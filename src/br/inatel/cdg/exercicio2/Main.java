package br.inatel.cdg.exercicio2;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João",465461656);
        Cliente cliente2 = new Cliente("Pedro",59191553);
        Cliente cliente3 = null;

        Conta conta = new Conta(1500,500);

        conta.addCliente(cliente1);
        conta.addCliente(cliente2);
        conta.addCliente(cliente3);

        conta.mostraInfo();

        try {
            conta.sacar(5000);
        } catch (SaldoInsuficienteException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Fim da main");
    }
}