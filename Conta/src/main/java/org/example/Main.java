package org.example;

public class Main {
    public static void main(String[] args) {

        CadastrarConta cadastrarConta = new CadastrarConta();
        cadastrarConta.receberDados();
        Conta conta = new Conta(cadastrarConta.getDadosConta());
        System.out.println(conta.buscarConta());
    }
}