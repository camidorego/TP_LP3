package tpf.lp3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import py.edu.uc.lp3.constants.ApiPaths;
import tpf.lp3.clases.Presupuesto;
import tpf.lp3.interfaces.ServicioPresupuesto;
/* CONTROLADOR DE LOS ENDPOINTS DE LAS OPERACIONES CRUD RELACIONADOS A PRESUPUESTO */
@RestController
@RequestMapping(ApiPaths.PRESUPUESTO)
public class PresupuestoController {
	
	@Autowired
	private ServicioPresupuesto servicioPresu;
	
	/* Cada ruta se enlaza a una funcion de la interfaz ServicioPresupuesto */
	
	@RequestMapping(value="/listarPresupuestos", method=RequestMethod.GET)
	public List<Presupuesto> listarPresupuesto() {
		try {
			return servicioPresu.listarPresupuesto();
		}
		catch(Exception e) {
			System.out.println("listarPresupuestos: Error al realizar operacion \n");
			return null;
		}
	}
	
	@PostMapping("/crearPresupuesto")
	public @ResponseBody Presupuesto crearPresupuesto(@RequestBody Presupuesto p1){//Pedido p1) {
		try {
			return servicioPresu.crearPresupuesto(p1);
		}
		catch(Exception e) {
			System.out.println("crearPresupuesto: Error al realizar operacion \n");
			return null;
		}
		
	}

	@DeleteMapping("/eliminarPresupuesto/{id}")
	public Boolean eliminarPresupuesto(@PathVariable("id") Long id) {
		try {	
			return servicioPresu.eliminarPresupuesto(id);
		}
		catch(Exception e) {
			System.out.println("eliminarPresupuesto: Error al realizar operacion \n");
			return null;
		}
		
	}

}
