package lab3_melvinvargas_richardpadgett;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3_MelvinVargas_RichardPadgett {

    static ArrayList<Guerreros> lista = new ArrayList();
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        String opcion = "";
        while (!opcion.equals("g")) {
            System.out.println("a -creacion de guerreros");
            System.out.println("b -eliminacion de guereros");
            System.out.println("c -registro de jugadores");
            System.out.println("d-iniciar partida");
            System.out.println("e-listar jugadores");
            System.out.println("f-listar guerreros");
            System.out.println("g-salir del programa");
            if (opcion.equals("a")) {
                System.out.println("Ingrese nombre del guerrero");
                String nombreg=sc.next();
                System.out.println("Ingrese edad del guerrero");
                int edad=sc.nextInt();
                System.out.println("Ingrese nivel de ataque del guerrero ");
                int ataque;
                System.out.println("Ingrese la salud del guerrero");
                int salud=sc.nextInt();
                System.out.println("Ingrese el costo del guerrero");
                int costo;
                System.out.println("1. mago");
                System.out.println("2. elfo");
                System.out.println("3. dragon");
                System.out.println("4. arquero");
                System.out.println("5. bruja");
                System.out.println("Ingrese numero de opcion de la tropa que quiere crear");
                int op=sc.nextInt();
                switch(op){
                    case 1:
                        lista.add(new Magos());
                        break;
                    case 2:
                        lista.add(new Elfos());
                        break;
                    case 3:
                        lista.add(new Dragoneros());
                        break;
                    case 4:
                        lista.add(new Elfos());
                        break;
                    case 5:
                        lista.add(new Brujas());
                        break;
                }
            }
            if (opcion.equals("b")) {
                System.out.println("Ingrese la posicion del guerrero que desea eliminar");
                int pos=sc.nextInt();
                lista.remove(pos);
            }
            if (opcion.equals("c")) {

            }
            if (opcion.equals("d")) {

            }
            if (opcion.equals("e")) {

            }
            if (opcion.equals("f")) {

            }
            if (opcion.equals("g")) {

            }
        }
    }

}
