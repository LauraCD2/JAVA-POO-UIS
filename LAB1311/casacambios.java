import java.util.Scanner;

//usuario escoge la opcion que desea realizar 1. euro 2. dolar 3. mexicanos 4. euro y dolar 5. euro y mexicanos 6. dolar y mexicanos 7. euro, dolar y mexicanos
public class opciones {
    private double dolar;
    private double euro;
    private double mexicano;
    private double colombianos;
    private double total;
    public double getDolar() {
        return dolar;
    }
    public void setDolar(double dolar) {
        this.dolar = dolar;
    }
    public double getEuro() {
        return euro;
    }
    public void setEuro(double euro) {
        this.euro = euro;
    }
    public double getMexicano() {
        return mexicano;
    }
    public void setPeso(double mexicano) {
        this.mexicano = mexicano;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public static void Opciones(String[] args) {
        opciones o = new opciones();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese la moneda que desea cambiar: ");
            System.out.println("1. euro");
            System.out.println("2. dolar");
            System.out.println("3. mexicanos");
            System.out.println("4. euro y dolar");
            System.out.println("5. euro y mexicanos");
            System.out.println("6. dolar y mexicanos");
            System.out.println("7. euro, dolar y mexicanos");

            int opcion = sc.nextInt();
            switch (opcion) {
            case 1:
                System.out.println("Ingrese el monto en euros: ");
                o.setEuro(sc.nextDouble());
                o.setTotal((o.getEuro()*1.02));
                System.out.println("El total en pesos colombianos es: "+o.getTotal());
                break;
            case 2:
                System.out.println("Ingrese el monto en dolares: ");
                o.setDolar(sc.nextDouble());
                o.setTotal((o.getDolar()*4998.76));
                System.out.println("El total en pesos colombianos es: "+o.getTotal());
                break;
            case 3:
                System.out.println("Ingrese el monto en pesos mexicanos: ");
                o.setPeso(sc.nextDouble());
                o.setTotal((o.getMexicano()));
                System.out.println("El total en pesos colombianos es: "+o.getTotal());
                break;
            case 4:
                System.out.println("Ingrese el monto en euros: ");
                o.setEuro(sc.nextDouble());
                System.out.println("Ingrese el monto en dolares: ");
                o.setDolar(sc.nextDouble());
                o.setTotal((o.getDolar()*4998.76)+(o.getEuro()*1.02));
                System.out.println("El total en pesos colombianos es: "+o.getTotal());
                break;
            case 5:
                System.out.println("Ingrese el monto en euros: ");
                o.setEuro(sc.nextDouble());
                System.out.println("Ingrese el monto en pesos mexicanos: ");
                o.setPeso(sc.nextDouble());
                o.setTotal((o.getMexicano())+(o.getEuro()*1.02));
                System.out.println("El total en pesos colombianos es: "+o.getTotal());
                break;
            case 6:
                System.out.println("Ingrese el monto en dolares: ");
                o.setDolar(sc.nextDouble());
                System.out.println("Ingrese el monto en pesos mexicanos: ");
                o.setPeso(sc.nextDouble());
                o.setTotal((o.getMexicano())+(o.getDolar()*4998.76));
                System.out.println("El total en pesos colombianos es: "+o.getTotal());
                break;
            case 7:
                System.out.println("Ingrese el monto en euros: ");
                o.setEuro(sc.nextDouble());
                System.out.println("Ingrese el monto en dolares: ");
                o.setDolar(sc.nextDouble());
                System.out.println("Ingrese el monto en pesos mexicanos: ");
                o.setPeso(sc.nextDouble());
                o.setTotal((o.getMexicano())+(o.getDolar()*4998.76)+(o.getEuro()*1.02));
                System.out.println("El total en pesos colombianos es: "+o.getTotal());
                break;
            default:
                System.out.println("Opcion no valida");
                break;
            }
        }
    }
    public static opciones opciones() {
        return null;
    }
}
