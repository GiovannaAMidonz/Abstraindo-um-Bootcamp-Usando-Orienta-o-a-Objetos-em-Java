package model;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Estudante {
    protected String nome;
    protected int ID;
    private static int contador =1 ;

    protected Set<Conteudo> conteudosInscrito = new LinkedHashSet<>();
    protected Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public Estudante( int ID) {
        this.ID = contador;
        contador++;
    }

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosConcluidos.addAll(bootcamp.getConteudos());
        bootcamp.getAlunosInscritos().add(this);

    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosInscrito.stream().findFirst();
        if (conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscrito.remove(conteudo.get());
        }else{
            System.err.println("Você não está matriculado!");
        }
    }

    public double calcularTotalXP(){
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXP)
                .sum();
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Estudante estudante = (Estudante) o;
        return ID == estudante.ID && Objects.equals(nome, estudante.nome) && Objects.equals(conteudosInscrito, estudante.conteudosInscrito) && Objects.equals(conteudosConcluidos, estudante.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, ID, conteudosInscrito, conteudosConcluidos);
    }
}
