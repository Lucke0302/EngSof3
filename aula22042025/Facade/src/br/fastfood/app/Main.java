// após implementar as classes solicitada remova os comentarios
// para executar o código

package br.fastfood.app;
import java.util.Scanner;
import br.fastfood.facade.ComboFacade;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=== Pará Lanches ===");
        System.out.println("1 – Combo Banana");
        System.out.println("2 – Combo Ratão");
        System.out.println("3 – Combo Grilo");
        System.out.print("Sua escolha: ");
        int escolha = in.nextInt();



        ComboFacade facade = new ComboFacade();
        facade.criarCombo(escolha);
        facade.exibirItens();
        facade.getPreco();

    }
}