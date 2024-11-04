package Classes;

public class Extrato {

    // atributos
    private int idCompra;
    private String extratoCartao;
    private String nomeLoja;
    private String dataCompra;

    // métodos
    public void verDetalhesExtrato() {
        System.out.println("----------------------");
        System.out.println("ID da compra: " + this.idCompra);
        System.out.println("Extrato do cartão: " + this.extratoCartao);
        System.out.println("Nome da loja: " + this.nomeLoja);
        System.out.println("Data da compra: " + this.dataCompra);
    }
    // métodos especiais


    public Extrato(int idCompra, String extratoCartao, String nomeLoja, String dataCompra) {
        this.idCompra = idCompra;
        this.extratoCartao = extratoCartao;
        this.nomeLoja = nomeLoja;
        this.dataCompra = dataCompra;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public String getExtratoCartao() {
        return extratoCartao;
    }

    public void setExtratoCartao(String extratoCartao) {
        this.extratoCartao = extratoCartao;
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }
}
