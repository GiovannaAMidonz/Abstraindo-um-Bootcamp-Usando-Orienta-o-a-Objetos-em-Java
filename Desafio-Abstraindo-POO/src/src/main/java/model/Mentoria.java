package model;


import service.ICalcularXP;

import java.time.LocalDate;

public class Mentoria extends Conteudo implements ICalcularXP {

    protected LocalDate date;


    public Mentoria(String titulo, String descricao, LocalDate date) {
        super(titulo, descricao);
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "date=" + date +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }
}
