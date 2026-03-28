# Atividade: Sistema de Controle de Estoque e Vendas

## Descricao

Depois de desenvolver um sistema de cadastro de produtos, o proximo passo e criar uma aplicacao mais completa, com mais regras de negocio e maior organizacao do codigo. Nesta atividade, a proposta e desenvolver um **Sistema de Controle de Estoque e Vendas**, capaz de registrar produtos, clientes, fornecedores, movimentacoes de estoque e vendas realizadas.

O objetivo e simular um sistema usado por uma pequena empresa para acompanhar seu estoque e controlar as vendas de forma organizada. O projeto deve permitir nao apenas cadastrar dados, mas tambem aplicar validacoes, atualizar quantidades disponiveis e registrar o historico das operacoes realizadas.

## Objetivo Geral

Desenvolver um sistema em Java para gerenciar produtos, clientes, fornecedores, estoque e vendas, aplicando conceitos de programacao orientada a objetos, colecoes, validacoes e organizacao em classes.

## Objetivos Especificos

- Criar o cadastro de produtos com informacoes relevantes para o controle de estoque.
- Permitir o cadastro de clientes e fornecedores.
- Registrar entradas e saidas de produtos no estoque.
- Realizar vendas e atualizar automaticamente a quantidade disponivel.
- Exibir consultas e relatorios basicos do sistema.
- Trabalhar com regras de negocio mais proximas de um sistema real.

## Requisitos Funcionais

O sistema deve possuir, no minimo, as seguintes funcionalidades:

1. Cadastrar produto.
2. Listar produtos cadastrados.
3. Buscar produto por nome ou codigo.
4. Atualizar dados de um produto.
5. Remover produto, quando permitido.
6. Cadastrar cliente.
7. Listar clientes cadastrados.
8. Cadastrar fornecedor.
9. Listar fornecedores cadastrados.
10. Registrar entrada de produtos no estoque.
11. Registrar saida de produtos no estoque.
12. Realizar venda de um ou mais produtos.
13. Calcular o valor total da venda.
14. Reduzir automaticamente o estoque apos a venda.
15. Exibir historico de movimentacoes.
16. Alertar quando um produto estiver com estoque baixo.

## Regras de Negocio

- Nenhum produto pode ter preco menor ou igual a zero.
- A quantidade em estoque nao pode ser negativa.
- Uma venda so pode ser concluida se houver quantidade suficiente em estoque.
- Toda entrada ou saida deve ficar registrada no historico.
- O sistema deve calcular o total da venda com base na quantidade e no preco dos itens.
- O alerta de estoque baixo deve aparecer quando a quantidade do produto ficar abaixo de um valor definido pelo sistema.

## Requisitos Minimos de Modelagem

O projeto pode ser organizado com classes como:

- `Produto`
- `Cliente`
- `Fornecedor`
- `Venda`
- `ItemVenda`
- `MovimentacaoEstoque`
- `Main` ou `Sistema`

Se quiser melhorar a organizacao, tambem pode separar classes de servico, como:

- `ProdutoService`
- `VendaService`
- `EstoqueService`

## Sugestao de Atributos

### Produto

- codigo
- nome
- preco
- quantidadeEmEstoque
- estoqueMinimo

### Cliente

- codigo
- nome
- cpf ou documento

### Fornecedor

- codigo
- nome
- cnpj ou documento

### ItemVenda

- produto
- quantidade
- subtotal

### Venda

- codigo
- cliente
- lista de itens
- valorTotal
- data

### MovimentacaoEstoque

- produto
- tipoMovimentacao
- quantidade
- data
- observacao

## Requisitos Nao Funcionais

- O sistema deve ser executado em modo texto, com menu no terminal.
- O codigo deve ser organizado em classes bem definidas.
- Deve haver tratamento basico para entradas invalidas do usuario.
- Os nomes das variaveis e metodos devem ser claros.

## Desafios Extras

Se quiser deixar o projeto ainda mais completo, voce pode implementar:

- Login de usuario com perfil `admin` e `funcionario`
- Persistencia em arquivo
- Persistencia em banco de dados
- Relatorio de vendas por periodo
- Relatorio de produtos mais vendidos
- Filtro de produtos com estoque baixo
- Cancelamento de venda com retorno ao estoque

## Resultado Esperado

Ao final da atividade, o sistema deve ser capaz de controlar o cadastro de produtos e pessoas envolvidas no processo, registrar movimentacoes no estoque e realizar vendas com atualizacao automatica das quantidades. Com isso, o projeto se torna um passo acima de um CRUD simples, exigindo mais planejamento, modelagem e aplicacao de regras de negocio.

## Criterios de Avaliacao

- Funcionamento correto das funcionalidades principais
- Boa organizacao das classes
- Uso adequado de orientacao a objetos
- Aplicacao correta das regras de negocio
- Clareza e legibilidade do codigo
- Tratamento de erros e entradas invalidas
