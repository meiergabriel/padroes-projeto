package br.com.guilhermevillaca.padroes.estruturais.decorator;

public class Principal {
    public static void main(String[] args) {
        cafe meuCafe = new CafeSimples();
        System.out.println(meuCafe.getDescricao() + " custa " + meuCafe.getCusto());
        
        meuCafe = new leite(meuCafe);
        System.out.println(meuCafe.getDescricao() + " custa " + meuCafe.getCusto());
        
        meuCafe = new acucar(meuCafe);
        System.out.println(meuCafe.getDescricao() + " custa " + meuCafe.getCusto());

    }
}
