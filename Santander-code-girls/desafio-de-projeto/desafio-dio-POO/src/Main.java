import br.com.dio.desafio.dominio.Curso;
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

        System.out.println(cursoJava);
        System.out.println(cursoPoo);
        System.out.println(mentoriaBasica);
        System.out.println(mentoriaIntermediaria);
    }
}
