package Clases;

import java.util.Scanner;

public class CondicionalSwitch {
    public static void condicionalSwitch() {
        Scanner sc = new Scanner(System.in);
        int op;
        System.out.println("Menu");
        System.out.println("1.Saludo");
        System.out.println("2.Firmes");
        System.out.println("3.Descanso");
        System.out.println("-1.Salir");
        System.out.print("Eliga Opcion: ");
        op = sc.nextInt();
        switch (op=-1){
            case 1:
                System.out.println("Holaa");
                break;
            case 2:
                System.out.println("Firmes");
                break;
            case 3:
                System.out.println("Descansen");
                break;
            case 4:
                System.out.println("Hasta la vista baby");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
}
