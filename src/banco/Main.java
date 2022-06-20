package banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double depositoInicial = 0;
        String NUMEROCONTA;
        String nome;
        double deposito;
        double saque;
        System.out.println("Entre com o numero da Conta");
         NUMEROCONTA = ler.next();
        System.out.println("Entre com o nome do dono da conta");
         nome = ler.next();

        Conta tales = new Conta(NUMEROCONTA,nome);
        System.out.println("Gostaria de fazer o deposito inicial? y/n");
        String resposta = ler.next();
        switch (resposta){
            case "y":
            System.out.println("Entre com o deposito inicial");
             tales.setValorDepositoInicial(ler.nextDouble());
             tales.depositar(tales.getValorDepositoInicial());

        break;
            case "n":
                tales.setValorDepositoInicial(0);
                break;
            default:
                System.out.println("valor invalido");
        }




        System.out.println(tales.getNomeTitular());
        System.out.println(tales.getValorDepositoInicial());
        System.out.println(tales.getNUMEROCONTA());
        System.out.println(tales.getSaldo());

        System.out.println("Deseja fazer um deposito ou sacar ?. s/d ou sair");
        resposta = ler.next();
        switch (resposta){
            case "d":
                System.out.println("Entre com o deposito");
                deposito = ler.nextDouble();
                System.out.println("Valor do saque: " + tales.depositar(deposito));
                System.out.println("Saldo atua:" + tales.getSaldo());
                break;
            case "s":
                System.out.println("Digite um valor para sacar");
                saque = ler.nextDouble();
                System.out.println("Valor do saque: " + tales.sacar(saque));
                System.out.println("Saldo atua:" + tales.getSaldo());


        }
    }
}
