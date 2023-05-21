package com.rodrigo.trimix.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "Persona")
public class Persona {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long perId;

   @Column(name = "perApellido")
   private String perApellido;

   @Column(name = "perFechaNacimiento")
   private Date perFechaNacimiento;

   @Column(name = "perNombre")
   private String perNombre;

   @Column(name = "perNumeroDocumento")
   private long perNumeroDocumento;

   @Column(name = "perTipoDocumento")
   private String perTipoDocumento;

}
