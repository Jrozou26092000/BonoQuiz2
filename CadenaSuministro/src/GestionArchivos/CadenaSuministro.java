/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionArchivos;

import Data.*;
import GUI.GUI;
import java.io.*;
import java.util.*;

/**
 *
 * @author Juanes
 */
public class CadenaSuministro {
    private String nombre;
    private ArrayList<Eslabon> eslabones;

    public CadenaSuministro(String nombre) {
        this.nombre = nombre;
        this.eslabones = new ArrayList<>();
    }
    
    public void Cargar(Scanner lector){
        System.out.println("Cargando...");
        
    }
    
    public void Guardar(PrintWriter pw2,PrintWriter pw1){
        System.out.println("Guardando...");
        for (int i = 0; i < this.eslabones.size(); i++) {
            if(this.eslabones.getClass().getName().equals("Data.Farmer")){
                Eslabon farmer = (Farmer)this.eslabones.get(i);
                pw2.println("Farmer");
                pw2.println(farmer.getNombre());
                pw2.println(farmer.getDescripcion());
                pw2.println(farmer.getLatitud());
                pw2.println(farmer.getLongitud());
                pw2.println("->Productos:");
                for (int j = 0; j < farmer.getProductos().size(); j++) {
                    ProductoCultivo pCultivo =(ProductoCultivo)farmer.getProductos().get(j);
                    pw2.println(pCultivo.getNombre());
                }
            }else if (this.eslabones.getClass().getName().equals("Data.Manufacturer")) {
                Eslabon manufacturer = (Manufacturer)this.eslabones.get(i);
                pw2.println("Manufacturer");
                pw2.println(manufacturer.getNombre());
                pw2.println(manufacturer.getDescripcion());
                pw2.println(manufacturer.getLatitud());
                pw2.println(manufacturer.getLongitud());
                pw2.println("->Productos:");
                for (int j = 0; j < manufacturer.getProductos().size(); j++) {
                    ProductoFabrica pFabrica =(ProductoFabrica)manufacturer.getProductos().get(j);
                    pw2.println("PFabrica");
                    pw2.println(pFabrica.getNombre());
                    ArrayList<ProductoCultivo> materiaPrima = pFabrica.getMateriaPrima();
                    for (int k = 0; k < 10; k++) {
                        pw2.println(materiaPrima.get(k).getNomIngrediente());
                        pw2.println(materiaPrima.get(k).getNomGranja());
                    }
                }
            }else if (this.eslabones.getClass().getName().equals("Data.DistributionCenter")) {
                Eslabon distribution = (DistributionCenter)this.eslabones.get(i);
                pw2.print("Distribution");
                pw2.print(distribution.getNombre());
                pw2.print(distribution.getDescripcion());
                pw2.print(distribution.getLatitud());
                pw2.print(distribution.getLongitud());
            }else if (this.eslabones.getClass().getName().equals("Data.Retail")) {
                Eslabon retail = (Retail)this.eslabones.get(i);
                pw2.print("Retail");
                pw2.print(retail.getNombre());
                pw2.print(retail.getDescripcion());
                pw2.print(retail.getLatitud());
                pw2.print(retail.getLongitud());
                pw1.print(retail.getNombre());
                for (int j = 0; j < retail.getProductos().size(); j++) {
                    pw1.println("-----------------------------------------------");
                    ProductoVenta v = (ProductoVenta) retail.getProductos().get(j);
                    pw1.println(v.getCodigoVenta());
                    pw1.println();
                }
            }
        }
    }
    public boolean addEslabon(Eslabon e){
        return this.eslabones.add(e);
    }
    public void RegistrarEslabon(PrintWriter pw1){
        
    }
    public void RegistrarProducto(PrintWriter pw, GUI gui){
        
    }
    public boolean VenderProducto(Scanner lector){
        return true;
    }
}
