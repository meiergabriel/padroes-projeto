package br.com.gabrielmeier.padroes.estruturais.flyweight;

public class Principal {
    
    private static final String[] cores = {
        "Verde", 
        "Branco", 
        "Azul", 
        "Preto", 
        "Rosa",
        "Amarelo"};
    
    public static void main(String[] args) {
        
        for (int  i = 0;  i < 20;  i++) {
            Circulo circulo = (Circulo) FormaFactory.getCirculo(getCorAleatoria());
            circulo.setX(getCoordenadaAleatoria());
            circulo.setY(getCoordenadaAleatoria());
            circulo.setRaio(12);
            circulo.desenhar();
            System.out.println("--------");
        }
        
    }
    
    private static String getCorAleatoria(){
        int aleatorio = (int) (Math.random() * cores.length);
        return cores[aleatorio];
    }
    
    private static int getCoordenadaAleatoria(){
        int aleatorio = (int) (Math.random() * 100);
        return aleatorio;
    }
}
