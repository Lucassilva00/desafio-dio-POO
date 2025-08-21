import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Descrição curso python");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java e python");
        mentoria.setDescricao("Descrição mentoria java e python");
        mentoria.setData(LocalDate.now());

        Conteudo conteudo = new Curso();
        conteudo.setTitulo("Teste conteudo");

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        System.out.println(conteudo);*/

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setName("Bootcamp Java Developer");
        bootcampJava.setDescricao("Descrição Bootcamp Java Developer");
        bootcampJava.getConteudos().add(curso1);
        bootcampJava.getConteudos().add(curso2);
        bootcampJava.getConteudos().add(mentoria);

        Dev devMaria = new Dev();
        devMaria.setName("Maria");
        devMaria.inscreverBootcamp(bootcampJava);
        System.out.printf("Conteúdos inscritos de Camila: %s\n", devMaria.getConteudosInscritos());

        devMaria.progredir();
        devMaria.progredir();

        System.out.println("----");
        System.out.printf("Conteúdos inscritos de Camila: %s\n", devMaria.getConteudosInscritos());
        System.out.printf("Conteúdos concluídos de Camila: %s\n", devMaria.getConteudosConcluidos());
        System.out.printf("XP: %s\n", devMaria.calcularTotalXp());


        System.out.println("===========================");
        Dev devJoao = new Dev();
        devJoao.setName("João");
        devJoao.inscreverBootcamp(bootcampJava);
        System.out.printf("Conteúdos inscritos de João: %s\n", devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("----");
        System.out.printf("Conteúdos inscritos de João: %s\n", devJoao.getConteudosInscritos());
        System.out.printf("Conteúdos concluídos de João: %s\n", devJoao.getConteudosConcluidos());
        System.out.printf("XP: %s\n", devJoao.calcularTotalXp());
    }
}
