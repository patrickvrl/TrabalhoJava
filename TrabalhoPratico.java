import java.util.Scanner;
import java.util.ArrayList;

public class TrabalhoPratico {

    public static void main(String[] args) {
        ArrayList<ProdutoEletronico> produtosEletronicos = new ArrayList<ProdutoEletronico>();
        ArrayList<ProdutoAlimenticio> produtosAlimenticios = new ArrayList<ProdutoAlimenticio>();
        
        Scanner scanner = new Scanner(System.in);
        int opcao;

            do{
                System.out.println("Selecione a opcao desejada:\n"
                    + "1- Cadastrar produto eletronico\n"
                    + "2- Cadastrar produto alimenticio\n"
                    + "3- Listar produtos\n"
                    + "4- Vender produtos eletronicos\n"
                    + "5- Vender produtos alimenticios\n"
                    + "6-Listar Vendas\n"
                    + "7- Pesquisar produto por nome\n"
                    + "0- Sair");
            opcao = scanner.nextInt();

                switch(opcao){
                    case 1: {
                        System.out.print("Quantos produtos eletronicos deseja cadastrar? ");
                        int n = scanner.nextInt();
                        scanner.nextLine();
                        ProdutoEletronico.adicionarProdutoEletronico(n,produtosEletronicos);
                        break;
                    }
                    case 2: 
                        System.out.print("Quantos produtos alimenticios deseja cadastrar? ");
                        int n = scanner.nextInt();
                        scanner.nextLine();
                        ProdutoAlimenticio.adicionarProdutoAlimenticio(n, produtosAlimenticios);
                        break;
                    case 3:
                        
                        int tam = produtosEletronicos.size();
                            if(tam == 0){
                                System.out.println("Não há nenhum produto eletrônico.");
                            }
                            else{
                                for(int i = 0; i < tam; i++){
                                System.out.println("Produtos eletronicos:");
                                System.out.println(produtosEletronicos.get(i));
                            }
                        }
                        
                        tam = produtosAlimenticios.size();
                        if(tam == 0){
                            System.out.println("Não há nenhum produto alimentício.");
                        }else{
                            for(int i = 0; i < tam; i++){
                                System.out.println("Produtos alimenticios:");
                                System.out.println(produtosAlimenticios.get(i));
                            }
                        }
                        break;
                    case 4:
                        
                        break;
                    
    //                case 5 -> System.out.println("Produto");
    //                case 6 -> System.out.println("Vendas realizadas: ");
                    case 0:
                    break;
                    default: System.out.println("Opção inválida.");
                }
            } while(opcao != 0);
            scanner.close();
        }
    }