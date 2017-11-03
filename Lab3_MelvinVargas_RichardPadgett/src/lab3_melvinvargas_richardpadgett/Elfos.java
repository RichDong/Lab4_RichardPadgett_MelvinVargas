
package lab3_melvinvargas_richardpadgett;

import java.util.ArrayList;


public class Elfos extends Guerreros  {
String tipoar;
String rangom;

    public Elfos() {
    }

    public Elfos(String tipoar, String rangom) {
        this.tipoar = tipoar;
        this.rangom = rangom;
    }

    public Elfos(String tipoar, String rangom, String nombreg, int edad, int ataque, int salud, int costo, String lugarn) {
        super(nombreg, edad, ataque, salud, costo, lugarn);
        this.tipoar = tipoar;
        this.rangom = rangom;
    }

    public String getTipoar() {
        return tipoar;
    }

    public void setTipoar(String tipoar) {
        this.tipoar = tipoar;
    }

    public String getRangom() {
        return rangom;
    }

    public void setRangom(String rangom) {
        this.rangom = rangom;
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
        return  "Nombre: " + super.nombreg + "\nEdad: " + super.edad + "Nivel de ataque: " + super.ataque + "\n salud: " + super.salud + "\nCosto: " + super.costo + "\n Lugar de Nacimiento: " +super.lugarn+"\nTipo de Arma" + tipoar + "\n Rango de Arma: " + rangom;
    }
    

    @Override
    public void ataque(ArrayList<Jugadores> jug, boolean turn) {
        
    }
    
}
