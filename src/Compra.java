
public class Compra {

    public static void main(String[] args) {
        System.out.println("CUPOM FISCAL "+"\n");

        // Declarando Objetos
        Loja superAL = new Loja(2258, "SuperMercado Almeida e Silva", "Rua das Laranjeiras, 127", "Supermercado Almeida e Silva S/A", "50060075810000");
        Cliente lucas = new Cliente("Yara Tavares", 698574, "07.03.2025", "123.456.789-00");

        Produto produto01 = new Produto(587, "Arroz", 35.99, 10);
        Produto produto02 = new Produto(321, "Feijão", 10.99, 5);
        Produto produto03 = new Produto(223, "Açúcar", 19.99, 3);
        Produto produto04 = new Produto(187, "Sal", 1.99, 10);

        // Calculando o total de itens e o valor total
        int itens = produto01.quantidadeProduto + produto02.quantidadeProduto + produto03.quantidadeProduto + produto04.quantidadeProduto;
        // declarando variaveis
        double valor1 = produto01.valorProduto * produto01.quantidadeProduto;
        double valor2 = produto02.valorProduto * produto02.quantidadeProduto;
        double valor3 = produto03.valorProduto * produto03.quantidadeProduto;
        double valor4 = produto04.valorProduto * produto04.quantidadeProduto;
        double precoTotalProduto = valor1 + valor2 + valor3 + valor4;

        // Imprimindo dados da loja
        System.out.println("Loja: " + superAL.getnomeLoja());
        System.out.println("CNPJ: " + superAL.getCnpjLoja());
        System.out.println("Endereço: " + superAL.getenderecoLoja());
        System.out.println("Razão Social: " + superAL.getRazaoSocialLoja() + "\n");

        // Imprimindo dados do cliente
        System.out.println("Cliente: " + lucas.getNomeCliente());
        System.out.println("Código Cliente: " + lucas.getCodigoCliente());
        System.out.println("Data de Cadastro: " + lucas.getDataCadastro());
        System.out.println("CPF/CNPJ: " + lucas.getCpfCnpj() + "\n");

        // Imprimindo dados dos produtos
        System.out.println("Produtos Comprados:");
        imprimirProduto(produto01);
        imprimirProduto(produto02);
        imprimirProduto(produto03);
        imprimirProduto(produto04);

        // Imprimindo totais
        System.out.printf("\nSubtotal: R$%.2f\n", precoTotalProduto);
        System.out.println("Total de Itens: " + itens);
        System.out.printf("Total a pagar: R$%.2f\n", precoTotalProduto);
        System.out.println("\nVolte sempre! Agradecemos por comprar conosco!");
    }

    // Método auxiliar para imprimir informações do produto
    public static void imprimirProduto(Produto produto) {
        System.out.println("Produto: " + produto.nomeProduto);
        System.out.println("Quantidade: " + produto.quantidadeProduto);
        System.out.println("Valor unitário: R$" + produto.valorProduto);
        System.out.println("----------------------");
    }
}