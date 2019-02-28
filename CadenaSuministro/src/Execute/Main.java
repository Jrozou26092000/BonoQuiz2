/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Execute;
import Data.Eslabon;
import Data.Farmer;
import Exception.ProgramException;
import GUI.GUI;
import GestionArchivos.CadenaSuministro;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author Juanes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CadenaSuministro cadena = new CadenaSuministro("X");
        System.out.println("------------Bienvenido a la cadena de suministro X"
                + "------------------------");
        
        File file_1 = new File("RegistroProducto");
        File file_2 = new File("InfoEslabones");
        GUI gui = new GUI();
        
        while(true){
            try{
                PrintWriter pw1 = new PrintWriter(file_1);
                Scanner lector = new Scanner(file_1);
                lector.useDelimiter(",");
                PrintWriter pw2 = new PrintWriter(file_2);
                int opcion = gui.MostrarMenu();
                switch(opcion){
                    case 1:
                        cadena.Cargar(lector);
                        break;
                    case 2: 
                        cadena.Guardar(pw2,pw1);
                        break;
                    case 3: 
                        cadena.RegistrarEslabon(pw2);
                        break;
                    case 4: 
                        cadena.RegistrarProducto(pw1,gui);
                        break;
                    case 5: 
                        cadena.VenderProducto(lector);
                        break;
                    default: break;
                }
            }catch(ProgramException p){
                System.out.println(p.getMessage());
            }catch(FileNotFoundException f){
                System.out.println("No se encontró el archivo.");
            }
            
        }
    }
    
}
