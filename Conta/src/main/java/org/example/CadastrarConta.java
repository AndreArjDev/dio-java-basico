package org.example;

import java.util.Scanner;

public class CadastrarConta {

    private Scanner teclado;
    private DadosConta dadosConta;

    public CadastrarConta(){
        this.teclado = new Scanner(System.in);
    }

    public void receberDados(){
        System.out.println("Digite  o da conta");
        int numeroDaConta = teclado.nextInt();

        System.out.println("Digite  o numero da agencia");
        String agencia = teclado.next();
        System.out.println("Digite  o nome do cliente");
        String nomeCliente = teclado.next();
        System.out.println("Digite  o valor de deposito inicial");
        double depositoInicial = teclado.nextDouble();

        this.dadosConta = new DadosConta(numeroDaConta, agencia, nomeCliente, depositoInicial);
    }

    public DadosConta getDadosConta() {
        return this.dadosConta;
    }
}
