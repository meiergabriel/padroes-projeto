package br.com.guilhermevillaca.padroes.estruturais.composite;

public class main {
    public static void main(String[] args) {
        empregado funcinario = new Funcionario("Robson", "Estagiario");
        empregado funcinario2 = new Funcionario("Ricardo", "Doutor");

        gestor gestor1 = new gestor("Erico", "Chefao");
        gestor1.adicionarSubordinado(funcinario);
        gestor1.adicionarSubordinado(funcinario2);
        
//        gestor1.mostrarDetalhes();

        empregado funcionario3 = new Funcionario("Marta", "Futebolista");

        gestor diretor = new gestor ("Eduardo", "Tecnologia");
        
        diretor.adicionarSubordinado(gestor1);
        
        System.out.println("Detalhes da estrutura ");
        diretor.mostrarDetalhes();
    }
}
