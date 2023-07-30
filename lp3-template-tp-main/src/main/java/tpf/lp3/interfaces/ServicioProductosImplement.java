package tpf.lp3.interfaces;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tpf.lp3.clases.Producto;
import tpf.lp3.repositorios.ProductosRepositorio;

/* IMPLEMENTACION DE LAS FUNCIONES DECLARADAS EN ServicioProductos PARA EL USO DE LAS OPERACIONES DE CRUD*/
//se marca como @Servicio para que se reconozca en el escaneo
@Service
public class ServicioProductosImplement implements ServicioProductos{
	@Autowired
	private ProductosRepositorio repoProduct; // repositorio de productos

	@Override
	public List<Producto> listarProductos() {
		// retornamos la lista de todos los productos en el repositorio
		try {
		return repoProduct.findAll();}
		catch(Exception e) {
			System.out.println("Servicio listarProductos: error al realizar la operacion");
			return null;
		}
	}

	@Override
	public Producto buscarProducto(Long id) {
		try {
		// retorna el producto solicitado si se encuentra en el repositorio
		Optional<Producto> t1= repoProduct.findById(id);
		if(!t1.isEmpty()) {
			return t1.get();
		}}
		catch(Exception e) {
			System.out.println("No se encontro el producto");
		return null;}
	return null;
	}

	@Override
	public Producto crearProducto(Producto produ) {
		try {
		// guardamos el nuevo producto en el repositorio
		return repoProduct.save(produ);}
		catch(Exception e) {
			System.out.println("Servicio crearProductor: error al realizar la operacion");
			return null;
		}
	}

	@Override
	public Producto editarProducto(Producto produ) {
		try {
		Optional<Producto> transporteActual= repoProduct.findById(produ.getId());
		// si existe entonces se actualiza y se retorna true
		if (!transporteActual.isEmpty()){
			return repoProduct.save(produ);
				
		}}
		catch(Exception e) {
			System.out.println("Servicio editarProducto: error al realizar la operacion");
			return null;
		}
		return null;
	}

	@Override
	public Boolean eliminarProducto(Long id) {
		try {
		repoProduct.deleteById(id);
		return true;}
		catch(Exception e) {
			System.out.println("Servicio listarPresupuesto: error al realizar la operacion");
			return false;
		}
	}
	
}
