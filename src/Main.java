import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("Curso de Java POO");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JavaScript");
        curso2.setDescricao("Curso de JavaScript");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de data");
        mentoria.setDescricao("Mentoria para Java");
        mentoria.setData(LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devNatal = new Dev();
        devNatal.setNome("Natal");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");

        devNatal.inscreverBootcamp(bootcamp);
        devCamila.inscreverBootcamp(bootcamp);
        devNatal.progredir();
        devNatal.progredir();
        devNatal.progredir();
        devCamila.progredir();

        System.out.println("Conteúdos inscritos " + devNatal.getConteudosInscritos());
        System.out.println("Conteúdos inscritos " + devCamila.getConteudosInscritos());

        System.out.println("Conteúdos Concluídos " + devNatal.getConteudoConcluido());
        System.out.println("Conteúdos Concluídos " + devCamila.getConteudoConcluido());
        System.out.println("XP " + devNatal.calcularXP());
        System.out.println("XP " + devCamila.calcularXP());

    }
}
