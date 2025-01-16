package br.com.davidlopes.dao;


public class ClienteDaoMock implements IClienteDao {

    @Override
    public String salvar() {
        return "Sucesso";
    }
}
