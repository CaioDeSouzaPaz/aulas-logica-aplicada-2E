public class Produto {
    //Atributos
    boolean diet;
    private String nome;
    double preco;
    //setter
    public void setNome (String _nome){
        this.nome = _nome;
    }
    //Método construtor padrão
    Produto(){}
    Produto(double _preco) {
        this.preco = _preco;

    }
    public Produto (String _nome, double _preco){
        this.nome = _nome;
        this.preco = _preco;
    }
}
