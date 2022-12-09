import java.util.Scanner;

public class rectangulo{
    
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa medida de largo");
        int tamanio = leer.nextInt();
        System.out.println("Ingresa medida de ancho");
        int tamanio2 = leer.nextInt();
        leer.close();
        for (int x = 1; x <= tamanio; x++){
            System.out.print("*");
            for (int z=1; z<=tamanio2 -1; z++){
                System.out.print("*");
            }
            System.out.println();    
        }
    }
}