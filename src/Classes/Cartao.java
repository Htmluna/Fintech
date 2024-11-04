package Classes;

public class Cartao {
    // Atributos
    private String numero;
    private String dtValidade;
    private String titular;
    private int cvc;

    // Métodos

    public void consultarCartao() {
        System.out.println("----------------------");
        System.out.println("Número do cartão: " + getNumero());
        System.out.println("Titular do cartão: " + getTitular());
        System.out.println("Data de validade: " + getDtValidade());
        System.out.println("CVC do cartão: " + getCvc());
    }

    // Métodos especiais


    public Cartao(String numero, String dtValidade, String titular, int cvc) {
        this.numero = numero;
        this.dtValidade = dtValidade;
        this.titular = titular;
        this.cvc = cvc;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDtValidade() {
        return dtValidade;
    }

    public void setDtValidade(String dtValidade) {
        this.dtValidade = dtValidade;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getCvc() {
        return cvc;
    }

    public void setCvc(int cvc) {
        this.cvc = cvc;
    }
}
