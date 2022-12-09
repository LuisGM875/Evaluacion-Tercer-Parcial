import java.util.Scanner;

public class tablaxx{
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa primer numero");
        int tabla = leer.nextInt();
        System.out.println("Ingresa segundo numero");
        int limite = leer.nextInt();
        leer.close();
        
        for (int x=1; x<=limite; x++){
            System.out.println(tabla+" x "+x+" = "+ tabla*x);
        
        }
    }
}