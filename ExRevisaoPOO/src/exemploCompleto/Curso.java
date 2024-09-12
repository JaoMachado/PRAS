package exemploCompleto;

public class Curso {
    protected String nome;
    protected int duracaoMeses;
    protected Professor professor;
    protected Biblioteca biblioteca;

    public Curso(String nome, int duracaoMeses, Professor professor, Biblioteca biblioteca) {
        this.nome = nome;
        this.duracaoMeses = duracaoMeses;
        this.professor = professor;
        this.biblioteca = biblioteca;
    }

    public void iniciarAulas(){
        System.out.println("Curso " + nome + " iniciado com duracao de " + duracaoMeses + " meses." + "\n");
    }

    public void ExibirInformacoes(){
        System.out.println("Curso: " + nome + ", Duracao: " + duracaoMeses + " meses, Professor: " + professor.getNomeProfessor() + "\nBiblioteca associada: " + biblioteca.getNome() + "\n");
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
