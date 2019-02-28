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
public class Fecha {
    private int dia;
    private int mes;
    private int annio;
    private Eslabon eslabon;

    public Fecha(int dia, int mes, int annio, Eslabon eslabon) {
        this.dia = dia;
        this.mes = mes;
        this.annio = annio;
        this.eslabon = eslabon;
    }

    public Eslabon getEslabon() {
        return eslabon;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnnio() {
        return annio;
    }
    
}
