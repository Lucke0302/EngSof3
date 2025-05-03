package br.fastfood.model;

public class Bebida implements ItemCombo {

    private double preco;
    private String nome;

    public Bebida(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    @Override
    public double getPreco(){
        return preco;
    }

    @Override
    public String getNome(){
        return nome;
    }

}
