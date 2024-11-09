/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nombres_companeros;
public class Nombres_Companeros {

    public static void main(String[] args) {
        // Crear un arreglo para almacenar 10 nombres
        String[] nombres = new String[10];

        // Asignar nombres al arreglo
        nombres[0] = "Erik";
        nombres[1] = "Sheyla";
        nombres[2] = "Leonel";
        nombres[3] = "Kevin";
        nombres[4] = "Ramon";
        nombres[5] = "Cristian";
        nombres[6] = "Osmer";
        nombres[7] = "Daniel";
        nombres[8] = "Alejandra";
        nombres[9] = "Johan";

        // Imprimir los nombres
        System.out.println("Nombres de mis companeros de clase:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
    }
}
