package tpf.lp3.organizaciones;

import tpf.lp3.clases.Organizacion;

public class AgenciaTransportista extends Organizacion{
	// funcion para asignar el tipo de organizacion
	public AgenciaTransportista() {
		super(); // se invoca al constructor de Organizacion
		this.tipo="TR"; // se establece el tipo de Organizacion
	}
}
