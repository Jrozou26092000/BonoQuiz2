/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author Juanes
 */
public class ProductoCultivo extends Producto{
    private String nomIngrediente;
    private String nomGranja;

    public ProductoCultivo(String nomIngrediente, String nomGranja, String nombre) {
        super(nombre);
        this.nomIngrediente = nomIngrediente;
        this.nomGranja = nomGranja;
    }

    public String getNomGranja() {
        return nomGranja;
    }
    
    

    public String getNomIngrediente() {
        return nomIngrediente;
    }
    
    
    
}
