package model;

import service.ICalcularXP;

public class Conteudo implements ICalcularXP {
    protected String titulo;
    protected String descricao;
    protected static final double XP_PADRAO = 10d;

    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }
}
