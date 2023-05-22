package com.rodrigo.trimix.controllers;

import com.rodrigo.trimix.models.Persona;
import com.rodrigo.trimix.services.PersonaService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/persona")
public class PersonaController {

   @Autowired
   private PersonaService personaService;

   @PostMapping(value = "/save")
   @ApiOperation("Permite guardar o actualizar una persona")
   public ResponseEntity<?> save(@RequestBody Persona persona) {
      try {
         Persona personaGuardada = personaService.save(persona);
         return ResponseEntity.status(HttpStatus.OK).body(personaGuardada.getPerId());
      } catch (Exception e) {
         return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error al guardar una persona: " + e.getMessage());
      }
   }


   @DeleteMapping(value = "/delete")
   @ApiOperation("Elimina una persona por ID")
   public ResponseEntity<?> delete(@RequestParam("idPersona") Long idPersona) {
      try {
         personaService.deleteById(idPersona);
         return ResponseEntity.status(HttpStatus.OK).body("Persona eliminada correctamente");
      } catch (Exception e) {
         return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error al eliminar la persona: " + e.getMessage());
      }
   }


   @GetMapping(value = "/findAll")
   @ApiOperation("Devuelve un listado de todas las personas")
   public ResponseEntity<?> findAll() {
      try {
         return ResponseEntity.status(HttpStatus.OK).body(personaService.findAll());
      } catch (Exception e) {
         return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error al buscar la lista de personas: " + e.getMessage());
      }
   }

   @GetMapping(value = "/findById")
   @ApiOperation("Busca una persona por ID")
   public ResponseEntity<?> findById(@RequestParam("idPersona") Long idPersona) {
      try {
         return ResponseEntity.status(HttpStatus.OK).body(personaService.findById(idPersona));
      } catch (Exception e) {
         return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error al buscar la persona: " + e.getMessage());
      }
   }

}
