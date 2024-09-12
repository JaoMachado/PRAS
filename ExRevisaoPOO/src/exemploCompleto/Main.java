package exemploCompleto;

public class Main {
    public static void main(String[] args) throws Exception {
        Professor professor = new Professor("Dr. Joao", "Matemática", 15);
        Biblioteca biblioteca = new Biblioteca("Biblioteca do Curso Engenharia de Software");
        Curso curso = new Curso("Engenharia de Software", 24, professor,  biblioteca);
        CursoOnline cursoOnline = new CursoOnline("Programacao Java", 6, professor, biblioteca, "Plataforma Moodle IFSP");
        Aluno aluno = new Aluno("Maria", 20, curso);
    }
}
