package tpf.lp3.organizaciones;

import tpf.lp3.clases.Organizacion;

public class AgenciaAdministradora extends Organizacion{
	// funcion para asignar el tipo de organizacion
	public AgenciaAdministradora() {
		super(); // se invoca al constructor de Organizacion
		this.tipo="AD"; // se establece el tipo de Organizacion
	}

}
