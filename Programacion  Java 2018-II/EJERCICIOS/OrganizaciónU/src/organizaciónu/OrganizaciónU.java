/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organizaciónu;

import java.io.File;
import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Juanes
 */
public class OrganizaciónU {

    /**
     * @param args the command line arguments
     */
    public static void Plantilla(File sede, boolean decision,Universidad un, 
            File programas,File info) throws IOException{
        //Para el archivo de registro de sedes (Para registar una sede se hará con
        // fw, linea,br
        FileWriter fw = new FileWriter(sede,decision);
        PrintWriter linea= new PrintWriter(fw);
        BufferedReader br = new BufferedReader(new FileReader(sede));
        //Para el registro de programas (Para registrar un progrma se hará con
        //fw2,linea2,br2
        FileWriter fw2 = new FileWriter(programas,decision);
        PrintWriter linea2= new PrintWriter(fw2);
        BufferedReader br2 = new BufferedReader(new FileReader(programas));
        //Para dar la info de las sedes se usará fw3,linea3
        FileWriter fw3 = new FileWriter(info,false);
        PrintWriter linea3= new PrintWriter(fw3);
        if (decision==false) {
        linea.println("--------------Explicación uso del formato-----------------");
        linea.println("1 Tipo: Profesional, Tecnológico o Educación continuada.");
        linea.println("2 Nombre: Nombre de la sede.");
        linea.println("3 Dirección: Dirección de la sede.");
        linea.println("4 Teléfono: Teléfono de la sede.");
        linea.println("5 Área construida: Área total contruida en mtros cuadrados.");
        linea.println("6 Programas alta calidad: Sólo aplica para sedes de tipo Profesional.");
        linea.println("7 Curso más popular: Sólo aplica para sedes de tipo Educación continuada.");
        linea.println("8 Estudaintes matriculados: Sólo aplica para sedes de tipo Tecnológico.");
        linea.println("9 Programas ofrecidos: Progrmas de formación que ofrece la sede.");
        linea.println("-------------------------------------------------------------");
        //Instrucciones
        un.registarSede(linea);
        un.registarSede(linea);
        un.registarSede(linea);
        }else{
            //Funciones necesarias (en ese orden) para que cada vez que el 
            //programa corra se actualicen
            //los datos que se encuentran en el txt.
            un.ActualizarDatosSedes(br);
            un.ActualizarDatosProgramas(br2);
            //Instrucciones
            un.RegistrarPrograma(linea2);
            un.RegistrarPrograma(linea2);
            //El metodo darInformacion se coloca al final para que una vez ya 
            //cargados los datos se impriman en el txt
            un.darInformacion(linea3);
        }
        fw.close();
        linea.close();
        br.close();
        //---------------
        fw2.close();
        linea2.close();
        br2.close();
        //--------------
        fw3.close();
        linea3.close();
    }
    public static void main(String[] args) {
        Universidad un = new Universidad("X");
        File sede = new File("RegistroSedes");
        File programas = new File("RegistroProgramas");
        File info = new File("InformacionSedes");
        System.out.println("Qué desea hacer¿?");
        System.out.println("1- Registrar datos");
        System.out.println("2- Registrar y borrar los datos existentes");
        Scanner leer = new Scanner(System.in);
        int opcion = leer.nextInt();
        boolean decision = true;
        if (opcion==1) {
            decision = true;
        }else if(opcion==2){
            decision = false;
        }
        try{
            Plantilla(sede,decision,un,programas,info);
        }catch(IOException e){
            System.out.println("No se encontró el archivo");
        }
    }
    
}
