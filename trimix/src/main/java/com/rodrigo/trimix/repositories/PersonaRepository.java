package com.rodrigo.trimix.repositories;

import com.rodrigo.trimix.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonaRepository extends JpaRepository<Persona, Long> {


   @Query("SELECT new Persona(" +
           "p.perId, " +
           "p.perApellido, " +
           "p.perFechaNacimiento, " +
           "p.perNombre, " +
           "p.perNumeroDocumento, " +
           "p.perTipoDocumento) " +
           "FROM Persona p " +
           "WHERE p.perNombre LIKE %:nombre% " +
           "AND p.perTipoDocumento = :tipoDoc ")
   List<Persona> filter(@Param("nombre") String nombre, @Param("tipoDoc") String tipoDoc);

}
