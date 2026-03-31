package Produto;

import java.util.ArrayList;

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

    public static String buscarProdutoNome(ArrayList<Produto> produtos, String nome){
        String resultado = "";
        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);

            if(produto.getNome().equalsIgnoreCase(nome)) {

                resultado +="Nome do produto: " + produto.getNome() +
                        "\nPreço: " + produto.getLote() +
                        "\nID: " + produto.getId() +
                        "\n-------------------\n";
            }
        }


        if (resultado.isEmpty()) {
            return "produto não encontrado";
        }

        return resultado;

    }

    public static String buscarProdutoLote(ArrayList<Produto> produtos, int lote){

        for(int i = 0; i < produtos.size(); i++){

            if(produtos.get(i).getLote() == lote){
                return "Nome do produto: " + produtos.get(i).getNome() +
                        "\nPreço: " + produtos.get(i).getLote() +
                        "\nID: " + produtos.get(i).getId() +
                        "\n-------------------\n";
            }
        }
        return null;
    }

    public static boolean removerPornome(ArrayList<Produto> produtos, String nome){
        for(int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equalsIgnoreCase(nome)) {
                produtos.remove(i);
                return true;
            }
        }
        return false;
    }

    public static boolean removerPorLote(ArrayList<Produto> produtos, int lote){
        for(int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getLote() == lote) {
                produtos.remove(i);
                return true;
            }
        }
        return false;
    }

  public static boolean removerPorId(ArrayList<Produto> produtos, int id){
        for(int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getId() == id) {
                produtos.remove(i);
                return true;
            }
        }
        return false;
  }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setLote(int lote){
        this.lote = lote;
    }

    public static int contarPorNome(ArrayList<Produto> produtos, String nome){
        int quantidade = 0;
        for(Produto produto : produtos) {
            if(produto.getNome().equalsIgnoreCase(nome)) {
                quantidade++;
            }
        }
        return quantidade;
    }
    public static int contarPorLote(ArrayList<Produto> produtos, int lote){
        int quantidade = 0;
        for(Produto produto : produtos) {
            if(produto.getLote() == lote) {
                quantidade++;

            }
        }
        return quantidade;
    }

    public static int contarPorId(ArrayList<Produto> produtos, int id){
        int quantidade = 0;
        for(Produto produto : produtos) {
            if(produto.getId() == id) {
                quantidade++;

            }
        }
        return quantidade;
    }
}
