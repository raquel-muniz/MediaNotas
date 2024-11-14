package com.src.prova;

// Subclasse ProvaFafifo
public class ProvaFafifo extends ProvaUniversidade {

    public ProvaFafifo(double AV1, double AV2) {
        super(AV1, AV2);
    }

    public boolean aprovado() {
        return calcularMedia() >= 6;
    }
}
