//Criando a Classe

public class Produto {
    int codigoProduto;
    String nomeProduto;
    double valorProduto;
    int quantidadeProduto;
    double precoTotalProduto;
 

//Criando o Construtor
   public Produto(int codigoProduto, String nomeProduto, double valorProduto, int quantidadeProduto) {
       this.codigoProduto = codigoProduto;
       this.nomeProduto = nomeProduto;
       this.valorProduto =valorProduto;
       this.quantidadeProduto = quantidadeProduto;
       this.precoTotalProduto = valorProduto * quantidadeProduto;

   }
   // Criandos os Metodos para calcular o preco total
   public double getprecoTotalProduto() {
    return valorProduto * quantidadeProduto;


   }
//Criando os Metodos Getter
   public int getCodigoProduto() {
       return codigoProduto;
   }

   public String getNomePoduto() {
       return nomeProduto;

   }
   public double ValorProduto() {
       return valorProduto;

   }
   public int getquantidadeProduto() {
       return quantidadeProduto;

   }
   
    // Criando os Metodos Setter
    public void setValorProduto(double valorProduto) {
    this.valorProduto = valorProduto;
    this.precoTotalProduto = valorProduto * quantidadeProduto;

    }

    public void setQuantidadeProduto(int quantidadeProduto) {
    this.quantidadeProduto = quantidadeProduto;
    this.precoTotalProduto = valorProduto * quantidadeProduto;

    }

}










