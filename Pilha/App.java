import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Pilha pilha = new Pilha(10);
        Scanner scanner = new Scanner(System.in);

        boolean continuar = false;
        int escolha;

        
        while (continuar == false) 
        {
            System.out.println("");
            System.out.println("--------Menu--------"
            + "\n1 - Adicionar a Pilha"
            + "\n2 - Remover do Topo"
            + "\n3 - Fechar Programa");
    
            System.out.println("\nDigite a opção desejada : ");
            escolha = scanner.nextInt();
            System.out.println("");
            
            switch (escolha) 
            {
                case 1:
                    System.out.println("Digite o valor para ser adicionado a pilha : ");
                    int numP = scanner.nextInt();
            
                    pilha.push(numP);
                break;
            
                case 2:
                    pilha.pop();
                break;

                case 3:
                    continuar = true;
                break;
            }
        }
    }
}