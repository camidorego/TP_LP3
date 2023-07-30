package tpf.lp3.organizaciones;

import tpf.lp3.clases.Organizacion;

public class AgenciaDespachante extends Organizacion{
	// funcion para asignar el tipo de organizacion
	public AgenciaDespachante() {
		super(); // se invoca al constructor de Organizacion
		this.tipo="DE"; // se establece el tipo de Organizacion
	}
}
