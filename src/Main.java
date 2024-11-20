public class Main {
    public static void main(String[] args) {
        try {
            if (args.length < 2) {
                throw new ArrayIndexOutOfBoundsException("Por favor, proporciona la velocidad inicial y el ángulo como argumentos.");
            }

            double velocidadInicial = Conversor.convertirADouble(args[0]);
            double anguloEnRadianes = Conversor.convertirAnguloARadianes(args[1]);

            Proyectil proyectil = new Proyectil(velocidadInicial, anguloEnRadianes, 9.81);
            proyectil.mostrarResultados();
        } catch (NumberFormatException e) {
            System.out.println("Error en la conversión de tipos de datos: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
