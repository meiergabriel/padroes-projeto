package br.com.guilhermevillaca.padroes.estruturais.facade;

public class Principal {
    public static void main(String[] args) {
        ComputadorFacade computador = new ComputadorFacade();
        computador.iniciarComputador();
    }
}
