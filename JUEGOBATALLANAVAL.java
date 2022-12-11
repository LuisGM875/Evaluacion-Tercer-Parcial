import java.util.*;
public class JUEGOBATALLANAVAL {
    public static void main(String[] args){
        
        ArrayList<String>nombres=new ArrayList<String>();
        ArrayList<Integer>barcos=new ArrayList<Integer>();
        ArrayList<Integer>puntuacion=new ArrayList<Integer>();
        ArrayList<Integer>barcosenjuego=new ArrayList<Integer>();
        //SE INICIAN LOS ARREGLOS
        int puntuacion_jugador1=0;
        int puntuacion_jugador2=0;
        int tbarcos1=0, tbarcos2=0;
        //VARIABLES A OCUPAR
        Scanner leer=new Scanner(System.in); //PARA STRING
        Scanner leer1=new Scanner(System.in); //PARA INT
        Scanner leer2=new Scanner(System.in);
        int numtablero=0, numBarco1=0, numBarco2=0, ganador=0, barcoss=0, barcos1=0;
        char [][] tablero_jugador1=null;
        char [][] tablero_jugador2=null;
        char [][] tablero_nadajugador1=null;
        char [][] tablero_nadajugador2=null;
        //SE DECLARAN LOS ARREGLOS BIDIMENSIONALES
        String nombre_jugador;
        //SE INICIA EL MENU
            System.out.println("===============Juego de Batalla naval===============");
            //SE PIDE TAMAÑO DE TABLERO SEGUN SU ANCHO Y LARGO
            System.out.print("Ingresa el tamaño del tablero: ");
            numtablero=leer.nextInt();
            //SE DECLARA LA DIMENSION DE LOS ARREGLOS BIDIMENSIONALES 
            tablero_jugador1= new char[numtablero] [numtablero];
            tablero_jugador2= new char[numtablero] [numtablero];
            tablero_nadajugador1= new char[numtablero] [numtablero];
            tablero_nadajugador2= new char[numtablero] [numtablero];         
            //SE MUESTRA COMO QUEDA EL TABLERO CON NUMEROS
            System.out.println("==============EL TABLERO ES EL SIGUIENTE==============");
            //SE INICIA LA CREACION DE CADA TABLERO, 1 y 2 PARA LOS JUGADORES QUE GUARDEN LOS BARCOS y 3 y 4 PARA QUE SE MUESTRE EN OCULTO EL TABLERO
            Creartablero(tablero_jugador1);
            Creartablero2(tablero_jugador2);
            Creartablero3(tablero_nadajugador1);
            Creartablero4(tablero_nadajugador2);
            imprimirTablero3(tablero_jugador1);
            System.out.println(" ");
            // SE LE PIDEN LOS DATOS AL JUGADOR 1
            System.out.println("=============JUGADOR 1=============");
            System.out.print("Ingresa el nombre del primer jugador:");
            nombre_jugador=leer1.nextLine();
            nombres.add(nombre_jugador);
            System.out.println(" ");
            // SE PIDE EL NUMERO DE BARCOS CON LOS QUE JUGARA
            System.out.println("JUGADOR 1 Son 4 barcos como limite");
            System.out.println(" ");
            int si=0;
            while (si==0){
                System.out.print("Ingresa cuantos barcos tendras: ");
                numBarco1=leer.nextInt();
                if (numBarco1>0 && numBarco1<=4){
                    if (numBarco1==1){
                        tbarcos1=1;
                    }else if (numBarco1==2){
                        tbarcos1=3;
                    }else if (numBarco1==3){
                        tbarcos1=6;
                    }else if (numBarco1==4){
                        tbarcos1=10;
                    }
                    //SE VALIDA SI LA PERSONA TECLEA EL NUMERO DE BARCOS CORRECTO
                    barcos.add(numBarco1);
                    System.out.println( );
                    si=1;
                    System.out.println("JUGADOR 1 tendras "+numBarco1+" barcos");
                }else{
                    System.out.println("No se pueden este numero de barcos ... ");
                    System.out.println("VUELVE A INGRESAR");
                }
            }
            //COMIENZA LA PARTE PARA PONER LOS BARCOS DEL JUGADOR 1
            Barco1(tablero_jugador1, leer1, numBarco1, tbarcos1, barcosenjuego);
            //JUGADOR 2 TABLERO
            // SE LE PIDEN LOS DATOS AL JUGADOR 2
            System.out.println("======================================================");
            System.out.println("=============JUGADOR 2=============");
            System.out.print("Ingresa el nombre del segundo jugador:");
            nombre_jugador=leer2.nextLine();
            nombres.add(nombre_jugador);
            System.out.println(" ");
            // SE PIDE EL NUMERO DE BARCOS CON LOS QUE JUGARA
            System.out.println("JUGADOR 2 Son 4 barcos como limite");
            System.out.println(" ");
            int si2=0;
            while (si2==0){
                //SE VALIDA SI LA PERSONA TECLEA EL NUMERO DE BARCOS CORRECTO
                System.out.print("Ingresa cuantos barcos tendras: ");
                numBarco2=leer.nextInt();
                if (numBarco2>0 && numBarco2<=4){
                    if (numBarco2==1){
                        tbarcos2=1;
                    }else if (numBarco2==2){
                        tbarcos2=3;
                    }else if (numBarco2==3){
                        tbarcos2=6;
                    }else if (numBarco2==4){
                        tbarcos2=10;
                    }
                    barcos.add(numBarco2);
                    System.out.println( );
                    si2=1;
                    System.out.println("JUGADOR 1 tendras "+numBarco2+" barcos");
                }else{
                    System.out.println("No se pueden este numero de barcos ... ");
                    System.out.println("VUELVE A INGRESAR");
                }
            }
            //COMIENZA LA PARTE PARA PONER LOS BARCOS DEL JUGADOR 2
            Barco2(tablero_jugador2, leer1, numBarco2, tbarcos2, barcosenjuego);
            //HACERLO POR BARCOS
            System.out.println("Jugadores en Juego: "+nombres);
            System.out.println("======================================================");
            System.out.println("");
            int pasaono=0, pasaono2=0, acaba=0;
            //COMIENZA LA SECUENCIA DE RONDAS
            Rondas(tablero_jugador1, tablero_jugador2, leer2, leer1, nombres, puntuacion_jugador1, tablero_nadajugador1, tablero_nadajugador2, puntuacion_jugador2, ganador, tbarcos1, tbarcos2, pasaono, pasaono2, acaba, barcosenjuego, tbarcos1, tbarcos2);
    }
 // SE CREA EL TABLERO PARA LLENAR DE BARCOS DEL JUGADOR 1
    public static void Creartablero(char [][]tablero_jugador1){
        for (int a=0; a<tablero_jugador1.length; a++){
            for (int j=0; j<tablero_jugador1.length; j++){
                tablero_jugador1[a][j]='o';
                //LLENA LOS ESPACIOS DE O
            }
        }
    }
// SE CREA EL TABLERO PARA LLENAR DE BARCOS DEL JUGADOR 2
    public static void Creartablero2(char [][]tablero_jugador2){
        for (int a=0; a<tablero_jugador2.length; a++){
            for (int j=0; j<tablero_jugador2.length; j++){
                tablero_jugador2[a][j]='o';
                //LLENA LOS ESPACIOS DE O
            }
        }
    }
// SE CREA EL TABLERO PARA VER LOS TIROS DEL JUGADOR 1
    public static void Creartablero3(char [][]tablero_nadajugador1){
        for (int a=0; a<tablero_nadajugador1.length; a++){
            for (int j=0; j<tablero_nadajugador1.length; j++){
                tablero_nadajugador1[a][j]='o';
                //LLENA LOS ESPACIOS DE O
            }
        }
    }
    // SE CREA EL TABLERO PARA VER LOS TIROS DEL JUGADOR 2
    public static void Creartablero4(char [][]tablero_nadajugador2){
        for (int a=0; a<tablero_nadajugador2.length; a++){
            for (int j=0; j<tablero_nadajugador2.length; j++){
                tablero_nadajugador2[a][j]='0';
                //LLENA LOS ESPACIOS DE O
            }
        }
    }

