package tpf.lp3.servicios;
import javax.persistence.Entity;

@Entity
public class Aereo extends Transporte{
	// funcion para asignar el medio de transporte
	public Aereo() {
		super(); // se invoca al constructor de Transporte
		this.medio="aereo"; // se establece el medio
	}

}
