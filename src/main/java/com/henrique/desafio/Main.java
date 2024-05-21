package com.henrique.desafio;

import com.henrique.desafio.dominio.Bootcamp;
import com.henrique.desafio.dominio.Curso;
import com.henrique.desafio.dominio.Dev;
import com.henrique.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("escricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JS");
        curso2.setDescricao("escricao curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("descricao mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("bootcamp Java developer");
        bootcamp.setDescricao("Descricao bootcamp Java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Nome 1");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + dev1.getConteudosInscritos());
        System.out.println("------------");
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteudos Inscritos " + dev1.getConteudosInscritos());
        System.out.println("Conteudos Concluidos " + dev1.getConteudosConcluidos());
        System.out.println("XP " + dev1.calcularXp());

        System.out.println("------------");

        Dev dev2 = new Dev();
        dev2.setNome("Nome 2");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + dev2.getConteudosInscritos());
        System.out.println("------------");
        dev2.progredir();
        System.out.println("Conteudos Inscritos " + dev2.getConteudosInscritos());
        System.out.println("Conteudos Concluidos " + dev2.getConteudosConcluidos());
        System.out.println("XP " + dev1.calcularXp());
    }
}