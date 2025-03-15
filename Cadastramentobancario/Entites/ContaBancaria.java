package Atividadepratica05.Entites;

public class ContaBancaria {
    private String nome;
    private int numConta;
    private double saldo;

    public ContaBancaria(int numConta, String nome) {
        this.nome = nome;
        this.numConta = numConta;
        this.saldo = 0.0;
    }

    public ContaBancaria(int numConta, String nome, double depInicial) {
        this.numConta = numConta;
        this.nome = nome;
        depositar(depInicial);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public String toString() {
        return "Conta:"
                + numConta
                + ";Nome:"
                + nome
                + ";Extrato: R$"
                + String.format("%.2f", saldo);
    }
}