package br.com.gabrielmeier.padroes.estruturais.bridge;

public interface Dispositivo {
    
    void ligar();
    
    void desligar();
    
    void aumentarVolume();
    
    void diminuirVolume();
    
    boolean ligado();
   
    void silenciar();
}
