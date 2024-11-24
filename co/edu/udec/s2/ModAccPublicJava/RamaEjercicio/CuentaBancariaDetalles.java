import Domain.Model.Ejercicio2.CuentaBancaria;

public class CuentaBancariaDetalles {

    public static void main(String[] args) {

        System.out.println("*****************7502410037******************");
        System.out.println("********BILLY JEAN YER PEINADO MADERA********");
        System.out.println("*********************************************");

        CuentaBancaria cuentaBancaria = new CuentaBancaria(26674312, 1200577.0, "Ahorros");

        // Intento de acceder directamente a numeroCuenta
        // System.out.println("Numero de cuenta introducida: " + cuentaBancaria.numeroCuenta);

        cuentaBancaria.mostrarDetalles();

        System.out.println("*********************************************");
    }
}
