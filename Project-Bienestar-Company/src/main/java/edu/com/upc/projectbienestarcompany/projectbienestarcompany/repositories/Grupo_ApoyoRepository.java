package com.upc.trabajotf.projectbienestarcompany.repositories;

import com.upc.trabajotf.projectbienestarcompany.entities.Grupo_Apoyo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Grupo_ApoyoRepository extends JpaRepository<Grupo_Apoyo,Integer> {
}
