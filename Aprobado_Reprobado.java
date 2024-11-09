package com.mycompany.aprobado_reprobado;
import java.util.Scanner;

public class Aprobado_Reprobado{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Ingrese la nota de " + nombre1 + ": ");
        int nota1 = scanner.nextInt();
        scanner.nextLine(); 

        evaluarEstudiante(nombre1, nota1);

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre2 = scanner.nextLine();
        System.out.print("Ingrese la nota de " + nombre2 + ": ");
        int nota2 = scanner.nextInt();

        evaluarEstudiante(nombre2, nota2);

        scanner.close();
    }

    public static void evaluarEstudiante(String nombre, int nota) {
        String estado = (nota >= 70) ? "Aprobado" : "Reprobado";

        System.out.println(nombre);
        System.out.println(nota);
        System.out.println(estado);
    }
}

