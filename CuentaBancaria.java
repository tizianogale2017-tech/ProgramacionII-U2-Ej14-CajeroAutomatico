package Ejercicio14_cajeroAutomatico;

public class CuentaBancaria {
    private static final double LIMITE_EXTRACCION = 50000.0;

    private String cbu;
    private String titulares;
    private double saldo;

    public CuentaBancaria(String cbu, String titulares, double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo.");
        }
        this.cbu = cbu;
        this.titulares = titulares;
        this.saldo = saldo;
    }

    public boolean debitar(double monto) {
        if (monto <= 0 || monto > saldo || monto > LIMITE_EXTRACCION) {
            return false;
        }
        saldo -= monto;
        return true;
    }

    public boolean acreditar(double monto) {
        if (monto <= 0) {
            return false;
        }
        saldo += monto;
        return true;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitulares() {
        return titulares;
    }

    public double getLimiteExtraccion() {
        return LIMITE_EXTRACCION;
    }
}
