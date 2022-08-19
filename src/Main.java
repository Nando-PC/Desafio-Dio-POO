import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Linguagem de Programação Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("Linguagem de Programação JavaScript");
        curso2.setCargaHoraria(6);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de Java");
        mentoria1.setDescricao("mentoria sobre o Java");
        mentoria1.setData(LocalDate.now());

        //Polimorfismo //instanciando objeto-filho a partir da classe mãe
        //Conteudo conteudo1 = new Curso();
        //Conteudo conteudo2 = new Mentoria();

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devNando = new Dev();
        devNando.setNome("Nando");
        devNando.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos - Nando: "+devNando.getConteudosInscritos());
        devNando.progredir();
        devNando.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos - Nando: "+devNando.getConteudosInscritos());
        System.out.println("Conteudos Concluidos - Nando: "+devNando.getConteudosConcluidos());
        System.out.println("XP:"+devNando.calcularTotalXp());

        System.out.println("------------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos - Camila: "+devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos - Camila: "+ devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos - Camila: "+devCamila.getConteudosConcluidos());
        System.out.println("XP:"+devCamila.calcularTotalXp());





    }
}
