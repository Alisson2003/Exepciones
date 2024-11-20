public class Proyectil {
    private double velocidadInicial;
    private double angulo; // Ángulo en radianes
    private double gravedad;

    // Constructor vacío
    public Proyectil() {}

    // Constructor con parámetros
    public Proyectil(double velocidadInicial, double angulo, double gravedad) {
        this.velocidadInicial = velocidadInicial;
        this.angulo = angulo;
        this.gravedad = gravedad;
    }

    // Getters y setters
    public double getVelocidadInicial() {
        return velocidadInicial;
    }

    public void setVelocidadInicial(double velocidadInicial) {
        this.velocidadInicial = velocidadInicial;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public double getGravedad() {
        return gravedad;
    }

    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }

    // Cálculo de la altura máxima
    public double calcularAlturaMaxima() {
        double velocidadVertical = velocidadInicial * Math.sin(angulo);
        if (gravedad == 0) {
            throw new ArithmeticException("La gravedad no puede ser 0.");
        }
        return (velocidadVertical * velocidadVertical) / (2 * Math.abs(gravedad));
    }

    // Cálculo del tiempo en alcanzar la altura máxima
    public double calcularTiempoAlturaMaxima() {
        double velocidadVertical = velocidadInicial * Math.sin(angulo);
        if (gravedad == 0) {
            throw new ArithmeticException("La gravedad no puede ser 0.");
        }
        return velocidadVertical / Math.abs(gravedad);
    }

    // Mostrar resultados
    public void mostrarResultados() {
        try {
            double alturaMaxima = calcularAlturaMaxima();
            double tiempoAlturaMaxima = calcularTiempoAlturaMaxima();
            System.out.printf("Altura máxima alcanzada: %.2f metros%n", alturaMaxima);
            System.out.printf("Tiempo para alcanzar la altura máxima: %.2f segundos%n", tiempoAlturaMaxima);
        } catch (ArithmeticException e) {
            System.out.println("Error al calcular: " + e.getMessage());
        }
    }
}
