package tpf.lp3.clases;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Servicio {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	public Long id; // id del transporte o del almacenamiento
	public String tipo; // El servicio puede ser de Almacenamiento ("al") o de Transporte ("tr")
	public String nombre; // nombre del transporte o almacenamiento. EJ: CAMION O CONTENEDOR 5
	public Double precio_por_peso; // precio de transporte o almacenamiento
	public Double capacidad; // capacidad maxima del transporte o almacenamiento
	public Double descuento_mercosur; // porcentaje de descuento si el pedido proviene de un pais del mercosur
	
	/* GETTERS Y SETTERS */
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Double getPrecio_por_peso() {
		return precio_por_peso;
	}
	public void setPrecio_por_peso(Double precio_por_peso) {
		this.precio_por_peso = precio_por_peso;
	}
	public Double getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(Double capacidad) {
		this.capacidad = capacidad;
	}
	public Double getDescuento_mercosur() {
		return descuento_mercosur;
	}
	public void setDescuento_mercosur(Double descuento_mercosur) {
		this.descuento_mercosur = descuento_mercosur;
	}
	
	
	
	
	
}
