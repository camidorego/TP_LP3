package tpf.lp3.interfaces;

import java.util.List;
import tpf.lp3.clases.Usuario;
import tpf.lp3.usuarios.Administrador;
import tpf.lp3.usuarios.Auditor;
import tpf.lp3.usuarios.Despachante;
import tpf.lp3.usuarios.Transportista;

/* INTERFAZ DE USUARIOS PARA LAS OPERACIONES CRUD */
public interface ServicioUsuario {
	// @put
	public Usuario crearAdministrador(Administrador a1);
	public Usuario crearAuditor(Auditor a1);
	public Usuario crearDespachante(Despachante d1);
	public Usuario crearTransportista(Transportista t1);
	
	//@update
	public Boolean actualizarAdministrador(Administrador a1);
	public Boolean actualizarAuditor(Auditor a1);
	public Boolean actualizarDespachante(Despachante d1);
	public Boolean actualizarTransportista(Transportista t1);
	
	// @get
	public Usuario buscarUsuario(Long id);
	public List<Usuario> todosUsuarios(String rol);
	 
	//@delete
	public Boolean eliminarUsuario(Long id);
	public Usuario crearUsuario(Usuario usuario);

				

}
