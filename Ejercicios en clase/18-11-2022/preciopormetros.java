public class preciopormetros {
    public static void main(String[] args) throws Exception {        
        String figura1 = "cuadrado";
        int precio; 
        int area; 
        int b=5; 
        int h=10; 
        int l=4; 
        System.out.println("Formas de terreno posibles triangulo, cuadrado y rectangulo");
        if (figura1 == "rectangulo"){ 
            area=b*h;
        }else if(figura1 == "triangulo"){
            area=b*h/2;
        }else{
            area=l*l;
        }
        if (area<=200) {
            precio = area*2000;
            System.out.println("Costo de 2000 por metro");
        }else if (area>200 && area<=300) {
            precio = area*1800;
            System.out.println("Costo de 1800 por metro");
        }else if (area>300 && area<=500) {
            precio = area*1600;
            System.out.println("Costo de 1600 por metro");
        }else {
            precio = area*1400;
            System.out.println("Costo de 1400 por metro");
        }
        System.out.println("El terreno tiene forma de: "+figura1);
        System.out.println("El precio total del terreno es: "+precio);
        System.out.println("El area del terreno es: "+area);
    }
}