package tpf.lp3.repositorios;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import tpf.lp3.clases.Servicio;
/* INTERFAZ DEL REPOSITORIO DE LOS SERVICIOS DE LA AGENCIA DE TRANSPORTE */
@Repository
public interface ServiciosRepositorio extends PagingAndSortingRepository<Servicio, Long>{
	List<Servicio> findByTipo(String tipo);

}
