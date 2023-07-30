package tpf.lp3.clases;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	public Long id; // id del producto -> se crea automaticamente
	public String nombre; // nombre del producto
	public Double precio_total; // precio total del pedido de este producto
	public String tipo_producto; // tipo de producto. EJ: "textil"
	public Double peso; // peso total del pedido de este producto (kg). 
						//EJ: PEDIDO DE 3 IMPRESORAS (CADA IMPRESORA PESA 5KG) -> PESO=15 KG
	public int cantidad;
	
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	/* GETTERS Y SETTERS */
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getPrecio_total() {
		return precio_total;
	}
	public void setPrecio_total(Double precio_total) {
		this.precio_total = precio_total;
	}
	public String getTipo_producto() {
		return tipo_producto;
	}
	public void setTipo_producto(String tipo_producto) {
		this.tipo_producto = tipo_producto;
	}
	
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}

}
