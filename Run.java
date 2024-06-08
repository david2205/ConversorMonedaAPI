import java.util.Scanner;

public class Run {
    static Scanner scanner = new Scanner(System.in);
    static int cambio;
    static ConsultaMonedas consulta = new ConsultaMonedas();

    public static void mostrarMenu() {
        System.out.println("Menú de Opciones");
        System.out.println("1. Peso Colombiano a Peso Chileno");
        System.out.println("2. Foringo Hungaro a Peso Jamaiquino");
        System.out.println("3. Naira a Riyal Saudi");
        System.out.println("4. Dolar Taiwanes a Dolar Simbawuense");
        System.out.println("5. Salir");
    }

    public static void opcion1() {
        System.out.println("ingrese la cantidad para hacer el cambio: ");
        cambio = scanner.nextInt();
        Moneda moneda1=consulta.buscaMoneda("COP");
        System.out.println("La Coversion de Peso Colombiano a Peso Chileno es "+(moneda1.getConversionRate("CLP")*cambio));
    }

    public static void opcion2() {
        System.out.println("ingrese la cantidad para hacer el cambio: ");
        cambio = scanner.nextInt();
        Moneda moneda1=consulta.buscaMoneda("HUF");
        System.out.println("La Coversion de Foringo Hungaro a Peso Jamaiquino es "+(moneda1.getConversionRate("JMD")*cambio));
    }

    public static void opcion3() {
        System.out.println("ingrese la cantidad para hacer el cambio: ");
        cambio = scanner.nextInt();
        Moneda moneda1=consulta.buscaMoneda("NGN");
        System.out.println("La Coversion de Naira a riyal Saudi es "+(moneda1.getConversionRate("SAR")*cambio));

    }

    public static void opcion4() {
        System.out.println("ingrese la cantidad para hacer el cambio: ");
        cambio = scanner.nextInt();
        Moneda moneda1=consulta.buscaMoneda("TWD");
        System.out.println("La Coversion de Dolar Taiwanes a Dolar Simbawuense es "+(moneda1.getConversionRate("ZWL")*cambio));

    }

    public static void main(String[] args)  {
        boolean salir = false;

        while (!salir) {
            mostrarMenu();
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    opcion1();
                    break;
                case 2:
                    opcion2();
                    break;
                case 3:
                    opcion3();
                    break;
                case 4:
                    opcion4();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida, por favor intenta de nuevo");
            }
        }

        scanner.close();
    }
}

