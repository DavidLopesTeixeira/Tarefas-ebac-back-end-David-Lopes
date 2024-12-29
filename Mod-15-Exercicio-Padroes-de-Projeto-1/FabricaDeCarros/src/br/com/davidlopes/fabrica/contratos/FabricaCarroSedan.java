package br.com.davidlopes.fabrica.contratos;

import br.com.davidlopes.fabrica.interfaces.ICarro;
import br.com.davidlopes.fabrica.interfaces.IFabricaCarro;

public class FabricaCarroSedan implements IFabricaCarro {
    @Override
    public ICarro criarCarro() {
        return  new CarroSedan();
    }
}
