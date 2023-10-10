package org.example.atividade1;

public class Candidato {
    String nome;
    Double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Candidato(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return
                nome + '\'' +
                ", salario: " + salario ;
    }
}
