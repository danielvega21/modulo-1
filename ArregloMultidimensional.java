/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arreglomultidimensional;

/**
 *
 * @author daniel vega
 * 
 */
public class ArregloMultidimensional {
    public static void main(String[] args) {
        
        String[][] compañeros = new String[5][4];

        // Llenar el arreglo con datos de ejemplo
        compañeros[0][0] = "Daniel";
        compañeros[0][1] = "Vega";
        compañeros[0][2] = "Produccion Industrial";
        compañeros[0][3] = "Campo";

        compañeros[1][0] = "Johan";
        compañeros[1][1] = "Aleman";
        compañeros[1][2] = "Computacion (Sistemas)";
        compañeros[1][3] = "SV";

        compañeros[2][0] = "Carlos";
        compañeros[2][1] = "Interiano";
        compañeros[2][2] = "Ingeniero En Produccion Industrial";
        compañeros[2][3] = "Catedratico";

        compañeros[3][0] = "Sheyla";
        compañeros[3][1] = "Casco";
        compañeros[3][2] = "Produccion Industrial";
        compañeros[3][3] = "Cafe Cafe";

        compañeros[4][0] = "Erik";
        compañeros[4][1] = "Pineda";
        compañeros[4][2] = "Produccion Industrial";
        compañeros[4][3] = "Cajero";

        for (int i = 0; i < compañeros.length; i++) {
            System.out.println("Nombre: " + compañeros[i][0]);
            System.out.println("Apellido: " + compañeros[i][1]);
            System.out.println("Carrera: " + compañeros[i][2]);
            System.out.println("Lugar de Trabajo: " + compañeros[i][3]);
            System.out.println("--------------------------");
        }
    }
}
