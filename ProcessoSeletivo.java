package org.example.atividade1;
import java.util.Scanner;

public class ProcessoSeletivo {
    public static void main(String[] args) {

        // instanciando um novo candidato
        SelecaoCandidatos candidato = new SelecaoCandidatos();

        // adicionando candidatos a lista
        candidato.addCandidato("Baruck", 1950.0);
        candidato.addCandidato("Douglas", 1850.0);
        candidato.addCandidato("Bruna", 2900.0);
        candidato.addCandidato("Jose", 2000.0);
        candidato.addCandidato("Thiago", 2300.0);
        candidato.addCandidato("Julianne", 1800.0);

        // imprimindo a lista de candidatos aprovados
        System.out.println("candidato aprovado: " +candidato.Aprovados());

        // exibir todos os candidatos e os salarios
        candidato.exibirCandidato();


    }
}