package br.com.davidlopes.exergenerics.domain;

public abstract class Carro<T> {
    private T marca;
    private T modelo;

    public Carro(T marca, T modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public T getMarca() {
        return marca;
    }

    public void setMarca(T marca) {
        this.marca = marca;
    }

    public T getModelo() {
        return modelo;
    }

    public void setModelo(T modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + " - Modelo: - " + modelo;
    }
}
