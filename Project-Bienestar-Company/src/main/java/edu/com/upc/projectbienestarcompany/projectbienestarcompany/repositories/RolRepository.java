package com.upc.trabajotf.projectbienestarcompany.repositories;

import com.upc.trabajotf.projectbienestarcompany.entities.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RolRepository extends JpaRepository<Rol,Integer> {

    //Buscar Rol
    @Query("select r from Rol r where r.rol like %:tipo%")
    public List<Rol> buscar(@Param("tipo")String tipo);

}
