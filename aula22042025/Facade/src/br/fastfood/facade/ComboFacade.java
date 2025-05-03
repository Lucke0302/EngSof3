package br.fastfood.facade;


import br.fastfood.model.*;


public class ComboFacade{
    private Combo combo;

    public void criarCombo(int num){
        //ItemCombo burguer;
        //ItemCombo bebida;
        //ItemCombo sobremesa;
        switch (num){
            case 1:
                combo = new Combo(
                            new Burguer(20, "X-Banana"),
                            new Bebida(10, "Suco de abacate"),
                            new Sobremesa(15, "Banana Split")
                );
                break;
            case 2:
                combo = new Combo(
                            new Burguer(20, "X-Ratão"),
                            new Bebida(10, "Suco de laranja (vencido)"),
                            new Sobremesa(15, "Sorvete de baunilha")
                );
                break;
            case 3:
                combo = new Combo(
                            new Burguer(20, "X-Grilo"),
                            new Bebida(10, "Suco de abacate"),
                            new Sobremesa(15, "")
                );
                break;
            default:
                System.out.println("Combo Pará Lanches não encontrado!");
                break;
        }
    }

    public void exibirItens(){
        combo.getItens();
    }

    public void getPreco(){
        combo.getPreco();
    }

}
