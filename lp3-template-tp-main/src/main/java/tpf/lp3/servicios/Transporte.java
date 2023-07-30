package tpf.lp3.servicios;

import javax.persistence.Entity;

import tpf.lp3.clases.Servicio;

@Entity
public class Transporte extends Servicio{
	
	public String medio;
	
	public Transporte() {
		super();
		this.tipo="tr";
	}

	public String getMedio() {
		return medio;
	}

	public void setMedio(String medio) {
		this.medio = medio;
	}

}
