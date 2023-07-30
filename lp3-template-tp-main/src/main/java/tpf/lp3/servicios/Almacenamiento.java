package tpf.lp3.servicios;


import javax.persistence.Entity;

import tpf.lp3.clases.Servicio;

@Entity
public class Almacenamiento extends Servicio{
	
	public Almacenamiento() {
		super();
		this.tipo="al";
	}

}
