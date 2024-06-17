package model;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;

    private String capitulo;
    private String descricao;
    private Status status;

    
    public abstract double calcularXP();

    public String getCapitulo() {
        return capitulo;
    }

    public void setCapitulo(String capitulo) {
        this.capitulo = capitulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
