package Principal;

import Clases.*;
import java.util.Scanner;

public class Principal {
    private static APITarget apiTarget;

    private static void interfazAPI() {
        apiTarget.sincronizar();
        apiTarget.enlazar();
        apiTarget.conectar();
        apiTarget.aprobCreditsPersonals();
    }

    public static void main(String[] args) {
        int opcion = 0;
        Scanner eleccion = new Scanner(System.in);
        while (opcion != 4) {
            System.out.println(
                    "OPCIONES\n"
                    + "---- -- --------\n"
                    + "1. API de BCP.\n"
                    + "2. API de Interbank.\n"
                    + "3. API de Scotiabank.\n"
                    + "4. Salir.\n"
                    + "Seleccione una opción: "
            );
            opcion = eleccion.nextInt();
            switch (opcion) {
                case 1:
                    apiTarget = new API_BCP();
                    interfazAPI();
                    break;
                case 2:
                    apiTarget = new API_Interbank_Adapter();
                    interfazAPI();
                    break;
                case 3:
                    apiTarget = new API_Scotiabank_Adapter();
                    interfazAPI();
                    break;
                case 4:
                    System.out.println("¡Programa Finalizado!");
                    break;
                default:
                    System.out.println("La opción ingresada NO es válida.");
            }
        }
    }
}