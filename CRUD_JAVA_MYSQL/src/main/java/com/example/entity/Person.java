package com.example.entity;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "person")
@ToString
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "id_number", nullable = false)
    private int idNumber;

    @Column(name = "id_type", nullable = false)
    private String idType;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "gender")
    private char gender;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @ToString.Include(name = "personDetail")
    public String personDetail(){
    char n = '\n'; 
    return
          "Registro: "+getId()+n+
          "DNI: "+getIdNumber()+n+
          "Documento: "+getIdType()+n+
          "Nombre: "+getName()+n+
          "Apellido: "+getLastName()+n+
          "Fecha Nacimiento: "+getBirthDate()+n+
          "Genero: "+getGender()+n+
          "Email: "+getEmail()+n+
          "Telefono: "+getPhone()+n;
  }

}
