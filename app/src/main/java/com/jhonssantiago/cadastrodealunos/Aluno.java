package com.jhonssantiago.cadastrodealunos;

public class Aluno {
    private String nome, disciplina, curso;
    private double nota;

    public Aluno (){

    }

    public Aluno(String nome, String disciplina, String curso, double nota) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.curso = curso;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", disciplina='" + disciplina + '\'' +
                ", curso='" + curso + '\'' +
                ", nota=" + nota +
                '}';
    }
}
