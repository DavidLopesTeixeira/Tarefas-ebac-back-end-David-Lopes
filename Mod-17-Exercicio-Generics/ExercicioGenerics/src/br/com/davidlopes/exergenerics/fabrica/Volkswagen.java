package br.com.davidlopes.exergenerics.fabrica;

import br.com.davidlopes.exergenerics.domain.Carro;

public class Volkswagen<T> extends Carro<T> {
    public Volkswagen(T marca, T modelo) {
        super(marca, modelo);
    }
}
