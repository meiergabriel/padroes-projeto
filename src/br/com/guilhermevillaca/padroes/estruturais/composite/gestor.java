package br.com.guilhermevillaca.padroes.estruturais.composite;

import java.util.ArrayList;
import java.util.List;


public class gestor implements empregado {

    private String nome;
    private String cargo;
    private List<empregado> subordinados;

    public gestor(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
        this.subordinados = new ArrayList<>();
    }

    public void adicionarSubordinado (empregado empregado) {
       this.subordinados.add(empregado);
    }
    
    public void removerSubordinado (empregado empregado) {
        this.subordinados.remove(empregado);
    }
    
    @Override
    public void mostrarDetalhes() {
        System.out.println(nome + " - " + cargo);
        
        for(empregado subordinado : subordinados){
            subordinado.mostrarDetalhes();
        }
    }

}
