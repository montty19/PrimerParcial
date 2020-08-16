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
public class Acta {
    int Id;
    String Carne;
    String Codigo_curso;
    String Codigo_catedratico;
    String Fecha;
    String Nota;

    public Acta() {
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

    public String getCodigo_catedratico() {
        return Codigo_catedratico;
    }

    public void setCodigo_catedratico(String Codigo_catedratico) {
        this.Codigo_catedratico = Codigo_catedratico;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getNota() {
        return Nota;
    }

    public void setNota(String Nota) {
        this.Nota = Nota;
    }
    
}
