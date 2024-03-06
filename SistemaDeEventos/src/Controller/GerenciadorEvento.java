package Controller;
import java.util.ArrayList;
import java.util.List;

import Model.Evento;

public class GerenciadorEvento {
    
    private List<Evento>eventos;

    public GerenciadorEvento(){
        eventos = new ArrayList<>();
    }

    public void registrarEvento(String nome, String descricao, String hora, String endereco, String categotia){
        Evento evento = new Evento(nome, descricao, hora, endereco, categotia);
        eventos.add(evento);
        System.out.println("Evento cadastrado com sucesso!");   
       
   }  
}