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

    }
}
