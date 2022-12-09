import java.util.Scanner;

public class carreracaballos {
    public static void main(String[] args) {
        int dado=0;
        int cab1 = 0; 
        int cab2 = 0; 
        int cab3 = 0; 
        int cab4 = 0;
        int primer = 0;
        int segundo = 0; 
        int tercero = 0; 
        int cuarto = 0; 
        int meta = 0;
        boolean sigue = true;
        Scanner leer = new Scanner(System.in);
        System.out.println("=======================================================");
        System.out.println("             Ingresa el valor de la meta: ");
        meta=leer.nextInt();
        System.out.println("=======================================================");
        leer.close();
        System.out.println("====================Inicia Carrera=====================");
        System.out.println("==================Dado de seis caras==================");

        while (sigue=true) {
            if (sigue=true) {
                dado = (int) (Math.random() * 6 + 1);
                if (cab1 < meta) {
                    System.out.println("====================Turno caballo 1====================");
                    System.out.println("Caballo 1 le dio en dado: " + dado);
                    System.out.println(" ");
                    cab1 = cab1+dado;
                    System.out.println("Posicion: " + cab1);
                    if (cab1 >= meta) {
                        if (primer <= 0) {
                            primer = 1;
                        } else if (primer > 0 && segundo <= 0) {
                            segundo = 1;
                        } else if (primer > 0 && segundo > 0 && tercero <= 0) {
                            tercero = 1;
                        } else if (primer > 0 && segundo > 0 && tercero > 0 && cuarto <= 0) {
                            cuarto = 1;
                        }
                    }
                    if ((primer >= 1) && (segundo >= 1) && (tercero >= 1) && (cuarto >= 1)) {
                        System.out.println("=======================================================");
                        System.out.println("                      Resultados: ");
                        System.out.println("Caballo " + primer+ " llego primero");
                        System.out.println("Caballo " + segundo+ " llego segundo");
                        System.out.println("Caballo " + tercero+ " llego tercero");
                        System.out.println("Caballo " + cuarto+ " llego cuarto");
                        System.out.println("=======================================================");
                        sigue = false;
                    }
                }
            }
            if (sigue=true) {
                dado = (int) (Math.random() * 6 + 1);
                if (cab2 < meta) {
                    System.out.println("====================Turno caballo 2====================");
                    System.out.println("Caballo 2 le dio en dado: " + dado);
                    System.out.println(" ");
                    cab2 = cab2+dado;
                    System.out.println("Posicion: " + cab2);
                    if (cab2 >= meta) {
                        if (primer <= 0) {
                            primer = 2;
                        } else if (primer > 0 && segundo <= 0) {
                            segundo = 2;
                        } else if (primer > 0 && segundo > 0 && tercero <= 0) {
                            tercero = 2;
                        } else if (primer > 0 && segundo > 0 && tercero > 0 && cuarto <= 0) {
                            cuarto = 2;
                        }
                    }
                    if ((primer >= 1) && (segundo >= 1) && (tercero >= 1) && (cuarto >= 1)) {
                        System.out.println("=======================================================");
                        System.out.println("                      Resultados: ");
                        System.out.println("Caballo " + primer+ " llego primero");
                        System.out.println("Caballo " + segundo+ " llego segundo");
                        System.out.println("Caballo " + tercero+ " llego tercero");
                        System.out.println("Caballo " + cuarto+ " llego cuarto");
                        System.out.println("=======================================================");
                        sigue = false;
                    }
                }
            }
            if (sigue=true) {
                dado = (int) (Math.random() * 6 + 1);
                if (cab3 < meta) {
                    System.out.println("====================Turno caballo 3====================");
                    System.out.println("Caballo 3 le dio en dado: " + dado);
                    cab3 = cab3+dado;
                    System.out.println(" ");
                    System.out.println("Posicion: " + cab3);
                    if (cab3 >= meta) {
                        if (primer <= 0) {
                            primer = 3;
                        } else if (primer > 0 && segundo <= 0) {
                            segundo = 3;
                        } else if (primer > 0 && segundo > 0 && tercero <= 0) {
                            tercero = 3;
                        } else if (primer > 0 && segundo > 0 && tercero > 0 && cuarto <= 0) {
                            cuarto = 3;
                        }
                    }
                    if ((primer >= 1) && (segundo >= 1) && (tercero >= 1) && (cuarto >= 1)) {
                        System.out.println("=======================================================");
                        System.out.println("                      Resultados: ");
                        System.out.println("Caballo " + primer+ " llego primero");
                        System.out.println("Caballo " + segundo+ " llego segundo");
                        System.out.println("Caballo " + tercero+ " llego tercero");
                        System.out.println("Caballo " + cuarto+ " llego cuarto");
                        System.out.println("=======================================================");
                        sigue = false;
                    }
                }
            }
            if (sigue=true) {
                dado = (int) (Math.random() * 6 + 1);
                if (cab4 < meta) {
                    System.out.println("====================Turno caballo 4====================");
                    System.out.println("Caballo 4 le dio en dado: " + dado);
                    cab4 = cab4+dado;
                    System.out.println(" ");
                    System.out.println("Posicion: " + cab4);
                    if (cab4 >= meta) {
                        if (primer <= 0) {
                            primer = 4;
                        } else if (primer > 0 && segundo <= 0) {
                            segundo = 4;
                        } else if (primer > 0 && segundo > 0 && tercero <= 0) {
                            tercero = 4;
                        } else if (primer > 0 && segundo > 0 && tercero > 0 && cuarto <= 0) {
                            cuarto = 4;
                        }
                    }
                    if ((primer >= 1) && (segundo >= 1) && (tercero >= 1) && (cuarto >= 1)) {
                        System.out.println("=======================================================");
                        System.out.println("                      Resultados: ");
                        System.out.println("Caballo " + primer+ " llego primero");
                        System.out.println("Caballo " + segundo+ " llego segundo");
                        System.out.println("Caballo " + tercero+ " llego tercero");
                        System.out.println("Caballo " + cuarto+ " llego cuarto");
                        System.out.println("=======================================================");
                        sigue = false;
                    }
                }
            }
        }
    }
}