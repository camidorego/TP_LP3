package tpf.lp3.clases;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Presupuesto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	public Long id; // id del presupuesto -> se crea automaticamente
	@ElementCollection
	@CollectionTable(name = "lista")//, joinColumns = @JoinColumn(name = "id")) 
	@Column(name = "lista") 
	private List<Long> lista; // lista de los id de los productos del pedido
	public String procedencia_pedido; // origen del pedido
	public String destino_pedido; // destino del pedido
	public Long id_impuesto; // el id del impuesto que se le va a aplicar
	public Long id_transporte; // el id del transporte seleccionado
	public Long id_almacenamiento; // el id del almacenamiento seleccionado
	public Double sub_total; // precio total sin impuestos ni servicios
	public Double total_impuestos; // precio total del impuesto
	public Double total_servicios; // precio total de los servicios
	public String operacion; // si es importacion o exportacion
	public Double TOTAL; // total a pagar con los impuestos y servicios
	
	/* GETTERS Y SETTERS */
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Long> getLista() {
		return lista;
	}
	public void setLista(List<Long> lista) {
		this.lista = lista;
	}
	public String getProcedencia_pedido() {
		return procedencia_pedido;
	}
	public void setProcedencia_pedido(String procedencia_pedido) {
		this.procedencia_pedido = procedencia_pedido;
	}
	public String getDestino_pedido() {
		return destino_pedido;
	}
	public void setDestino_pedido(String destino_pedido) {
		this.destino_pedido = destino_pedido;
	}
	public Long getId_impuesto() {
		return id_impuesto;
	}
	public void setId_impuesto(Long id_impuesto) {
		this.id_impuesto = id_impuesto;
	}
	public Long getId_transporte() {
		return id_transporte;
	}
	public void setId_transporte(Long id_transporte) {
		this.id_transporte = id_transporte;
	}
	public Long getId_almacenamiento() {
		return id_almacenamiento;
	}
	public void setId_almacenamiento(Long id_almacenamiento) {
		this.id_almacenamiento = id_almacenamiento;
	}
	public Double getTotal_impuestos() {
		return total_impuestos;
	}
	public void setTotal_impuestos(Double total_impuestos) {
		this.total_impuestos = total_impuestos;
	}
	public Double getSub_total() {
		return sub_total;
	}
	public void setSub_total(Double sub_total) {
		this.sub_total = sub_total;
	}
	public Double getTotal_servicios() {
		return total_servicios;
	}
	public void setTotal_servicios(Double total_servicios) {
		this.total_servicios = total_servicios;
	}
	public String getOperacion() {
		return operacion;
	}
	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}
	public Double getTOTAL() {
		return TOTAL;
	}
	public void setTOTAL(Double tOTAL) {
		TOTAL = tOTAL;
	}
	
	
	
	
	
	
	
	
	
	
}
