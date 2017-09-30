package javaapplication22;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciarAlunos {
    
    ArrayList <Aluno> listaAlunos = new ArrayList();
    
    public static void main(String[] args) {
       GerenciarAlunos ger = new GerenciarAlunos(); 
       ger.menu();
    }
    
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
        Scanner scan = new Scanner(System.in);
        System.out.println("Opção 1 - Cadastrar Aluno");
        System.out.println("Opção 2 - Cadastrar AlunoGraduação");
        System.out.println("Opção 3 - Imprmir Todos");
        System.out.println("Opção 4 - Sair ");
       
       
       int menu = scan.nextInt();
        switch (menu){
            case 1:
               System.out.println("RA:");
    }
    //Para responder os itens e.1 e e.2, considere a existência da classe AppGerenciaAlunos que contenha o método main e seja implementado um menu com 4 opções 
    //(1-Cadastrar Aluno, 2-Cadastrar AlunoGraduacao, 3-ImprimirTodos, 4- Sair).


}

