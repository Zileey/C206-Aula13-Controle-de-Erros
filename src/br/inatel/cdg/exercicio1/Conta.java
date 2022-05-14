package br.inatel.cdg.exercicio1;

import java.util.HashSet;
import java.util.Set;

public class Conta {
    private double saldo;
    private double limite;
    Set<Cliente> clientes = new HashSet<Cliente>();
    public Conta(double saldo, double limite){
        this.saldo = saldo;
        this.limite = limite;
        this.clientes = new HashSet<Cliente>();
    }

    public boolean sacar(double quantia){
        this.saldo -= quantia;
        return false;
    }
}
