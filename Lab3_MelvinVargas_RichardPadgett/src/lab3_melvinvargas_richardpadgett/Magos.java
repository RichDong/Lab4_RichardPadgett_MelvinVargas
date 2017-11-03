/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_melvinvargas_richardpadgett;

public class Magos extends Guerreros{
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
        return "Magos{" + "tipom=" + tipom + ", elemnt=" + elemnt + '}';
    }
    
    @Override
    public void ataque() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
