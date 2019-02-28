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
public class ProductoFabrica extends Producto{
    private int numLote;
    private ArrayList<ProductoCultivo>materiaPrima;

    public ProductoFabrica(int numLote, ArrayList<ProductoCultivo> materiaPrima, 
            String nombre) {
        super(nombre);
        this.numLote = numLote;
        this.materiaPrima = materiaPrima;
    }

    public int getNumLote() {
        return numLote;
    }

    public ArrayList<ProductoCultivo> getMateriaPrima() {
        return materiaPrima;
    }
    
    
    
}
