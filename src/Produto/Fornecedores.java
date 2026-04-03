package Produto;

public class Fornecedores {
    private String NomeFornecedor;
    private String cnpjFornecedor;
    private String insumos;
    private int idFornecedor;

    public Fornecedores(String nomeFornecedor, String cnpjFornecedor, String insumoFornecedor, int idFornecedor) {
        this.NomeFornecedor = nomeFornecedor;
        this.cnpjFornecedor = cnpjFornecedor;
        this.insumos = insumoFornecedor;
        this.idFornecedor = idFornecedor;
    }

    public String getNomeFornecedor() {
        return NomeFornecedor;
    }
    public String getCnpjFornecedor() {
        return cnpjFornecedor;
    }
    public String getInsumos() {
        return insumos;
    }
    public int getIdFornecedor() {
        return idFornecedor;
    }

    @Override
    public String toString() {
        return "\n===================================" +
                "\n Cliente: " + getNomeFornecedor() +
                "\n CNPJ: " + getCnpjFornecedor() +
                "\n Insumos oferecidos: " + getInsumos() +
                "\n===================================";
    }
}
