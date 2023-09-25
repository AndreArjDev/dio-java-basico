package org.example;

public class Conta {

    private int numeroDaConta;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public Conta(DadosConta dadosDaConta) {
        this.numeroDaConta = dadosDaConta.getNumeroDaConta();
        this.agencia = dadosDaConta.getAgencia();
        this.nomeCliente = dadosDaConta.getNomeCliente();
        this.saldo = dadosDaConta.getSaldo();
    }

    public String buscarConta() {
        return String.format("numero da conta: %d \nagencia: %s \nnomeCliente: %s " +
                "\nsaldo: %s", this.numeroDaConta,this.agencia, this.nomeCliente, this.saldo);
    }
}
