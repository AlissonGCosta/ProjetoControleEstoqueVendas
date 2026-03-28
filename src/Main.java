import Produto.Produto;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean condicaoMenuSimples = true;
        ArrayList<Produto> listaProduto = new ArrayList<>();

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

                        for (Produto produtoadcionado : listaProduto) {
                            System.out.println(produtoadcionado.getNome());
                            System.out.println(produtoadcionado.getLote());
                            System.out.println(produtoadcionado.getId());

                        }

                        System.out.println("Digite deseja Continuar? (S/N):");
                        escolhaMenuProutos = sc.nextLine();



                    }

                    for(Produto produto : listaProduto) {
                        System.out.println(produto.getNome());
                        System.out.println(produto.getLote());
                        System.out.println(produto.getId());
                    }



                    break;
                case 2:
                    System.out.println("escolheu o 2");
                    break;
                case 3:
                    System.out.println("escolheu o 3");
                    break;
                case 4:
                    System.out.println("escolheu o 4");
                    break;
                case 0:

                    condicaoMenuSimples = false;
                    System.out.println("Saindo...");

                    break;
            }

        }
    }
}
