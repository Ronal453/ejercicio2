package ejercicio_estaturas;

public class Estudiante {
 
    private double estatura;

    // Constructor
    public Estudiante(double estatura) {
        this.estatura = estatura;
    }

    // Getter para la estatura
    public double getEstatura() {
        return this.estatura;
    }

    // Método estático para calcular la estatura más alta
    public static double calcularEstaturaMasAlta(Estudiante[] estudiantes) {
        double max = estudiantes[0].getEstatura();
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getEstatura() > max) {
                max = estudiante.getEstatura();
            }
        }
        return max;
    }

    // Método estático para calcular la estatura más baja
    public static double calcularEstaturaMasBaja(Estudiante[] estudiantes) {
        double min = estudiantes[0].getEstatura();
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getEstatura() < min) {
                min = estudiante.getEstatura();
            }
        }
        return min;
    }

}
