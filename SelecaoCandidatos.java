package org.example.atividade1;

import java.util.*;

public class SelecaoCandidatos {

    private List<Candidato> selecaoCandidatos;

    public SelecaoCandidatos() {
        this.selecaoCandidatos = new LinkedList<>();
    }
    // o metodo abaixo adiciona candidatos a lista 'selecaoCandidatos
    public void addCandidato(String nome, Double salario){
        selecaoCandidatos.add(new Candidato(nome, salario));
    }

    // o metodo abaixo exibe os candidatos
    public void exibirCandidato(){
        System.out.println(selecaoCandidatos);
    }

    // o metodo cria uma nova lista com os candidatos que se adequam ao salario proposto caso contrario retorna um
    // aviso.
    public List<Candidato> Aprovados(){
        List<Candidato> aprovadosList = new ArrayList<>();
        for(Candidato c : selecaoCandidatos){
            if(c.getSalario() >= 1800.0 && c.getSalario() <= 2000.0){
                aprovadosList.add(c);

            } else if (c.getSalario() > 2000.0) {
                System.out.println("ligar para candidato " + c.getNome());

            } else {
                System.out.println("aguardando resultado dos demais candidatos");
            }
        }
        return aprovadosList;


    }







}
