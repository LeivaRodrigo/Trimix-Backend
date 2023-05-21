package com.rodrigo.trimix.repositories;

import com.rodrigo.trimix.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
