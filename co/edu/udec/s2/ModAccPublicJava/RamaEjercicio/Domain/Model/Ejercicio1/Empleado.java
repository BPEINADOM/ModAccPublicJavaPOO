package Domain.Model.Ejercicio1;

public class Empleado {
    public String nombre;
    private double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        if (sueldo > 0) {
            this.sueldo = sueldo;
        }
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Sueldo: $" + sueldo);
    }

}
