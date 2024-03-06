import java.util.ArrayList;
import java.util.List;

public class GerenciadorUsuario {

    private List<Usuario>usuarios;

    public GerenciadorUsuario(){
        this.usuarios = new ArrayList<>();
    }

    public void registrarUsuario(String nome, Integer idade, String CPF, String telefone, String email, String senha){
        Usuario usuario = new Usuario(nome, idade, CPF, telefone, email, senha);
        this.usuarios.add(usuario);
        System.out.println("Usuario cadastrado com sucesso!");
    }
    
}
