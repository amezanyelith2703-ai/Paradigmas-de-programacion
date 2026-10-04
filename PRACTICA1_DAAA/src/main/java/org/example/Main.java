package org.example;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Integer> numeros = List.of(10, 5, 8, 3, 15, 20, 7, 12, 4, 9);

        System.out.println("--- PROGRAMACIÓN ESTRUCTURADA ---");

        //Ejercicio 1
        System.out.print("Ejercicio 1 (Todos los números): ");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i) + " ");
        }
        System.out.println();

        // Ejercicio 2
        System.out.print("Ejercicio 2 (Mayores que 10): ");
        for (int n : numeros) {
            if (n > 10) {
                System.out.print(n + " ");
            }
        }
        System.out.println();

        //Ejercicio 3
        System.out.print("Ejercicio 3 (Pares): ");
        for (int n : numeros) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
        }
        System.out.println();

        //Ejercicio 4
        System.out.print("Ejercicio 4 (Impares): ");
        for (int n : numeros) {
            if (n % 2 != 0) {
                System.out.print(n + " ");
            }
        }
        System.out.println();

        System.out.print("Ejercicio 5 (Multiplicados por 2): ");
        for (int n : numeros) {
            System.out.print((n * 2) + " ");
        }
        System.out.println("\n");

        //Lambdas y Streams

        //Ejercicio 6
        List<Integer> mayoresIgual8 = numeros.stream()
                .filter(n -> n>=8)
                .toList();
        System.out.println("Ejercicio 6 (>= 8): " + mayoresIgual8);

        List<Integer> paresStream = numeros.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("Ejercicio 7 (Pares): " + paresStream);

        List<Integer> mayorMenor = numeros.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Ejercicio 8 (mayor a menor):" + mayorMenor);

        Integer maximo = numeros.stream()
                .max(Integer :: compareTo)
                .orElse(0);
        System.out.println("Ejercicio 10 (Maximo):" + maximo);

        Integer minimo = numeros.stream()
                .min(Integer :: compareTo)
                .orElse(0);
        System.out.println("Ejercicio 11 (Minimo):" + minimo);

        int sumatotal = numeros.stream()
                .reduce(0, Integer::sum);
        System.out.println("Ejercicio 12 (Suma):" + sumatotal);

        double promedio = numeros.stream()
                .mapToDouble(Integer :: doubleValue)
                .average()
                .orElse(0.0);
        System.out.println("Ejercicio 13 (Promedio):" + promedio);

        long conteomayor10 = numeros.stream()
                .filter(n -> n > 10)
                .count();
        System.out.println("Ejercicio 14 (conteo mas de 10): " + conteomayor10);

        List<Integer> imparesOrdenados = numeros.stream()
                .filter(n -> n % 2 != 0)
                .sorted()
                .toList();

    }
}