    //IMPRIME EL TABLERO DEL JUGADOR 1
    public static void imprimirTablero(char [][]tablero_jugador1){
            int b=0;
            int c=0;
            System.out.print("   ");
            for (int i = 0; i < tablero_jugador1.length; i++) {//Coordenadas de arriba
                c++;
                if (i<=8){
                    //SISTEMA DE COORDENADAS POR NUMEROS DE COLUMNAS
                    System.out.print(" "+"0"+c+"  ");
                }else{
                System.out.print(" "+c+"  ");
                }
            }
            System.out.println(" ");
            for (int i = 0; i < tablero_jugador1.length; i++) { //Coordenadas de los de los lados
                b++;
                if (i<=8){
                    System.out.print("0"+b);
                }else{
                    System.out.print(b);
                }
                for (int j = 0; j < tablero_jugador1[0].length; j++) {
//LE DA FORMATO AL TABLERO
                    if (j == 0 || j == tablero_jugador1.length - 1) {
                        if (j == 0) {
                             System.out.print("| " + tablero_jugador1[i][j]+"  ");
    
                        }
                        if (j == tablero_jugador1.length - 1) {
                            System.out.print("  "+tablero_jugador1[i][j] + "  |");
                        }
                    } else {
                        System.out.print("  " + tablero_jugador1[i][j] + "  ");
                    }
                }
                System.out.println(" ");
            }
    
    }
    // //IMPRIME EL TABLERO DEL JUGADOR 2
    public static void imprimirTablero2(char [][]tablero_jugador2){
        int b=0;
        int c=0;
        System.out.print("   ");
        for (int i = 0; i < tablero_jugador2.length; i++) {//Coordenadas de arriba
            c++;
            if (i<=8){
                //SISTEMA DE COORDENADAS POR NUMEROS DE COLUMNAS
                System.out.print(" "+"0"+c+"  ");
            }else{
            System.out.print(" "+c+"  ");
            }
        }
        System.out.println(" ");
        for (int i = 0; i < tablero_jugador2.length; i++) { //Coordenadas de los de los lados
            b++;
            if (i<=8){
                System.out.print("0"+b);
            }else{
                System.out.print(b);
            }
            for (int j = 0; j < tablero_jugador2[0].length; j++) {
//LE DA FORMATO AL TABLERO
                if (j == 0 || j == tablero_jugador2.length - 1) {
                    if (j == 0) {
                         System.out.print("| " + tablero_jugador2[i][j]+"  ");

                    }
                    if (j == tablero_jugador2.length - 1) {
                        System.out.print("  "+tablero_jugador2[i][j] + "  |");
                    }
                } else {
                    System.out.print("  " + tablero_jugador2[i][j] + "  ");
                }
            }
            System.out.println(" ");
        }
    }
    //imprimir tablero vacio jugador 1
    public static void imprimirTablero3(char [][]tablero_nadajugador1){
        int b=0;
        int c=0;
        System.out.print("   ");
        for (int i = 0; i < tablero_nadajugador1.length; i++) {//Coordenadas de arriba
            c++;
            if (i<=8){
                //SISTEMA DE COORDENADAS POR NUMEROS DE COLUMNAS
                System.out.print(" "+"0"+c+"  ");
            }else{
            System.out.print(" "+c+"  ");
            }
        }
        System.out.println(" ");
        for (int i = 0; i < tablero_nadajugador1.length; i++) { //Coordenadas de los de los lados
            b++;
            if (i<=8){
                System.out.print("0"+b);
            }else{
                System.out.print(b);
            }
            for (int j = 0; j < tablero_nadajugador1[0].length; j++) {
//LE DA FORMATO AL TABLERO
                if (j == 0 || j == tablero_nadajugador1.length - 1) {
                    if (j == 0) {
                         System.out.print("| " + tablero_nadajugador1[i][j]+"  ");

                    }
                    if (j == tablero_nadajugador1.length - 1) {
                        System.out.print("  "+tablero_nadajugador1[i][j] + "  |");
                    }
                } else {
                    System.out.print("  " + tablero_nadajugador1[i][j] + "  ");
                }
            }
            System.out.println(" ");
        }
    }
    //imprimir tablero vacio del jugador 2
    public static void imprimirTablero4(char [][]tablero_nadajugador2){
        int b=0;
        int c=0;
        System.out.print("   ");
        for (int i = 0; i < tablero_nadajugador2.length; i++) {//Coordenadas de arriba
            c++;
            if (i<=8){
                //SISTEMA DE COORDENADAS POR NUMEROS DE COLUMNAS
                System.out.print(" "+"0"+c+"  ");
            }else{
            System.out.print(" "+c+"  ");
            }
        }
        System.out.println(" ");
        for (int i = 0; i < tablero_nadajugador2.length; i++) { //Coordenadas de los de los lados
            b++;
            if (i<=8){
                System.out.print("0"+b);
            }else{
                System.out.print(b);
            }
            for (int j = 0; j < tablero_nadajugador2[0].length; j++) {
//LE DA FORMATO AL TABLERO
                if (j == 0 || j == tablero_nadajugador2.length - 1) {
                    if (j == 0) {
                         System.out.print("| " + tablero_nadajugador2[i][j]+"  ");

                    }
                    if (j == tablero_nadajugador2.length - 1) {
                        System.out.print("  "+tablero_nadajugador2[i][j] + "  |");
                    }
                } else {
                    System.out.print("  " + tablero_nadajugador2[i][j] + "  ");
                }
            }
            System.out.println(" ");
        }
    }


