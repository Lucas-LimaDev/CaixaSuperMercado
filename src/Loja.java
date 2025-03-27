//Criando a Classe
public class Loja {
    private  int codigoLoja;
    private String nomeLoja;
    private String cnpjLoja;
    private String enderecoLoja;
     private String razaoSocialLoja;
 
 //Criando os Metodos
 public  Loja(int codigoLoja, String nomeLoja, String enderecoLoja, String razaoSocialLoja, String cnpjLoja ){
     this.codigoLoja = codigoLoja;
     this.nomeLoja = nomeLoja;
     this.enderecoLoja = enderecoLoja;
     this.razaoSocialLoja = razaoSocialLoja;
     this.cnpjLoja = cnpjLoja;
 }
 // Criando os Metodos Getter
  public int getcodigoLoja() {
     return codigoLoja;
  }
 public String getnomeLoja() {
     return nomeLoja;
 }
 public String getCnpjLoja() {
     return cnpjLoja;
 }
 public String getenderecoLoja() {
     return enderecoLoja;
 }
 public String getRazaoSocialLoja() {
     return razaoSocialLoja;
 
 }
 // Criando os Metodos Setter caso precise alterar algum dado
    public void setCodigoLoja(int codigoLoja) {
        this.codigoLoja = codigoLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public void setCnpjLoja(String cnpjLoja) {
        this.cnpjLoja = cnpjLoja;
    }

    public void setEnderecoLoja(String enderecoLoja) {
        this.enderecoLoja = enderecoLoja;
    }

    public void setRazaoSocialLoja(String razaoSocialLoja) {
        this.razaoSocialLoja = razaoSocialLoja;
    }
}
 
 
 
 