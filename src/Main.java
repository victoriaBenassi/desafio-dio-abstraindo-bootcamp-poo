import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        //System.out.println(curso1);
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devVictoria = new Dev();
        devVictoria.setNome("Victoria");
        devVictoria.inscreverBootcamp(bootcamp);
        System.out.println("conteúdos inscritos Victoria: "+ devVictoria.getConteudoInscritos());

        System.out.println(" - ");
        devVictoria.progredir();
        devVictoria.progredir();

        System.out.println("conteúdos inscritos Victoria: "+ devVictoria.getConteudoInscritos());
        System.out.println("conteúdos concluidos Victoria: "+ devVictoria.getConteudoConcluidos());
        System.out.println("XP: "+ devVictoria.calcularTotalXp());

        System.out.println("------------------------------------------------");

        Dev devAndrey = new Dev();
        devAndrey.setNome("Andrey");
        devAndrey.inscreverBootcamp(bootcamp);
        System.out.println("conteúdos inscritos Andrey: "+ devAndrey.getConteudoInscritos());

        System.out.println(" - ");
        devAndrey.progredir();
        devAndrey.progredir();
        devAndrey.progredir();
        System.out.println("conteúdos inscritos Andrey: "+ devAndrey.getConteudoInscritos());
        System.out.println("conteúdos concluidos Andrey: "+ devAndrey.getConteudoConcluidos());
        System.out.println("XP: "+ devAndrey.calcularTotalXp());

    }
}
