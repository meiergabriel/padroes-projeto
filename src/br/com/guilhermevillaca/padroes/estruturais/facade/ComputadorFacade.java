package br.com.guilhermevillaca.padroes.estruturais.facade;

public class ComputadorFacade {

    private Memoria memoria;
    private Dispositivo dispositivo;
    private SistemaOperacional sistema;

    public ComputadorFacade() {
        this.memoria = new Memoria();
        this.dispositivo = new Dispositivo();
        this.sistema = new SistemaOperacional();
    }
    
    public void iniciarComputador() {
        System.out.println("iniciando compuiter...");
        memoria.verificarMemoria();
        dispositivo.inicializarDispositivo();
        sistema.carregandoSistemaOperacional();
        System.out.println("compuiter iniciado com sucesso");
    }
}
