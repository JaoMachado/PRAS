package exemploCompleto;

import java.util.Random;

public class Professor {
    private String nome;
    private String especialidade;
    private int anosExperiencia;
    Random random = new Random();
    
    public Professor(String nome, String especialidade, int anosExperiencia) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.anosExperiencia = anosExperiencia;
    }

    public void ensinar(){
        int valor = random.nextInt(10);

        if(valor % 2 == 0) {
            System.out.println("O professor(a) " + nome + " esta ensinando!!");
        } else {
            System.out.println("O professor(a) " + nome + " nao esta ensinando!!");
        }
    }

    public void avaliarAluno(Aluno aluno){
        int valor = random.nextInt(10);
        System.out.println("O aluno(a) " + aluno.getNome() + " recebe nota: " + valor + ".");
    }

    public void exibirPerfil(){
        System.out.println("Professor: " + nome + ", Especialidade: " + especialidade + ", Anos de experiencia: " + anosExperiencia + "\n");
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }
    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }


}
