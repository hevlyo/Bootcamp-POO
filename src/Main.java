import domain.Bootcamp;
import domain.Curso;
import domain.Dev;
import domain.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // 1. Criando Conteúdos (Cursos e Mentorias)
        System.out.println("--- Criando Conteúdos ---");

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java básico");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Spring Boot");
        curso2.setDescricao("Descrição curso Spring Boot avançado");
        curso2.setCargaHoraria(10);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Carreira");
        mentoria1.setDescricao("Mentoria para direcionamento de carreira em TI");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria de Código Limpo");
        mentoria2.setDescricao("Mentoria sobre boas práticas de código");
        mentoria2.setData(LocalDate.now().plusDays(5));

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        System.out.println(mentoria2);
        System.out.println("\n---------------------------\n");


        // 2. Criando um Bootcamp e adicionando Conteúdos
        System.out.println("--- Criando Bootcamp e Adicionando Conteúdos ---");

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java Developer");
        bootcampJava.setDescricao("Bootcamp completo para se tornar um desenvolvedor Java");
        bootcampJava.getConteudos().add(curso1);
        bootcampJava.getConteudos().add(mentoria1);
        bootcampJava.getConteudos().add(curso2);
        bootcampJava.getConteudos().add(mentoria2);

        System.out.println("Bootcamp: " + bootcampJava.getNome());
        System.out.println("Conteúdos do Bootcamp: " + bootcampJava.getConteudos());
        System.out.println("\n---------------------------\n");


        // 3. Criando Devs e Inscrevendo eles no Bootcamp
        System.out.println("--- Criando Devs e Inscrevendo-os ---");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcampJava);

        System.out.println("Dev: " + devCamila.getNome());
        System.out.println("Conteúdos Inscritos de " + devCamila.getNome() + ": " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de " + devCamila.getNome() + ": " + devCamila.getConteudosConcluidos());
        System.out.println("XP Inicial de " + devCamila.getNome() + ": " + devCamila.calcularTotalXp());
        System.out.println("\n");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcampJava);

        System.out.println("Dev: " + devJoao.getNome());
        System.out.println("Conteúdos Inscritos de " + devJoao.getNome() + ": " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de " + devJoao.getNome() + ": " + devJoao.getConteudosConcluidos());
        System.out.println("XP Inicial de " + devJoao.getNome() + ": " + devJoao.calcularTotalXp());
        System.out.println("\n---------------------------\n");


        // 4. Progresso dos Devs
        System.out.println("--- Progresso dos Devs ---");

        System.out.println("Progresso de " + devCamila.getNome() + ":");
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();

        System.out.println("Conteúdos Inscritos de " + devCamila.getNome() + " (após progredir): " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de " + devCamila.getNome() + " (após progredir): " + devCamila.getConteudosConcluidos());
        System.out.println("XP Final de " + devCamila.getNome() + ": " + devCamila.calcularTotalXp());
        System.out.println("\n");

        System.out.println("Progresso de " + devJoao.getNome() + ":");
        devJoao.progredir();

        System.out.println("Conteúdos Inscritos de " + devJoao.getNome() + " (após progredir): " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de " + devJoao.getNome() + " (após progredir): " + devJoao.getConteudosConcluidos());
        System.out.println("XP Final de " + devJoao.getNome() + ": " + devJoao.calcularTotalXp());
        System.out.println("\n---------------------------\n");

        System.out.println("--- Tentando progredir sem conteúdos ---");
        Dev devSemConteudo = new Dev();
        devSemConteudo.setNome("Maria");
        System.out.println("Dev: " + devSemConteudo.getNome());
        devSemConteudo.progredir();
        System.out.println("\n---------------------------\n");

        // Demonstração de Polimorfismo
        System.out.println("--- Demonstração de Polimorfismo (no cálculo de XP) ---");
        System.out.println("A XP total é calculada iterando sobre uma coleção de Conteudos (que podem ser Cursos ou Mentorias),");
        System.out.println("e o método calcularXp() é chamado de forma polimórfica para cada tipo de conteúdo.");
        System.out.println("XP Final de Camila (recalculado para reforçar): " + devCamila.calcularTotalXp());
        System.out.println("XP Final de João (recalculado para reforçar): " + devJoao.calcularTotalXp());
        System.out.println("\n---------------------------\n");

        System.out.println("Desafio de POO Concluído com Sucesso!");
    }
}