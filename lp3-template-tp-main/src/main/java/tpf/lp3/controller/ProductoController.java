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
import tpf.lp3.clases.Producto;
import tpf.lp3.interfaces.ServicioProductos;
/* CONTROLADOR DE LOS ENDPOINTS DE LAS OPERACIONES CRUD RELACIONADOS A PRODUCTO */
@RestController
@RequestMapping(ApiPaths.PRODUCTO)
public class ProductoController {
	@Autowired
	private ServicioProductos servicioProduct;
	/* Cada ruta se enlaza a una funcion de la interfaz ServicioProductos */
	
	
	@RequestMapping(value="/listarProductos", method=RequestMethod.GET)
	public List<Producto> listarProducto(){
		try {
			return servicioProduct.listarProductos();
		}
		catch(Exception e) {
			System.out.println("listarProducto: Error al realizar operacion \n");
			return null;
		}
	}
	
	@RequestMapping(value="/buscarProducto/{id}", method=RequestMethod.GET)
	public Producto buscarProducto(@PathVariable("id") Long id) {
		try {
		return servicioProduct.buscarProducto(id);
		}
		catch(Exception e) {
			System.out.println("buscarProducto: Error al realizar operacion \n");
			return null;
		}
		
	}
	@PostMapping("/crearProducto")
	public Producto crearProducto(@RequestBody Producto t1) {
		try {
			return servicioProduct.crearProducto(t1);
		}
		catch(Exception e) {
			System.out.println("crearProducto: Error al realizar operacion \n");
			return null;
		}
	}
	
	@PutMapping("/editarProducto")
	public Producto editarTransporte(@RequestBody Producto t1) {
		try {
			return servicioProduct.editarProducto(t1);
		}
		catch(Exception e) {
			System.out.println("editarProducto: Error al realizar operacion \n");
			return null;
		}
		
	}
	
	@DeleteMapping("/eliminarProducto/{id}")
	public Boolean eliminarProducto(@PathVariable("id") Long id) {
		try {
			return servicioProduct.eliminarProducto(id);
		}
		catch(Exception e) {
			System.out.println("eliminarProducto: Error al realizar operacion \n");
			return null;
		}
		
	}

}
