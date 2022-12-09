/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primera.clase1;

/**
 *
 * @author Alumno
 */
public class PrimeraClase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        int n1 = 5;
        int n2 = 10;
        int total = n1 + n2;
        int totalr = n1 - n2;
        int totalm = n1 * n2;
        int totald = n1 / n2;
        String nombre = "Luis";
        
        System.out.println(total);
        System.out.println(totalr);
        System.out.println(totalm);
        System.out.println(total);
        System.out.println(nombre);
        if(n1 < n2){
            System.out.println("N1 es menor");
        } else {
            System.out.println("n2 es menor");
        }
        
        /*
        0 - 1 bebe
        2 - 12 niño
        13 -17 puberto
        18 - 27 joven
        28 > adulto
        */
        // TODO code application logic here
        int edad = 6;
                if (edad<=1) {
                    System.out.println("Bebe");
                }else if (edad>=2 && edad<=12) {
                    System.out.println("Niño");
                }else if (edad>=13 && edad<17){
                    System.out.println("Puberto");
                }else if (edad>=18 && edad<=27) {
                    System.out.println("Joven");
                }else{
                    System.out.println("Adulto");
                }
    }
    
}
