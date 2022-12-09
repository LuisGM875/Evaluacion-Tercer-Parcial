import java.util.Scanner;

public class juegoazar{
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa limite del numero a adivinar");
        int limite = leer.nextInt();
        int num = (int)(Math.random()*limite+1);
        System.out.println("Ingresa numero de intentos");
        int intentos = leer.nextInt();

        int quedan=1;
        boolean sigue = true;
        while (sigue == true){
            System.out.println("Ingresa tu respuesta");
            int respuesta =leer.nextInt();

            if (respuesta==num){
                System.out.println("Correcto");
                sigue= false;
            } else{
                if (intentos != quedan){
                System.out.println("Vuelve a introducir");
            }
            if (intentos==quedan){
                System.out.println("No te quedan intentos");
                sigue=false;   
            }
        }
        quedan++;      
}leer.close();
} 
}


