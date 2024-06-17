import java.time.LocalDate;

import model.Aluno;
import model.Bootcamp;
import model.Curso;
import model.Mentoria;

public class AbstractApplication {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setCapitulo("JAVA");
        curso1.setDescricao("Descrição curso JAVA");
        curso1.setCarga(18);

        Curso curso2 = new Curso();
        curso2.setCapitulo("CURSO JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCarga(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setCapitulo("Mentoria Hard Skill - JAVA");
        mentoria.setDescricao("Descrição mentoria JAVA ");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Bruna");
        aluno1.inscricaoBootcamp(bootcamp);
        aluno1.progredir();
        aluno1.progredir();
        System.out.println("-");
        System.out.println("Aluno: "+ aluno1.getNome()+ "Conteúdos Inscritos:" + aluno1.getConteudos());
        System.out.println("Aluno: "+ aluno1.getNome()+ "Conteúdos Concluídos:" + aluno1.getConteudosConcluidos());
        System.out.println("XP:" + aluno1.calcularTotalXP());

        System.out.println("----           --------------          ----------------                   ---");

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Luiza");
        aluno2.inscricaoBootcamp(bootcamp);
        aluno2.progredir();
        aluno2.progredir();
        System.out.println("-");
        System.out.println("Aluno: "+ aluno2.getNome()+ "Conteúdos Inscritos:" + aluno2.getConteudos());
        System.out.println("Aluno: "+ aluno2.getNome()+ "Conteúdos Concluídos:" + aluno2.getConteudosConcluidos());
        System.out.println("XP:" + aluno2.calcularTotalXP());
    }
}
