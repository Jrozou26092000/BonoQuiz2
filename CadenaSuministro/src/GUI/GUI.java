/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Exception.ProgramException;
import java.util.Scanner;

/**
 *
 * @author Juanes
 */
public class GUI {
    public int MostrarMenu() throws ProgramException{
        Scanner leer = new Scanner(System.in);
        System.out.println("1-Cargar\n2-Guardar\n3-Registrar eslabon\n 4-"
                + "Registrar producto\n5-Vender producto");
        int opcion = leer.nextInt();
        if((opcion>5)||(opcion<1)){
            throw new ProgramException("Opcion no valida (menu principal).");
        }
        return opcion;
    }
}
