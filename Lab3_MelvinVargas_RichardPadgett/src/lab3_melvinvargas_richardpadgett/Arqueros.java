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
public class Arqueros extends Guerreros {

    String materialarc;
    String materialarm;

    public Arqueros() {
    }

    public Arqueros(String materialarc, String materialarm) {
        this.materialarc = materialarc;
        this.materialarm = materialarm;
    }

    public Arqueros(String materialarc, String materialarm, String nombreg, int edad, int ataque, int salud, int costo, String lugarn) {
        super(nombreg, edad, ataque, salud, costo, lugarn);
        this.materialarc = materialarc;
        this.materialarm = materialarm;
    }

    public String getMaterialarc() {
        return materialarc;
    }

    public void setMaterialarc(String materialarc) {
        this.materialarc = materialarc;
    }

    public String getMaterialarm() {
        return materialarm;
    }

    public void setMaterialarm(String materialarm) {
        this.materialarm = materialarm;
    }

    @Override
    public String toString() {
        return "Nombre: " + super.nombreg + "\nEdad: " + super.edad + "\nNivel de ataque: " + super.ataque + "\n salud: " + super.salud + "\nCosto: " + super.costo + "\n Lugar de Nacimiento: " + "\nMaterial Arco: " + materialarc + "\nmaterial de arma" + materialarm;
    }

    @Override
    public boolean ataque(ArrayList<Jugadores> jug, boolean turn, boolean ganador) {
        if (turn == false) {
            this.ataque = (jug.get(0).getG().getAtaque());
            if (jug.get(1).getG().getSalud() - ataque >= 0) {
                jug.get(0).getG().setSalud(jug.get(0).getG().getSalud() + 10);
                jug.get(1).getG().setSalud(jug.get(1).getG().getSalud() - ataque);
                return true;
            } else {
                System.out.println("jugador 2 su guerrero ha muerto");
                return false;
            }

        } else {
            this.ataque = (jug.get(1).getG().getAtaque());
            if (jug.get(0).getG().getSalud() - ataque >= 0) {
                jug.get(0).getG().setSalud(jug.get(0).getG().getSalud() - ataque);
                jug.get(1).getG().setSalud(jug.get(1).getG().getSalud() + 10);
                return true;
            } else {
                System.out.println("jugador 1 su guerrero ha muerto :(");
                return false;
            }
        }

    }

}
