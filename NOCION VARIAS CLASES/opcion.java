//escoger clase suma o resta

import java.util.Scanner;
public class opcion {
    
    public static void main(String[] args) {
        int opcion;
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Salir");
            System.out.println("Elija una opcion");
            opcion = entrada.nextInt();
            switch(opcion){
            case 1:
                suma.main(args);
                break;
            case 2:
                resta.main(args);
                break;
            case 3:
                System.out.println("Gracias por usar el programa");
                break;
            default:
                System.out.println("Opcion no valida");
            }
        }
    }
    

}
