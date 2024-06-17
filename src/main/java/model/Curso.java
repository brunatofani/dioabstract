package model;

public class Curso extends Conteudo {
    
    private int carga;

    public Curso() {
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO * carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Curso { " +
                "capitulo = '" + getCapitulo() + '\'' +
                ", descricao = '" + getDescricao() + '\'' +
                ", cargaHoraria = " + carga + " " +
                '}';
    }
}
