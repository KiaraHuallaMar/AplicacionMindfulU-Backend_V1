package com.upc.trabajotf.projectbienestarcompany.repositories;

import com.upc.trabajotf.projectbienestarcompany.entities.Cita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitaRepository extends JpaRepository<Cita,Integer> {
}
