package com.src.prova;

// Subclasse ProvaUCB
public class ProvaUCB extends ProvaUniversidade {

    public ProvaUCB(double AV1, double AV2) {
        super(AV1, AV2);
    }

    public boolean aprovado() {
        return calcularMedia() >= 7;
    }
}
