package exemploCompleto;

public class Curso {
    private String nome;
    private int duracaoMeses;
    private Professor professor;
    private Biblioteca biblioteca;

    public Curso(String nome, int duracaoMeses, Professor professor, Biblioteca biblioteca) {
        this.nome = nome;
        this.duracaoMeses = duracaoMeses;
        this.professor = professor;
        this.biblioteca = biblioteca;
    }

    public void iniciarAulas(){

    }

    public void ExibirInformacoes(){

    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getDuracaoMeses() {
        return duracaoMeses;
    }
    public void setDuracaoMeses(int duracaoMeses) {
        this.duracaoMeses = duracaoMeses;
    }
    
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
