package main.java.set.Pesquisa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class agendaContato {

    private Set<Contato> contatoSet;

    public agendaContato() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }
    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novonumero){
        Contato contatoAtalizado = null;
        for(Contato c: contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novonumero);
                contatoAtalizado = c;
                break;
            }
        }
        return contatoAtalizado;
    }


    public static void main(String[] args) {
        agendaContato agendacontato = new agendaContato();

        agendacontato.exibirContato();

        agendacontato.adicionarContato("Camila", 1234567);
        agendacontato.adicionarContato("Camila", 5665);
        agendacontato.adicionarContato("Camila Cavalcante", 1111111);
        agendacontato.adicionarContato("Camila Dio", 654987);
        agendacontato.adicionarContato("Maria Silva", 1111111);

        agendacontato.exibirContato();

       System.out.println(agendacontato.pesquisarPorNome("Maria"));

       System.out.println("Contato atualizado: " + agendacontato.atualizarNumeroContato("Maria Silva", 5555555));

       agendacontato.exibirContato();
    }

}
