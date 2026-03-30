import Produto.Produto;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean condicaoMenuSimples = true;
        ArrayList<Produto> listaProduto = new ArrayList<>();;

        boolean condicaoMenumaior = true;
        while(condicaoMenumaior){
                System.out.println("Digite Uma das opções: " +
                        "\n 1 - menu" +
                        "\n 2 - menu" +
                        "\n 3 - menu" +
                        "\n 0 - sair");
                int opcaoMenuMaior= sc.nextInt();
                sc.nextLine();
                switch (opcaoMenuMaior){
                    case 1:
                        while(condicaoMenuSimples){

//Criando o menu Simples para os testes
                            System.out.println("Escolha uma das opções" +
                                    "\n 1 - cadastrar Produtos" +
                                    "\n 2 - listar produtos cadastrado" +
                                    "\n 3 - buscar produto por nome ou codigo" +
                                    "\n 4- remover produto " +
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

                                    for(Produto produto : listaProduto) {
                                        System.out.println(produto);
                                    }
                                    break;

                                //Aqui fazemos uma procura pelos itens adcionados
                                case 3:

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


                                    //Aqui fazemos o menu de Delete
                                case 4:

                                    System.out.println("Escolha uma das opções: " +
                                            "\n 1 - procura por Nome" +
                                            "\n 2 - procura por lote");
                                    int escolhaMenuProcuraDeletar = sc.nextInt();
                                    sc.nextLine();

                                    int quantidade = 0;

                                    if(escolhaMenuProcuraDeletar == 1){

                                        for(Produto produto : listaProduto) {
                                            System.out.println(produto);
                                        }


                                        System.out.println("Digite o nome do produto: ");
                                        String nomeProdutoPesquisa = sc.nextLine();

                                        //Aqui fizemos um delete por quanntidade de produtos

                                        for(int i = 0 ; i < listaProduto.size(); i++){
                                            if(listaProduto.get(i).getNome().equals(nomeProdutoPesquisa)){
                                                quantidade++;
                                                System.out.println("Encontrado:");
                                                System.out.println(listaProduto.get(i).toString());

                                            }


                                        }

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

                                        for(int i = 0 ; i < listaProduto.size(); i++){
                                            if(listaProduto.get(i).getLote()== loteProdutoPesquisa){
                                                quantidade++;
                                                System.out.println("Encontrado:");
                                                System.out.println(listaProduto.get(i).toString());
                                            }
                                        }
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


                                    break;
                                case 0:

                                    condicaoMenuSimples = false;
                                    System.out.println("Voltando ao menu...");

                                    break;
                            }

                        }
                        break;
                    case 2:
                        System.out.println("menu 2");
                        break;
                    case 3:
                        System.out.println("menu 3");
                        break;
                    case 0:
                        System.out.println("Saindo...");
                }

        }

        while(condicaoMenuSimples){

//Criando o menu Simples para os testes
            System.out.println("Escolha uma das opções" +
                    "\n 1 - cadastrar Produtos" +
                    "\n 2 - listar produtos cadastrado" +
                    "\n 3 - buscar produto por nome ou codigo" +
                    "\n 4- remover produto " +
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

                    for(Produto produto : listaProduto) {
                            System.out.println(produto);
                    }
                    break;

            //Aqui fazemos uma procura pelos itens adcionados
                case 3:

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


                //Aqui fazemos o menu de Delete
                case 4:

                    System.out.println("Escolha uma das opções: " +
                            "\n 1 - procura por Nome" +
                            "\n 2 - procura por lote");
                    int escolhaMenuProcuraDeletar = sc.nextInt();
                    sc.nextLine();

                    int quantidade = 0;

                    if(escolhaMenuProcuraDeletar == 1){

                        for(Produto produto : listaProduto) {
                            System.out.println(produto);
                        }


                        System.out.println("Digite o nome do produto: ");
                        String nomeProdutoPesquisa = sc.nextLine();

                        //Aqui fizemos um delete por quanntidade de produtos

                        for(int i = 0 ; i < listaProduto.size(); i++){
                            if(listaProduto.get(i).getNome().equals(nomeProdutoPesquisa)){
                                quantidade++;
                                System.out.println("Encontrado:");
                                System.out.println(listaProduto.get(i).toString());

                            }


                        }

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

                        for(int i = 0 ; i < listaProduto.size(); i++){
                            if(listaProduto.get(i).getLote()== loteProdutoPesquisa){
                                quantidade++;
                                System.out.println("Encontrado:");
                                System.out.println(listaProduto.get(i).toString());
                            }
                        }
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


                    break;
                case 0:

                    condicaoMenuSimples = false;
                    System.out.println("Saindo...");

                    break;
            }

        }

    }





}


