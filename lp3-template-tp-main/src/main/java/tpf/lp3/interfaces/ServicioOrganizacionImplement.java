package tpf.lp3.interfaces;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tpf.lp3.clases.Organizacion;
import tpf.lp3.repositorios.OrganizacionRepositorio;

@Service
public class ServicioOrganizacionImplement implements ServicioOrganizacion{
	@Autowired
	private OrganizacionRepositorio repoOrganizacion;
	
	@Override
	public List<Organizacion> listarOrganizacion() {
		try {
		List<Organizacion> todasOrganizaciones = repoOrganizacion.findAll();
		return todasOrganizaciones;}
		catch(Exception e){
			System.out.println("Servicio listarOrganizacion: error al realizar operacion");
			return null;
		}
	}

	@Override
	public List<Organizacion> buscarOrganizacionPorTipo(String tipo) {
		try {
		return repoOrganizacion.findByTipo(tipo);}
		catch(Exception e){
			System.out.println("Servicio buscarOrganizacion: error al realizar operacion");
			return null;
		}
	}

	@Override
	public Organizacion crearOrganizacion(Organizacion o1) {
		try {
		return repoOrganizacion.save(o1);
		}
		catch(Exception e){
			System.out.println("Servicio crearOrganizacion: error al realizar operacion");
			return null;
		}
	}

	@Override
	public Organizacion editarOrganizacion(Organizacion o1) {
		// buscamos la organizacion que se quiere editar
		try {
		Optional<Organizacion> organizacionActual= repoOrganizacion.findById(o1.getId());
		// si existe entonces se actualiza y se retorna true
		if (organizacionActual.isPresent()){
			return repoOrganizacion.save(o1);
			}	
		}
		catch(Exception e){
			System.out.println("Servicio editarOrganizacion: error al realizar operacion");
			return null;
		}
		return null;
	}

	@Override
	public Boolean eliminarOrganizacion(Long id_organizacion) {
		// buscamos la organizacion por id
		try {
		Optional<Organizacion> buscarOrganizacion= repoOrganizacion.findById(id_organizacion);
		// si existe entonces se elimina y se retorna true si no se retorna false
		if(buscarOrganizacion.isPresent()) {
			repoOrganizacion.deleteById(id_organizacion);
			return true;
		}}
		catch(Exception e){
			System.out.println("Servicio eliminarOrganizacion: error al realizar operacion");
			return null;
		}
		return false;
	}


}
