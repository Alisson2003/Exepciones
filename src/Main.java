import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Cálculo de Altura Máxima y Tiempo ===");

        try {
            // Solicitar la velocidad inicial
            System.out.print("Ingrese la velocidad inicial (m/s): ");
            double velocidadInicial = scanner.nextDouble();

            // Solicitar el ángulo de lanzamiento
            System.out.print("Ingrese el ángulo de lanzamiento (grados): ");
            double angulo = scanner.nextDouble();

            // Solicitar la gravedad (por defecto se puede usar 9.81)
            System.out.print("Ingrese la gravedad (m/s^2, usualmente 9.81): ");
            double gravedad = scanner.nextDouble();

            // Crear un objeto de la clase Proyectil
            Proyectil proyectil = new Proyectil(velocidadInicial, angulo, gravedad);

            // Calcular y mostrar los resultados
            proyectil.mostrarResultados();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Cerrar el scanner
            scanner.close();
        }
    }
}
