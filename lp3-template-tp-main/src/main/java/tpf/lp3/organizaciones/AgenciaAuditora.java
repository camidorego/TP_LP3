package tpf.lp3.organizaciones;

import tpf.lp3.clases.Organizacion;

public class AgenciaAuditora extends Organizacion{
	// funcion para asignar el tipo de organizacion
	public AgenciaAuditora() {
		super(); // se invoca al constructor de Organizacion
		this.tipo="AU"; // se establece el tipo de Organizacion
	}
}
