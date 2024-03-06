package Model;
public class Usuario {
    
    private String nome;
    private Integer idade;
    private String CPF;
    private String telefone;
    private String email;
    private String senha;

    public Usuario(String nome, Integer idade, String CPF, String telefone, String email, String senha) {
        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }   

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    
}
