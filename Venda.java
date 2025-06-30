import java.util.ArrayList;

public class Venda {

    private static ArrayList<String> vendasRealizadas = new ArrayList<>();

    public static void venderProdutoEletronico(int codigo, ArrayList<ProdutoEletronico> eletronicos) {
        boolean encontrado = false;
        for (int i = 0; i < eletronicos.size(); i++) {
            if (eletronicos.get(i).getCodigo() == codigo) {
                ProdutoEletronico vendido = eletronicos.remove(i);
                System.out.println("Produto eletrônico vendido com sucesso: " + vendido);
                vendasRealizadas.add("Eletrônico - " + vendido.toString());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Produto eletrônico com código " + codigo + " não encontrado.");
        }
    }

    public static void venderProdutoAlimenticio(int codigo, ArrayList<ProdutoAlimenticio> alimenticios) {
        boolean encontrado = false;
        for (int i = 0; i < alimenticios.size(); i++) {
            if (alimenticios.get(i).getCodigo() == codigo) {
                ProdutoAlimenticio vendido = alimenticios.remove(i);
                System.out.println("Produto alimentício vendido com sucesso: " + vendido);
                vendasRealizadas.add("Alimentício - " + vendido.toString());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Produto alimentício com código " + codigo + " não encontrado.");
        }
    }

    public static void listarVendas() {
        if (vendasRealizadas.isEmpty()) {
            System.out.println("Nenhuma venda registrada.");
        } else {
            System.out.println("Vendas realizadas:");
            for (String venda : vendasRealizadas) {
                System.out.println(venda);
            }
        }
    }
}
