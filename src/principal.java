import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        consultarMoneda consulta = new consultarMoneda();
        int opcion;

        System.out.println("************************************************************************");
        System.out.println("Sea bienvenido al Conversor de Moneda de Mishell\n");

        while (true) {
            System.out.println("1) Euro =>> Libra esterlina");
            System.out.println("2) Libra esterlina =>> Euro ");
            System.out.println("3) Euro =>> Yen japonés");
            System.out.println("4) Yen japonés =>> Euro ");
            System.out.println("5) Euro =>> Franco suizo");
            System.out.println("6) Franco suizo =>> Euro ");
            System.out.println("7) Euro =>> Dólar canadiense");
            System.out.println("8) Dólar canadiense =>> Euro ");
            System.out.println("9) SALIR");
            System.out.println("Elija una opcion valida.");
            System.out.println("********************************");

            opcion = lectura.nextInt();
            switch (opcion) {
                case 1, 2, 3, 4, 5, 6, 7, 8:
                    try {
                        String monedaOrigen = obtenerMonedaOrigen(opcion);
                        String monedaDestino = obtenerMonedaDestino(opcion);
                        moneda moneda = consulta.buscaMoneda(monedaOrigen);

                        System.out.println("Ingrese el valor de " + monedaOrigen + " que deseas convertir a " + monedaDestino);
                        double cantidad = lectura.nextDouble();

                        System.out.println("CONVERSION: ");
                        System.out.println("El valor " + cantidad + " [" + monedaOrigen + "] corresponde al valor final de =>>> " +
                                (moneda.obtenerTasaDeConversion(monedaDestino) * cantidad) + " [" + monedaDestino + "]\n");
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Finalizando la aplicacion.");
                        System.exit(0);
                    }
                    break;
                case 9:
                    lectura.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }

    private static String obtenerMonedaOrigen(int opcion) {
        switch (opcion) {
            case 1, 3, 5, 7: return "EUR"; // Euro
            case 2: return "GBP";          // Libra esterlina
            case 4: return "JPY";          // Yen japonés
            case 6: return "CHF";          // Franco suizo
            case 8: return "CAD";          // Dólar canadiense
            default:
                throw new IllegalArgumentException("Opción de conversión no válida.");
        }
    }

    private static String obtenerMonedaDestino(int opcion) {
        switch (opcion) {
            case 2, 4, 6, 8: return "EUR"; // Euro
            case 1: return "GBP";          // Libra esterlina
            case 3: return "JPY";          // Yen japonés
            case 5: return "CHF";          // Franco suizo
            case 7: return "CAD";          // Dólar canadiense
            default:
                throw new IllegalArgumentException("Opción de conversión no válida.");
        }
    }
}