    public static void Barco1(char [][] tablero_jugador1, Scanner leer, int numBarco1, int tbarcos1, ArrayList<Integer>barcosenjuego){
        
        int barcoss=numBarco1;
        int barcoporponer=1;
        tbarcos1=0;
        int barcos1=0;
        // COMIENZA LA PARTE EN LA QUE EL JUGADOR PONE SUS BARCOS PUNTO POR PUNTO
        while (numBarco1>0){
            if (barcoporponer==1){
                barcoporponer+=1;
                barcos1=barcos1+1;
                tbarcos1=barcos1;
                //EL PRIMER BARCO COMIENZA CON UN WHILE QUE COMPRUEBA SI SE ESTA EN LA COLUMNA CORRECTA
                System.out.println("======================================================");
                System.out.println("=================PON TU PRIMER BARCO==================");
                int otra=0;
                while (otra==0){
                    System.out.print("Ingresa la columna donde quieres poner tu barco");
                    int x= leer.nextInt();
                    System.out.println(" ");
                    if (x>0 && x<=tablero_jugador1[0].length ){
                        // SE COMPRUEBA LA COLUMNA
                        int comprobarfila=0;
                        while (comprobarfila==0){
                            System.out.print("Ingresa la fila donde quieres poner tu barco");
                            int y=leer.nextInt();
                            System.out.println(" ");
                            if (y>0 && y<=tablero_jugador1[0].length ){
                                // SE COMPRUEBA LA FILA
                                y=y-1;
                                x=x-1;
                                System.out.println("===================================");
                                System.out.println(" ");
                                System.out.println("Asi queda tu tablero con los barcos");
                                tablero_jugador1[y][x]='U'; //SE PONE UNA LETRA CONFORME AL NUMERO DEL BARCO EN ESTE CASO ES PARA EL BARCO 1 QUE ES U
                                imprimirTablero(tablero_jugador1); // SE IMPRIME TABLERO
                                System.out.println(" ");
                                numBarco1=numBarco1-1;
                                otra=1;
                                comprobarfila=1;
                            }else{
                                System.out.println("NO ES UNA FILA CORRECTA");
                            }
                        }
                    }else{
                        System.out.println("NO ES UNA COLUMNA CORRECTA");
                    }
                }
                
            }else if (barcoporponer==2){
                //EL SEGUNDO BARCO COMIENZA CON UN WHILE QUE COMPRUEBA SI SE ESTA EN LA COLUMNA CORRECTA
                System.out.println("======================================================");
                System.out.println("================PON TU SEGUNDO BARCO==================");
                int barcodos=2;
                int barcos2=2*1;
                tbarcos1=tbarcos1+barcos2;
                while (barcodos>0){
                    int otra=0;
                    while (otra==0){
                        System.out.println("Ingresa la columna donde quieres poner tu barco");
                        int x= leer.nextInt();
                        if (x>0 && x<=tablero_jugador1[0].length ){
                            // SE COMPRUEBA LA COLUMNA
                            int comprobarfila=0;
                            while (comprobarfila==0){
                                System.out.println("Ingresa la fila donde quieres poner tu barco");
                                int y=leer.nextInt();
                                if (y>0 && y<=tablero_jugador1[0].length ){
                                    // SE COMPRUEBA LA FILA
                                    y=y-1;
                                    x=x-1;
                                    System.out.println("===================================");
                                    System.out.println(" ");
                                    System.out.println("Asi queda tu tablero con los barcos");
                                    tablero_jugador1[y][x]='D'; //SE PONE UNA LETRA CONFORME AL NUMERO DEL BARCO EN ESTE CASO ES PARA EL BARCO 2 QUE ES D
                                    barcodos--;
                                    otra=1;
                                    comprobarfila=1;
                                    imprimirTablero(tablero_jugador1); // SE IMPRIME TABLERO
                                    System.out.println(" ");
                                }else{
                                    System.out.println("NO ES UNA FILA CORRECTA");
                                }
                            }
                        }else{
                            System.out.println("NO ES UNA COLUMNA CORRECTA");
                        }
                    }
                }
                
                barcoporponer++;
                numBarco1=numBarco1-1;
            }else if (barcoporponer==3){
                //EL TERCER BARCO COMIENZA CON UN WHILE QUE COMPRUEBA SI SE ESTA EN LA COLUMNA CORRECTA
                System.out.println("======================================================");
                System.out.println("================PON TU TERCER BARCO===================");
                int barcotres=3;
                int barcos3=3*1;
                tbarcos1=tbarcos1+barcos3;
                while (barcotres>0){
                    int otra=0;
                    while (otra==0){
                        System.out.println("Ingresa la columna donde quieres poner tu barco");
                        int x= leer.nextInt();
                        if (x>0 && x<=tablero_jugador1[0].length ){
                            // SE COMPRUEBA LA COLUMNA
                            int comprobarfila=0;
                            while (comprobarfila==0){
                                System.out.println("Ingresa la fila donde quieres poner tu barco");
                                int y=leer.nextInt();
                                if (y>0 && y<=tablero_jugador1[0].length ){
                                    // SE COMPRUEBA LA FILA
                                    y=y-1;
                                    x=x-1;
                                    System.out.println("===================================");
                                    System.out.println(" ");
                                    System.out.println("Asi queda tu tablero con los barcos");
                                    tablero_jugador1[y][x]='T'; //SE PONE UNA LETRA CONFORME AL NUMERO DEL BARCO EN ESTE CASO ES PARA EL BARCO 3 QUE ES T
                                    barcotres--;
                                    otra=1;
                                    comprobarfila=1;
                                    imprimirTablero(tablero_jugador1); // SE IMPRIME TABLERO
                                    System.out.println(" ");
                                }else{
                                    System.out.println("NO ES UNA FILA CORRECTA");
                                }
                            }
                        }else{
                            System.out.println("NO ES UNA COLUMNA CORRECTA");
                        }
                    }
                }
                
                barcoporponer++;
                numBarco1=numBarco1-1;
            }else if (barcoporponer==4){
                //EL CUARTO BARCO COMIENZA CON UN WHILE QUE COMPRUEBA SI SE ESTA EN LA COLUMNA CORRECTA
                System.out.println("======================================================");
                System.out.println("=================PON TU CUARTO BARCO==================");
                int barcocuatro=4;
                int barcos4=4*1;
                tbarcos1=tbarcos1+barcos4;
                while (barcocuatro>0){
                    int otra=0;
                    while (otra==0){
                        System.out.println("Ingresa la columna donde quieres poner tu barco");
                        int x= leer.nextInt();
                        if (x>0 && x<=tablero_jugador1[0].length ){
                            // SE COMPRUEBA LA COLUMNA
                            int comprobarfila=0;
                            while (comprobarfila==0){
                                System.out.println("Ingresa la fila donde quieres poner tu barco");
                                int y=leer.nextInt();
                                if (y>0 && y<=tablero_jugador1[0].length ){
                                    // SE COMPRUEBA LA FILA
                                    y=y-1;
                                    x=x-1;
                                    System.out.println("===================================");
                                    System.out.println(" ");
                                    System.out.println("Asi queda tu tablero con los barcos");
                                    tablero_jugador1[y][x]='C'; //SE PONE UNA LETRA CONFORME AL NUMERO DEL BARCO EN ESTE CASO ES PARA EL BARCO 4 QUE ES C
                                    barcocuatro--;
                                    otra=1;
                                    comprobarfila=1;
                                    imprimirTablero(tablero_jugador1); // SE IMPRIME TABLERO
                                    System.out.println(" ");
                                }else{ 
                                    System.out.println("NO ES UNA FILA CORRECTA");
                                }
                            }
                        }else{
                            System.out.println("NO ES UNA COLUMNA CORRECTA");
                        }
                    }
                }
                barcoporponer++;
                numBarco1=numBarco1-1;
                barcosenjuego.add(tbarcos1);
            }
        }
        barcosenjuego.add(tbarcos1);
        barcoss=tbarcos1;
    }

