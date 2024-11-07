package operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    //atributo
    private List<Tarefa> tarefaList;


    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }



    public void adicionarTarefa(String descriicao){
        tarefaList.add(new Tarefa(descriicao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }

        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    public int obterNumerosTotalTarefa(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O número total de elementos na lista é " + listaTarefa.obterNumerosTotalTarefa());
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O número total de elementos na lista é " + listaTarefa.obterNumerosTotalTarefa());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O número total de elementos na lista é " + listaTarefa.obterNumerosTotalTarefa());

        listaTarefa.obterDescricoesTarefas();
    }
}
