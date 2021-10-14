import java.util.Scanner;

public class Condicionales {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Escribe el número 1: ");
        int n1 = 5;
        System.out.print("Escribe el número 2: ");
        int n2 = 5;

        int suma = n1 + n2; // ==, equal, >, >=, <, <=
        // or, and, negación
        // and
        /*
          || -> or
          && -> and
          ! -> negación
         */
        if(suma >= 0 && suma <= 10) {
            System.out.println("Tu suma va en el siguiente rango [0, 10]");
        } else if (!(suma >= 0)){ // !(suma >= 0) suma < 0
            System.out.println("Tu suma salió negativa");
        }

        // for(var, condicion, incremento) i++ -> i = i + 1
        // i-- -> i = i - 1
        int[] x = new int[100000];
        for(int i = 0; i < x.length; i++) {
            x[i] = i;
        }
        System.out.print("[");
        for(int j = 0; j < 100; j++) {
            System.out.print(x[j] + " ");
        }
        System.out.print("]");


        // condicion tiene que ser de tipo boolean
        /*if(sonIguales) {
            System.out.println(nombre1);
        } else if(sonIguales2) { // else if(nombre2 == "Jose") {}
            System.out.println(nombre2);
        } else {
            System.out.println("Las 2 condiciones anteriores no se cumplieron");
        }
        if(sonIguales) {
            System.out.println(nombre1);
        }
        if(sonIguales2) {
            System.out.println(nombre2);
        }
        System.out.println("Las 2 condiciones anteriores no se cumplieron");

        System.out.println("Afuera de los condicionales");
        */
        /* if(condicion) {
               // Lo que hago si la condición se cumple
           }
         */
        /* if(condicion) {
               // Lo que hago si la condición se cumple
           } else {
               // Lo que hago si la condición no se cumple
           }
         */

        /* if(condicion) {
               // Lo que hago si la condición se cumple
           } else if(condicion2) {
               // Lo que hago si la condición 2 se cumple
           } else {
               // Lo que hago si la condición y condición2 no se cumplen
           }
         */




        // "Hola" == "Hola1" -> false
        /*if(nombre1 == "Juan2") { // if(x == 7) { System.out.println(x) }
            System.out.println(nombre1);
        } else {
            System.out.println("El valor del nombre 1 no es Juan");
            }*/
    }
}
