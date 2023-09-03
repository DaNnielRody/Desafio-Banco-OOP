package edu.OOP2.DesafioDioBasico;

public abstract class Conta implements IConta{
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    private int agencia;
    private int numero;
    private double saldo;
    private Cliente cliente;

    protected Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }
    public int getAgencia() {
        return agencia;
    }

    public int getNumero(){ return numero; }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo(){ return saldo; }

    public void sacar(double valor){
        this.saldo -= valor;
    }
    public void depositar(double valor){
        this.saldo += valor;
    }
    public void transferir(double valor, @org.jetbrains.annotations.NotNull Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfosComuns(){
        System.out.printf("Titular: %s%nAgência: %d%nNúmero: %d%nSaldo: %.2f%n", getCliente(), getAgencia(), getNumero(), getSaldo());
        System.out.println();
    }
}
