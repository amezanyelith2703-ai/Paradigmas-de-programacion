package org.example.IPN;
// Es una clase hija
public class Docente extends Empleado {

   private String materias;
   private float horasTrabajadas;
   private float precioHorea;

   public Docente(String nombre, String claveEmpleado, String unidad) {
       super(nombre, claveEmpleado, unidad);
       horasTrabajadas = 0;
       precioHorea = 0;

   }


    @Override
    public float calcularSalario(){
        return horasTrabajadas * precioHorea;
    }

    @Override
    public float calcularSalarioAnual(){
       return 0;
    }

    public void setHorasTrabajadas(float horasTrabajadas) {

       this.horasTrabajadas = horasTrabajadas;
    }
    public void setPrecioHorea(float precioHorea) {

       this.precioHorea = precioHorea;
    }
    // Podemos establecer desde el docente es docente, es necesario
    @Override
    public void setBono(float bono) {
        super.setBono(bono);
    }

}
