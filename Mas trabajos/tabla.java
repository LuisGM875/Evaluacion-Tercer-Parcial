import java.util.Scanner;

public class tabla{
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el numero");
        int tabla = leer.nextInt();
        leer.close();
        
        for (int x=1; x<=100; x++){
            System.out.println(tabla+" x "+x+" = "+ tabla*x);
        
        }
    }
}
