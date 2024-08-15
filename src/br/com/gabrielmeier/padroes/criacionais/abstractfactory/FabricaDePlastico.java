package br.com.gabrielmeier.padroes.criacionais.abstractfactory;

import br.com.gabrielmeier.padroes.criacionais.abstractfactory.bichos.Raposa;
import br.com.gabrielmeier.padroes.criacionais.abstractfactory.bichos.Ursinho;
import br.com.gabrielmeier.padroes.criacionais.abstractfactory.bichos.RaposaDePlastico;
import br.com.gabrielmeier.padroes.criacionais.abstractfactory.bichos.UrsinhoDePlastico;
import br.com.gabrielmeier.padroes.criacionais.abstractfactory.bichos.CoelhoDePlastico;
import br.com.gabrielmeier.padroes.criacionais.abstractfactory.bichos.Coelho;
import br.com.gabrielmeier.padroes.criacionais.abstractfactory.bichos.Porco;
import br.com.gabrielmeier.padroes.criacionais.abstractfactory.bichos.PorcoDePlastico;

/**
 *
 * @author guilherme.villaca
 */
public class FabricaDePlastico implements FabricaDeBrinquedo{

    @Override
    public Ursinho criarUrsinho() {
        return new UrsinhoDePlastico();
    }

    @Override
    public Coelho criarCoelho() {
        return new CoelhoDePlastico();
    }

    @Override
    public Raposa criarRaposa() {
        return new RaposaDePlastico();
    }

    @Override
    public Porco criarPorco() {
        return new PorcoDePlastico();
    }

}
