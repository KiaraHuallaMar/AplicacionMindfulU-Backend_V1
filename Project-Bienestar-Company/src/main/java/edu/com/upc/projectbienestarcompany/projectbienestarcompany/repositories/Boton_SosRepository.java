package edu.com.upc.projectbienestarcompany.projectbienestarcompany.repositories;

import edu.com.upc.projectbienestarcompany.projectbienestarcompany.entities.Boton_Sos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Boton_SosRepository extends JpaRepository<Boton_Sos,Integer> {

}
