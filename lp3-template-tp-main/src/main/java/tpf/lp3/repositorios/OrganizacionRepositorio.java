package tpf.lp3.repositorios;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import tpf.lp3.clases.Organizacion;
/* INTERFAZ DEL REPOSITORIO DE ORGANIZACION*/
@Repository
public interface OrganizacionRepositorio extends PagingAndSortingRepository<Organizacion, Long>{
	List<Organizacion> findAll();
	List<Organizacion> findByTipo(String tipo);
}
