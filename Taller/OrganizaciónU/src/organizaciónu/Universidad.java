/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organizaciónu;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Juanes
 */
public class Universidad {
    private String nombre;
    private ArrayList<Sede> sedes;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.sedes = new ArrayList<Sede>();
    }

    public void registarSede(PrintWriter linea) throws IOException{
        System.out.println("-----¿Que tipo de sede desea registrar?---------");        
        System.out.println("1- Profesional");
        System.out.println("2- Tecnologico");
        System.out.println("3- Educacion continuada");
        Scanner leer = new Scanner(System.in);
        int a = leer.nextInt();
        switch(a){
            case 1:
                System.out.println("- Nombre:");
                String n1 = leer.next();
                System.out.println("- Direccion: ");
                String d1 = leer.next();
                System.out.println("- Telfono:");
                String t1 = leer.next();
                System.out.println("- Area contruida: ");
                String ac1 = leer.next();
                System.out.println("- Numero programas de alta calidad:");
                String p = leer.next();
                Sede profesional = new Profesional(p, n1, d1, t1, ac1);
                this.sedes.add(profesional);
                profesional.RegistrarDatos(linea);
                break;
            case 2:
                System.out.println("- Nombre:");
                String n2 = leer.next();
                System.out.println("- Direccion: ");
                String d2 = leer.next();
                System.out.println("-Telfono:");
                String t2 = leer.next();
                System.out.println("Area contruida: ");
                String ac2 = leer.next();
                System.out.println("Numero de estudiantes matriculados: ");
                String e = leer.next();
                Sede tecnologico = new Tecnologico(e, n2, d2, t2, ac2);
                this.sedes.add(tecnologico);
                tecnologico.RegistrarDatos(linea);
                break;
            case 3: 
                System.out.println("- Nombre:");
                String n3 = leer.next();
                System.out.println("- Direccion: ");
                String d3 = leer.next();
                System.out.println("-Telfono:");
                String t3 = leer.next();
                System.out.println("Area contruida: ");
                String ac3 = leer.next();
                System.out.println("-Curso mas popular: ");
                String c = leer.next();
                Sede eContinuada = new EducacionContinuada(c, n3, d3, t3, ac3);
                this.sedes.add(eContinuada);
                eContinuada.RegistrarDatos(linea);
                break;
        }
    }
    
    public void ActualizarDatosSedes(BufferedReader br)throws IOException{
        try{
            while(null!=br.readLine()){
                switch (br.readLine()) {
                    case "Tecnológico":
                        {
                            String n = br.readLine();
                            //System.out.println(n);
                            String d = br.readLine();
                            String t = br.readLine();
                            String ac = br.readLine();
                            String e = br.readLine();
                            this.sedes.add(new Tecnologico(e, n, d, t, ac));
                            break;
                        }
                    case "Profesional":
                        {
                            String n = br.readLine();
                            //System.out.println(n);
                            String d = br.readLine();
                            //System.out.println(d);
                            String t = br.readLine();
                            //System.out.println(t);
                            String ac = br.readLine();
                            //System.out.println(ac);
                            String a = br.readLine();
                            //System.out.println(a);
                            this.sedes.add(new Profesional(a, n, d, t, ac));
                            break;
                        }
                    case "Educación continuada":
                        {
                            String n = br.readLine();
                            //System.out.println(n);
                            String d = br.readLine();
                            //System.out.println(d);
                            String t = br.readLine();
                            //System.out.println(t);
                            String ac = br.readLine();
                            //System.out.println(ac);
                            String c = br.readLine();
                            //System.out.println(c);
                            this.sedes.add(new EducacionContinuada(c, n, d, t, ac));
                            break;
                        }
                    default:
                        break;
                }
            }
        }catch(NullPointerException e){
            System.out.println("Aviso");
        }
    }
    public boolean RegistrarPrograma(PrintWriter linea2){
        Scanner leer = new Scanner(System.in);
        System.out.println("-Nombre del programa a registrar: ");
        String n = leer.next();
        System.out.println("-Descripcion: ");
        String d = leer.next();
        System.out.println("-Nombre de la sede: ");
        String sede = leer.next();
        System.out.println("-Seleccione el tipo de sede: ");
        System.out.println("1- Profesional");
        System.out.println("2- Tecnologico");
        int seleccion = leer.nextInt();
        switch(seleccion){
            case 1:
                for (int i = 0; i < this.sedes.size(); i++) {
                    if(sede.equals(this.sedes.get(i).getNombre())){
                        System.out.println("-Tipo de programa: ");
                        String t = leer.next();
                        ProgramasFormacion p = new ProgramasFormacion(n, t, d);
                        this.sedes.get(i).Programa(p);
                        linea2.println("-------------------------------------------------------------");
                        linea2.println(sede);
                        linea2.println(p.getNombre());
                        linea2.println(p.getTipo());
                        linea2.println(p.getDescripcion());
                        linea2.println("-------------------------------------------------------------");
                        return true;
                    }
                }
                break;
            case 2:
                for (int i = 0; i < this.sedes.size(); i++) {
                    if(sede.equals(this.sedes.get(i).getNombre())){
                        ProgramasFormacion p2 = new ProgramasFormacion(n, "Tecnológico", d);
                        this.sedes.get(i).Programa(p2);
                        linea2.println("-------------------------------------------------------------");
                        linea2.println(sede);
                        linea2.println(p2.getNombre());
                        linea2.println(p2.getTipo());
                        linea2.println(p2.getDescripcion());
                        linea2.println("-------------------------------------------------------------");
                        return true;
                    }
                }
                break;
            default:
                break;
        }
        System.out.println("No se encontro la sede ó ingreso mal los datos");
        return false;
    }
    public void ActualizarDatosProgramas(BufferedReader br2)throws IOException{
        try{
            while(null!=br2.readLine()){ 
                for (int i = 0; i < this.sedes.size(); i++) {
                    if(this.sedes.get(i).getNombre().equals(br2.readLine())){
                        String n = br2.readLine();
                        //System.out.println(n);
                        String t = br2.readLine();
                        //System.out.println(t);
                        String d = br2.readLine();
                        //System.out.println(d);
                        this.sedes.get(i).Programa(new ProgramasFormacion(n, t, d));
                    }
                }
            }
        }catch(NullPointerException e){
            System.out.println("Aviso");
        }
    }
    public void darInformacion(PrintWriter linea3){
        for (int i = 0; i < this.sedes.size(); i++) {
            this.sedes.get(i).darInfo(linea3);
        }
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public ArrayList<Sede> getSedes() {
        return sedes;
    }

    public void setSedes(ArrayList<Sede> sedes) {
        this.sedes = sedes;
    }
}
