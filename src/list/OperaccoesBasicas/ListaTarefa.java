package list.OperaccoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
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

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricaoTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args){
        ListaTarefa listaTarefa = new ListaTarefa();
        listaTarefa.adicionarTarefa("teste 1");
        listaTarefa.adicionarTarefa("teste 2");
        listaTarefa.adicionarTarefa("teste 3");
        listaTarefa.removerTarefa("teste 2");
        System.out.println(listaTarefa.obterNumeroTotalTarefas());
    }
}
