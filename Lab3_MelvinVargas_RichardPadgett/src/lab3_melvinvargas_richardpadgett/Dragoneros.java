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
public class Dragoneros extends Guerreros {

    String color;
    String raza;

    public Dragoneros() {
    }

    public Dragoneros(String color, String raza) {
        this.color = color;
        this.raza = raza;
    }

    public Dragoneros(String color, String raza, String nombreg, int edad, int ataque, int salud, int costo, String lugarn) {
        super(nombreg, edad, ataque, salud, costo, lugarn);
        this.color = color;
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Nombre: " + super.nombreg + "\nEdad: " + super.edad + "\nNivel de ataque: " + super.ataque + "\n salud: " + super.salud + "\nCosto: " + super.costo + "\n Lugar de Nacimiento: " + super.lugarn + "\n color: " + color + "\n raza: " + raza;
    }

    @Override
    public boolean ataque(ArrayList<Jugadores> jug, boolean turn, boolean ganador) {
        if(turn==false){
            this. ataque=(jug.get(0).getG().getAtaque());
            if(jug.get(1).getG().getSalud()-ataque>=0){
                jug.get(1).getG().setAtaque(jug.get(1).getG().getAtaque()*0.25);
                jug.get(1).getG().setSalud(jug.get(1).getG().getSalud()-ataque);
               return true;
            }else{
                System.out.println("jugador 2 su guerrero ha muerto");
                return false;
            }
   
        }else{
            this. ataque=(jug.get(1).getG().getAtaque());
            if(jug.get(0).getG().getSalud()-ataque>=0){
                jug.get(0).getG().setSalud(jug.get(0).getG().getSalud()-ataque);
                 jug.get(0).getG().setAtaque(jug.get(0).getG().getAtaque()*0.25);
                return true;
            }else{
                System.out.println("jugador 1 su guerrero ha muerto :(");
                return false;
            }
        }
    }
}
