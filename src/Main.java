import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cálculo de Altura Máxima y Tiempo de Vuelo para un Movimiento Parabólico");

        System.out.print("Ingrese la velocidad inicial (m/s): ");
        double velocidadInicial = scanner.nextDouble();

        System.out.print("Ingrese el ángulo de lanzamiento (grados): ");
        double angulo = scanner.nextDouble();

        System.out.print("Ingrese la aceleración por gravedad (m/s^2): ");
        double gravedad = scanner.nextDouble();

        Proyectil proyectil = new Proyectil();
        proyectil.mostrarResultados();
        System.out.println(" ");
        proyectil.setAngulo(30);
        proyectil.setGravedad(26.2);
        proyectil.setVelocidadInicial(150);
        proyectil.mostrarResultados();

    }
}

