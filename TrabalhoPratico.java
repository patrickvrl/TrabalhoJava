import java.util.Scanner;



public class TrabalhoPratico {

    public static void main(String[] args) {
        ProdutoEletronico[] produtosEletronicos = new ProdutoEletronico[0];
        ProdutoAlimenticio[] produtosAlimenticios = new ProdutoAlimenticio[0];
        
        Scanner scanner = new Scanner(System.in);
        int opcao;

            do{
                System.out.println("Selecione a opcao desejada:\n"
                    + "1- Cadastrar produto eletronico\n"
                    + "2- Cadastrar produto alimenticio\n"
                    + "3- Listar produtos\n"
                    + "4- Realizar vendas\n"
                    + "5-Listar Vendas\n"
                    + "6- Pesquisar produto por nome\n"
                    + "0- Sair");
            opcao = scanner.nextInt();

                switch(opcao){
                    case 1: {
                        System.out.print("Quantos produtos eletronicos deseja cadastrar? ");
                        int n = scanner.nextInt();
                        scanner.nextLine();
                        produtosEletronicos = ProdutoEletronico.adicionarProdutoEletronico(n);
                        break;
                    }
                    case 2: 
                        System.out.print("Quantos produtos alimenticios deseja cadastrar? ");
                        int n = scanner.nextInt();
                        scanner.nextLine();
                        produtosAlimenticios = ProdutoAlimenticio.adicionarProdutoAlimenticio(n);
                        break;
                    case 3:
                        System.out.println("Produtos eletronicos:");
                        for(int i = 0; i < 10; i++){
                            System.out.println(produtosEletronicos[i].toString());
                        }
                        System.out.println("Produtos alimenticios:");
                        for(int i = 0; i < 10; i++){
                            System.out.println(produtosAlimenticios[i].toString());
                        }
    //                case 4 -> System.out.println("Realizando Venda");
    //                case 5 -> System.out.println("Produto");
    //                case 6 -> System.out.println("Vendas realizadas: ");
                    default: System.out.println("Opção inválida.");
                }
            } while(opcao != 0);
            scanner.close();
        }
    }