    public static void Barco2(char [][] tablero_jugador2, Scanner leer, int numBarco2, int tbarcos2, ArrayList<Integer>barcosenjuego){
        int barcos=numBarco2;
        int barcoporponer=1;
        // COMIENZA LA PARTE EN LA QUE EL JUGADOR PONE SUS BARCOS PUNTO POR PUNTO
        while (numBarco2>0){
            if (barcoporponer==1){
                barcoporponer+=1;
                System.out.println("======================================================");
                System.out.println("=================PON TU PRIMER BARCO==================");
                int otra=0;
                int barcos1=1;
                tbarcos2=tbarcos2+barcos1;
                //EL PRIMER BARCO COMIENZA CON UN WHILE QUE COMPRUEBA SI SE ESTA EN LA COLUMNA CORRECTA
                while (otra==0){
                    System.out.println("Ingresa la columna donde quieres poner tu barco");
                    int x= leer.nextInt();
                    if (x>0 && x<=tablero_jugador2[0].length ){
                        
                        int comprobarfila=0;
                        while (comprobarfila==0){
                            System.out.println("Ingresa la fila donde quieres poner tu barco");
                        int y=leer.nextInt();
                            if (y>0 && y<=tablero_jugador2[0].length ){
                                y=y-1;
                                x=x-1;
                                System.out.println("===================================");
                                System.out.println(" ");
                                System.out.println("Asi queda tu tablero con los barcos");
                                tablero_jugador2[y][x]='U'; //SE PONE UNA LETRA CONFORME AL NUMERO DEL BARCO EN ESTE CASO ES PARA EL BARCO 1 QUE ES U
                                imprimirTablero(tablero_jugador2); // SE IMPRIME TABLERO
                                System.out.println(" ");
                                numBarco2=numBarco2-1;
                                otra=1;
                                comprobarfila=1;
                            }else{
                                System.out.println("NO ES UNA FILA CORRECTA");
                            }
                        }
                    }else{
                        System.out.println("NO ES UNA COLUMNA CORRECTA");
                    }
                }
                
            }else if (barcoporponer==2){
                //EL SEGUNDO BARCO COMIENZA CON UN WHILE QUE COMPRUEBA SI SE ESTA EN LA COLUMNA CORRECTA
                System.out.println("======================================================");
                System.out.println("================PON TU SEGUNDO BARCO==================");
                int barcodos=2;
                int barcos2=2;
                tbarcos2=tbarcos2+barcos2;
                while (barcodos>0){
                    int otra=0;
                    while (otra==0){
                        System.out.println("Ingresa la columna donde quieres poner tu barco");
                        int x= leer.nextInt();
                        if (x>0 && x<=tablero_jugador2[0].length ){
                            
                            int comprobarfila=0;
                            while (comprobarfila==0){
                                System.out.println("Ingresa la fila donde quieres poner tu barco");
                                int y=leer.nextInt();
                                if (y>0 && y<=tablero_jugador2[0].length ){
                                y=y-1;
                                x=x-1;
                                System.out.println("===================================");
                                System.out.println(" ");
                                System.out.println("Asi queda tu tablero con los barcos");
                                tablero_jugador2[y][x]='D'; //SE PONE UNA LETRA CONFORME AL NUMERO DEL BARCO EN ESTE CASO ES PARA EL BARCO 2 QUE ES D
                                barcodos--;
                                otra=1; 
                                comprobarfila=1;
                                System.out.println("=========================================");
                                imprimirTablero(tablero_jugador2); // SE IMPRIME TABLERO
                                System.out.println(" ");
                                }else{
                                    System.out.println("NO ES UNA FILA CORRECTA");
                                }
                            }
                        }else{
                            System.out.println("NO ES UNA COLUMNA CORRECTA");
                        }
                    }
                }
                barcoporponer++;
                numBarco2=numBarco2-1;
            }else if (barcoporponer==3){
                //EL TERCER BARCO COMIENZA CON UN WHILE QUE COMPRUEBA SI SE ESTA EN LA COLUMNA CORRECTA
                System.out.println("======================================================");
                System.out.println("================PON TU TERCER BARCO===================");
                int barcotres=3;
                int barcos3=3;
                tbarcos2=tbarcos2+barcos3;
                while (barcotres>0){
                    int otra=0;
                    while (otra==0){
                        System.out.println("Ingresa la columna donde quieres poner tu barco");
                        int x= leer.nextInt();
                        if (x>0 && x<=tablero_jugador2[0].length ){
                            
                            int comprobarfila=0;
                            while (comprobarfila==0){
                                System.out.println("Ingresa la fila donde quieres poner tu barco");
                                int y=leer.nextInt();
                                if (y>0 && y<=tablero_jugador2[0].length ){
                                y=y-1;
                                x=x-1;
                                System.out.println("===================================");
                                System.out.println(" ");
                                System.out.println("Asi queda tu tablero con los barcos");
                                tablero_jugador2[y][x]='T'; //SE PONE UNA LETRA CONFORME AL NUMERO DEL BARCO EN ESTE CASO ES PARA EL BARCO 3 QUE ES T
                                barcotres--;
                                otra=1;
                                comprobarfila=1;
                                System.out.println("=========================================");
                                imprimirTablero(tablero_jugador2); // SE IMPRIME TABLERO
                                System.out.println(" ");
                                }else{
                                    System.out.println("NO ES UNA FILA CORRECTA");
                                }
                            }
                        }else{
                            System.out.println("NO ES UNA COLUMNA CORRECTA");
                        }
                    }
                }
                barcoporponer++;
                numBarco2=numBarco2-1;
            }else if (barcoporponer==4){
                //EL CUARTO BARCO COMIENZA CON UN WHILE QUE COMPRUEBA SI SE ESTA EN LA COLUMNA CORRECTA
                System.out.println("======================================================");
                System.out.println("=================PON TU CUARTO BARCO==================");
                int barcocuatro=4;
                int barcos4=4;
                tbarcos2=tbarcos2+barcos4;
                while (barcocuatro>0){
                    int otra=0;
                    while (otra==0){
                        System.out.println("Ingresa la columna donde quieres poner tu barco");
                        int x= leer.nextInt();
                        if (x>0 && x<=tablero_jugador2[0].length ){
                            
                            int comprobarfila=0;
                            while (comprobarfila==0){
                                System.out.println("Ingresa la fila donde quieres poner tu barco");
                                int y=leer.nextInt();
                                if (y>0 && y<=tablero_jugador2[0].length ){
                                y=y-1;
                                x=x-1;
                                System.out.println("===================================");
                                System.out.println(" ");
                                System.out.println("Asi queda tu tablero con los barcos");
                                tablero_jugador2[y][x]='C'; //SE PONE UNA LETRA CONFORME AL NUMERO DEL BARCO EN ESTE CASO ES PARA EL BARCO 4 QUE ES C
                                barcocuatro--;
                                otra=1;
                                comprobarfila=1;
                                System.out.println("=========================================");
                                imprimirTablero(tablero_jugador2); // SE IMPRIME TABLERO
                                System.out.println(" ");
                                }else{
                                    System.out.println("NO ES UNA FILA CORRECTA");
                                }
                            }
                        }else{
                            System.out.println("NO ES UNA COLUMNA CORRECTA");
                        }
                    }
                }
                barcoporponer++;
                numBarco2=numBarco2-1;
                
            }
        }
    }

