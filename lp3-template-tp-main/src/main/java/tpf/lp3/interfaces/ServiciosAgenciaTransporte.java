package tpf.lp3.interfaces;

import java.util.List;

import tpf.lp3.clases.Servicio;
import tpf.lp3.servicios.Almacenamiento;
import tpf.lp3.servicios.Transporte;
/* INTERFAZ DE LOS SERVICIOS DE LA AGENCIA DE TRANSPORTE PARA LAS OPERACIONES CRUD */
public interface ServiciosAgenciaTransporte {
	// Todos las operaciones de transporte
		Servicio crearTransporte(Transporte t1);
		Servicio editarTransporte(Transporte t1);
		Boolean eliminarTransporte(Long id);
		List<Servicio> todosTransporte();
		Servicio buscarTransporte(Long id);
		
		// Todas las operaciones de Almacenamiento
		Servicio crearAlmacenamiento(Almacenamiento a1);
		Servicio editarAlmacenamiento(Almacenamiento a1);
		Boolean eliminarAlmacenamiento(Long id_almacenamiento);
		List<Servicio> todosAlmacenamiento();
		Servicio buscarAlmacenamiento(Long id_almacenamiento);
}
