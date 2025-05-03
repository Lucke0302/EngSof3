package org.singleton;

public class Documento {

    private String nome, texto;

    public Documento(String nome, String texto){
        this.nome = nome;
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
