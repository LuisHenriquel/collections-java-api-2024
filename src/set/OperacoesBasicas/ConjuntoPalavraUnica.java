package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavraUnica {
    //Atributos

    private Set<PalavraUnica> palavraUnicaSet;

    public ConjuntoPalavraUnica() {
        this.palavraUnicaSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavraUnicaSet.add(new PalavraUnica(palavra));
    }

    public void removerPalavra(String palavra){
        PalavraUnica palavraParaRemover = null;
        for(PalavraUnica p : palavraUnicaSet){
            if(p.getPalavraUnica() == palavra){
                palavraParaRemover = p;
                break;
            }

        }
        palavraUnicaSet.remove(palavraParaRemover);

    }
    public boolean verificarPalavra(String palavra) {
        return this.palavraUnicaSet.contains(palavra);
    }


    public void exibirPalavrasUnicas(){
       System.out.println(palavraUnicaSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavraUnica  conjuntoLinguagens = new ConjuntoPalavraUnica();
        conjuntoLinguagens.adicionarPalavra("Java");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("JavaScript");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("C++");
        conjuntoLinguagens.adicionarPalavra("Ruby");
        conjuntoLinguagens.exibirPalavrasUnicas();
        conjuntoLinguagens.removerPalavra("Python");
        conjuntoLinguagens.exibirPalavrasUnicas();
        conjuntoLinguagens.removerPalavra("Swift");
        System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));
        conjuntoLinguagens.exibirPalavrasUnicas();
    }


}
