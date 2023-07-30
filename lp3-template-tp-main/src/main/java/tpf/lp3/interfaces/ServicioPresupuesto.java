package tpf.lp3.interfaces;

import java.util.List;

import tpf.lp3.clases.Presupuesto;

public interface ServicioPresupuesto {
	
	List<Presupuesto> listarPresupuesto();
	
	Presupuesto buscarPresupuesto(Long id_presupuesto);
	
	Presupuesto crearPresupuesto(Presupuesto p1);
	
	//Boolean editarPresupuesto(Presupuesto p1);
	
	Boolean eliminarPresupuesto(Long id_presupuesto);

}
