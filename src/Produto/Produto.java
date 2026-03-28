package Produto;

public class Produto {
    private String nome;
    private int lote;
    private int id;

    public Produto(String nome, int lote, int id) {
        this.nome = nome;
        this.lote = lote;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public int getLote() {

        return lote;
    }
    public int getId() {
        return id;
    }

    @Override
    public String toString(){

      return
                "==============================================="+
                "\nProduto: "+ getNome() +
                "\nLote: "+ getLote() +
                "\nId: "+ getId() +
                "\n-------------------------------------------- \n";

    }
}
