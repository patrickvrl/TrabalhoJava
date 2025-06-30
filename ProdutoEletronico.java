
import java.util.Scanner;
import java.util.ArrayList;

public class ProdutoEletronico extends Produto{
    private int garantia;
    public int getGarantia(){
        return garantia;
    }
    public void setGarantia(int garantia){
        this.garantia = garantia;
    }
    @Override
    public String toString(){
        return "Produto { " + "nome:" + nome + ", " + "preco=" + getPreco() + ", " + "codigo=" + getCodigo() + ", " + "garantia=" + getGarantia() + "}";
}
    
    
    public static void adicionarProdutoEletronico(int n,  ArrayList<ProdutoEletronico> eletronico) { 
        Scanner scanner = new Scanner(System.in);
        //ArrayList<ProdutoEletronico> eletronico = new ArrayList<>();
        

        for (int i = 0; i < n; i++) {
            System.out.println("\nProduto " + (i + 1));
            ProdutoEletronico prod = new ProdutoEletronico();
            System.out.print("Nome do produto: ");
            prod.setNome(scanner.nextLine());

            System.out.print("Preco: ");
            prod.setPreco(scanner.nextFloat());
            
            System.out.print("Codigo: ");
            prod.setCodigo(scanner.nextInt());
            
            System.out.print("Garantia em meses: ");
            prod.setGarantia(scanner.nextInt());
            eletronico.add(prod);
            scanner.nextLine(); 
            
            
        }
       
    }
}