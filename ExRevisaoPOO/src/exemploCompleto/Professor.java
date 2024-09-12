package exemploCompleto;

public class Professor {
    private String nomeProfessor;
    private String especialidade;
    private int anosExperiencia;
    
    public Professor(String nomeProfessor, String especialidade, int anosExperiencia) {
        this.nomeProfessor = nomeProfessor;
        this.especialidade = especialidade;
        this.anosExperiencia = anosExperiencia;
    }

    public void ensinar(){

    }

    public int avaliarAluno(Aluno aluno){
        return 1;
    }

    public void exibirPerfil(){
        System.out.println("Professor: " + nomeProfessor + ", Especialidade: " + especialidade + ", Anos de experiencia: " + anosExperiencia + "\n");
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }
    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }
    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }


}
