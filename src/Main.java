public class Main {
    public static void main(String[] args) {
        try {
            // Verificar que los argumentos necesarios estén presentes
            if (args.length < 2) {
                throw new ArrayIndexOutOfBoundsException(
                    "Por favor, proporciona la velocidad inicial y el ángulo como argumentos."
                );
            }

            // Conversión de argumentos
            double velocidadInicial = Conversor.convertidorDouble(args[0]);
            double anguloEnRadianes = Conversor.convertirAnguloARadianes(args[1]);

            // Crear un objeto Proyectil con gravedad estándar (9.81 m/s^2)
            Proyectil proyectil = new Proyectil(velocidadInicial, anguloEnRadianes, 9.81);

            // Mostrar los resultados
            proyectil.mostrarResultados();

        } catch (NumberFormatException e) {
            System.out.println("Error en la conversión de tipos de datos: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }
}
