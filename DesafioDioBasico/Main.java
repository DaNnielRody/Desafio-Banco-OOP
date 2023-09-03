package edu.OOP2.DesafioDioBasico;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Dan");

        Conta cc = new ContaCorrente(cliente);
        Conta cp = new ContaPoupanca(cliente);
        
        cc.depositar(100);
        cc.transferir(100, cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
