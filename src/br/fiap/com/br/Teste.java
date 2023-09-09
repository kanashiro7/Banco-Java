package br.fiap.com.br;

public class Teste{
    public static void main(String[] args){
        Banco banco = new Banco("123456789", "Agencia1", 1);


        banco.setNumero("987654321");
        banco.setAgencia("AgenciaB");
        banco.setTipoConta(2);


        System.out.println("Informações do Banco");
        System.out.println("---------------------------------------");
        System.out.println("Número da conta: " + banco.getNumero());
        System.out.println("Tipo de conta: " + banco.getTipoConta());

        Conta conta = new Conta(1, 1001, 2001, "9876543210", "AgenciaB", 2);


        conta.setTipoMoeda(2);
        conta.setContaCorrente(1002);
        conta.setContaPoupanca(2002);

        System.out.println("Informações da conta");
        System.out.println("---------------------------------------");
        System.out.println("Tipo de moeda: " + conta.getTipoMoeda());
        System.out.println("Número da Conta Corrente: " + conta.getContaCorrente());
        System.out.println("Número da Conta Poupanca: " + conta.getContaPoupanca());


    }
}
