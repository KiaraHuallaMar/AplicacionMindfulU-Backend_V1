package edu.com.upc.mindfulu.mindfulu.repositories;

import edu.com.upc.mindfulu.mindfulu.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    public Usuario findOneByUsername(String username);
}
