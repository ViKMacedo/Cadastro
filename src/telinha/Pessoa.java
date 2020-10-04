package telinha;

public class Pessoa {
    private int Id; 
    private String Nome;
    private String Sexo;
    private String CPF;
    private String Endereço;
    private String Cidade;
    private String Estado;

    public Pessoa(String Nome, String Sexo, String CPF, String Endereço, String Cidade, String Estado) {
        this.Nome = Nome;
        this.Sexo = Sexo;
        this.CPF = CPF;
        this.Endereço = Endereço;
        this.Cidade = Cidade;
        this.Estado = Estado;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereço() {
        return Endereço;
    }

    public void setEndereço(String Endereço) {
        this.Endereço = Endereço;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
}