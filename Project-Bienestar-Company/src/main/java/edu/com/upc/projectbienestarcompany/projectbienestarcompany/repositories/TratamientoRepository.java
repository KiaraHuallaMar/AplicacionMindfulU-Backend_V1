package edu.com.upc.projectbienestarcompany.projectbienestarcompany.repositories;

import edu.com.upc.projectbienestarcompany.projectbienestarcompany.entities.Tratamiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TratamientoRepository extends JpaRepository<Tratamiento,Integer> {

}
