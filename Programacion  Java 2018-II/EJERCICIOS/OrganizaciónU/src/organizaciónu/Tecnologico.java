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
public class Tecnologico extends Sede{
    private String estudiantesMatriculados;
    private ArrayList<ProgramasFormacion>programas;

    public Tecnologico(String estudiantesMatriculados,String nombre, String direccion, 
            String telefono, String areaContruida) {
        super(nombre, direccion, telefono, areaContruida);
        this.estudiantesMatriculados = estudiantesMatriculados;
        this.programas = new ArrayList<ProgramasFormacion>();
    }
    
    public boolean addPrograma(ProgramasFormacion p){
        return this.programas.add(p);
    }
    public boolean removePrograma(ProgramasFormacion p){
        return this.programas.remove(p);
    }
    public String getEstudiantesMatriculados() {
        return estudiantesMatriculados;
    }

    public void setEstudiantesMatriculados(String estudiantesMatriculados) {
        this.estudiantesMatriculados = estudiantesMatriculados;
    }

    public ArrayList<ProgramasFormacion> getProgramas() {
        return programas;
    }

    public void setProgramas(ArrayList<ProgramasFormacion> programas) {
        this.programas = programas;
    }
    
    @Override
    public void RegistrarDatos(PrintWriter linea)throws IOException{
        linea.println("Tecnológico");
        linea.println(this.nombre);
        linea.println(this.direccion);
        linea.println(this.telefono);
        linea.println(this.areaContruida);
        linea.println(this.estudiantesMatriculados);
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
        linea3.println("-Estudiantes matriculados: "+this.estudiantesMatriculados);
        linea3.println("-Programas de formacion: ");
        for (int i = 0; i < this.programas.size(); i++) {
            linea3.println(this.programas.get(i).getNombre());
        }
        linea3.println("-------------------------------------------------------------");
    }
}

