import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner leer= new Scanner(System.in);
        System.out.println("Ingresa el numero");
        int multiplicacion= leer.nextInt();
        for (int x=0; x<=100; x++){
            System.out.println(multiplicacion+" x "+x+" = "+ multiplicacion*x);

        }
    }
}
