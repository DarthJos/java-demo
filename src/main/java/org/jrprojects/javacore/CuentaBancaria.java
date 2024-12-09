package org.jrprojects.javacore;public class CuentaBancaria {

    private Long numeroCuenta;
    private double saldo;

    public CuentaBancaria(Long numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public Long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(Long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double mostrarSaldo() {
        return saldo;
    }

    // ---------------------------- Métodos especializados ----------------------------
    public void depositar(double monto) {
        saldo += monto;
    }

    public void retirar(double monto) {
        if (saldo >= monto)
            saldo -= monto;
        else
            System.out.println("Saldo insuficiente...");
    }
}
