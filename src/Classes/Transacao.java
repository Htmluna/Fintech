package Classes;

import java.time.LocalDateTime;

public abstract class Transacao {

    // Atributos
    protected String idTrans;
    protected LocalDateTime dtTrans = LocalDateTime.now();
    protected String vlrReais;

    // Getters e Setters

    public String getIdTrans() {
        return idTrans;
    }

    public void setIdTrans(String idTrans) {
        this.idTrans = idTrans;
    }

    public LocalDateTime getDtTrans() {
        return dtTrans;
    }

    public void setDtTrans(LocalDateTime dtTrans) {
        this.dtTrans = dtTrans;
    }

    public String getVlrReais() {
        return vlrReais;
    }

    public void setVlrReais(String vlrReais) {
        this.vlrReais = vlrReais;
    }

    @Override
    public String toString() {
        return "Transacao: {" +
                "idTrans='" + idTrans + '\'' +
                ", dtTrans=" + dtTrans +
                ", vlrReais='" + vlrReais + '\'' +
                '}';
    }
}
