package Classes;

import java.time.LocalDateTime;

public class Carteira {
    // Declarar atributos da classe
    private int idCarteira;
    private String nomeCarteira;
    private LocalDateTime dtCriacao = LocalDateTime.now();
    private double saldo;


    // Declarar os métodos

    public void consultarCarteira() {
        System.out.println("----------------------");
        System.out.println("ID Carteira: " + getIdCarteira());
        System.out.println("Nome: " + getNomeCarteira());
        System.out.println("Data de Criação: " + getDtCriacao());
        System.out.println("Saldo: R$" + getSaldo());
    }

    public void depositar(double v) {
       this.saldo += v;
    }

    public void sacar(double v) {
        this.saldo -= v;
    }

    // Declarar os métodos especiais

    public Carteira(int idCarteira, String nomeCarteira, double saldo) {
        this.idCarteira = idCarteira;
        this.nomeCarteira = nomeCarteira;
        this.saldo = saldo;
    }

    public int getIdCarteira() {
        return idCarteira;
    }

    public void setIdCarteira(int idCarteira) {
        this.idCarteira = idCarteira;
    }

    public String getNomeCarteira() {
        return nomeCarteira;
    }

    public void setNomeCarteira(String nomeCarteira) {
        this.nomeCarteira = nomeCarteira;
    }

    public LocalDateTime getDtCriacao() {
        return dtCriacao;
    }

    public void setDtCriacao(LocalDateTime dtCriacao) {
        this.dtCriacao = dtCriacao;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
