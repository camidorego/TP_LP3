package tpf.lp3.usuarios;

import tpf.lp3.clases.Usuario;
import javax.persistence.Entity;

/* El auditor puede observar cualquiera de los datos, solo en modo lectura */

@Entity
public class Auditor extends Usuario{
	
	// funcion para asignar el rol de auditor
	public Auditor() {
		super();
		this.rol = "AU";
	}
}
