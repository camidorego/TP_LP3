package tpf.lp3.clases;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Organizacion {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	public Long id; // id de la organizacion -> se crea por default
	public String nombre_organizacion; // nombre de la organizacion
	public String tipo; // tipo -> {auditora : "AU", despachante: "DE", administradora: "AD", transportista: "TR"}
	public String direccion; // direccion de la organizacion
	public int telefono; // telefono de la organizacion
	
	/* GETTERS Y SETTERS */
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre_organizacion() {
		return nombre_organizacion;
	}
	public void setNombre_organizacion(String nombre_organizacion) {
		this.nombre_organizacion = nombre_organizacion;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	

}
