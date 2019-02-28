/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.ArrayList;

/**
 *
 * @author Juanes
 */
public class Cliente{
    
    private String nombre;
    private ArrayList<Producto> productos;

    public Cliente(String nombre, ArrayList<Producto> productos) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }
    
    public void InfoProductos(){
        for (int i = 0; i < this.productos.size(); i++) {
            ProductoVenta p = (ProductoVenta)this.productos.get(i);
            System.out.println(p.getNombre());
            System.out.println(p.getPrecio());
            System.out.println(p.getCodigoVenta());
            for (int j = 0; j < p.getfRegistros().size(); j++) {
                System.out.println("Nombre eslabon: "+p.getfRegistros().get(i).getEslabon());
                System.out.println(p.getfRegistros().get(i).getDia()+"/"+
                        p.getfRegistros().get(i).getMes()+"/"+p.getfRegistros().get(i).getAnnio());
            }
        }
    }
    
    public boolean addProductos(Producto p){
        return this.productos.add(p);
    }
    
}
