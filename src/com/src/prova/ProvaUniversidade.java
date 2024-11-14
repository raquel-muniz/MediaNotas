package com.src.prova;

// Superclasse ProvaUniversidade
public class ProvaUniversidade {
    protected double AV1;
    protected double AV2;

    public ProvaUniversidade(double AV1, double AV2) {
        this.AV1 = AV1;
        this.AV2 = AV2;
    }

    public double calcularMedia() {
        return (AV1 + AV2) / 2;
    }
}

