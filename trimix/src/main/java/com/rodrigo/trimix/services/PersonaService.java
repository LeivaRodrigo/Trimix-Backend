package com.rodrigo.trimix.services;

import com.rodrigo.trimix.models.Persona;
import com.rodrigo.trimix.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {

   @Autowired
   private PersonaRepository personaRepository;

   public List<Persona> findAll() {
      return personaRepository.findAll();
   }

   public void deleteById(Long aLong) {
      personaRepository.deleteById(aLong);
   }

   public <S extends Persona> S save(S entity) {
      return personaRepository.save(entity);
   }

   public Optional<Persona> findById(Long aLong) {
      return personaRepository.findById(aLong);
   }

}
