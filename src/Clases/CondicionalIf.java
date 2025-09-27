package Clases;
import java.util.*;
public class CondicionalIf {
    public static void condicionalIf() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de x: ");
        int x= sc.nextInt();

        if(x%2==0){
            System.out.println("El Valor de "+x+": PAR");
        }else{
            System.out.println("El Valor de: "+x+": IMPAR");
        }
    }
}
