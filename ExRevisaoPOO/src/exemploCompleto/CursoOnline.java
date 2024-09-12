package exemploCompleto;

public class CursoOnline extends Curso {
    private String plataforma;

    public CursoOnline(String nome, int duracaoMeses, Professor professor, Biblioteca biblioteca, String plataforma) {
        super(nome, duracaoMeses, professor, biblioteca);
        this.plataforma = plataforma;
    }

    public CursoOnline(String nome, int duracaoMeses, Professor professor, Biblioteca biblioteca) {
        super(nome, duracaoMeses, professor, biblioteca);
    }

    public void ExibirInformacoes(){
        System.out.println("Curso: " + getNome() + ", Duracao: " + getDuracaoMeses() + " meses, Professor: " + professor.getNomeProfessor() + "\nPlataforma do curso online: " + getPlataforma() + "\n");
    }

    public String getPlataforma() {
        return plataforma;
    }
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

}
