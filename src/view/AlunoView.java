package view;

import control.AlunoController;

import java.io.File;
import java.io.IOException;

public class AlunoView {
    private File arquivo = new File("C:/Users/autologon/Desktop/Nova Pasta/prova/alunos.csv");
    private AlunoController alunoCTRL = new AlunoController();

    public void op() throws IOException{
        // Leitura dos dados do arquivo CSV
        alunoCTRL.leitura(arquivo);

        // Processamento dos dados lidos
        alunoCTRL.processar();

        alunoCTRL.gravar(arquivo);
    }

    public void show() {
        // Exibição das estatísticas
        System.out.println("N° de alunos = " + alunoCTRL.getAlunos());
        System.out.println("Aprovados = " + alunoCTRL.getAprovados());
        System.out.println("Reprovados = " + alunoCTRL.getReprovados());
        System.out.println("Maior nota = " + alunoCTRL.getMaior());
        System.out.println("Menor nota = " + alunoCTRL.getMenor());
        System.out.println("Média Geral = " + alunoCTRL.getMedia());
    }
}
