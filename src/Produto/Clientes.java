package Produto;

public class Clientes {
    private String nomeCliente;
    private String cpf;
    private int numeroTelefone;
    private int id;

    public Clientes(String nomeCliente, String cpf, int numeroTelefone, int id) {
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.numeroTelefone = numeroTelefone;
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public String getCpf() {
        return cpf;
    }
    public int getNumeroTelefone() {
        return numeroTelefone;
    }


    @Override
    public String toString() {
        return "\n===================================" +
                "\n Cliente: " + getNomeCliente() +
                "\n CPF: " + getCpf() +
                "\n Numero Telefone: " + getNumeroTelefone() +
                "\n===================================";
    }


}


