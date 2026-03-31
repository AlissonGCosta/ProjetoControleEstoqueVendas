import Produto.Produto;
import Produto.Clientes;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Produto> listaProduto = new ArrayList<>();
        ArrayList<Clientes> listaCliente = new ArrayList<>();

        boolean condicaoMenuSimples = true;

        boolean condicaoMenumaior = true;
        while(condicaoMenumaior){



                System.out.println("Digite Uma das opções: " +
                        "\n 1 - Menu Produtos" +
                        "\n 2 - Menu Clientes/Fornecedores" +
                        "\n 3 - menu" +
                        "\n 0 - sair");
                int opcaoMenuMaior= sc.nextInt();
                sc.nextLine();
                switch (opcaoMenuMaior){
                    case 1:

                        while(condicaoMenuSimples){

                            int verificarQuantidadeEstoque = listaProduto.size();

//Criando o menu Simples para os testes
                            System.out.println("Escolha uma das opções" +
                                    "\n 1 - cadastrar Produtos" +
                                    "\n 2 - listar produtos cadastrado" +
                                    "\n 3 - buscar produto por nome ou codigo" +
                                    "\n 4- remover produto " +
                                    "\n 5 - alterar produto " +
                                    "\n 0 Sair");
                            int escolhaMenu = sc.nextInt();
                            sc.nextLine();



                            switch (escolhaMenu){
                                //Aqui fazemos a adição dos produtos
                                case 1:

                                    int newId = 1;
                                    String escolhaMenuProutos = "s";
                                    while(escolhaMenuProutos.equalsIgnoreCase("s")){


                                        System.out.println("Digite o nome do produto: ");
                                        String nomeProduto = sc.nextLine();

                                        System.out.println("Digite o lote do produto: ");
                                        int loteProduto = sc.nextInt();
                                        sc.nextLine();

                                        Produto newProduct = new Produto(nomeProduto, loteProduto, newId);
                                        listaProduto.add(newProduct);
                                        newId++;


                                        System.out.println(newProduct.toString());


                                        System.out.println("Digite deseja Continuar? (S/N):");
                                        escolhaMenuProutos = sc.nextLine();



                                    }

                                    for(Produto produto : listaProduto) {
                                        System.out.println(produto);
                                    }



                                    break;


                                //Aqui listamos os produtos do array
                                case 2:

                                        if(verificarQuantidadeEstoque == 0 ){
                                            System.out.println("=================================" +
                                                    "\nvoce Precisa adcionar um produto ao estoque" +
                                                    "\n ========================================");
                                        }else {
                                            for (Produto produto : listaProduto) {
                                                System.out.println(produto);
                                            }
                                        }

                                    break;

                                //Aqui fazemos uma procura pelos itens adcionados
                                case 3:

                                    if(verificarQuantidadeEstoque == 0 ){
                                        System.out.println("=================================" +
                                                "\nvoce Precisa adcionar um produto ao estoque" +
                                                "\n ========================================");
                                    }else {
                                        System.out.println("Escolha uma das opções: " +
                                                "\n 1 - procura por Nome" +
                                                "\n 2 - procura por lote");
                                        int escolhaMenuProcura = sc.nextInt();
                                        sc.nextLine();



                                        if(escolhaMenuProcura == 1){


                                            System.out.println("Digite o nome do produto: ");
                                            String nomeProdutoPesquisa = sc.nextLine();



                                            System.out.println(Produto.buscarProdutoNome(listaProduto, nomeProdutoPesquisa));

                                        }else if(escolhaMenuProcura == 2){
                                            System.out.println("Digite o lote do produto: ");
                                            int loteProdutoPesquisa = sc.nextInt();
                                            sc.nextLine();

                                            System.out.print(Produto.buscarProdutoLote(listaProduto, loteProdutoPesquisa));
                                        }
                                    }



                                break;


                                    //Aqui fazemos o menu de Delete
                                case 4:
                                    if(verificarQuantidadeEstoque == 0 ){
                                        System.out.println("=================================" +
                                                "\nvoce Precisa adcionar um produto ao estoque" +
                                                "\n ========================================");
                                    }else {
                                        System.out.println("Escolha uma das opções: " +
                                                "\n 1 - procura por Nome" +
                                                "\n 2 - procura por lote");
                                        int escolhaMenuProcuraDeletar = sc.nextInt();
                                        sc.nextLine();


                                        if(escolhaMenuProcuraDeletar == 1){

                                            for(Produto produto : listaProduto) {
                                                System.out.println(produto);
                                            }


                                            System.out.println("Digite o nome do produto: ");
                                            String nomeProdutoPesquisa = sc.nextLine();

                                            //Aqui fizemos um delete por quanntidade de produtos

                                            int quantidade = Produto.contarPorNome(listaProduto, nomeProdutoPesquisa);
                                            System.out.println(Produto.contarPorNome(listaProduto, nomeProdutoPesquisa));

                                            if(quantidade == 0){
                                                System.out.println("nenhum produto encontrado");
                                            } else if (quantidade == 1) {
                                                boolean removeu = Produto.removerPornome(listaProduto, nomeProdutoPesquisa);
                                                System.out.println(removeu ? "Produto removido com sucesso!" : "Produto não encontrado!");


                                            }else if(quantidade >= 2){

                                                System.out.println("Digite o id do produto: ");
                                                int idProdutoPesquisa = sc.nextInt();
                                                sc.nextLine();

                                                boolean removeu = Produto.removerPorId(listaProduto, idProdutoPesquisa);

                                                System.out.println(removeu ? "Produto removido com suceeso!" : "produto não removido!");

                                            }



                                            //Aqui fizemos o delete por lote

                                        }else if(escolhaMenuProcuraDeletar == 2){

                                            for(Produto produto : listaProduto) {
                                                System.out.println(produto);
                                            }

                                            System.out.println("Digite o lote do produto: ");
                                            int loteProdutoPesquisa = sc.nextInt();
                                            sc.nextLine();

                                            int quantidade = Produto.contarPorLote(listaProduto, loteProdutoPesquisa);
                                            System.out.println(Produto.buscarProdutoLote(listaProduto, loteProdutoPesquisa));

                                            if(quantidade == 0){
                                                System.out.println("nenhum produto encontrado");

                                            } else if (quantidade == 1) {

                                                boolean removeu = Produto.removerPorLote(listaProduto, loteProdutoPesquisa);
                                                System.out.println(removeu ? "Produto removido com sucesso!" : "Produto não encontrado!");


                                            }else if(quantidade >= 2){

                                                System.out.println("Digite o id do produto: ");
                                                int idProdutoPesquisa = sc.nextInt();
                                                sc.nextLine();

                                                boolean removeu = Produto.removerPorId(listaProduto, idProdutoPesquisa);

                                                System.out.println(removeu ? "Produto removido com suceeso!" : "produto não removido!");

                                            }


                                        }

                                        System.out.println("=====================================" +
                                                "\n nova Lista" +
                                                "\n===========================================");

                                        for(Produto produto : listaProduto) {
                                            System.out.println(produto);
                                        }
                                    }




                                break;

                            //Menu para alterar o nome ou o lote do Produto
                                case 5:

                                    if(verificarQuantidadeEstoque == 0 ){
                                        System.out.println("=================================" +
                                                "\nvoce Precisa adcionar um produto ao estoque" +
                                                "\n ========================================");
                                    }else {
                                        boolean escolaMenuAlterarWhile = true;
                                        while(escolaMenuAlterarWhile) {

                                            System.out.println("escolha uma das opções:" +
                                                    "\n1 - alterar nome do produto" +
                                                    "\n2 - alterar lote do produto" +
                                                    "\n0 - sair ");

                                            int escolhaMenuAlterar = sc.nextInt();
                                            sc.nextLine();

                                            switch (escolhaMenuAlterar) {
                                                case 1:
                                                    System.out.println("Digite o nome do produto: ");
                                                    String nomeProdutoAlterar = sc.nextLine();

                                                    int quantidade = Produto.contarPorNome(listaProduto, nomeProdutoAlterar);
                                                    System.out.println(Produto.buscarProdutoNome(listaProduto, nomeProdutoAlterar));

                                                    if(quantidade == 0){
                                                        System.out.println("nenhum produto encontrado");
                                                    }else if(quantidade == 1){
                                                        for(Produto produto : listaProduto) {
                                                            if(produto.getNome().equalsIgnoreCase(nomeProdutoAlterar)){
                                                                System.out.println("Digite o novo nome  do produto: ");
                                                                String novoNomeProduto = sc.nextLine();
                                                                produto.setNome(novoNomeProduto);

                                                                System.out.println("nome alterado com sucesso!");
                                                                System.out.println(Produto.buscarProdutoNome(listaProduto, novoNomeProduto));
                                                            }
                                                        }

                                                    }else{
                                                        System.out.println("Digite o id do produto q deseja alterar: ");
                                                        int idProdutoAlterar = sc.nextInt();
                                                        sc.nextLine();


                                                        for(Produto produto : listaProduto) {
                                                            if(produto.getId() == idProdutoAlterar){
                                                                System.out.println("Produto encontrado com sucesso!");
                                                                System.out.println(produto);

                                                                System.out.println("Digite o novo nome  do produto: ");
                                                                String novoNomeProduto = sc.nextLine();

                                                                produto.setNome(novoNomeProduto);
                                                                System.out.println("nome alterado com sucesso!");

                                                                break;

                                                            }
                                                        }
                                                    }

                                                    break;
                                                case 2:
                                                    System.out.println("Digite o lote do produto: ");
                                                    int loteProdutoAlterar = sc.nextInt();
                                                    sc.nextLine();

                                                    System.out.println(Produto.buscarProdutoLote(listaProduto, loteProdutoAlterar));
                                                    int quantidadeLote = Produto.contarPorLote(listaProduto,loteProdutoAlterar);

                                                    if(quantidadeLote == 0){
                                                        System.out.println("nenhum produto encontrado");
                                                    }else if(quantidadeLote == 1){
                                                        for(Produto produto : listaProduto) {
                                                            if(produto.getLote() == loteProdutoAlterar){
                                                                System.out.println("Digite o novo lote do produto: ");
                                                                int novoLoteProduto = sc.nextInt();
                                                                sc.nextLine();
                                                                produto.setLote(novoLoteProduto);

                                                                System.out.println("nome alterado com sucesso!");
                                                                System.out.println(Produto.buscarProdutoLote(listaProduto, novoLoteProduto));
                                                            }
                                                        }
                                                    }else{
                                                        System.out.println("Digite o id do produto q deseja alterar: ");
                                                        int idProdutoAlterar = sc.nextInt();
                                                        sc.nextLine();


                                                        for(Produto produto : listaProduto) {
                                                            if(produto.getId() == idProdutoAlterar){
                                                                System.out.println("Produto encontrado com sucesso!");
                                                                System.out.println(produto);

                                                                System.out.println("Digite o novo lote do produto: ");
                                                                int novoLoteProduto = sc.nextInt();

                                                                produto.setLote(novoLoteProduto);
                                                                System.out.println("lote alterado com sucesso!");

                                                                break;

                                                            }
                                                        }
                                                    }

                                                    break;

                                                case 0 :
                                                    escolaMenuAlterarWhile = false;
                                                    System.out.println("Saindo...");
                                                break;
                                        }
                                    }




                                    }

                                break;
                                case 0:

                                    condicaoMenuSimples = false;
                                    System.out.println("Voltando ao menu...");

                                    break;
                            }

                        }
                        break;
                    case 2:

                        while(condicaoMenuSimples){

                            System.out.println("Digite uma das opçoes: " +
                                    "\n 1 - Clientes" +
                                    "\n 2 - Fornecedores" +
                                    "\n 0 - voltar ao menu principal");
                            int opcaoMenuClienteFornecedor = sc.nextInt();
                            sc.nextLine();

                            switch (opcaoMenuClienteFornecedor) {
                                case 1:
                                    boolean condicaoMenuClientes = true;
                                    while(condicaoMenuClientes){
                                        System.out.println("Digite uma das opções: " +
                                                "\n 1 - Cadastrar Clientes" +
                                                "\n 2 - Listar todos os clientes" +
                                                "\n 0 - voltar ao menu Clientes/Fornecedores");
                                            int opcaoMenuClientes = sc.nextInt();
                                            sc.nextLine();


                                        switch (opcaoMenuClientes) {
                                            case 1:

                                                String condicaoMenuCadastrarClientes = "s";
                                                int idCliente = 1;

                                                while(condicaoMenuCadastrarClientes.equalsIgnoreCase("s")){
                                                    System.out.println("Digite o nome do cliente: ");
                                                    String nomeCliente = sc.nextLine();

                                                    System.out.println("Digite o cpf do cliente: ");
                                                    String cpfCliente = sc.nextLine();

                                                    System.out.println("Digite o numero de telefone do cliente:  obs: Sem pontos e traços");
                                                    int numeroCliente = sc.nextInt();
                                                    sc.nextLine();



                                                    Clientes clientes = new Clientes(nomeCliente, cpfCliente, numeroCliente, idCliente);
                                                    listaCliente.add(clientes);
                                                    idCliente++;

                                                    System.out.println("Clientes cadastrados com sucesso!");
                                                    System.out.println(listaCliente.toString());

                                                    System.out.println("Deseja cadastrar outro Cliente? (S/N)");
                                                    condicaoMenuCadastrarClientes = sc.nextLine();


                                                }

                                            break;

                                            case 2:
                                                System.out.println("Voce escolheu o menu 2");
                                            break;

                                            case 0:

                                                condicaoMenuClientes= false;
                                                System.out.println("Saindo...");
                                            break;
                                                }
                                            }
                                    }
                                break;




                        }

                        System.out.println("menu 2");
                        break;
                    case 3:
                        System.out.println("menu 3");
                        break;
                    case 0:
                        System.out.println("Saindo...");
                }

        }

    }

}











