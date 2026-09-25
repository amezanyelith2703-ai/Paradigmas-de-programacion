package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Pruebas Unitarias
        int opcion = 0;
        while (opcion != 5) {
            opcion = menu();
            switch (opcion) {
                case 1:
                    //Programacion Funcional - Declarrativa
                    muestraResultados("El resultado de la suma es: ",
                            suma(numeroTeclado(), numeroTeclado()));
                    break;
                case 2:
                    //Programación Estructurada - Imperativa
                    float n1 = numeroTeclado();
                    float n2 = numeroTeclado();
                    float r = resta(n1,n2);

                    muestraResultados("El resultado de la resta es ",r);
                    break;

            }
        }
    }

    public static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.- Suma");
        System.out.println("2.- Resta ");
        System.out.println("3.- Multiplicacion");
        System.out.println("4.- Division");
        System.out.println("5.- Salir");
        System.out.println("Elige un numero: ");
        int opcion = sc.nextInt();
        return opcion;
    }

    public static float suma(float a, float b) {
        return a + b;
    }

    //Función Resta - float
    public static float resta(float n1, float n2){
        return n1-n2;
    }
    //Función Multiplicación - float
    //Función División - float

    public static float numeroTeclado() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        float numero = sc.nextFloat();
        return numero;
    }

    public static void muestraResultados(String mensaje, float resultado) {
        System.out.println(mensaje + " :" + resultado);
    }
}