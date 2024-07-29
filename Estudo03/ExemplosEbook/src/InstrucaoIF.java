import java.util.Scanner;

public class InstrucaoIF {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Nome do produto: ");
        String nome = leia.nextLine();
        System.out.print("Quantidade de produto no estoque: ");
        int qtd = leia.nextInt();
        
        System.out.println("**** Dados do produto ****");
        System.out.println("Produto......: " + nome);
        System.out.println("Quantidade...: " + qtd);
        if (qtd <= 0) {
            System.out.println("Produto sem estoque");
        }
    }
}

