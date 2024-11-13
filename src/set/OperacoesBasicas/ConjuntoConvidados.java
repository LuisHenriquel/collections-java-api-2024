package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    // Atributo

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();

    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }


    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidado(){
        return convidadoSet.size();
    }

    public void  exibirConvidado(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidado() + " convidados dentro do set de Convidados");

        conjuntoConvidados.adicionarConvidado("Carlos", 548652);
        conjuntoConvidados.adicionarConvidado("Luis", 528665);
        conjuntoConvidados.adicionarConvidado("Felipe", 548652);
        conjuntoConvidados.adicionarConvidado("Henrique", 652534);




        System.out.println("Existem " + conjuntoConvidados.contarConvidado() + " convidados dentro do set de Convidados");
        conjuntoConvidados.exibirConvidado();
        conjuntoConvidados.removerConvidadoPorCodigoConvite(652534);
        conjuntoConvidados.exibirConvidado();

    }



}
