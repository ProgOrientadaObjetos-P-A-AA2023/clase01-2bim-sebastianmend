/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

import java.util.Locale;
import java.util.Scanner;
import herencia1.*;

/**
 *
 * @author reroes
 */
public class Ejecutor3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opc;
        // Ingresar por teclado
        // un objeto de tipo Estudiante Distancia si el usuario ingresa 1 como 
        // opción
        // un objeto de tipo Estudiante Presencial si el usuario ingresa 2 como 
        // opción
        do {
            System.out.println("Ingrese:\n[1] para ingresar un Estudiante Distancia\n"
                    + "[2] para ingresar un Estudiante Presencial ");
            opc = entrada.nextInt();
            entrada.nextLine();

            if (opc == 1) {
                EstudianteDistancia estudiante = new EstudianteDistancia();
                entrada.useLocale(Locale.US);
                System.out.println("Ingrese nombres");
                String nombre = entrada.nextLine();
                System.out.println("Ingrese apellidos");
                String apellidos = entrada.nextLine();
                System.out.println("Ingrese identificación");
                String identificacion = entrada.nextLine();
                System.out.println("Ingrese edad");
                int edad = entrada.nextInt();
                System.out.println("Ingrese número de asignaturas");
                int asignaturas = entrada.nextInt();
                System.out.println("Ingrese costo asignatura");
                double costoAsignatura = entrada.nextDouble();
                estudiante.establecerNombresEstudiante(nombre);
                estudiante.establecerApellidoEstudiante(apellidos);
                estudiante.establecerEdadEstudiante(edad);
                estudiante.establecerIdentificacionEstudiante(identificacion);
                estudiante.establecerNumeroAsginaturas(asignaturas);
                estudiante.establecerCostoAsignatura(costoAsignatura);
                estudiante.calcularMatriculaDistancia();

                System.out.printf("%s\n", estudiante);
                opc = 3;

            }

            if (opc == 2) {
                EstudiantePresencial estudiante = new EstudiantePresencial();
                entrada.useLocale(Locale.US);
                System.out.println("Ingrese nombres");
                String nombres = entrada.nextLine();
                System.out.println("Ingrese apellidos");
                String apellidos = entrada.nextLine();
                System.out.println("Ingrese identificación");
                String identificacion = entrada.nextLine();
                System.out.println("Ingrese edad");
                int edad = entrada.nextInt();

                System.out.println("Ingrese número de creditos");
                int asignaturas = entrada.nextInt();
                System.out.println("Ingrese costo de los creditos");
                double costoAsignatura = entrada.nextDouble();
                estudiante.establecerNombresEstudiante(nombres);
                estudiante.establecerApellidoEstudiante(apellidos);
                estudiante.establecerEdadEstudiante(edad);
                estudiante.establecerIdentificacionEstudiante(identificacion);
                estudiante.establecerNumeroCreditos(asignaturas);
                estudiante.establecerCostoCredito(costoAsignatura);
                estudiante.obtenerMatriculaPresencial();

                System.out.printf("%s\n", estudiante);

                opc = 3;

            }

        } while (opc != 0);

    }
}
