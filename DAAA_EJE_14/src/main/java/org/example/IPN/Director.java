package org.example.IPN;

public class Director extends Empleado {
    private String periodo;
    private float sueldoBase;

    // Constructor
    public Director(String nombre, String claveempleado, String unidad, String periodo, float sueldoBase) {
        super(nombre, claveempleado, unidad);
        this.periodo = periodo;
        this.sueldoBase = sueldoBase;
    }

    // Corrección: camelCase en el nombre del método
    @Override
    public float calcularSalario() {
        return sueldoBase;
    }

    @Override
    public float calcularSalarioAnual() {
        return (sueldoBase * 12) + getAguinaldo() + getBono();
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
}