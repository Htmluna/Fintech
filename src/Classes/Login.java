package Classes;

import java.time.LocalDateTime;

public class Login {
    // Declarar atributos
    private String userName;
    private String password;
    private String loginId;
    private LocalDateTime dtLogin = LocalDateTime.now();

    // Métodos da classe
    public void consultarLogin() {
        System.out.println("----------------------");
        System.out.println("Username: " + this.userName);
        System.out.println("Password: " + this.password);
        System.out.println("Login ID: " + this.loginId);
        System.out.println("Login Time: " + this.dtLogin);
    }

    public void confirmarLogin() {
    // a ser implementado
    }

    // Métodos especiais

    public Login(String userName, String password, String loginId) {
        this.userName = userName;
        this.password = password;
        this.loginId = loginId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginID) {
        this.loginId = loginId;
    }

    public LocalDateTime getDtLogin() {
        return dtLogin;
    }

    public void setDtLogin(LocalDateTime dtLogin) {
        this.dtLogin = dtLogin;
    }
}
