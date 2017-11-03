package lab3_melvinvargas_richardpadgett;

import java.util.ArrayList;

public class Elfos extends Guerreros {

    String tipoar;
    String rangom;

    public Elfos() {
    }

    public Elfos(String tipoar, String rangom) {
        this.tipoar = tipoar;
        this.rangom = rangom;
    }

    public Elfos(String tipoar, String rangom, String nombreg, int edad, double ataque, int salud, int costo, String lugarn) {
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
    
    @Override
    public String toString() {
        return "Nombre: " + super.nombreg + "\nEdad: " + super.edad + "\nNivel de ataque: " + super.ataque + "\n salud: " + super.salud + "\nCosto: " + super.costo + "\n Lugar de Nacimiento: " + super.lugarn + "\nTipo de Arma" + tipoar + "\n Rango de Arma: " + rangom;
    }

    @Override
    public boolean ataque(ArrayList<Jugadores> jug, boolean turn, boolean ganador) {
        return ganador;
    }

}
