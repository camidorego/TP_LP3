package tpf.lp3.servicios;
import javax.persistence.Entity;

@Entity
public class Terrestre extends Transporte{
	// funcion para asignar el medio de transporte
	public Terrestre() {
		super(); // se invoca al constructor de Transporte
		this.medio="terrestre"; // se establece el medio
	}
	

}