    public static void Rondas(char [][] tablero_jugador1, char [][] tablero_jugador2, Scanner leer, Scanner leer1, ArrayList<String> nombres, int puntuacion_jugador1, char [][] tablero_nadajugador1, char [][] tablero_sinmodifjugador2, int puntuacion_jugador2, int ganador, int tbarcos1, int tbarcos2, int pasaono, int pasaono2, int acaba, ArrayList<Integer> barcosenjuego, int barcos, int barcoss){
        puntuacion_jugador1=0;
        puntuacion_jugador2=0;
        int rondas=0;
        int ronda1=0;
        int ronda2=1;
        int perdedor=0;
        // COMIENZA EL JUEGO EN RONDAS
        while (rondas==0){ 
            if (acaba==0){
            if (rondas==0){
                //COMIENZA EL TURNO DEL JUGADOR 1
            if (ronda1==0){
            while (ronda1==0){
                ronda1=1;
                System.out.println("============TURNO JUGADOR 1============");
                System.out.print("Jugador 1: ");
                System.out.println(nombres.get(0));
                System.out.print("Puntuacion: ");
                System.out.println(puntuacion_jugador1);
                System.out.println("Puntos de barcos que tienes que encontrar: "+tbarcos2);
                System.out.println("=======================================");
                System.out.println("EL TABLERO DEL ENEMIGO DEL JUGADOR 2 ");
                //MUESTRA EL TABLERO DEL ENEMIGO CON TIROS YA HECHOS
                imprimirTablero4(tablero_sinmodifjugador2);
                System.out.println(" ");
                System.out.println("=======================================");
                System.out.println("ESTE ES TU TABLERO JUGADOR 1: ");
                //MUESTRA NUESTRO TABLERO DONDE YA FUE ATACADO UN BARCO O CUANTOS QUEDAN
                imprimirTablero(tablero_jugador1);
                int columnasi=0;
                while (columnasi==0){
                //CADA WHILE COMPRUEBA SI SE INTRODUCEN BIEN LAS COORDENADAS
                System.out.println("=======================================");
                System.out.println("Pon columna para atacar");
                int x= leer.nextInt();
                if (x>0 && x<=tablero_jugador2[0].length ){
                    int comprobarfila=0;
                    while (comprobarfila==0){
                        System.out.println("Pon fila para atacar");
                        int y=leer.nextInt();
                        if (y>0 && y<=tablero_jugador2[0].length ){
                            y=y-1;
                            x=x-1;
                            if (tablero_jugador2[y][x]=='U'| tablero_jugador2[y][x]=='D' | tablero_jugador2[y][x]=='T' | tablero_jugador2[y][x]=='C'){
                                System.out.println(" LE DISTE A UN BARCO GANASTE 200 PUNTOS");
                                System.out.println("=========================================");
                                tablero_jugador2[y][x]='X';
                                tablero_sinmodifjugador2[y][x]='X';
                                tbarcos2=tbarcos2-1;
                                System.out.println("Quedan por encontrar: "+tbarcos2+ " puntos de barcos en el tablero del jugador 1");
                                System.out.println(tbarcos2);
                                puntuacion_jugador1+=200;
                                imprimirTablero4(tablero_sinmodifjugador2);
                                System.out.println("============VUELVE A TIRAR================");
                                //CADA QUE TERMINA UNA RONDA SE PUEDE VOLVER A TIRAR
                                comprobarfila=1; 
                                columnasi=1;
                                ronda1=0;
                                ganador=0;
                                perdedor=1;
                                if(tbarcos2==0){ //COMPRUEBA QUE EL JUEGO AUN TENGA PUTNOS DE BARCOS
                                    acaba=1;
                                    System.out.println("Ya no hay barcos en el tablero del jugador 2 ...");
                                }
                            }else if(tablero_jugador2[y][x]=='X'){
                                System.out.println("LE DISTE A UNA MISMA POSICION");
                                System.out.println("YA ATACASTE ANTES");
                                tablero_jugador2[y][x]='X';
                                tablero_sinmodifjugador2[y][x]='X';
                                imprimirTablero4(tablero_sinmodifjugador2);
                                comprobarfila=1;
                                columnasi=1;
                                ronda2=0;
                                rondas=0;
                                if(tbarcos2==0){ //COMPRUEBA QUE EL JUEGO AUN TENGA PUTNOS DE BARCOS
                                    acaba=1;
                                    System.out.println("Ya no hay barcos en el tablero del jugador 2 ...");
                                }
                            }else{//SI NO DA EL TIRO SE PASA AL JUGADOR 2
                                System.out.println("===================================");
                                System.out.println("NO LE DISTE A NINGUN BARCO");
                                tablero_jugador2[y][x]='X';
                                tablero_sinmodifjugador2[y][x]='X';
                                imprimirTablero4(tablero_sinmodifjugador2);
                                comprobarfila=1;
                                columnasi=1;
                                ronda2=0;
                                rondas=0;
                                if(tbarcos2==0){ //COMPRUEBA QUE EL JUEGO AUN TENGA PUTNOS DE BARCOS
                                    acaba=1;
                                    System.out.println("Ya no hay barcos en el tablero del jugador 2 ...");
                                }
                            }
                        }else{
                            System.out.println("NO ES UNA FILA CORRECTA");
                        }
                    }
                }else{
                    System.out.println("NO ES UNA COLUMNA CORRECTA");
                }
            }
        }
        //COMIENZA LA RONDA DEL JUGADOR 2
        }else if(ronda2==0){
            //if para buscar letras
            while (ronda2==0){
                // WHILE QUE COMPRUEBA EL VALOR DE LA RONDA 2
                ronda2=1;
                System.out.println("============TURNO JUGADOR 2============");
                System.out.print("Jugador 2: ");
                System.out.println(nombres.get(1));
                System.out.print("Puntuacion: ");
                System.out.println(puntuacion_jugador2);
                System.out.println("Puntos de barcos que tienes que encontrar: "+tbarcos1);
                System.out.println("=======================================");
                System.out.println(" EL TABLERO DEL ENEMIGO DEL JUGADOR 1");
                //MUESTRA EL TABLERO DEL ENEMIGO CON TIROS YA HECHOS
                imprimirTablero3(tablero_nadajugador1);
                System.out.println("=======================================");
                System.out.println("ESTE ES TU TABLERO JUGADOR 2: ");
                //MUESTRA NUESTRO TABLERO DONDE YA FUE ATACADO UN BARCO O CUANTOS QUEDAN
                imprimirTablero2(tablero_jugador2);
                int columnasi=0;
                //CADA WHILE COMPRUEBA SI SE INTRODUCEN BIEN LAS COORDENADAS
                    while (columnasi==0){
                        System.out.println("=======================================");
                        System.out.println("INGRESA TUS COORDENADAS X y Y");
                        System.out.println("Pon columna para atacar");
                        int x= leer.nextInt();
                        if (x>0 && x<=tablero_jugador1[0].length ){
                            int comprobarfila=0;
                            while (comprobarfila==0){
                                System.out.println("Pon fila para atacar");
                                int y=leer.nextInt();
                                if (y>0 && y<=tablero_jugador1[0].length ){
                                    y=y-1;
                                    x=x-1;
                                    if (tablero_jugador1[y][x]=='U'| tablero_jugador1[y][x]=='D' | tablero_jugador1[y][x]=='T' | tablero_jugador1[y][x]=='C'){
                                        System.out.println("=========================================");
                                        System.out.println(" LE DISTE A UN BARCO GANASTE 200 PUNTOS");
                                        System.out.println("=========================================");
                                        System.out.println("PUEDES VOLVER A TIRAR");
                                        tablero_jugador1[y][x]='X';
                                        tablero_nadajugador1[y][x]='X';
                                        tbarcos1=tbarcos1-1;
                                        System.out.println("Quedan por encontrar: "+tbarcos1+ " puntos de barcos en el tablero del jugador 1");
                                        puntuacion_jugador2+= 200;
                                        imprimirTablero3(tablero_nadajugador1);
                                        System.out.println("============VUELVE A TIRAR================");
                                        //CADA QUE TERMINA UNA RONDA SE PUEDE VOLVER A TIRAR
                                        comprobarfila=1;
                                        columnasi=1;
                                        ronda2=0;
                                        ganador=1;
                                        perdedor=0;
                                        if(tbarcos1==0){ //COMPRUEBA QUE EL JUEGO AUN TENGA PUTNOS DE BARCOS
                                            acaba=1;
                                            System.out.println("Ya no hay barcos en el tablero del jugador 1 ...");
                                        }
                                    }else if(tablero_jugador1[y][x]=='X'){
                                        System.out.println("LE DISTE A UNA MISMA POSICION");
                                        System.out.println("YA ATACASTE ANTES");
                                        tablero_jugador1[y][x]='X';
                                        tablero_sinmodifjugador2[y][x]='X';
                                        imprimirTablero4(tablero_sinmodifjugador2);
                                        comprobarfila=1;
                                        columnasi=1;
                                        ronda2=0;
                                        rondas=0;
                                        if(tbarcos1==0){ //COMPRUEBA QUE EL JUEGO AUN TENGA PUTNOS DE BARCOS
                                            acaba=1;
                                            System.out.println("Ya no hay barcos en el tablero del jugador 1 ...");
                                        }
                                    }else{
                                        System.out.println("NO LE DISTE A NINGUN BARCO");//SI NO DA EL TIRO SE PASA AL JUGADOR 1
                                        tablero_jugador1[y][x]='X';
                                        tablero_nadajugador1[y][x]='X';
                                        imprimirTablero3(tablero_nadajugador1);
                                        comprobarfila=1;
                                        columnasi=1;
                                        rondas=0;
                                        ronda1=0;
                                        if(tbarcos1==0){ //COMPRUEBA QUE EL JUEGO AUN TENGA PUTNOS DE BARCOS
                                            acaba=1;
                                            System.out.println("Ya no hay barcos en el tablero del jugador 1 ...");
                                        }
                                    }
                                }else{
                                    System.out.println("NO ES UNA FILA CORRECTA");
                                }
                            }
                        }else{
                            System.out.println("NO ES UNA COLUMNA CORRECTA");
                        }
                    }
            }
        }
        }
    }else{
        //TERMINA EL JUEGO POR RONDAS
        ArrayList<Integer> puntuacion= new ArrayList<Integer>();
        puntuacion.add(puntuacion_jugador1);
        puntuacion.add(puntuacion_jugador2);
        System.out.println("========================GANADOR======================="); //MENCIONA AL GANADOR QUE COMPLETO EL TABLERO ANTES
        System.out.print("Nombre: ");
        System.out.println(nombres.get(ganador));
        System.out.print("Puntuacion: ");
        System.out.println(puntuacion.get(ganador));
        System.out.println(" ");
        System.out.println("========================PERDEDOR======================="); //MENCIONA AL PERDEDOR QUE NO COMPLETO EL TABLERO ANTES
        System.out.print("Nombre: ");
        System.out.println(nombres.get(perdedor));
        System.out.print("Puntuacion: ");
        System.out.println(puntuacion.get(perdedor));
        System.out.println(" ");
        System.out.println("==================GRACIAS POR JUGAR===================");
        rondas = 1;
    }
}//While cierre de juego
}
}