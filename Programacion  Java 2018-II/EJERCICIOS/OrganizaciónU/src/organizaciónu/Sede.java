/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organizaciónu;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Juanes
 */
public abstract class Sede {
    protected String nombre;
    protected String direccion;
    protected String telefono;
    protected String areaContruida;
    protected ArrayList<Estudiante>estudiantes;

    public Sede(String nombre, String direccion, String telefono,String areaContruida) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.areaContruida = areaContruida;
        this.estudiantes = new ArrayList<Estudiante>();
    }
    
    public abstract void RegistrarDatos(PrintWriter linea)throws IOException;
    public abstract void Programa(ProgramasFormacion p);
    public abstract void darInfo(PrintWriter linea3);

    
    public boolean matricularEstudiante(Estudiante e){
        return this.estudiantes.add(e);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAreaContruida() {
        return areaContruida;
    }

    public void setAreaContruida(String areaContruida) {
        this.areaContruida = areaContruida;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    

    
    
    
}
