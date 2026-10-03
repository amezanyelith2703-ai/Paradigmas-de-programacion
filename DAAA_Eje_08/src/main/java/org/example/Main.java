package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();

        numeros.add(5);
        numeros.add(-7);
        numeros.add(30);
        numeros.add(20);
        numeros.add(1);



        // 1. Sumar elementos
        int sumaNumeros = numeros.stream()
                .reduce(0, (suma, n) -> suma + n);
        System.out.println("La suma es: " + sumaNumeros);

        // 2. Obtener el máximo
        Integer numeroMayor = numeros.stream()
                .max((n1, n2) -> n1.compareTo(n2))
                .orElse(0);
        System.out.println("La mayor es: " + numeroMayor);

        // 3. Obtener el mínimo
        Integer numeroMenor = numeros.stream()
                .min((n1, n2) -> n1.compareTo(n2))
                .orElse(0);
        System.out.println("La menor de tu lista: " + numeroMenor);

        // 4. Contar elementos
        Long totalNumeros = numeros.stream()
                .count();
        System.out.println("El total de los numeros: " + totalNumeros);



        // 5. Números pares
        List<Integer> numerosPares = numeros.stream()
                .filter((n) -> n % 2 == 0)
                .toList();
        System.out.println("Tus numeros pares: " + numerosPares);

        // 6. Números mayores que 50
        List<Integer> mayores50 = numeros.stream()
                .filter((n) -> n > 50)
                .toList();
        System.out.println("Numeros mayores a 50: " + mayores50);

        // 7. Contar números positivos
        Long totalNumerosPositivos = numeros.stream()
                .filter((n) -> n > 0)
                .count();
        System.out.println("El total de numeros positivos es " + totalNumerosPositivos);

        // 8. Obtener números dentro de un rango (ejemplo: entre 5 y 25)
        List<Integer> enRango = numeros.stream()
                .filter((n) -> n >= 5 && n <= 25)
                .toList();
        System.out.println("Numeros entre 5 y 25: " + enRango);


        // 9. Elevar al cuadrado
        List<Integer> alCuadrado = numeros.stream()
                .map((n) -> n * n)
                .toList();
        System.out.println("Numeros elevados al cuadrado: " + alCuadrado);

        // 10. Multiplicar por 10
        List<Integer> porDiez = numeros.stream()
                .map((n) -> n * 10)
                .toList();
        System.out.println("Numeros multiplicados por 10: " + porDiez);

        // 11. Convertir temperaturas (de Celsius a Fahrenheit: F = C * 1.8 + 32)
        List<Double> fahrenheit = numeros.stream()
                .map((n) -> n * 1.8 + 32)
                .toList();
        System.out.println("Temperaturas en Fahrenheit: " + fahrenheit);


        // 12. Pares elevados al cuadrado
        List<Integer> paresAlCuadrado = numeros.stream()
                .filter((n) -> n % 2 == 0)
                .map((n) -> n * n)
                .toList();
        System.out.println("Pares elevados al cuadrado: " + paresAlCuadrado);

        // 13. Suma de números pares
        int sumaPares = numeros.stream()
                .filter((n) -> n % 2 == 0)
                .reduce(0, (suma, n) -> suma + n);
        System.out.println("Suma de numeros pares: " + sumaPares);

        // 14. Promedio de números mayores que 50
        double promedioMayores50 = numeros.stream()
                .filter((n) -> n > 50)
                .mapToDouble(n -> n)
                .average()
                .orElse(0.0);
        System.out.println("Promedio de numeros mayores que 50: " + promedioMayores50);

        // 15. Máximo de números pares
        Integer maximoPar = numeros.stream()
                .filter((n) -> n % 2 == 0)
                .max((n1, n2) -> n1.compareTo(n2))
                .orElse(0);
        System.out.println("Maximo de numeros pares: " + maximoPar);



        // 16. Ordenar de menor a mayor
        List<Integer> menorAMayor = numeros.stream()
                .sorted()
                .toList();
        System.out.println("Ordenados de menor a mayor: " + menorAMayor);

        // 17. Ordenar de mayor a menor
        List<Integer> mayorAMenor = numeros.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Ordenados de mayor a menor: " + mayorAMenor);

        // 18. Tres números más grandes
        List<Integer> tresMasGrandes = numeros.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();
        System.out.println("Los 3 numeros mas grandes: " + tresMasGrandes);


        List<String> nombres = Arrays.asList("Ana", "Carlos", "Beatriz", "Alejandro", "Sofia");

        // 19. Filtrar nombres (ejemplo: que inicien con 'A')
        List<String> nombresConA = nombres.stream()
                .filter((nombre) -> nombre.startsWith("A"))
                .toList();
        System.out.println("Nombres que empiezan con A: " + nombresConA);

        // 20. Nombres con más de 5 caracteres
        List<String> nombresLargos = nombres.stream()
                .filter((nombre) -> nombre.length() > 5)
                .toList();
        System.out.println("Nombres con mas de 5 caracteres: " + nombresLargos);

        // 21. Convertir a mayúsculas
        List<String> nombresMayusculas = nombres.stream()
                .map((nombre) -> nombre.toUpperCase())
                .toList();
        System.out.println("Nombres en mayusculas: " + nombresMayusculas);

        // 22. Ordenar nombres
        List<String> nombresOrdenados = nombres.stream()
                .sorted()
                .toList();
        System.out.println("Nombres ordenados alfabeticamente: " + nombresOrdenados);


        // NIVEL 7 — Búsquedas y Condicionales


        // 23. Buscar un número (ejemplo: buscar el número 30)
        boolean existe30 = numeros.stream()
                .anyMatch((n) -> n == 30);
        System.out.println("¿Existe el numero 30?: " + existe30);

        // 24. Determinar si todos cumplen una condición (ejemplo: todos mayores a 0)
        boolean todosPositivos = numeros.stream()
                .allMatch((n) -> n > 0);
        System.out.println("¿Todos los numeros son positivos?: " + todosPositivos);

        // 25. Determinar si alguno cumple una condición (ejemplo: alguno mayor a 25)
        boolean algunoMayor25 = numeros.stream()
                .anyMatch((n) -> n > 25);
        System.out.println("¿Algun numero es mayor a 25?: " + algunoMayor25);
    }
}