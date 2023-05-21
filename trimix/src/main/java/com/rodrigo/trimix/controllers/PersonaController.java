package com.rodrigo.trimix.controllers;

import com.rodrigo.trimix.models.Persona;
import com.rodrigo.trimix.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/persona/")
public class PersonaController {

   @Autowired
   private PersonaService personaService;

   @PostMapping(value = "/save")
   public ResponseEntity<?> save(@RequestBody Persona persona) {
      try {
         Persona personaGuardada = personaService.save(persona);
         return ResponseEntity.status(HttpStatus.OK).body(personaGuardada.getPerId());
      } catch (Exception e) {
         return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error al guardar una persona: " + e.getMessage());
      }
   }

   @GetMapping(value = "/findAll")
   public ResponseEntity<?> findAll() {
      try {
         return ResponseEntity.status(HttpStatus.OK).body(personaService.findAll());
      } catch (Exception e) {
         return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error al buscar la lista de personas: " + e.getMessage());
      }
   }

}
