/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organizaciónu;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juanes
 */
public class EducacionContinuada extends Sede{
    private String cursoPopular;
    public EducacionContinuada(String cursoPopular, String nombre, String direccion, 
            String telefono, String areaContruida) {
        super(nombre, direccion, telefono, areaContruida);
        this.cursoPopular = cursoPopular;
    }
    
    public String getCursoPopular() {
        return cursoPopular;
    }

    public void setCursoPopular(String cursoPopular) {
        this.cursoPopular = cursoPopular;
    }

    @Override
    public void RegistrarDatos(PrintWriter linea)throws IOException{
        linea.println("Educación continuada");
        linea.println(this.nombre);
        linea.println(this.direccion);
        linea.println(this.telefono);
        linea.println(this.areaContruida);
        linea.println(this.cursoPopular);
        linea.println("-------------------------------------------------------------");
    }
    @Override
    public void Programa(ProgramasFormacion p){
        System.out.println("Este tipo de sede no  brinda programas de formación.");
    }
    @Override
    public void darInfo(PrintWriter linea3){
        linea3.println("-------------------------------------------------------------");
        linea3.println("-Nombre: "+this.nombre);
        linea3.println("-Direccion: "+this.direccion);
        linea3.println("-Telefono: "+this.telefono);
        linea3.println("-Area construida: "+this.areaContruida);
        linea3.println("-Curso mas popular: "+this.cursoPopular);
        linea3.println("-------------------------------------------------------------");
    }
    
}
