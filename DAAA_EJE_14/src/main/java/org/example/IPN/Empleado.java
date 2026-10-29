package org.example.IPN;
// Es una clase super
public abstract class Empleado {
    private String nombre;
    private String claveEmpleado;
    private String unidad;
    private float aguinaldo;
    private float bono;

    public Empleado(String nombre, String claveEmpleado, String unidad) {
        this.nombre = nombre;
        this.claveEmpleado = claveEmpleado;
        this.unidad = unidad;
        aguinaldo=0;
        bono=0;
    }

    //Las sub-clases que me extiendan definir el calculo
    public abstract float calcularSalario();
    public abstract float calcularSalarioAnual();
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {}

    public void mostrarInformacion(){
        System.out.println("---------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Clave: " + claveEmpleado);
        System.out.println("Unidad: " + unidad);
        System.out.println("Salario: " + calcularSalario());


    }
    public float getAguinaldo() {
        return aguinaldo;
    }
    public void setAguinaldo(float aguinaldo) {
        this.aguinaldo = aguinaldo;
    }
    public float getBono() {
        return bono;
    }
    public void setBono(float bono) {
        this.bono = bono;
    }
}
