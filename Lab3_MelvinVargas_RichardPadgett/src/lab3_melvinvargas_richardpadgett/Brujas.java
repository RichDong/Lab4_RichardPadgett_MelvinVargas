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

    public String getNombreg() {
        return nombreg;
    }

    public void setNombreg(String nombreg) {
        this.nombreg = nombreg;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getLugarn() {
        return lugarn;
    }

    public void setLugarn(String lugarn) {
        this.lugarn = lugarn;
    }

    @Override
    public String toString() {
        return "Brujas{" + "suglon=" + suglon + ", lugar=" + lugar + '}';
    }
    
    @Override
    public void ataque(ArrayList<Jugadores> jug, boolean turn) {
     
    }
    
}
