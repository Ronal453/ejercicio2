package ejercicio_estaturas;

import java.util.Scanner;

public class Ejercicio_Estaturas {

    public static void main(String[] args) {
        Scanner escribir = new Scanner(System.in);
        //solicita al usuario el numero estudiantes  
        System.out.print("Ingrese el numero de estudiantes: ");
        int numEstudiantes = escribir.nextInt();

        Estudiante[] estudiantes = new Estudiante[numEstudiantes];
        //llena el vector con la estatura de los estudiantes
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.print("Ingrese la estatura del estudiante " + (i + 1) + ": ");
            double estatura = escribir.nextDouble();
            estudiantes[i] = new Estudiante(estatura);
        }

        // Calcular usando los metodos de la clase Estudiante
        double estaturaAlta = Estudiante.calcularEstaturaMasAlta(estudiantes);
        double estaturaBaja = Estudiante.calcularEstaturaMasBaja(estudiantes);
        
        System.out.println("\nLa estatura mas alta es: " + estaturaAlta);
        System.out.println("La estatura mas baja es: " + estaturaBaja);

    }
}