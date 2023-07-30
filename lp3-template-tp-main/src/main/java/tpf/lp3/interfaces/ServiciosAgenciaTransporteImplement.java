package tpf.lp3.interfaces;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tpf.lp3.clases.Servicio;
import tpf.lp3.repositorios.ServiciosRepositorio;
import tpf.lp3.servicios.Almacenamiento;
import tpf.lp3.servicios.Transporte;
@Service
public class ServiciosAgenciaTransporteImplement implements ServiciosAgenciaTransporte{
	@Autowired
	private ServiciosRepositorio repoServicio;
	
	@Override
	public Transporte crearTransporte(Transporte t1) {
		try {
		return repoServicio.save(t1);}
		catch(Exception e) {
			System.out.println("Servicio crearTransporte: error al realizar la operacion");
			return null;
		}
		
	}
	
	@Override
	public Transporte editarTransporte(Transporte t1) {
		try {
		Optional<Servicio> transporteActual= repoServicio.findById(t1.getId());
		// si existe entonces se actualiza y se retorna true
		if (!transporteActual.isEmpty()){
			return repoServicio.save(t1);}
				
		}
		catch(Exception e) {
			System.out.println("Servicio editarTransporte: error al realizar la operacion");
			return null;
		}
		return null;
	}

	@Override
	public Boolean eliminarTransporte(Long id) {
		try {
		repoServicio.deleteById(id);
		return true;}
		catch(Exception e) {
			System.out.println("Servicio eliminarTransporte: error al realizar la operacion");
			return false;
		}
	}

	@Override
	public List<Servicio> todosTransporte() {
		try {
		return repoServicio.findByTipo("tr");}
		catch(Exception e) {
			System.out.println("Servicio todosTransporte: error al realizar la operacion");
			return null;
		}
	}
	
	@Override
	public Servicio buscarTransporte(Long id) {
		try {
		Optional<Servicio> t1= repoServicio.findById(id);
		if(!t1.isEmpty()) {
			return t1.get();
		}}
		catch(Exception e) {
			System.out.println("Servicio buscarTransporte: error al realizar la operacion");
			return null;
		}
	return null;
	}
	// ALMACENAMIENTO
	@Override
	public Servicio crearAlmacenamiento(Almacenamiento a1) {
		try {
		return repoServicio.save(a1);}
		catch(Exception e) {
			System.out.println("Servicio crearAlmacenamiento: error al realizar la operacion");
			return null;
		}
		
	}

	@Override
	public Servicio editarAlmacenamiento(Almacenamiento a1) {
		try {
		Optional<Servicio> almacenamientoActual=repoServicio.findById(a1.getId());
		if(almacenamientoActual.isPresent()) {
			return repoServicio.save(a1);}
			
		}
		catch(Exception e) {
			System.out.println("Servicio editarAlmacenamiento: error al realizar la operacion");
			return null;
		}
	return null;
	}

	@Override
	public Boolean eliminarAlmacenamiento(Long id) {
		try {
		Optional<Servicio> almacenamientoActual=repoServicio.findById(id);
		if(almacenamientoActual.isPresent()) {
			repoServicio.deleteById(id);
			return true;
		}}
		catch(Exception e) {
			System.out.println("Servicio eliminarAlmacenamiento: error al realizar la operacion");
			return false;
		}
		return false;
	}

	@Override
	public List<Servicio> todosAlmacenamiento() {
		try {
		return repoServicio.findByTipo("al");}
		catch(Exception e) {
			System.out.println("Servicio ListarAlmacenamiento: error al realizar la operacion");
			return null;
		}
		
	}

	@Override
	public Servicio buscarAlmacenamiento(Long id) {
		try {
		Optional<Servicio> a1=repoServicio.findById(id);
		if(a1.isPresent()) {
			return a1.get();
		}}
		catch(Exception e) {
			System.out.println("Servicio buscarAlmacenamiento: error al realizar la operacion");
			return null;
		}
	return null;
	}
}

