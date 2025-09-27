package Clases;

import java.util.Scanner;

public class LeerDatos {
    public static void leerDatos() {
        Scanner sc = new Scanner(System.in);

        System.out.print("numero: ");
        int n1 = sc.nextInt();
        System.out.print("Numero: ");
        double n2 = sc.nextFloat();

        System.out.print("Texto: ");
        String texto = sc.next();

        System.out.print("Entero: "+n1+" Decimal: "+n2+" Texto: "+texto);
        sc.close();
    }
}