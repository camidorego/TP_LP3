package tpf.lp3.repositorios;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import tpf.lp3.clases.Usuario;
/* INTERFAZ DEL REPOSITORIO DE USUARIOS */
@Repository
public interface UsuarioRepositorio extends PagingAndSortingRepository<Usuario, Long>{
	List<Usuario> findByRol(String rol); // se devuelve la lista de usuarios que tienen el mismo rol
	
}
