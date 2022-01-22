package desafio.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        List<String> palavras = new ArrayList<>();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Dveloper");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Lucas" + devLucas.getConteudosInscritos());
        devLucas.progredir();
        devLucas.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Lucas" + devLucas.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Lucas" + devLucas.getConteudosConcluidos());
        System.out.println("XP: " + devLucas.calcularTotalXp());

        System.out.println("--------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Joao" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Joao" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Joao" + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

    }
}
