/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_melvinvargas_richardpadgett;

import java.util.ArrayList;

/**
 *
 * @author richa
 */
public class Brujas extends Guerreros {
    int suglon;
    String lugar;

    public Brujas() {
    }

    public Brujas(int suglon, String lugar) {
        this.suglon = suglon;
        this.lugar = lugar;
    }

    public Brujas(int suglon, String lugar, String nombreg, int edad, int ataque, int salud, int costo, String lugarn) {
        super(nombreg, edad, ataque, salud, costo, lugarn);
        this.suglon = suglon;
        this.lugar = lugar;
    }

    public int getSuglon() {
        return suglon;
    }

    public void setSuglon(int suglon) {
        this.suglon = suglon;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }


    @Override
    public String toString() {
        return "Nombre: " + super.nombreg + "\nEdad: " + super.edad + "N\nivel de ataque: " + super.ataque + "\n salud: " + super.salud + "\nCosto: " + super.costo + "\n Lugar de Nacimiento: "+"\nSiglo de navimiento: " + suglon + "\nlugar de residencia: " + lugar;
    }
    
    @Override
    public boolean ataque(ArrayList<Jugadores> jug, boolean turn,boolean ganador) {
     return ganador;
    }
    
}
