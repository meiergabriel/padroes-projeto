package br.com.gabrielmeier.padroes.estruturais.decorator;

public abstract class CafeDecoretor implements cafe {

    protected cafe cafe;

    public CafeDecoretor(cafe cafe) {
        this.cafe = cafe;
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao();
    }

    @Override
    public double getCusto() {
        return cafe.getCusto();
    }
    
    
}
