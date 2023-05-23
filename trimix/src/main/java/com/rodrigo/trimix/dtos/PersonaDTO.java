package com.rodrigo.trimix.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class PersonaDTO {

   private long perId;
   private String perApellido;
   private Date perFechaNacimiento;
   private String perNombre;
   private long perNumeroDocumento;
   private String perTipoDocumento;
}
