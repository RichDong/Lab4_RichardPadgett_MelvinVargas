package lab3_melvinvargas_richardpadgett;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Lab3_MelvinVargas_RichardPadgett {

    static ArrayList<Guerreros> lista = new ArrayList();

    static ArrayList<Jugadores> lista2 = new ArrayList();

    static ArrayList<Jugadores> jugando = new ArrayList();

    static Scanner sc = new Scanner(System.in);
    static Guerreros g;

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
            System.out.println("Ingrese letra de la opcion deseada");
            opcion = sc.next();
            if (opcion.equals("a")) {
                System.out.println("Ingrese nombre del guerrero");
                String nombreg = sc.next();
                System.out.println("Ingrese edad del guerrero");
                int edad = sc.nextInt();
                System.out.println("Ingrese nivel de ataque del guerrero ");
                int ataque = sc.nextInt();
                System.out.println("Ingrese la salud del guerrero");
                int salud = sc.nextInt();
                System.out.println("Ingrese el costo del guerrero");
                int costo = sc.nextInt();
                System.out.println("Ingrese lugar de nacimiento");
                String lugarn = sc.next();
                System.out.println("1. mago");
                System.out.println("2. elfo");
                System.out.println("3. dragon");
                System.out.println("4. arquero");
                System.out.println("5. bruja");
                System.out.println("Ingrese numero de opcion de la tropa que quiere crear");
                try {
                    int op = sc.nextInt();
                    switch (op) {
                        case 1:
                            System.out.println("Ingrese tipo de magia");
                            String tipom = sc.next();
                            System.out.println("Ingrese el tipo de elemento");
                            String elemnt = sc.next();
                            lista.add(new Magos(tipom, elemnt, nombreg, edad, ataque, salud, costo, lugarn));
                            break;
                        case 2:
                            System.out.println("Ingrese el tipo de arma");
                            String tipoar = sc.next();
                            System.out.println("Ingrese el rango militar");
                            String rangom = sc.next();
                            lista.add(new Elfos(tipoar, rangom, nombreg, edad, ataque, salud, costo, lugarn));
                            break;
                        case 3:
                            System.out.println("Ingrese el color del dragon");
                            String color = sc.next();
                            System.out.println("Ingrese raza del dragon");
                            String raza = sc.next();
                            lista.add(new Dragoneros(color, raza, nombreg, edad, ataque, salud, costo, lugarn));
                            break;
                        case 4:
                            System.out.println("Ingrese material del arco");
                            String materialarc = sc.next();
                            System.out.println("Ingrese material de la armadura");
                            String materialarm = sc.next();
                            lista.add(new Elfos(materialarc, materialarm, nombreg, edad, ataque, salud, costo, lugarn));
                            break;
                        case 5:
                            System.out.println("Ingrese siglo de nacimiento");
                            int suglon = sc.nextInt();
                            System.out.println("Ingrese lugar de residencia");
                            String lugar = sc.next();
                            lista.add(new Brujas(suglon, lugar, nombreg, edad, ataque, salud, costo, lugarn));
                            break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error de imput");

                }

            }
            if (opcion.equals("b")) {
                System.out.println("Ingrese la posicion del guerrero que desea eliminar");
                int pos = sc.nextInt();
                lista.remove(pos);
            }
            if (opcion.equals("c")) {
                System.out.println("Ingrese nombre del jugador");
                String nombre = sc.nextLine();
                nombre = sc.nextLine();
                System.out.println("Ingrese dinero disponible del jugador");
                int dinero = sc.nextInt();
                int puntos = 0;
                System.out.println(lista);
                System.out.println("Ingrese la posicion del guerrero que quiere reclutar");
                int pos = sc.nextInt();
                while (lista.get(pos).getCosto() > dinero) {
                    System.out.println("Usted no puede reclutar este guerrero no tiene dinero suficiente");
                    System.out.println("Ingrese posicion de otro guerrero");
                    pos = sc.nextInt();
                }
                g = lista.get(pos);
                lista2.add(new Jugadores(nombre, dinero, puntos, g));
                lista.remove(pos);
            }
            if (opcion.equals("d")) {
                int cont = 1;
                while (cont <= 2) {
                    System.out.println("Ingrese la posicion del jugador " + cont);
                    int pos = sc.nextInt();
                    jugando.add(lista2.get(pos));
                    cont++;
                }
                boolean ganador = false;
                boolean turno = true;
                int cont2=1;
                do {
                    if (cont2==1) {
                        turno=g.ataque(jugando, true, ganador);
                        System.out.println("Salud del guerrero del primer jugador");
                        System.out.println(jugando.get(0).getG().getSalud());
                        System.out.println("Salud del guerrero del segundo jugador");
                        System.out.println(jugando.get(1).getG().getSalud());
                        System.out.println("");
                        cont2++;
                        

                    } else {
                       turno= g.ataque(jugando, false, ganador);
                        System.out.println("Salud del guerrero del primer jugador");
                        System.out.println(jugando.get(0).getG().getSalud());
                        System.out.println("Salud del guerrero del segundo jugador");
                        System.out.println(jugando.get(1).getG().getSalud());
                        System.out.println("");
                        cont2--;
                       
                    }
                    if(turno==false){
                        ganador=true;
                    }
                } while (ganador==false);
            }
            if (opcion.equals("e")) {
                System.out.print(lista2);
            }
            if (opcion.equals("f")) {
                System.out.print(lista);
            }
        }
    }

}
