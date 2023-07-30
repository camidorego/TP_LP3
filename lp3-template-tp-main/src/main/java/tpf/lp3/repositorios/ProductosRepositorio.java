package tpf.lp3.repositorios;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import tpf.lp3.clases.Producto;
/* INTERFAZ DEL REPOSITORIO DE PRODUCTOS */
@Repository
public interface ProductosRepositorio extends PagingAndSortingRepository<Producto, Long>{
	List<Producto> findAll();
	
}
