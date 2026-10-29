// Daniela Anyelith Amezquita Argote
// 2026670244
// Actividad 14

package org.example;

import org.example.IPN.Director;
import org.example.IPN.Docente;

public class Main {
    public static void main(String[] args) {
        Docente docente = new Docente("luis", "147898", "Zacatecas");

        // metodos en negrita
        docente.setPrecioHorea(200);
        docente.setHorasTrabajadas(80);
        docente.mostrarInformacion();

        // Sistema - nomipaq - 12 de diciembre de este ano
        docente.setBono(5000);
        docente.setAguinaldo(20000);
        System.out.println("salario anual" + docente.calcularSalarioAnual());


        // Para el director
        Director director = new Director("Jorge", "998877", "Zacatecas", "2026-2027", 25000);
        director.setBono(7000);
        director.setAguinaldo(30000);
        System.out.println("salario anual del director" + director.calcularSalarioAnual());

    }
}
//https://github.com/amezanyelith2703-ai/Paradigmas-de-programacion