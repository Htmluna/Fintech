package Classes;

public class Teste {
    public static void main(String[] args) {
        // Testes das classes
        Login l1 = new Login("Matheus Akio", "123", "1");
        l1.consultarLogin();

        Carteira c1 = new Carteira(1,"Carteira Akio", 0d);
        c1.depositar(100);
        c1.sacar(35);
        c1.consultarCarteira();

        Meta m1 = new Meta(1, "Reserva de Emergência", 1000d, 0d);
        m1.guardar(600);
        m1.resgatar(100);
        m1.consultarMeta();

        Cartao cartao1 = new Cartao("1234 4321 5643 8765", "27/10/31", "Matheus Akio", 234 );
        cartao1.consultarCartao();

        Extrato e1 = new Extrato(1,"R$49,89 débito", "Padaria do Manuel", "23/02/2024");
        e1.verDetalhesExtrato();

        // Testes das Heranças
        TransacaoCarteira t1 = new TransacaoCarteira();
        t1.setIdTrans("123");
        t1.setVlrReais("400");
        System.out.println(t1.toString());

        TransacaoConta t2 = new TransacaoConta();
        t2.setIdTrans("123");
        t2.setVlrReais("456,45");
        System.out.println(t2.toString());
    }
}

