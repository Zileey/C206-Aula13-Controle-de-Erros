package br.inatel.cdg.exercicio2;

import java.util.HashSet;
import java.util.Set;

public class Conta {
    private float saldo;
    private float limite;
    Set<Cliente> clientes = new HashSet<Cliente>();

    public Conta(float saldo, float limite){
        this.saldo = saldo;
        this.limite = limite;
    }

    public void addCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public void mostraInfo(){
        System.out.println("Saldo: "+ saldo);
        System.out.println("Limite: "+ limite);

        for (Cliente cliente :clientes){
            try {
                System.out.println("Nome do cliente: " + cliente.getNome());
                System.out.println("CPF do cliente: " + cliente.getCpf());
            }catch(NullPointerException e){
                System.out.println("Não eiste cliente nessa posição");
            }
        }
    }

    public void sacar(double quantia) throws SaldoInsuficienteException {
        if(quantia < (saldo + limite)){
            this.saldo -= quantia;
        }else{
            throw new SaldoInsuficienteException("Saldo Insuficiente");
        }
    }
}