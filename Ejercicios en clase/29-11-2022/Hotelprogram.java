import java.util.Scanner;
public class Hotelprogram {
    public static void main(String[] args) {
        int elevador = 0; 
        int sigue=0;
        int numproceso;
        int total=0;
        int saliopiso1=0;
        int saliopiso2=0;
        int saliopiso3=0;
        int saliopiso4=0;
        int saliopiso5=0;
        int numpiso;
        int numpersonas;
        int limitepersonas = 500;
        int totalsalieron=0;
        int piso1=263;
        int piso2=0;
        int piso3=0;
        int piso4=0;
        int piso5=0;
        int bajarpiso;
        int totalpiso=0;
        int subelev;
        int suben=0;

        while (sigue==0) {
            //while menu
            System.out.println("*---------*---------*---------*---------*");
            System.out.println("                Procesos");
            System.out.println("1- Subir personas a un piso");
            System.out.println("2- Consultar gente por piso");
            System.out.println("3- Sacar personas de un piso");
            System.out.println("4- Sacar personas de todos los pisos");
            System.out.println("5- Mostrar informacion de cuantas personas salieron, entraron y estan dentro");
            System.out.println("0- Cerrar programa");
            System.out.println("*---------*---------*---------*---------*");
            Scanner leer = new Scanner(System.in);
            System.out.println("Elige proceso");
            numproceso = leer.nextInt();
            if(numproceso==1){
                System.out.println("==========Subir personas==========");
                System.out.println("Ingresa piso al que subiran");
                numpiso = leer.nextInt();
                if (numpiso > 0 && numpiso <= 5){
                    //while subir personas
                    boolean siguesub=false;
                    while (siguesub == false) {
                    System.out.println("Ingresa cantidad de personas que subiran");
                    numpersonas = leer.nextInt();
                    if (numpersonas > 0 && numpersonas <= limitepersonas) {
                        if (numpiso == 1) {
                            piso1 = 0; 
                            while (piso1<numpersonas){
                                piso1 = piso1+5;
                                if (piso1 > numpersonas){
                                    piso1 = +numpersonas;
                                }
                                elevador=numpersonas-piso1;
                                
                                System.out.println("Quedan por subir: "+elevador);
                            }
                            System.out.println("Subieron : " + piso1+ " personas al piso 1");
                        }
                        else if (numpiso == 2){
                            piso2 = 0;
                            while (piso2<numpersonas){
                                subelev=numpersonas-piso2;
                                if (subelev>=5){
                                    suben=5;
                                }
                                else if(subelev<5){
                                    suben=subelev;
                                }
                                piso2 = piso2+5;
                                if (piso2>numpersonas){
                                    piso2=+numpersonas;
                                }
                                elevador=numpersonas-piso2;
                                System.out.println("Subieron: "+suben);
                                System.out.println("Quedan por subir: "+elevador);
                            }
                            System.out.println("Subieron : " + piso2+ " personas al piso 2");
                        }
                        else if (numpiso==3){
                            piso3 = 0; 
                            while(piso3<numpersonas) {
                                piso3=piso3+5;
                                if (piso3>numpersonas) {
                                    piso3=+numpersonas;
                                }
                                elevador=numpersonas-piso3;
                                System.out.println("Quedan por subir: "+elevador);
                            }
                            System.out.println("Subieron : " + piso3+ " personas al piso 3");
                        }
                        else if (numpiso == 4) {
                            piso4 = 0;
                            while (piso4<numpersonas) {
                                piso4=piso4+5;
                                if (piso4>numpersonas){
                                    piso4=+numpersonas;
                                }
                                elevador=numpersonas-piso4;
                                System.out.println("Quedan por subir: "+elevador);
                            }
                            System.out.println("Subieron : " + piso4+ " personas al piso 4");
                        }
                        else if (numpiso==5){
                            piso5=0;
                            while (piso5<numpersonas) {
                                piso5 = piso5 + 5;
                                if(piso5>numpersonas){
                                    piso5=+numpersonas;
                                }
                                elevador=numpersonas-piso5;
                                System.out.println("Quedan por subir: "+elevador);
                            }
                            System.out.println("Subieron : " + piso5+ " personas al piso 5");
                        }
                        
                        else{
                            System.out.println("Numero de piso no valido, ingresa otro");
                        }
                    } else {
                        System.out.println("No es un valor aceptable");
                    }
                    System.out.println("==========Opciones==========");
                    System.out.println("Salir de opcion escriba el numero 0 o superior al 5");
                    System.out.println("Para volver a ingresar personas a un piso escribir numero de piso");
                    numpiso = leer.nextInt();
                    if (numpiso==0){
                        System.out.println("Saliendo al menu de procesos");
                        siguesub=true;
                    }
                    else if (numpiso>=6){
                        System.out.println("Saliendo al menu de procesos");
                        siguesub=true;
                    }
                    
                    }
                }
                else{
                    System.out.println("No valido vuelve a ingresar el piso desde menu");
                }
                total = piso1+piso2+piso3+piso4+piso5;
            }
            else if (numproceso==2) {
                    // while de consulta
                    boolean siguecon=false;
                    while (siguecon==false){
                        System.out.println("========================Consultar========================");
                        System.out.println("Para consultar por piso poner del 1-5 y para todos poner 6");
                        System.out.println("Escribe tu opción");
                        int consulta = leer.nextInt();
                        if (consulta>0 && consulta<=6){
                            if (consulta==1){
                                System.out.println("Estan "+piso1+" personas en el piso 1");
                                siguecon=true;
                            }else if (consulta==2){
                                System.out.println("Estan "+piso2+" personas en el piso 2");
                                siguecon=true;
                            }else if (consulta==3){
                                System.out.println("Estan "+piso3+" personas en el piso 3");
                                siguecon=true;
                            }else if (consulta==4){
                                System.out.println("Estan "+piso4+" personas en el piso 4");
                                siguecon=true;
                            }else if (consulta==5){
                                System.out.println("Estan "+piso5+" personas en el piso 5");
                                siguecon=true;
                            }else if (consulta==6){
                                System.out.println("Estan " + piso1 + " personas en el piso 1");
                                System.out.println("Estan " + piso2 + " personas en el piso 2");
                                System.out.println("Estan " + piso3 + " personas en el piso 3");
                                System.out.println("Estan " + piso4 + " personas en el piso 4");
                                System.out.println("Estan " + piso5 + " personas en el piso 5");
                                siguecon=true;
                            }
                        }else{
                            System.out.println("No corresponde a una opcion, vuleve a introducir el numero");
                        }    
                    }
            }
            else if (numproceso==3){
                //Bajar por piso
                System.out.println("=============BAJAR POR PISO=============");
                System.out.println("Ingresa numero de piso");
                bajarpiso = leer.nextInt();
                int caso = 0;
                if (bajarpiso>0 && bajarpiso<=5){
                if (bajarpiso == 1) {
                    saliopiso1=saliopiso1+piso1;
                    while ( caso < piso1) {    
                        piso1 = piso1 - 5;
                        if (piso1 < 0) {
                        piso1 = 0;
                        }
                        System.out.println("Personas esperando el elevador: " + piso1);
                    }
                }
                else if (bajarpiso == 2) {
                    saliopiso2=saliopiso2+piso2;
                    while (caso<piso2){
                        piso2 = piso2 - 5;
                        if (piso2 < 0) {
                            piso2 = 0;
                        }
                        System.out.println("Personas esperando el elevador: " + piso2);
                    }
                }
                else if (bajarpiso == 3) {
                    saliopiso3=saliopiso3+piso3;
                    while (caso<piso3) {
                        piso3 = piso3 - 5;
                        if (piso3 < 0) {
                            piso3 = 0;
                        }
                        System.out.println("Personas esperando el elevador: " + piso3);
                    }
                }
                else if (bajarpiso == 4) {
                    saliopiso4=saliopiso4+piso4;
                    while ( caso < piso4) {
                        piso4 = piso4 - 5;
                        if (piso4 < 0) {
                            piso4 = 0;
                        }
                        System.out.println("Personas esperando para bajar: " + piso4);
                    }
                }
                else if (bajarpiso == 5) {
                    saliopiso5=saliopiso5+piso5;
                    while ( caso < piso5) {
                        piso5 = piso5 - 5;
                        if (piso5 < 0) {
                            piso5 = 0;
                        }
                        System.out.println("Personas esperando para bajar: " + piso5);
                    }
                }
                }
                else{
                    System.out.println("No hay personas o no es un piso correcto");
                }
            }
            else if(numproceso==4){
                //Bajar todos
                System.out.println("=================BAJAR DE TODOS LOS PISOS=================");
                int seguir = 0;
                saliopiso1= saliopiso1 +piso1;
                while ( seguir < piso1) {
                    
                    piso1 = piso1 - 5;
                    if (piso1 < 0) {
                    piso1 = 0;
                    }
                    System.out.println(piso1+" personas por bajar del piso 1");
                }
                saliopiso2= saliopiso2+piso2;
                while (seguir<piso2) {
                    
                    piso2 = piso2 - 5;
                    if (piso2 < 0) {
                        piso2 = 0;
                    }
                    System.out.println(piso2+" personas por bajar del piso 2");
                }
                saliopiso3= saliopiso3+piso3;
                while (seguir< piso3) {
                    
                    piso3 = piso3 - 5;
                    if (piso3 < 0) {
                        piso3 = 0;
                    }
                    System.out.println(piso3+" personas por bajar del piso 3");
                }
                saliopiso4= saliopiso4+piso4;
                while (seguir<piso4) {
                    piso4 = piso4 - 5;
                    if (piso4 < 0) {
                        piso4 = 0;
                    }
                    System.out.println(piso4+" personas por bajar del piso 4");
                }
                saliopiso5= saliopiso5+piso5;
                while (seguir<piso5) {
                    piso5 = piso5 - 5;
                    if (piso5 < 0) {
                    piso5 = 0;
                    }
                    System.out.println(piso5+" personas por bajar del piso 5");
                }    
            }else if(numproceso==5){
                //if para ver informacion 
                totalsalieron = saliopiso1+saliopiso2+saliopiso3+saliopiso4+saliopiso5;
                totalpiso= total-totalsalieron;
                System.out.println("==================MOSTRAR INFORMACION==================");
                System.out.println("De "+total+ " personas quen estabann cuando se consulto:");
                System.out.println("Quedaban en el hotel:"+total);
                System.out.println("Estan " + piso1 + " personas en el piso 1");
                System.out.println("Estan " + piso2 + " personas en el piso 2");
                System.out.println("Estan " + piso3 + " personas en el piso 3");
                System.out.println("Estan " + piso4 + " personas en el piso 4");
                System.out.println("Estan " + piso5 + " personas en el piso 5");
                System.out.println("Salieron en total: "+totalsalieron+" personas");
                System.out.println("Y de las que bajaron se fueron por piso: ");
                System.out.println("Personas que bajaron del piso 1: "+ saliopiso1);
                System.out.println("Personas que bajaron del piso 2: "+ saliopiso2);
                System.out.println("Personas que bajaron del piso 3: "+ saliopiso3);
                System.out.println("Personas que bajaron del el piso 4: "+ saliopiso4);
                System.out.println("Personas que bajaron del piso 5: "+ saliopiso5);
                System.out.println("Se modificaron: "+totalpiso+" personas");
            }
            else if (numproceso == 0) {
                sigue = 1;
                System.out.println("--------ADIOS--------");
            }
            else {
                System.out.println("Numero no valido");
                System.out.println("Pasando al menu de procesos");
            }
        }
    }
}