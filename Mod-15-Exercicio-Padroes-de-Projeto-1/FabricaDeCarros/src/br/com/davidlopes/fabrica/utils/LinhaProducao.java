package br.com.davidlopes.fabrica.utils;

import br.com.davidlopes.fabrica.contratos.FabricaCarroSUV;
import br.com.davidlopes.fabrica.contratos.FabricaCarroSedan;
import br.com.davidlopes.fabrica.interfaces.ICarro;
import br.com.davidlopes.fabrica.interfaces.IFabricaCarro;

public class LinhaProducao {

    public static void montarSedan(){
        IFabricaCarro fabricaSedan = new FabricaCarroSedan();
        ICarro carroSedan = fabricaSedan.criarCarro();

        try{
            System.out.println("Iniciamos a produção do chassi...");
            carroSedan.montarChassi();
            Thread.sleep(3000);
            System.out.println("Terminamos a produção do chassi e estamos enviando para a próxima etapa.\n");

            System.out.println("Recebemos o chassi pronto");
            System.out.println("Iniciamos a instalação do motor...");
            carroSedan.instalarMotor();
            Thread.sleep(3000);
            System.out.println("Terminamos a instalação do motor e estamos enviando para a próxima etapa.\n");

            System.out.println("Recebemos o chassi e motor prontos");
            System.out.println("Iniciamos a aplicação da pintura...");
            carroSedan.aplicarPintura();
            Thread.sleep(3000);
            System.out.println("Terminamos a aplicação da pintura, estamos enviando para a próxima etapa \n");

            System.out.println("Recebemos o carro pintado");
            System.out.println("Iniciamos a instalação das rodas...");
            carroSedan.instalarRodas();
            Thread.sleep(3000);
            System.out.println("Terminamos a instalação das rodas. Carro finalizado!\n");

        } catch (InterruptedException e ){
            System.out.println("Ocorreu um erro na linha de produção " +
                    e.getStackTrace());
        }
    }

    public static void montarSUV(){
        IFabricaCarro fabricaSUV = new FabricaCarroSUV();
        ICarro carroSuv = fabricaSUV.criarCarro();

        try{
            System.out.println("Iniciamos a produção do chassi...");
            carroSuv.montarChassi();
            Thread.sleep(3000);
            System.out.println("Terminamos a produção do chassi e estamos enviando para a próxima etapa.\n");

            System.out.println("Recebemos o chassi pronto");
            System.out.println("Iniciamos a instalação do motor...");
            carroSuv.instalarMotor();
            Thread.sleep(3000);
            System.out.println("Terminamos a instalação do motor e estamos enviando para a próxima etapa.\n");

            System.out.println("Recebemos o chassi e motor prontos");
            System.out.println("Iniciamos a aplicação da pintura...");
            carroSuv.aplicarPintura();
            Thread.sleep(3000);
            System.out.println("Terminamos a aplicação da pintura, estamos enviando para a próxima etapa \n");

            System.out.println("Recebemos o carro pintado");
            System.out.println("Iniciamos a instalação das rodas...");
            carroSuv.instalarRodas();
            Thread.sleep(3000);
            System.out.println("Terminamos a instalação das rodas. Carro finalizado!\n");

        } catch (InterruptedException e ){
            System.out.println("Ocorreu um erro na linha de produção " +
                    e.getStackTrace());
        }
    }
}
