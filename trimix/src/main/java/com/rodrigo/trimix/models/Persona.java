package com.rodrigo.trimix.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@Entity
@Table(name = "Persona")
@NoArgsConstructor
public class Persona implements Serializable {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "per_id")
   private long perId;

   @Column(name = "per_apellido")
   private String perApellido;

   @Column(name = "per_fecha_nacimiento")
   private Date perFechaNacimiento;

   @Column(name = "per_nombre")
   private String perNombre;

   @Column(name = "per_numero_documento")
   private long perNumeroDocumento;

   @Column(name = "per_tipo_documento")
   private String perTipoDocumento;

}



