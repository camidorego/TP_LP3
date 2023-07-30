package tpf.lp3.interfaces;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tpf.lp3.clases.Impuesto;
import tpf.lp3.repositorios.ImpuestoRepositorio;
@Service
public class ServicioImpuestoImplement implements ServicioImpuesto{
	
	@Autowired
	private ImpuestoRepositorio repoImpuesto;
	
	@Override
	public List<Impuesto> listarImpuesto() {
		// retornamos la lista de todos los impuestos
		try {
		List<Impuesto> todosImpuestos = repoImpuesto.findAll();
		return todosImpuestos;}
		catch(Exception e) {
			System.out.println("Servicio listarImpuesto: error al realizar la operacion");
			return null;
		}
	}
	@Override
	public Impuesto buscarImpuesto(Long id) {
		// retorna el impuesto solicitado
		try {
		Optional<Impuesto> i1= repoImpuesto.findById(id);
		if (i1.isPresent()) {
			return i1.get();
		}}
		catch(Exception e) {
			System.out.println("Servicio buscarImpuesto: error al realizar la operacion");
			return null;
		}	
	return null;
	}
	@Override
	public Impuesto crearImpuesto(Impuesto i1) {
		// guardamos el nuevo impuesto
		try {
		return repoImpuesto.save(i1);
		}
		catch(Exception e) {
			System.out.println("Servicio crearImpuesto: error al realizar la operacion");
			return null;
		}
	}

	@Override
	public Impuesto editarImpuesto(Impuesto i1) {
		// buscamos el impuesto que se quiere actualizar
		try {
		Optional<Impuesto> impuestoActual= repoImpuesto.findById(i1.getId());
		// si existe entonces se actualiza y se retorna true
		if (impuestoActual.isPresent()){
			return repoImpuesto.save(i1);
		
		}}
		catch(Exception e) {
			System.out.println("Servicio editarImpuesto: error al realizar la operacion");
			return null;
		}
	return null;
	}

	@Override
	public Boolean eliminarImpuesto(Long id) {
		// buscamos el impuesto por id
		try {
		Optional<Impuesto> buscarImpuesto= repoImpuesto.findById(id);
		// si existe entonces se elimina y se retorna true si no se retorna false
		if(buscarImpuesto.isPresent()) {
			repoImpuesto.deleteById(id);
			return true;}
		}
		catch(Exception e) {
			System.out.println("Servicio eliminarImpuesto: error al realizar la operacion");
			return null;
		}
		return false;
	}

	

}
