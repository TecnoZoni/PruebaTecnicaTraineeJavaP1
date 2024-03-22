package pruebatecnicatraineejava;

import java.util.Scanner;
import javax.security.auth.x500.X500Principal;

public class PruebaTecnicaTraineeJava {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //declaracion
        String mapa[][] = new String[10][10];
        String salidaReserva, finPrograma;
        int opcion, filaElejida, asientoElejido;
        boolean asientoDisponible = true;

        //asignacion
        salidaReserva = "";
        finPrograma = "";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                mapa[i][j] = "L";
            }
        }

        while (!(salidaReserva.equalsIgnoreCase("salir"))) {

            System.out.println("=====================\n Que operacion desa relizar? \n 1.Ver asientos disponibles. \n 2.Reservar asientos. \n 3.Salir \n =====================");
            opcion = leer.nextInt();
            leer.nextLine();
            if (opcion == 1) {
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
                        System.out.print("[" + mapa[i][j] + "]");
                    }
                    System.out.println("");
                }
            } else if (opcion == 2) {
                while (asientoDisponible) {
                    System.out.println("Ingrese el valor de la fila donde elijira el asiento: ");
                    filaElejida = leer.nextInt();
                    System.out.println("Ingrese el valor del asiento donde quiere sentarse: ");
                    asientoElejido = leer.nextInt();

                    if (mapa[filaElejida][asientoElejido].equalsIgnoreCase("L")) {
                        mapa[filaElejida][asientoElejido] = "X";
                        asientoDisponible = false;
                        System.out.println("El asiento se reservo correctamente.");
                    } else {
                        System.out.println("El asiento seleccionado se encuentra ocupado, por favor elija otro.");
                    }
                }
                asientoDisponible = true;
            } else if (opcion == 3) {
                salidaReserva = "salir";
            }

        }

    }

}
