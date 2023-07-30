package tpf.lp3.controller;

import java.util.List;

//import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import py.edu.uc.lp3.constants.ApiPaths;
import tpf.lp3.interfaces.ServicioUsuario;
import tpf.lp3.clases.Usuario;
import tpf.lp3.usuarios.Administrador;
import tpf.lp3.usuarios.Auditor;
import tpf.lp3.usuarios.Despachante;
import tpf.lp3.usuarios.Transportista;
/* CONTROLADOR DE LOS ENDPOINTS DE LAS OPERACIONES CRUD RELACIONADAS A USUARIO */
@RestController
@RequestMapping(ApiPaths.USUARIO)
public class UsuarioController {
	
	@Autowired
	private ServicioUsuario servicioUsu;
	
	/* Cada ruta se enlaza a una funcion de la interfaz ServicioUsuario */
	
	@PostMapping(value = "/crearUsuario/administrador")
	public Usuario crearAdministrador(@RequestBody Administrador a1) {
		try {
			return servicioUsu.crearAdministrador(a1);
			}
		catch(Exception e) {
			System.out.println("crearAdministrador: Error al realizar operacion \n");
			return null;
			}
	}
	
	@PostMapping(value = "/crearUsuario/auditor")
	public Usuario crearAuditor(@RequestBody Auditor a1) {
		try {
			return servicioUsu.crearAuditor(a1);
			}
		catch(Exception e) {
			System.out.println("crearAuditor: Error al realizar operacion \n");
			return null;
			}
	}
	
	@PostMapping(value = "/crearUsuario/despachante")
	public Usuario crearDespachante(@RequestBody Despachante d1) {
		try {
			return servicioUsu.crearDespachante(d1);
			}
		catch(Exception e) {
			System.out.println("crearDespachante: Error al realizar operacion \n");
			return null;
			}
	}
	
	@PostMapping(value = "/crearUsuario/transportista")
	public Usuario crearTransportista(@RequestBody Transportista t1) {
		try {
			return servicioUsu.crearTransportista(t1);
			}
		catch(Exception e) {
			System.out.println("crearTransportista: Error al realizar operacion \n");
			return null;
			}
	}
	
	@PutMapping("/editarUsuarior/administrador")
	public Boolean actualizarAdministrador(@RequestBody Administrador a1) {
		try {
			return servicioUsu.actualizarAdministrador(a1);
			}
		catch(Exception e) {
			System.out.println("actualizarAdministrador: Error al realizar operacion \n");
			return null;
			}
		
	}
	
	@PutMapping(value = "/editarUsuario/auditor")
	public Boolean actualizarAuditor(@RequestBody Auditor a1) {
		try {
			return servicioUsu.actualizarAuditor(a1);}
		catch(Exception e) {
			System.out.println("actualizarAuditor: Error al realizar operacion \n");
			return null;
			}
	}
	
	@PutMapping(value = "/editarUsuario/despachante")
	public Boolean actualizarDespachante(@RequestBody Despachante d1) {
		try {
			return servicioUsu.actualizarDespachante(d1);
			}
		catch(Exception e) {
			System.out.println("actualizarDespachante: Error al realizar operacion \n");
			return null;
			}
	}
	
	@PutMapping(value = "/editarUsuario/transportista")
	public Boolean actualizarTransportista(@RequestBody Transportista t1) {
		try {
			return servicioUsu.actualizarTransportista(t1);
		}
		catch(Exception e) {
			System.out.println("actualizarTransportista: Error al realizar operacion \n");
			return null;
			}
	}
	
	@GetMapping("/buscarUsuario/{id}")
	public Usuario buscarUsuario(@PathVariable Long id) {
		try {
			return servicioUsu.buscarUsuario(id);
			}
		catch(Exception e) {
			System.out.println("buscarUsuario: Error al realizar operacion \n");
			return null;
			}
	}	
	
	@RequestMapping(value="/listarUsuarios/{rol}", method=RequestMethod.GET)
	public List<Usuario> todosUsuarios(@PathVariable("rol") String rol){
		try {
			return servicioUsu.todosUsuarios(rol);
		}
		catch(Exception e) {
			System.out.println("listarUsuarios: Error al realizar operacion \n");
			return null;
			}
	}
			
	@DeleteMapping("/eliminarUsuario/{id}")
	public Boolean eliminarUsuario(@PathVariable("id") long id) {
		try {
			return servicioUsu.eliminarUsuario(id);
			}
		catch(Exception e) {
			System.out.println("eliminarUsuario: Error al realizar operacion \n");
			return null;
			}
	}

}
