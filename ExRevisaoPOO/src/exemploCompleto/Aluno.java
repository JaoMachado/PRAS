package exemploCompleto;

import java.util.Random;

public class Aluno {
    private String nome;
    private int idade;
    private Curso curso;
    Random random = new Random();
    
    public Aluno(String nome, int idade, Curso curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome + ", Idade: " + idade + ", Curso: " + curso.getNome() + "\n");
    }

    public void estudar(){
        int valor = random.nextInt(2);

        if(valor < 1) {
            System.out.println("O aluno " + nome + " esta estudando!!");
        } else {
            System.out.println("O aluno " + nome + " nao esta estudando!!");
        }

    }
    
    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
