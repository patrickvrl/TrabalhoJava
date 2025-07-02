import java.util.Scanner;
import java.util.ArrayList;


public class TrabalhoPratico {
      public static void buscarProdutoPorNome(ArrayList<ProdutoEletronico> eletronicos, ArrayList<ProdutoAlimenticio> alimenticios, String nomeBusca) {
        boolean encontrado = false;

        for (ProdutoEletronico p : eletronicos) {
            if (p.getNome().equalsIgnoreCase(nomeBusca)) {
                System.out.println("Produto eletrônico encontrado: " + p);
                encontrado = true;
            }
        }

        for (ProdutoAlimenticio p : alimenticios) {
            if (p.getNome().equalsIgnoreCase(nomeBusca)) {
                System.out.println("Produto alimentício encontrado: " + p);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Produto não encontrado.");
        }
    }

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
                        if (produtosEletronicos.isEmpty()) {
                            System.out.println("Não há produtos eletrônicos em estoque para vender.");
                        } else {
                            System.out.print("Digite o código do produto eletrônico a ser vendido: ");
                            int codigoVenda = scanner.nextInt();
                            Venda.venderProdutoEletronico(codigoVenda, produtosEletronicos);
                        }
                        break;
                    
                    case 5: 
                        if (produtosAlimenticios.isEmpty()) {
                        System.out.println("Não há produtos alimentícios em estoque para vender.");
                    } else {
                        System.out.print("Digite o código do produto alimentício a ser vendido: ");
                        int codigoVenda = scanner.nextInt();
                        Venda.venderProdutoAlimenticio(codigoVenda, produtosAlimenticios);
                    }
                        break;
                    case 6:
                        Venda.listarVendas();
                        break;
                    case 7:
                        scanner.nextLine();
                        System.out.print("Digite o nome do produto que deseja buscar: ");
                        String nomeBusca = scanner.nextLine();
                        buscarProdutoPorNome(produtosEletronicos, produtosAlimenticios, nomeBusca);
                        break;
                    case 0:
                    break;
                    default: System.out.println("Opção inválida.");
                }
            } while(opcao != 0);
            scanner.close();
        }
    }