package com.theinsideshine;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        Scanner lectura = new Scanner (System.in);

        System.out.println("Ingrese su nombre: ");

        String nombre = lectura.next();

        System.out.println("Ingrese su apellido: ");

        String apellido = lectura.next();

        System.out.println("Ingrese su edad: ");

        int edad = lectura.nextInt();

        System.out.println("Ingrese su hobbie: ");

        String hobbie = lectura.next();

        System.out.println("Ingrese su editor de codigo: ");

        String editor = lectura.next();

        System.out.println("Su nombre es: " + nombre +
                " su apellido es: " + apellido +
                " y su edad es: " + edad +
                "  y su hobbie es: " + hobbie +
                        " y su editor es: " + editor );

    }//cierra método main

}//cierra class

