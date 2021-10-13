package com.generation;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*
        String mensaje = saludar("Luis Angel");
        System.out.println(mensaje);
        int resultado = suma(5, 3);
        System.out.println(resultado);
        alerta("Mensaje de prueba");

        System.out.println(Math.PI);
        double num2 = 23.12;
        double num1 = 13.75;

        System.out.println(Math.ceil(num2));
        */
        String mensaje1 = "Hola!";
        String mensaje2 = "bye!";
        System.out.println(mensaje2.length());  // nos devuelve el tamaño de las cadenas
        System.out.println(mensaje2.compareTo(mensaje1));  //si ambas cadenas son iguales devuelve 0 en int, sino un numero mayor a cero
        System.out.println(mensaje1.equals(mensaje2)); // lo mismo pero devuelve un boolean, difiere de mayusculas y minusculas
        System.out.println(mensaje1.equalsIgnoreCase(mensaje2)); // lo mismo pero es igual mayus y minus
        System.out.println(mensaje2.toUpperCase());
    }

    public static String saludar(String nombre){
        return "Hola, "+ nombre;
    }

    public static int suma(int num1, int num2){
        return num1 + num2;
    }

    public static void alerta(String mensaje){
        System.out.println(mensaje);
    }
}
