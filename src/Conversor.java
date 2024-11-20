public class Conversor {
    public static double convertidorDouble(String valor) {
        try {
            return Double.parseDouble(valor);
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir a double: " + e.getMessage());
            return 0.0;
        }
    }

    public static double convertirAnguloARadianes(String anguloGrados) {
        double angulo = convertidorDouble(anguloGrados);
        return Math.toRadians(angulo);
    }
}
