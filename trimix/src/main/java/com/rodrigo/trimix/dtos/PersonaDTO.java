package com.rodrigo.trimix.dtos;

import lombok.Data;

import java.util.Date;

@Data
public class PersonaDTO {

   private long perId;
   private String perApellido;
   private Date perFechaNacimiento;
   private String perNombre;
   private long perNumeroDocumento;
   private String perTipoDocumento;
}
