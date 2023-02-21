package br.com.dio.bootcamp;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso cursoGratis = new Curso();
        cursoGratis.setTitulo("Java do zero");
        cursoGratis.setDescricao("Curso que ensina java do zero ao avançado em apenas 12 meses");
        cursoGratis.setCargaHoraria(95);

        Conteudo cursoPago = new Curso();
        cursoGratis.setTitulo("Java Avançado");
        cursoGratis.setDescricao("Curso que ensina toda a parte avançada do java, é um completo ao curso java do zero");
        cursoGratis.setCargaHoraria(40);

        Mentoria mentoria = new Mentoria();

        mentoria.setDate(LocalDate.of(2023,05,03));
        mentoria.setTitulo("Mentoria sobre java");
        mentoria.setDescricao("Você aprenderá sobre trabalho ágil");

  //      System.out.println(cursoGratis);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.getNome("Bootcamp de python");
        bootcamp.getDescricao("Descricao");
        bootcamp.getConteudos().add(cursoPago);
        bootcamp.getConteudos().add(cursoGratis);
        bootcamp.getConteudos().add(mentoria);

        Dev gab = new Dev();
        gab.setNome("Gabriel");
        gab.InscreverBootcamp(bootcamp);
        gab.progredir();


        System.out.println("Conteudos inscritos Gab: " + gab.getConteudoInscrito());
        System.out.println("==============================================================\n");
        System.out.println("Conteudo concluido Gab: " + gab.getConteudoConcluido());
    }
}
