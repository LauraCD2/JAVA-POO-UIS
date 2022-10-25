//area de circulo, cuadrado o rectangulo
import java.util.Scanner;
public class areas{
/**
 * @param args
 */
public static void main(String[] args){
try (Scanner entrada = new Scanner(System.in)) {
    int opcion;
    double radio, lado, base, altura, area;
    System.out.println("1. Area de un circulo");
    System.out.println("2. Area de un cuadrado");
    System.out.println("3. Area de un rectangulo");
    System.out.println("4. Salir");
    System.out.println("Elija una opcion");
    opcion = entrada.nextInt();
    switch(opcion){
    case 1:
    System.out.println("Ingrese el radio del circulo");
    radio = entrada.nextDouble();
    area = Math.PI * Math.pow(radio, 2);
    System.out.println("El area del circulo es: " + area);
    break;
    case 2:
    System.out.println("Ingrese el lado del cuadrado");
    lado = entrada.nextDouble();
    area = Math.pow(lado, 2);
    System.out.println("El area del cuadrado es: " + area);
    break;
    case 3:
    System.out.println("Ingrese la base del rectangulo");
    base = entrada.nextDouble();
    System.out.println("Ingrese la altura del rectangulo");
    altura = entrada.nextDouble();
    area = base * altura;
    System.out.println("El area del rectangulo es: " + area);
    break;
    case 4:
    System.out.println("Gracias por usar el programa");
    break;
    default:
    System.out.println("Opcion no valida");
    }
}
}

}
