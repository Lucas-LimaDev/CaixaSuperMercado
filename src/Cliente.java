//Criando a Classe
public class Cliente {
    private String nomeCliente;
    private int codigoCliente;
    private  String dataCadastro;
    private String cpfCnpj;


    // Criando os Metodos
    public Cliente(String nomeCliente, int codigoCliente, String dataCadastro, String cpfCnpj) {
            this.nomeCliente = nomeCliente;
            this.codigoCliente = codigoCliente;
            this.dataCadastro = dataCadastro;
            this.cpfCnpj = cpfCnpj;

    }
    // Criando os Métodos gets
    public String getNomeCliente() {
        return nomeCliente;

    }

    public int getCodigoCliente() {
        return codigoCliente;


    }

    public String getCpfCnpj() {
        return cpfCnpj;

}
    public String getDataCadastro() {
        return dataCadastro;

    }

    //Criando os Metodos setter
     public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}



