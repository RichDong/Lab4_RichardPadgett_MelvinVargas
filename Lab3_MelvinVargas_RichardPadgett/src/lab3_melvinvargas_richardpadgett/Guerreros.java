package lab3_melvinvargas_richardpadgett;

public abstract class Guerreros {

    String nombreg;
    int edad;
    int ataque;
    int salud;
    int costo;

    String lugarn;

    public Guerreros() {
    }

    public Guerreros(String nombreg, int edad, int ataque, int salud, int costo, String lugarn) {
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

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        if (ataque < 50) {
            this.ataque = ataque;
        }

    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
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

    public abstract void ataque();

    @Override
    public String toString() {
        return "Guerreros{" + "nombreg=" + nombreg + ", edad=" + edad + ", ataque=" + ataque + ", salud=" + salud + ", costo=" + costo + '}';
    }
}
