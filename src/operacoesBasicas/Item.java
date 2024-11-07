package operacoesBasicas;


public class Item {
    private String nome;
    private double preco;
    private int quant;

    public Item(String nome, double preco, int quant) {
        this.nome = nome;
        this.preco = preco;
        this.quant = quant;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getQuant() {
        return this.quant;
    }

    public String toString() {
        return "Item{nome='" + this.nome + "', preco=" + this.preco + ", quant=" + this.quant + "}";
    }
}
