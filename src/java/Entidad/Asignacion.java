/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Alejandro Montalvo
 */
public class Asignacion {
    int Id;
    String Nombre_Estudiante;
    String Carne;
    String Codigo_curso;

    public Asignacion() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre_Estudiante() {
        return Nombre_Estudiante;
    }

    public void setNombre_Estudiante(String Nombre_Estudiante) {
        this.Nombre_Estudiante = Nombre_Estudiante;
    }

    public String getCarne() {
        return Carne;
    }

    public void setCarne(String Carne) {
        this.Carne = Carne;
    }

    public String getCodigo_curso() {
        return Codigo_curso;
    }

    public void setCodigo_curso(String Codigo_curso) {
        this.Codigo_curso = Codigo_curso;
    }
    
}
