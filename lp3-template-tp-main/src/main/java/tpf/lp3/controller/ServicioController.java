package tpf.lp3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import py.edu.uc.lp3.constants.ApiPaths;
import tpf.lp3.clases.Servicio;
import tpf.lp3.interfaces.ServiciosAgenciaTransporte;
import tpf.lp3.servicios.Almacenamiento;
import tpf.lp3.servicios.Transporte;
/* CONTROLADOR DE LOS ENDPOINTS DE LAS OPERACIONES CRUD RELACIONADAS A LOS SERVICIOS DE LA AGENCIA DE TRANSPORTE */
@RestController
@RequestMapping(ApiPaths.SERVICIO)
public class ServicioController {
	// TRANSPORTE
	@Autowired
	private ServiciosAgenciaTransporte serviciosAgenTransport;
	
	/* Cada ruta se enlaza a una funcion de la interfaz ServiciosAgenciaTransporte */
	
	@RequestMapping(value="/listarTransporte", method=RequestMethod.GET)
	public List<Servicio> todosTransporte(){
		try {
			return serviciosAgenTransport.todosTransporte();
		}
		catch(Exception e) {
			System.out.println("listarTransporte: Error al realizar operacion \n");
			return null;
		}
	}
	
	@RequestMapping(value="/buscarTransporte/{id}", method=RequestMethod.GET)
	public Servicio buscarTransporte(@PathVariable("id") Long id) {
		try {
			return serviciosAgenTransport.buscarTransporte(id);
		}
		catch(Exception e) {
			System.out.println("buscarTransporte: Error al realizar operacion \n");
			return null;
		}
	}
	@PostMapping("/crearTransporte")
	public Servicio crearTransporte(@RequestBody Transporte t1) {
		try {
			return serviciosAgenTransport.crearTransporte(t1);
		}
		catch(Exception e) {
			System.out.println("crearTransporte: Error al realizar operacion \n");
			return null;
		}
	}
	
	@PutMapping("/editarTransporte")
	public Servicio editarTransporte(@RequestBody Transporte t1) {
		try {
			return serviciosAgenTransport.editarTransporte(t1);
		}
		catch(Exception e) {
			System.out.println("editarTransporte: Error al realizar operacion \n");
			return null;
		}
	}
	
	@DeleteMapping("/eliminarTransporte/{id}")
	public Boolean eliminarTransporte(@PathVariable("id") Long id) {
		try {
			return serviciosAgenTransport.eliminarTransporte(id);
		}
		catch(Exception e) {
			System.out.println("eliminarTransporte: Error al realizar operacion \n");
			return null;
		}
	}
	
	//**** ALMACENAMIENTO ****///
	@RequestMapping(value="/listarAlmacenamiento", method=RequestMethod.GET)
	public List<Servicio> todosAlmacenamiento(){
		try {
			return serviciosAgenTransport.todosAlmacenamiento();
		}
		catch(Exception e) {
			System.out.println("listarAlmacenamiento: Error al realizar operacion \n");
			return null;
		}	
	}
	@RequestMapping(value="/buscarAlmacenamiento/{id}", method=RequestMethod.GET)
	public Servicio buscarAlmacenamiento(@PathVariable("id") long id) {
		try {
			return serviciosAgenTransport.buscarAlmacenamiento(id);
		}
		catch(Exception e) {
			System.out.println("buscarAlmacenamiento: Error al realizar operacion \n");
			return null;
		}	
	}
	@PostMapping("/crearAlmacenamiento")
	public Servicio crearAlmacenamiento(@RequestBody Almacenamiento a1) {
		try {
			return serviciosAgenTransport.crearAlmacenamiento(a1);
		}
		catch(Exception e) {
			System.out.println("crearAlmacenamiento: Error al realizar operacion \n");
			return null;
		}
		
	}
	@PutMapping("/editarAlmacenamiento")
	public Servicio editarAlmacenamiento(@RequestBody Almacenamiento a1) {
		try {
			return serviciosAgenTransport.editarAlmacenamiento(a1);
		}
		catch(Exception e) {
			System.out.println("editarAlmacenamiento: Error al realizar operacion \n");
			return null;
		}	
	}
		
	@DeleteMapping("/eliminarAlmacenamiento/{id}")
	public Boolean eliminarAlmacenamiento(@PathVariable("id") long id_almacenamiento) {
		try {
			return serviciosAgenTransport.eliminarAlmacenamiento(id_almacenamiento);
		}
		catch(Exception e) {
			System.out.println("eliminarAlmacenamiento: Error al realizar operacion \n");
			return null;
		}
	}

}
