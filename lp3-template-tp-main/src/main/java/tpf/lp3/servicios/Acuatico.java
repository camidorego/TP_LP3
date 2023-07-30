package tpf.lp3.servicios;
import javax.persistence.Entity;

@Entity
public class Acuatico extends Transporte{
	// funcion para asignar el medio de transporte
	public Acuatico() {
		super(); // se invoca al constructor de Transporte
		this.medio="acuatico"; // se establece el medio
	}

}
