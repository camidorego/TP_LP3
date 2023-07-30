package tpf.lp3.clases;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Impuesto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	public Long id; // id del impuesto -> se crea por default
	public String nombre_impuesto; //nombre del impuesto
	public String tipo_producto; // tipo de producto sobre el cual se aplica el impuesto
	public Double porcentaje_a_cobrar; // porcentaje del impuesto
	public Double descuento_mercosur; // porcentaje de descuento si el pedido proviene de un pais del mercosur
	
	/* GETTERS Y SETTERS */
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre_impuesto() {
		return nombre_impuesto;
	}
	public void setNombre_impuesto(String nombre_impuesto) {
		this.nombre_impuesto = nombre_impuesto;
	}
	public String getTipo_producto() {
		return tipo_producto;
	}
	public void setTipo_producto(String tipo_producto) {
		this.tipo_producto = tipo_producto;
	}
	public Double getPorcentaje_a_cobrar() {
		return porcentaje_a_cobrar;
	}
	public void setPorcentaje_a_cobrar(Double porcentaje_a_cobrar) {
		this.porcentaje_a_cobrar = porcentaje_a_cobrar;
	}
	public Double getDescuento_mercosur() {
		return descuento_mercosur;
	}
	public void setDescuento_mercosur(Double descuento_mercosur) {
		this.descuento_mercosur = descuento_mercosur;
	}
	
	
	
	

}
