package br.inatel.cdg.exercicio1;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João",465461656);
        Cliente cliente2 = new Cliente("Pedro",59155123);
        Cliente cliente3 = null;

        Conta conta = new Conta(1500,500);

        conta.addCliente(cliente1);
        conta.addCliente(cliente2);
        conta.addCliente(cliente3);

        conta.mostraInfo();

        System.out.println("Fim da main");
    }
}
