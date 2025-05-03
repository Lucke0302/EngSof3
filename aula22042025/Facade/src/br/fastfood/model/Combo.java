package br.fastfood.model;

import java.util.ArrayList;

public class Combo{

    private ItemCombo burguer;
    private ItemCombo sobremesa;
    private ItemCombo bebida;

    public Combo(ItemCombo burguer, ItemCombo sobremesa, ItemCombo bebida) {
        this.burguer = burguer;
        this.sobremesa = sobremesa;
        this.bebida = bebida;
    }

    public void getItens(){
        System.out.println("Combo:");
        System.out.println("Hamburguer - " + burguer.getNome());
        System.out.println("Sobremesa - " + sobremesa.getNome());
        System.out.println("Bebida - " + bebida.getNome());
    }

    public void getPreco(){
        System.out.println("Valor total: R$"+(burguer.getPreco() + bebida.getPreco() + sobremesa.getPreco()));
    }


}
