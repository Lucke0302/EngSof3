package org.singleton;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Fila fila = Fila.getInstance();
        fila.addDoc("doc1", "mucho texto");
        fila.addDoc("doc2", "mucho texto 1");
        fila.addDoc("doc3", "mucho texto 2");
        fila.addDoc("doc4", "mucho texto 3");
        fila.removeDoc();
        fila.addDoc("doc5", "mucho texto 4");
        fila.addDoc("doc6", "mucho texto 5");

        fila.imprimeDoc();

        fila.addDoc("doc1", "vamo ver");
        fila.imprimeDoc();
    }
}