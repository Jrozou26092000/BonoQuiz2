/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.*;

/**
 *
 * @author Juanes
 */
public class Eslabon {
    protected String nombre;
    protected String descripcion;
    protected int latitud;
    protected int longitud;
    protected ArrayList<Producto>productos;

    public Eslabon(String nombre, String descripcion, int latitud, 
            int longitud) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.productos = new ArrayList<>();
    }
    
    public boolean addProducto(Producto p){
        return this.productos.add(p);
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getLatitud() {
        return latitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
    
    
}
