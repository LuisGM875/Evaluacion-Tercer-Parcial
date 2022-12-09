import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // (int) (Math.random() * 5 + 1)
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0, primer = 0, segundo = 0, tercero = 0, cuarto = 0, meta = 0,random = 0;
        boolean estado = false;
        Scanner lector = new Scanner(System.in);

        System.out.println("Define tu meta: ");
        meta = lector.nextInt();
        while (!estado) {
            if (!estado) {
                random = (int) (Math.random() * 12 + 1);
                if (c1 < meta) {
                    System.out.println("Turno caballo 1");
                    System.out.println("Caballo 1 tiró: " + random);
                    c1 += random;
                    System.out.println("Puntuación: " + c1 + "/" + meta);
                    if (c1 >= meta) {
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
                    if (primer >= 1 && segundo >= 1 && tercero >= 1 && cuarto >= 1) {
                        System.out.println("Juego finalizado los podeos quedaron: ");
                        System.out.println("Caballo: " + primer);
                        System.out.println("Caballo: " + segundo);
                        System.out.println("Caballo: " + tercero);
                        System.out.println("Caballo: " + cuarto);
                        estado = true;
                    }
                }
            }
            if (!estado) {
                random = (int) (Math.random() * 12 + 1);
                if (c2 < meta) {
                    System.out.println("Turno caballo 2");
                    System.out.println("Caballo 2 tiró: " + random);
                    c2 += random;
                    System.out.println("Puntuación: " + c2 + "/" + meta);
                    if (c2 >= meta) {
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
                    if (primer >= 1 && segundo >= 1 && tercero >= 1 && cuarto >= 1) {
                        System.out.println("Juego finalizado los podeos quedaron: ");
                        System.out.println("Caballo: " + primer);
                        System.out.println("Caballo: " + segundo);
                        System.out.println("Caballo: " + tercero);
                        System.out.println("Caballo: " + cuarto);
                        estado = true;
                    }
                }
            }
            if (!estado) {
                random = (int) (Math.random() * 12 + 1);
                if (c3 < meta) {
                    System.out.println("Turno caballo 3");
                    System.out.println("Caballo 3 tiró: " + random);
                    c3 += random;
                    System.out.println("Puntuación: " + c3 + "/" + meta);
                    if (c3 >= meta) {
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
                    if (primer >= 1 && segundo >= 1 && tercero >= 1 && cuarto >= 1) {
                        System.out.println("Juego finalizado los podeos quedaron: ");
                        System.out.println("Caballo: " + primer);
                        System.out.println("Caballo: " + segundo);
                        System.out.println("Caballo: " + tercero);
                        System.out.println("Caballo: " + cuarto);
                        estado = true;
                    }
                }
            }
            if (!estado) {
                random = (int) (Math.random() * 12 + 1);
                if (c4 < meta) {
                    System.out.println("Turno caballo 4");
                    System.out.println("Caballo 4 tiró: " + random);
                    c4 += random;
                    System.out.println("Puntuación: " + c4 + "/" + meta);
                    if (c4 >= meta) {
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
                    if (primer >= 1 && segundo >= 1 && tercero >= 1 && cuarto >= 1) {
                        System.out.println("Juego finalizado los podeos quedaron: ");
                        System.out.println("Caballo: " + primer);
                        System.out.println("Caballo: " + segundo);
                        System.out.println("Caballo: " + tercero);
                        System.out.println("Caballo: " + cuarto);
                        estado = true;
                    }
                }
            }

        }


    }
}
