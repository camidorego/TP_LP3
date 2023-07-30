package tpf.lp3.usuarios;

import tpf.lp3.clases.Usuario;
import javax.persistence.Entity;
/* Genera presupuestos */
@Entity
public class Despachante extends Usuario{
	
	// funcion para asignar el rol de Despachante
	public Despachante() {
		super();
		this.rol="DE";
		}
}
