package br.com.gabrielmeier.padroes.estruturais.adapter;

public interface SistemaPagamentoNovo {

    void processarPagamento(String clienteId, double valor);
}
