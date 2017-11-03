package lab3_melvinvargas_richardpadgett;

public class Jugadores {

    String nombre;
    int dinero;
    int puntos;
    Guerreros g;

    public Jugadores() {
    }

    public Jugadores(String nombre, int dinero, int puntos, Guerreros g) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.puntos = puntos;
        this.g = g;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public Guerreros getG() {
        return g;
    }

    public void setG(Guerreros g) {
        this.g = g;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "nombre=" + nombre + ", dinero=" + dinero + ", puntos=" + puntos + ", g=" + g + '}';
    }
    
}
