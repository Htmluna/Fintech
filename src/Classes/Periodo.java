package Classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Periodo {
    private LocalDate dtInicio;
    private LocalDate dtFim;

    // Construtor
    public Periodo(LocalDate dtInicio, LocalDate dtFim) {
        this.dtInicio = dtInicio;
        this.dtFim = dtFim;
    }

    // Método para imprimir o período
    public void imprimirPeriodo() {
        System.out.println("---------------------");
        System.out.println("Período:");
        System.out.println("Data de Início: " + dtInicio.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Data de Fim: " + dtFim.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    // Método para gerar um novo período
    public void gerarPeriodo(LocalDate dtInicio, LocalDate dtFim) {
        this.dtInicio = dtInicio;
        this.dtFim = dtFim;
    }

    // Método para consultar o período
    public Periodo consultarPeriodo(LocalDate dtInicio, LocalDate dtFim) {
        return new Periodo(dtInicio, dtFim);
    }

    // Métodos getters e setters
    public LocalDate getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(LocalDate dtInicio) {
        this.dtInicio = dtInicio;
    }

    public LocalDate getDtFim() {
        return dtFim;
    }

    public void setDtFim(LocalDate dtFim) {
        this.dtFim = dtFim;
    }
}
