/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_melvinvargas_richardpadgett;

import java.util.ArrayList;

public class Magos extends Guerreros {

    String tipom;
    String elemnt;

    public Magos() {
    }

    public Magos(String tipom, String elemnt) {
        this.tipom = tipom;
        this.elemnt = elemnt;
    }

    public Magos(String tipom, String elemnt, String nombreg, int edad, int ataque, int salud, int costo, String lugarn) {
        super(nombreg, edad, ataque, salud, costo, lugarn);
        this.tipom = tipom;
        this.elemnt = elemnt;
    }

    public String getTipom() {
        return tipom;
    }

    public void setTipom(String tipom) {
        this.tipom = tipom;
    }

    public String getElemnt() {
        return elemnt;
    }

    public void setElemnt(String elemnt) {
        this.elemnt = elemnt;
    }



    @Override
    public String toString() {
        return "Nombre: " + super.nombreg + "\nEdad: " + super.edad + "Nivel de ataque: " + super.ataque + "\n salud: " + super.salud + "\nCosto: " + super.costo + "\n Lugar de Nacimiento: " + super.lugarn + "\nTipo de magia: " + tipom + "\n Elemento favorito" + elemnt;
    }

    @Override
    public boolean ataque(ArrayList<Jugadores> jug, boolean turn,boolean ganador) {
        if(turn==false){
            this. ataque=(jug.get(0).getG().getAtaque())+ (jug.get(1).getG().getAtaque()/2);
            if(jug.get(1).getG().getSalud()-ataque>=0){
                jug.get(1).getG().setSalud(jug.get(1).getG().getSalud()-ataque);
              
            }else{
                System.out.println("jugador 2 su guerrero ha muerto :(");
                ganador=true;
            }
   
        }else{
            this. ataque=(jug.get(1).getG().getAtaque())+ (jug.get(0).getG().getAtaque()/2);
            if(jug.get(0).getG().getSalud()-ataque>=0){
                jug.get(0).getG().setSalud(jug.get(0).getG().getSalud()-ataque);
            }else{
                System.out.println("jugador 1 su guerrero ha muerto :(");
                ganador=true;
            }
        }
        return ganador;
    }

}
