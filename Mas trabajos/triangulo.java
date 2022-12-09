import java.util.Scanner;

public class triangulo {
    
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tamanio de altura");
        int altura = leer.nextInt();
        leer.close();
        for (int base = 1; base <= altura; base++){

            for (int blanco=1; blanco<=(altura-base); blanco++){
                System.out.print(" ");
            }
            for (int area=1; area<=(base*2) -1; area++){
                System.out.print("*");
            }
            System.out.println();    
        }
    }
}