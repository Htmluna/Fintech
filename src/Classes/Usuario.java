package Classes;

public class Usuario {
    // Atributos
    private String primeiroNome;
    private String sobrenome;
    private String dtNasc;
    private String rg;
    private String cpf;
    private String email;
    private boolean autorizado;
    private String userName;

    // Construtor
    public Usuario(String primeiroNome, String sobrenome, String dtNasc, String rg, String cpf, String email, boolean autorizado, String userName) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.dtNasc = dtNasc;
        this.rg = rg;
        this.cpf = cpf;
        this.email = email;
        this.autorizado = autorizado;
        this.userName = userName;
    }

    public void registrarUsuario(String primeiroNome, String sobrenome, String dtNasc, String rg, String cpf, String email, boolean autorizado) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.dtNasc = dtNasc;
        this.rg = rg;
        this.cpf = cpf;
        this.email = email;
        this.autorizado = autorizado;
    }

    // Método para consultar informações do usuário
    public void consultarUsuario() {
        System.out.println("----------------------");
        System.out.println("Nome: " + this.primeiroNome + " " + this.sobrenome);
        System.out.println("Data de Nascimento: " + this.dtNasc);
        System.out.println("RG: " + this.rg);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Email: " + this.email);
        System.out.println("Autorizado: " + (this.autorizado ? "Sim" : "Não"));
        System.out.println("Nome de Usuário: " + this.userName);
    }

    // Métodos especiais
    public String getPrimeiroNome() {
        return this.primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDtNasc() {
        return this.dtNasc;
    }

    public void setDtNasc(String dtNasc) {
        this.dtNasc = dtNasc;
    }

    public String getRg() {
        return this.rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAutorizado() {
        return this.autorizado;
    }

    public void setAutorizado(boolean autorizado) {
        this.autorizado = autorizado;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
