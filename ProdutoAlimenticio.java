import java.util.Scanner;
import java.util.ArrayList;

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
    
    
    public static void adicionarProdutoAlimenticio(int n, ArrayList<ProdutoAlimenticio> alimento) { 
        Scanner scanner = new Scanner(System.in);
        //ArrayList<ProdutoAlimenticio> alimento = new ArrayList<>();
        
        
        for (int i = 0; i < n; i++) {
            ProdutoAlimenticio prod = new ProdutoAlimenticio();
            System.out.println("\nProduto " + (i + 1));

            System.out.print("Nome do produto: ");
            prod.setNome(scanner.nextLine());

            System.out.print("Preco: ");
            prod.setPreco(scanner.nextFloat());
            
            System.out.print("Codigo: ");
            prod.setCodigo(scanner.nextInt());

            scanner.nextLine();

            System.out.println("Data de vencimento: ");
            prod.setValidade(scanner.nextLine());
            alimento.add(prod);
            
            
            
        }
    }
}

