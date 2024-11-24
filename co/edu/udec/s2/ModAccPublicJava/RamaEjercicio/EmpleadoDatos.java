import Domain.Model.Ejercicio1.Empleado;

public class EmpleadoDatos {

    public static void main(String[] args) {
        
        System.out.println("*****************7502410037******************");
        System.out.println("********BILLY JEAN YER PEINADO MADERA********");
        System.out.println("*********************************************");

        // Instanciar objetos de empleado
        Empleado empleado = new Empleado("Juan Torres", 1500000.0);

        // Mostrar informacion del empleado
        empleado.mostrarInformacion();

        System.out.println("*********************************************");
    }
}
