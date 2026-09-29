import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Integer> lista = new ArrayList<>();

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion=0;
        while(opcion!=7){
            opcion = menu();
            ejecutarOpcion(opcion);
        }
    }

    public static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- MENÚ DE OPCIONES ---");
        System.out.println("1.- Leer datos");
        System.out.println("2.- Muestre numeros pares");
        System.out.println("3.- Muestre los cuadrados de los valores");
        System.out.println("4.- Suma de los elementos de la lista");
        System.out.println("5.- Buscar un elemento de la lista");
        System.out.println("6.- Encontrar el valor maximo");
        System.out.println("7.- Salir");
        System.out.print("Seleccione una opción: ");
        int opcion = sc.nextInt();
        return opcion;
    }

    public static void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                leerDato();
                break;
            case 2:
                mostrarPares();
                break;
            case 3:
                mostrarCuadrados();
                break;
            case 4:
                sumarElementos();
                break;
            case 5:
                buscarElemento();
                break;
            case 6:
                encontrarMaximo();
                break;
            case 7:
                System.out.println("Finalizando programa...");
                break;
            default:
                System.out.println("Opción inválida. Intente nuevamente.");
        }
    }

    public static void leerDato() {
        System.out.print("Ingrese un número entero: ");
        int numero = entrada.nextInt();
        lista.add(numero);
        System.out.println("Dato guardado con éxito.");
    }

    public static void mostrarPares() {
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        }
        System.out.print("Números pares en la lista: ");
        boolean hayPares = false;
        for (Integer num : lista) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
                hayPares = true;
            }
        }
        if (!hayPares) System.out.print("Ninguno");
        System.out.println();
    }

    public static void mostrarCuadrados() {
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        }
        System.out.print("Cuadrados de los valores: ");
        for (Integer num : lista) {
            System.out.print((num * num) + " ");
        }
        System.out.println();
    }

    public static void sumarElementos() {
        int suma = 0;
        for (Integer num : lista) {
            suma += num;
        }
        System.out.println("La suma de todos los elementos es: " + suma);
    }

    public static void buscarElemento() {
        System.out.print("Ingrese el número que desea buscar: ");
        int buscado = entrada.nextInt();

        if (lista.contains(buscado)) {
            System.out.println("El número " + buscado + " SÍ está en la lista.");
        } else {
            System.out.println("El número " + buscado + " NO fue encontrado.");
        }
    }

    public static void encontrarMaximo() {
        if (lista.isEmpty()) {
            System.out.println("No hay valores para evaluar. La lista está vacía.");
            return;
        }

        int maximo = lista.get(0);
        for (Integer num : lista) {
            if (num > maximo) {
                maximo = num;
            }
        }
        System.out.println("El valor máximo de la lista es: " + maximo);
    }
}
//https://github.com/amezanyelith2703-ai/Paradigmas-de-programacion