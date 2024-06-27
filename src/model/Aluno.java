package model;
public class Aluno {


    private String matricula;
    private String nome;
    private String nota;

    public Aluno(){
        
    }

    public Aluno(String matricula, String nome, String nota){
        this.matricula = matricula;
        this.nome = nome;
        this.nota = nota;
    }


    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNota() {
        return nota;
    }
    public void setNota(String nota) {
        this.nota = nota;
    }
    
}
