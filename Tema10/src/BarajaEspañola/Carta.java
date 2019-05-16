/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BarajaEspañola;

import java.util.Objects;

/**
 *
 * @author Luis
 */
public class Carta {
    
    
    private static String palos[] = {"Oros", "Copas", "Espadas", "Bastos"};
    private static String numerosCartas[] = {"As", "2", "3", "4", "5", "6","7",
    "Sota","Caballo","Rey"};
    
    private String palo;
    private String numeroCarta;
    
    
    public Carta(){
        this.palo = palos[(int)(Math.random()*4)];
        this.numeroCarta = numerosCartas[(int) (Math.random()*10)];
    }

    public String getPalo() {
        return palo;
    }

    public String getNumeroCarta() {
        return numeroCarta;
    }

    @Override
    public String toString() {
        return numeroCarta+" de "+ palo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carta other = (Carta) obj;
        if (!Objects.equals(this.palo, other.palo)) {
            return false;
        }
        if (!Objects.equals(this.numeroCarta, other.numeroCarta)) {
            return false;
        }
        return true;
    }
    
}