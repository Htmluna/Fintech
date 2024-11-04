package Classes;

public class Cargo {
    private String descricao;

    // Método para imprimir a descrição do cargo
    public void imprimirDescricao() {
        System.out.println("---------------------");
        System.out.println("Descrição do Cargo: " + this.descricao);
    }

    // Métodos getters e setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
