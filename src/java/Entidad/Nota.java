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
public class Nota {
    int Id;
    String Carne;
    String Codigo_curso;
    String Nota;

    public Nota() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
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

    public String getNota() {
        return Nota;
    }

    public void setNota(String Nota) {
        this.Nota = Nota;
    }
    
}
