public class Produto {
    public String nome;
    private float preco;
    private int codigo;
//   
    public String getNome(){
    return nome;
    }
    public float getPreco(){
        return preco;
    }
    public int getCodigo(){
        return codigo;
    }
//
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(float preco){
        this.preco = preco;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public String toString(){
        return "Produto { " + "nome:" + nome + ", " + "preco=" + preco + ", " + "codigo=" + codigo + "}" ;
    }
}
