package br.fastfood.model;

public class Burguer implements ItemCombo {

    private double preco;
    private String nome;

    public Burguer(double preco, String nome) {
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
