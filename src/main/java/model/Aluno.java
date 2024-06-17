package model;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Aluno {
   
    private String nome;
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public void inscricaoConteudo(Conteudo conteudo) {
        this.conteudos.add(conteudo);
    }

    public void inscricaoBootcamp(Bootcamp camp) {
        this.conteudos.addAll(camp.getConteudos());
        camp.getAlunos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudos.stream().findFirst();
        if(conteudo.isPresent()) {
            this.getConteudosConcluidos().add(conteudo.get());
            this.conteudos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double calcularTotalXP() {
        Iterator<Conteudo> iterator = this.getConteudosConcluidos().iterator();
        double soma = 0;
        while(iterator.hasNext()){
            double next = iterator.next().calcularXP();
            soma += next;
        }
        return soma;
    }


    public List<Conteudo> getConteudosConcluidos() {
        return conteudos.stream().filter(conteudo -> conteudo.getStatus() == (Status.FINALIZADO)).collect(Collectors.toList());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(nome, aluno.nome) && Objects.equals(conteudos, aluno.conteudos) && Objects.equals(getConteudosConcluidos(), aluno.getConteudosConcluidos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudos, getConteudosConcluidos());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    
}
