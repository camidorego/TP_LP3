package tpf.lp3.clases;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	public Long id; // id del usuario -> se crea automaticamente
	public String nombre; // nombre del usuario
	public String correo; // correo del usuario
	protected String rol; //rol del usuario ->
			//ADMINISTRADOR -> "AD", AUDITOR -> "AU", TRANSPORTISTA -> "TR", DESPACHANTE -> "DE" 
	
	/* GETTERS Y SETTERS */
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	} 
	
	
}
