package org.example;

public class DadosConta {

    private int numeroDaConta;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public DadosConta(int numeroDaConta, String agencia, String nomeCliente, double depositoInicial){
        this.numeroDaConta = numeroDaConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = depositoInicial;
    }
}
