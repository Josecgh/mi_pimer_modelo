package dev.jose;

import java.time.Year;

public class Persona {

  private String nombre;
  private String apellidos;
  private String dni;
  private int nacimiento;
  
  public Persona(String nombre, String apellidos, String dni, int nacimiento){
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.dni = dni;
    this.nacimiento = nacimiento;
  }

  public String getNombre(){
    return nombre;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public String getApellidos(){
    return apellidos;
  }

  public void setApellidos(String apellidos){
    this.apellidos = apellidos;
  }

  public String getDni(){
    return dni;
  }

  public void setDni(String dni){
    this.dni = dni;
  }

  public int getNacimiento(){
    return nacimiento;
  }

  public void setNacimiento(int nacimiento){
    this.nacimiento = nacimiento;
  }

  public int calcularEdad(){
    int anioActual = Year.now().getValue();
    return anioActual - this.nacimiento;
  }

  public int getEdad(){
    return calcularEdad();
  }

  @Override
  public String toString() {
    return "Persona{" +
           "nombre='" + nombre + '\'' +
           ", apellidos='" + apellidos + '\'' +
           ", dni=" + dni +
           ", nacimiento=" + nacimiento +
           ", edad=" + getEdad() + // Mostramos la edad calculada al vuelo
           '}';
  } 
}