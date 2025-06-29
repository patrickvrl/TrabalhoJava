
import java.util.Scanner;

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
    
    
    public static ProdutoEletronico[] adicionarProdutoEletronico(int n) { 
        Scanner scanner = new Scanner(System.in);
        ProdutoEletronico[] eletronico = new ProdutoEletronico[n];

        for (int i = 0; i < n; i++) {
            eletronico[i] = new ProdutoEletronico(); 

            System.out.println("\nProduto " + (i + 1));

            System.out.print("Nome do produto: ");
            eletronico[i].setNome(scanner.nextLine());

            System.out.print("Preco: ");
            eletronico[i].setPreco(scanner.nextFloat());
            
            System.out.print("Codigo: ");
            eletronico[i].setCodigo(scanner.nextInt());
            
            System.out.print("Garantia em meses: ");
            eletronico[i].setGarantia(scanner.nextInt());
                                 
            scanner.nextLine(); 
            
            scanner.close();
        }
        return eletronico;
    }
}