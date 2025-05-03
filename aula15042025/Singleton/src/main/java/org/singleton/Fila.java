package org.singleton;

import java.util.ArrayList;

public class Fila {
    private static Fila instance;
    private ArrayList<Documento> fila;

    private Fila(){
        this.fila = new ArrayList<>();
    }

    public static Fila getInstance() {
        if (instance == null) {
            instance = new Fila();
        }
        return instance;
    }

    public void addDoc(String nome, String texto){
        Documento doc = new Documento(nome, texto);
        fila.add(doc);
    }

    public void imprimeDoc(){
        for(Documento doc: fila){
            System.out.println(doc.getTexto());
        }
        this.removeTodosDocs();
    }

    public void removeDoc(){
        if(!fila.isEmpty()){
            fila.removeLast();
        }
    }

    public void removeTodosDocs(){
        if(!fila.isEmpty()){
            fila.clear();
        }
    }


}
