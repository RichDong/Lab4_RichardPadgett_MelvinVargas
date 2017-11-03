/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_melvinvargas_richardpadgett;

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
        return "Arqueros{" + "materialarc=" + materialarc + ", materialarm=" + materialarm + '}';
    }
    
    @Override
    public void ataque() {
       
    }
    
}
