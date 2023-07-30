package tpf.lp3.interfaces;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tpf.lp3.Utilidades.Utils;
import tpf.lp3.clases.Impuesto;
import tpf.lp3.clases.Presupuesto;
import tpf.lp3.clases.Producto;
import tpf.lp3.clases.Servicio;

import tpf.lp3.repositorios.ImpuestoRepositorio;
import tpf.lp3.repositorios.PresupuestoRepositorio;
import tpf.lp3.repositorios.ProductosRepositorio;
import tpf.lp3.repositorios.ServiciosRepositorio;

@Service
public class ServicioPresupuestoImplement implements ServicioPresupuesto{
	@Autowired
	private PresupuestoRepositorio repoPresupuesto; // repositorio de presupuesto
	
	@Autowired
	private ImpuestoRepositorio repoImpuesto; // respositorio de impuesto
	
	@Autowired
	private ServiciosRepositorio repoServicio; // repositorio de servicios
	
	@Autowired
	private ProductosRepositorio repoProducto; // repositorio de productos
	
	@Override
	public List<Presupuesto> listarPresupuesto() {
		// retornamos la lista de todos los presupuestos
		try {
		return repoPresupuesto.findAll();}
		catch(Exception e) {
			System.out.println("Servicio listarPresupuesto: error al realizar la operacion");
		}
		return null;
	}
	
	@Override
	public Presupuesto buscarPresupuesto(Long id_pedido) {
		// retorna el impuesto solicitado
		try {
		Optional<Presupuesto> p1= repoPresupuesto.findById(id_pedido);
		if (p1.isPresent()) {
			return p1.get();}
		}
		catch(Exception e) {
			System.out.println("Servicio buscarPresupuesto: error al realizar la operacion");
			return null;
		}
		
		return null;
	}

	@Override
	public Presupuesto crearPresupuesto(Presupuesto p1) {
		try {
		Double sub_total=(double)0, peso=(double)0;
		Producto producto=new Producto();
		// se verifica si el origen del producto es un pais del mercosur
		Boolean es_mercosur=Utils.tieneDescuento(p1.getProcedencia_pedido());
		// se busca el impuesto seleccionado
		Optional<Impuesto> im=repoImpuesto.findById(p1.getId_impuesto());
		Impuesto impuesto_pedido=new Impuesto();
		// se busca el transporte seleccionado
		Optional<Servicio> transport=repoServicio.findById(p1.getId_transporte());
		Servicio t1=new Servicio();
		// se busca el almacenamiento seleccionado
		Optional<Servicio> almacem=repoServicio.findById(p1.getId_almacenamiento());
		Servicio a1=new Servicio();
		
		// se verifica que todos los id sean correctos
		if(im.isPresent() && transport.isPresent() && almacem.isPresent()) {
			impuesto_pedido=im.get();
			t1=transport.get();
			a1=almacem.get();
		}
		else {
			System.out.println("Uno de los id ingresados es incorrecto");
			return null;
		}
		// se calcula el sub total del pedido
		List<Long> lista=p1.getLista();
		for(int i=0; i<lista.size(); i++) {
			Optional<Producto> prod=repoProducto.findById(lista.get(i));
			if(prod.isPresent()) {
				producto=prod.get();
				sub_total+=producto.getPrecio_total();
				peso+=producto.getPeso();
			}
		}
		// si el origen del pedido es de un pais del mercosur se le aplica el descuento en los servicios y el el impuesto
		if(es_mercosur) {
			p1.setTotal_impuestos(sub_total*(impuesto_pedido.getPorcentaje_a_cobrar()-impuesto_pedido.getDescuento_mercosur()));
			p1.setTotal_servicios((peso*t1.getPrecio_por_peso())+(peso*a1.getPrecio_por_peso())-((peso*t1.getPrecio_por_peso())+(peso*a1.getPrecio_por_peso())*impuesto_pedido.getDescuento_mercosur()));
		}
		else {
			p1.setTotal_impuestos(sub_total*impuesto_pedido.getPorcentaje_a_cobrar());
			p1.setTotal_servicios((peso*t1.getPrecio_por_peso())+(peso*a1.getPrecio_por_peso()));
		}
		p1.setOperacion(Utils.definirOperacion(p1.getProcedencia_pedido()));
		// se establece el sub total y el total del pedido
		p1.setSub_total(sub_total);
		p1.setTOTAL(sub_total+p1.getTotal_impuestos()+p1.getTotal_servicios());
		// se guarda el presupuesto en el respositorio y se retorna
		repoPresupuesto.save(p1);
		return p1;}
		catch(Exception e) {
			System.out.println("Servicio listarPresupuesto: error al realizar la operacion");
			return null;
		}
	
	}

	@Override
	public Boolean eliminarPresupuesto(Long id_presupuesto) {
		try {
		Optional<Presupuesto> buscarPresupuesto= repoPresupuesto.findById(id_presupuesto);
		// si existe entonces se elimina y se retorna true si no se retorna false
		if(buscarPresupuesto.isPresent()) {
			repoPresupuesto.deleteById(id_presupuesto);
			return true;}
		}
		catch(Exception e) {
			System.out.println("Servicio listarPresupuesto: error al realizar la operacion");
			return false;
		}
		return false;
	}

}
