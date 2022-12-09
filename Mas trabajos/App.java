import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int tamaniotablero;
        Scanner leer= new Scanner(System.in);
        System.out.println("=========MENU=========");
        System.out.println("1__JUGAR CON JUGADORES");
        System.out.println("2__JUGAR CON BOT");
        System.out.println("======================");
        int modojuego=leer.nextInt();
        if (modojuego==1){
            System.out.println("INGRESA TAMAÑO DE TABLERO");
            tamaniotablero=leer.nextInt();
            int [] tablero = new int [tamaniotablero+1];
            int [] tableromodificado= new int [tamaniotablero+1];

            System.out.println("Ingresa posicion en la que se escondera");
            int adivinar = leer.nextInt();
            int identificador=5;

            tablero[adivinar]=5; //numero que marca la diferencia
            for (int a=0; a<=tamaniotablero; a++){
                System.out.print(tablero[a]);
            }//GUIARME EN LOS ARREGLOS

            System.out.println("  ");
            int x=0;
            while (x==0){
            System.out.println("Ingresa posicion a adivinar");
            int intento1 =leer.nextInt();
            int intentos=1;
                tableromodificado[intento1]=1;
                if (tablero=tableromodificado){
                    System.out.println("Ganaste");
                }
            }
        }else if(modojuego==2){


        }
        

        



        

    }
}
