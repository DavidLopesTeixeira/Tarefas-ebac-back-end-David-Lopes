package br.com.davidlopes.fabrica.contratos;

import br.com.davidlopes.fabrica.interfaces.ICarro;

public class CarroSUV  implements ICarro {
    @Override
    public void montarChassi() {
        System.out.println("Montando o chassi do carro SUV");
    }

    @Override
    public void instalarMotor() {
        System.out.println("Instalando o motor no carro SUV");
    }

    @Override
    public void instalarRodas() {
        System.out.println("Instalando as rodas no carro SUV");
    }

    @Override
    public void aplicarPintura() {
        System.out.println("Aplicando a pintura no carro SUV");
    }
}
