import java.util.ArrayList;
import java.util.List;

public class Evento {
    
    private String nome;
    private String descricao;
    private String hora;
    private String endereco;
    private String categoria;
    private List<Usuario>usuarios;

public Evento (String nome, String descricao, String hora, String endereco, String categotia){
    this.nome = nome;
    this.descricao = descricao;
    this.hora = hora;
    this.endereco = endereco;
    this.categoria = categoria;
    this.usuarios = new ArrayList<>();
}
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    
}
