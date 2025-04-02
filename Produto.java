package At2;

public class Produto {

    int codigo;
    String nome, tipo;
    int quantidade;
    double preco;

    Produto(int codigo) {
        this.codigo = codigo;
    }

    Produto(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    Produto(int codigo, String nome, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    Produto(int codigo, String nome, int quantidade, String tipo, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    double vender(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade = this.quantidade - quantidade;
            return preco * quantidade;
        } else {
            System.out.println("Não tem estoque do produto");
            return 0;
        }
    }

    void comprar(int qunantidade, double preco) {
        this.quantidade = this.quantidade + qunantidade;
        this.preco = preco;
    }

    void comprar(int qunantidade) {
        this.quantidade = this.quantidade + qunantidade;
    }

    void inserir(String nome, String tipo, int quantidade, double preco) {
        this.nome = nome;
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    boolean igual(Produto produto) {
        if (this.nome.equals(produto.nome) && this.tipo.equals(produto.tipo)) {
            return true;
        } else {
            return false;
        }
    }

    public String consultar() {
        return "Codigo: " + this.codigo
                + "\nNome: " + this.nome
                + "\nQuantidade" + this.quantidade
                + "\nTipo" + this.tipo
                + "\nPreco" + this.preco;
    }
}
