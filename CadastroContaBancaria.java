package Conteudo.DIO;

import java.util.Scanner;

class ContaBancaria {
    private String titular;
    private String numeroConta;

    public ContaBancaria(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "titular='" + titular + '\'' +
                ", numeroConta='" + numeroConta + '\'' +
                '}';
    }
}

public class CadastroContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do titular: ");
        String titular = scanner.nextLine();

        System.out.print("Digite o número da conta: ");
        String numeroConta = scanner.nextLine();

        ContaBancaria conta = new ContaBancaria(titular, numeroConta);

        System.out.println("\nConta cadastrada com sucesso:");
        System.out.println(conta);

        scanner.close();
    }
}
