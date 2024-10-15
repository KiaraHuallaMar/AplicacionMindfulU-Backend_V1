package edu.com.upc.mindfulu.mindfulu.repositories;

import edu.com.upc.mindfulu.mindfulu.entities.Cita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitaRepository extends JpaRepository<Cita, Integer> {

  //TotalRecaudado de Cita
   @Query(value = "select sum(cita.precio_cita) as total_recaudado\n" +
            "from cita inner join cita \n" +
            "on usuario.id = cita.usuario_id",nativeQuery = true)
    public List<String[]> totalRecaudado();
}
