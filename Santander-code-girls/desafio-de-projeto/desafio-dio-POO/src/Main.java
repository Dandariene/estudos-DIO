import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo(" Dominando IDEs");
        cursoJava.setDescricao(" Entendendo IntelliJ e Eclipse");
        cursoJava.setCargaHoraria( 4);

        Curso cursoPoo = new Curso();
        cursoPoo.setTitulo(" Orirntação à objeto");
        cursoPoo.setDescricao(" Introdução a orientação à objeto");
        cursoPoo.setCargaHoraria( 6);

        Mentoria mentoriaBasica = new Mentoria();
        mentoriaBasica.setTitulo("Mentoria de Java");
        mentoriaBasica.setDescricao("Como começar a estudar Java");
        mentoriaBasica.setData(LocalDate.now());

        Mentoria mentoriaIntermediaria = new Mentoria();
        mentoriaIntermediaria.setTitulo("Mentoria de POO em Java");
        mentoriaIntermediaria.setDescricao("Como aprender Poo em Java");
        mentoriaIntermediaria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Full Stack Js");
        bootcamp.setDescricao("Aprendendo Javascript do zero");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoPoo);
        bootcamp.getConteudos().add(mentoriaBasica);
        bootcamp.getConteudos().add(mentoriaIntermediaria);

        Dev devDandariene = new Dev();
        devDandariene.setNome("Dandariene");
        devDandariene.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Dandariene: " + devDandariene.getConteudosInscritos());
        devDandariene.progredir();
        System.out.println("--");
        System.out.println("Conteudos inscritos Dandariene: " + devDandariene.getConteudosInscritos());
        System.out.println("Conteudos concluídos Dandariene: " + devDandariene.getConteudosConcluidos());
        devDandariene.calcularTotalXp();
        System.out.println("Total de XP adquirido: " + devDandariene.calcularTotalXp());

        System.out.println("********************");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("--");
        System.out.println("Conteudos inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteudos concluídos Camila: " + devCamila.getConteudosConcluidos());
        devCamila.calcularTotalXp();
        System.out.println("Total de XP adquirido: " + devCamila.calcularTotalXp());
    }


}
