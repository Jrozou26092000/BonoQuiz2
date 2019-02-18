/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organizaciónu;

/**
 *
 * @author Juanes
 */
public class Estudiante {
    private String nombre;
    private String colegio;
    private int annioGrado;
    private ProgramasFormacion programa;

    public Estudiante(String nombre, String colegio, int annioGrado, ProgramasFormacion programa) {
        this.nombre = nombre;
        this.colegio = colegio;
        this.annioGrado = annioGrado;
        this.programa = programa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public int getAnnioGrado() {
        return annioGrado;
    }

    public void setAnnioGrado(int annioGrado) {
        this.annioGrado = annioGrado;
    }

    public ProgramasFormacion getPrograma() {
        return programa;
    }

    public void setPrograma(ProgramasFormacion programa) {
        this.programa = programa;
    }
    
    
}
