/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Juanes
 */
public class ProductoVenta extends Producto{
    private double precio;
    private int codigoVenta;
    private ArrayList<Fecha> fRegistros;

    public ProductoVenta(double precio, int codigoVenta,String nombre) {
        super(nombre);
        this.precio = precio;
        this.codigoVenta = codigoVenta;
        this.fRegistros = new ArrayList<>();
    }

    public ArrayList<Fecha> getfRegistros() {
        return fRegistros;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCodigoVenta() {
        return codigoVenta;
    }
    
    public boolean addFRegistros(Fecha f){
        return this.fRegistros.add(f);
    }
    
    
}
