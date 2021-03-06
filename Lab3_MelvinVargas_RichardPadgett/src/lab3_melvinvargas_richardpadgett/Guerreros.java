package lab3_melvinvargas_richardpadgett;

import java.util.ArrayList;

public abstract class Guerreros {

    String nombreg;
    int edad;
    double ataque;
    double salud;
    int costo;

    String lugarn;

    public Guerreros() {
    }

    public Guerreros(String nombreg, int edad, double ataque, double salud, int costo, String lugarn) {
        this.nombreg = nombreg;
        this.edad = edad;
        this.ataque = ataque;
        this.salud = salud;
        this.costo = costo;

    }

    public String getLugarn() {
        return lugarn;
    }

    public void setLugarn(String lugarn) {
        this.lugarn = lugarn;
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

    public double getAtaque() {
        return ataque;
    }

    public double setAtaque(double ataque) {
        if (ataque < 50) {
            this.ataque = ataque;
        }
        return ataque;
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        if (salud >= 100 && salud <= 200) {
            this.salud = salud;
        }

    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        if (costo <= 300) {
            this.costo = costo;
        }

    }

    public abstract boolean ataque(ArrayList<Jugadores> jug, boolean turn,boolean ganador);

    @Override
    public String toString() {
        return "Guerrero: " + "\n nombre: " + nombreg + "\n edad: " + edad + "\n Nivel de Ataque: " + ataque + "\n salud: " + salud + "\n costo: " + costo;
    }
}
