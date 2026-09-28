package Ejercicio14_cajeroAutomatico;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("0170099220000012345678", "Nora Vidal", 80000.0);
        CajeroAutomatico cajero = new CajeroAutomatico(cuenta);

        cajero.extraerDinero(20000.0);
        cajero.extraerDinero(70000.0);
        cajero.depositarDinero(15000.0);

        System.out.println("Estado final de la cuenta de " + cuenta.getTitulares() + ": $" + cuenta.getSaldo());
    }
}
