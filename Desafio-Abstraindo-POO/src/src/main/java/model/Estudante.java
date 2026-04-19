package model;

import java.util.LinkedHashSet;
import java.util.Set;

public class Estudante {
    protected String nome;
    protected int ID;
    private static int contador =1 ;

    protected Set<Conteudo> conteudosInscrito = new LinkedHashSet<>();
    protected Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public Estudante(String nome, int ID) {
        this.nome = nome;
        this.ID = contador;
        contador++;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Set<Conteudo> getConteudosInscrito() {
        return conteudosInscrito;
    }

    public void setConteudosInscrito(Set<Conteudo> conteudosInscrito) {
        this.conteudosInscrito = conteudosInscrito;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }


}
