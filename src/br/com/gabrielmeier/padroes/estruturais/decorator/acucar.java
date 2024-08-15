package br.com.gabrielmeier.padroes.estruturais.decorator;

public class acucar extends CafeDecoretor {
    
    public acucar(br.com.gabrielmeier.padroes.estruturais.decorator.cafe cafe) {
        super(cafe);
    }

    @Override
    public double getCusto() {
        return cafe.getCusto() + 2.99;
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + " açucar"; 
    }
    
}
