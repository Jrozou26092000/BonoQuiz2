/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organizaciónu;

import java.util.ArrayList;
import java.io.*;
/**
 *
 * @author Juanes
 */
public class Profesional extends Sede{
    private String programasCalidad;
    private ArrayList<ProgramasFormacion> programas;

    public Profesional(String programasCalidad,String nombre, String direccion, 
            String telefono, String areaContruida) {
        super(nombre, direccion, telefono, areaContruida);
        this.programasCalidad = programasCalidad;
        this.programas = new ArrayList<ProgramasFormacion>();
    }
    
    public boolean addPrograma(ProgramasFormacion p){
        return this.programas.add(p);
    }
    public boolean removePrograma(ProgramasFormacion p){
        return this.programas.remove(p);
    }
    public String getProgramasCalidad() {
        return programasCalidad;
    }

    public void setProgramasCalidad(String programasCalidad) {
        this.programasCalidad = programasCalidad;
    }

    public ArrayList<ProgramasFormacion> getProgrmas() {
        return programas;
    }

    public void setProgrmas(ArrayList<ProgramasFormacion> progrmas) {
        this.programas = progrmas;
    }
    
    @Override
    public void RegistrarDatos(PrintWriter linea)throws IOException{
        linea.println("Profesional");
        linea.println(this.nombre);
        linea.println(this.direccion);
        linea.println(this.telefono);
        linea.println(this.areaContruida);
        linea.println(this.programasCalidad);
        linea.println("-------------------------------------------------------------");
    }   
    
    @Override
    public void Programa(ProgramasFormacion p){
       this.programas.add(p);
    }
    @Override
    public void darInfo(PrintWriter linea3){
        linea3.println("-------------------------------------------------------------");
        linea3.println("-Nombre: "+this.nombre);
        linea3.println("-Direccion: "+this.direccion);
        linea3.println("-Telefono: "+this.telefono);
        linea3.println("-Area construida: "+this.areaContruida);
        linea3.println("-Programas de alta calidad: "+this.programasCalidad);
        linea3.println("-Programas de formacion: ");
        for (int i = 0; i < this.programas.size(); i++) {
            linea3.println(this.programas.get(i).getNombre());
        }
        linea3.println("-------------------------------------------------------------");
    }
}
