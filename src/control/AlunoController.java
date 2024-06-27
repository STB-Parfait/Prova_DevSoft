package control;

import model.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AlunoController {

    List<Aluno>listaDeAlunos = new ArrayList<>();

    int aprovados = 0;
    int reprovados = 0;
    Double maior = 0.0;
    Double menor = 0.0;
    Double media = 0.0;
    int alunos = 0;

    public void leitura(File lista) throws FileNotFoundException{
        Scanner scanner = new Scanner(lista);
        while(scanner.hasNextLine()){
            String linha = scanner.nextLine();
            String valores[] = linha.split(";");
            String a = "";
            String b = "";
            String c = "";
            a = valores[0];
            b = valores[1];
            c = valores[2];
            Aluno aluno = new Aluno(a,b,c);
            listaDeAlunos.add(aluno);
        }
        scanner.close();
    }

    public void processar(){
        //número de alunos
        int alunos = listaDeAlunos.size();
        int count = 0;

        Double n;
        for(Aluno aluno : listaDeAlunos){

            count++;

            n = Double.parseDouble(aluno.getNota());

            //maior nota
            if(n>maior){
                maior = n;
            }
            //menor nota
            if(count==1){
                menor = n;
            }
            else if(count>1){
                if(n<menor){
                    menor = n;
                }
            }
            //N° aprovados
            if(n>=6){
                aprovados++;
            }
            //N° reprovados
            else{
                reprovados++;
            }
            //Média geral
            media = media+n;
        }
        media = media/alunos;
        
    }

    public int getAprovados() {
        return aprovados;
    }

    public void setAprovados(int aprovados) {
        this.aprovados = aprovados;
    }

    public int getReprovados() {
        return reprovados;
    }

    public void setReprovados(int reprovados) {
        this.reprovados = reprovados;
    }

    public Double getMaior() {
        return maior;
    }

    public void setMaior(Double maior) {
        this.maior = maior;
    }

    public Double getMenor() {
        return menor;
    }

    public void setMenor(Double menor) {
        this.menor = menor;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public int getAlunos() {
        return alunos;
    }

    public void setAlunos(int alunos) {
        this.alunos = alunos;
    }

    public void gravar(File arquivo) throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo));
        writer.write("N° de alunos = " + alunos);
        writer.write("Aprovados = " + aprovados);
        writer.write("Reprovados = " + reprovados);
        writer.write("Maior nota = " + maior);
        writer.write("Menor nota = " + menor);
        writer.write("Média Geral = " + media);
    }

    
}
