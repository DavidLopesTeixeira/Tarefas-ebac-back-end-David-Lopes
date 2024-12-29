package br.com.davidlopes.fabrica;

import br.com.davidlopes.fabrica.utils.LinhaProducao;

public class App {
    public static void main(String[] args) {
        LinhaProducao.montarSedan();
        System.out.println("---- ----");
        LinhaProducao.montarSUV();

    }
}
