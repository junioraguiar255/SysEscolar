
package model;

public class Aluno {
    private String matricula;
    private String nome;
    private String cpf;

    public Aluno(String matricula, String nome, String cpf) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}
