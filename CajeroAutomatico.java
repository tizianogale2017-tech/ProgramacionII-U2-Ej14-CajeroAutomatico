package Ejercicio14_cajeroAutomatico;

public class CajeroAutomatico {
    private CuentaBancaria cuentaActiva;

    public CajeroAutomatico(CuentaBancaria cuentaActiva) {
        this.cuentaActiva = cuentaActiva;
    }

    public void extraerDinero(double monto) {
        System.out.println("Solicitud de extracción de $" + monto + "...");
        if (cuentaActiva.debitar(monto)) {
            System.out.println("  -> Retire su dinero. Saldo restante: $" + cuentaActiva.getSaldo());
        } else {
            System.out.println("  -> Operación rechazada (saldo insuficiente o límite de $"
                    + cuentaActiva.getLimiteExtraccion() + " superado).");
        }
    }

    public void depositarDinero(double monto) {
        System.out.println("Depósito de $" + monto + "...");
        if (cuentaActiva.acreditar(monto)) {
            System.out.println("  -> Depósito acreditado. Saldo: $" + cuentaActiva.getSaldo());
        } else {
            System.out.println("  -> Monto inválido.");
        }
    }
}
