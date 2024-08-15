package br.com.gabrielmeier.padroes.estruturais.decorator;

public class leite extends CafeDecoretor {

    public leite(br.com.gabrielmeier.padroes.estruturais.decorator.cafe cafe) {
        super(cafe);
    }

    @Override
    public double getCusto() {
        return cafe.getCusto() + 4.33; 
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + " leite"; 
    }
    
}
