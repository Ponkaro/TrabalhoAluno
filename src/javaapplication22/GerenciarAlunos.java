package javaapplication22;

import java.util.ArrayList;

public class GerenciarAlunos {
    
    ArrayList <Aluno> listaAlunos = new ArrayList();
    
    public void adicionarAluno(Aluno a){
        listaAlunos.add(a);
    }
    public void imprimirTodos(){
        String saida = "";
        if(listaAlunos.isEmpty()){
            saida = "Nenhum aluno cadastrado";
        }else{
            for(Aluno a: listaAlunos){
                saida = saida + a.imprimir()+"\n";
            }
        }
    }
    public void menu(){
        
    }
    //Para responder os itens e.1 e e.2, considere a existência da classe AppGerenciaAlunos que contenha o método main e seja implementado um menu com 4 opções 
    //(1-Cadastrar Aluno, 2-Cadastrar AlunoGraduacao, 3-ImprimirTodos, 4- Sair).


}

