package tpf.lp3.interfaces;

import java.util.List;

import tpf.lp3.clases.Impuesto;

/* INTERFAZ DE IMPUESTOS PARA LAS OPERACIONES CRUD */
public interface ServicioImpuesto {
	List<Impuesto> listarImpuesto();	
	Impuesto buscarImpuesto(Long id);		
	Impuesto crearImpuesto(Impuesto i1);		
	Impuesto editarImpuesto(Impuesto i1); 		
	Boolean eliminarImpuesto(Long id); 
}
