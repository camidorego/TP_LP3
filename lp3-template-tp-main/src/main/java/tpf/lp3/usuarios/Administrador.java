package tpf.lp3.usuarios;

import tpf.lp3.clases.Usuario;
import javax.persistence.Entity;
/* Maneja los tipos de impuestos y crea los diferentes usuarios para las agencias despachantes */
@Entity
public class Administrador extends Usuario{
	
	// funcion para asignar el rol de administrador
	public  Administrador() {
		super(); // se invoca al constructor de Usuario
		this.rol = "AD"; // se establece el rol de administrador
	}

}
