import java.util.Scanner;

public class ProdutoAlimenticio extends Produto{
    String validade;
    public String getValidade(){
        return validade;
    }
    public void setValidade(String validade){
        this.validade = validade;
    }
    @Override
    public String toString(){
        return "Produto { " + "nome:" + nome + ", " + "preco=" + getPreco() + ", " + "codigo=" + getCodigo() + ", " + "validade=" + getValidade() + "}";
}
    
    
    public static ProdutoAlimenticio[] adicionarProdutoAlimenticio(int n) { 
        Scanner scanner = new Scanner(System.in);
        ProdutoAlimenticio[] alimento = new ProdutoAlimenticio[n];

        for (int i = 0; i < n; i++) {
            alimento[i] = new ProdutoAlimenticio();

            System.out.println("\nProduto " + (i + 1));

            System.out.print("Nome do produto: ");
            alimento[i].setNome(scanner.nextLine());

            System.out.print("Preco: ");
            alimento[i].setPreco(scanner.nextFloat());
            
            System.out.print("Codigo: ");
            alimento[i].setCodigo(scanner.nextInt());
            
            System.out.print("Data de vencimento ");
            alimento[i].setValidade(scanner.nextLine());
                                 
            scanner.nextLine(); 
            
            scanner.close();
        }
        return alimento;
    }
}

