package br.com.davidlopes.fabrica.contratos;

import br.com.davidlopes.fabrica.interfaces.ICarro;

public class CarroSedan  implements ICarro {
    @Override
    public void montarChassi() {
        System.out.println("Montando o chassi do carro sedan");
    }

    @Override
    public void instalarMotor() {
        System.out.println("Instalando o motor no carro sedan");
    }

    @Override
    public void instalarRodas() {
        System.out.println("Instalando as rodas no carro sedan");
    }

    @Override
    public void aplicarPintura() {
        System.out.println("Aplicando a pintura no carro sedan");
    }
}
