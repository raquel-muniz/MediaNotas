package com.src.prova;

public class Main {
    public static void main(String[] args) {
        ProvaUCB provaUCB = new ProvaUCB(8.0, 7.5);
        ProvaFafifo provaFafifo = new ProvaFafifo(5.5, 6.0);

        System.out.println("Aluno na UCB aprovado: " + provaUCB.aprovado());
        System.out.println("Aluno na Fafifo aprovado: " + provaFafifo.aprovado());
    }
}
