package br.com.guilhermevillaca.padroes.estruturais.decorator;

public class CafeSimples implements cafe{

    @Override
    public String getDescricao() {
        return "cafe simples";
    }

    @Override
    public double getCusto() {
        return 2.00;
    }

}
