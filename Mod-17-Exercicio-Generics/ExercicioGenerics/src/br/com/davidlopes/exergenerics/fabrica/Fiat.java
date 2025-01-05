package br.com.davidlopes.exergenerics.fabrica;

import br.com.davidlopes.exergenerics.domain.Carro;

public class Fiat<T> extends Carro<T> {

    public Fiat(T marca, T modelo) {
        super(marca, modelo);
    }

}
