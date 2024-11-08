package main.java.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    //atributos

    private List<Pessoa> pessoaList;

    public  OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, altura, idade));
    }

    public List<Pessoa> ordenadoPorIdade(){
        List<Pessoa> pessoasPorIdade =  new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return  pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }
    public static void main(String[] args) {
      OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
      ordenacaoPessoa.adicionarPessoa( "Nome 1", 20, 1.56);
      ordenacaoPessoa.adicionarPessoa( "Nome 2", 30, 1.90);
      ordenacaoPessoa.adicionarPessoa( "Nome 3", 25, 1.80);
      ordenacaoPessoa.adicionarPessoa( "Nome 4", 18, 1.75);

      System.out.println(ordenacaoPessoa.ordenadoPorIdade());
      System.out.println(ordenacaoPessoa.ordenarPorAltura());


    }

}
