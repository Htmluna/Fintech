package Classes;

import java.time.LocalDateTime;

public class Meta {
    // Atributos
    private int idMeta;
    private String nomeMeta;
    private LocalDateTime dtCriacao = LocalDateTime.now();
    private double valorMeta;
    private double saldoAtual;

    //private int progresso = (int) (saldoAtual / valorMeta); - ainda estamos pensando na implementação
    //private int valorRestante = (int) (valorMeta - saldoAtual);

    // Métodos
    public void consultarMeta() {
        System.out.println("---------------------");
        System.out.println("ID da Meta: " + this.idMeta);
        System.out.println("Nome da Meta: " + this.nomeMeta);
        System.out.println("Data de criação: "+ this.dtCriacao);
        System.out.println("Valor da Meta: R$" + this.valorMeta);
        System.out.println("Saldo atual: R$" + this.saldoAtual);
        //System.out.println("Progresso da meta:" + getProgresso() + "%");
        //System.out.println("Valor restante: R$" + getValorRestante());
    }

    public void guardar(double v) {
        this.saldoAtual += v;
    }

    public void resgatar(double v) {
        this.saldoAtual -= v;
    }



    // Métodos Especiais


    public Meta(int idMeta, String nomeMeta, double valorMeta, double saldoAtual) {
        this.idMeta = idMeta;
        this.nomeMeta = nomeMeta;
        this.valorMeta = valorMeta;
        this.saldoAtual = saldoAtual;
    }

    public int getIdMeta() {
        return idMeta;
    }

    public void setIdMeta(int idMeta) {
        this.idMeta = idMeta;
    }

    public String getNomeMeta() {
        return nomeMeta;
    }

    public void setNomeMeta(String nomeMeta) {
        this.nomeMeta = nomeMeta;
    }

    public LocalDateTime getDtCriacao() {
        return dtCriacao;
    }

    public void setDtCriacao(LocalDateTime dtCriacao) {
        this.dtCriacao = dtCriacao;
    }

    public double getValorMeta() {
        return valorMeta;
    }

    public void setValorMeta(double valorMeta) {
        this.valorMeta = valorMeta;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    /*public int getProgresso() {
        return progresso;
    }

    public void setProgresso(int progresso) {
        this.progresso = progresso;
    }

    public int getValorRestante() {
        return valorRestante;
    }

    public void setValorRestante(int valorRestante) {
        this.valorRestante = valorRestante;
    }*/
}
