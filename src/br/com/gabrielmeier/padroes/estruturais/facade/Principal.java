package br.com.gabrielmeier.padroes.estruturais.facade;

public class Principal {
    public static void main(String[] args) {
        ComputadorFacade computador = new ComputadorFacade();
        computador.iniciarComputador();
    }
}
