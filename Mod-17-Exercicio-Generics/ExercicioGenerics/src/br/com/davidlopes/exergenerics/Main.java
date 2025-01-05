package br.com.davidlopes.exergenerics;

import br.com.davidlopes.exergenerics.domain.Carro;
import br.com.davidlopes.exergenerics.fabrica.Fiat;
import br.com.davidlopes.exergenerics.fabrica.Volkswagen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        criarCarros();
    }

    public static void criarCarros() {
        List<Carro> lista = new ArrayList<>();
        int opcao;
        String modelo;
        String marca;
        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("(1) Cadastar carros");
            System.out.println("(2) Exibir carros cadastrados");
            System.out.println("(0) Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 0:
                    System.out.println("Saindo...");
                    break;

                case 1:
                    adicionarCarro(lista, sc);
                    break;

                case 2:

                    exibirCarros(lista);
                    break;

                default:
                    System.out.println("Opção inválida! Escolha (0) Sair, (1) Adicionar carro ou (2) Exibir carros.");
                    break;
            }

        } while (opcao != 0);

        sc.close();
    }

    public static void adicionarCarro(List<Carro> lista, Scanner sc) {
        int opcaoMarca;
        String modelo;
        String marca;

        do {
            System.out.println("\nEscolha a marca do carro:");
            System.out.println("(1) Fiat");
            System.out.println("(2) Volkswagen");
            System.out.println("(0) Voltar ao menu");
            System.out.print("Opção: ");
            opcaoMarca = sc.nextInt();
            sc.nextLine();

            if (opcaoMarca == 0) {
                return;
            }

            System.out.print("Modelo: ");
            modelo = sc.nextLine();

            if (opcaoMarca == 1) {
                marca = "Fiat";
                if (!modelo.isEmpty()) {
                    Fiat fiat = new Fiat(marca, modelo);
                    lista.add(fiat);
                    System.out.println("Carro Fiat adicionado!");
                }
            } else if (opcaoMarca == 2) {
                marca = "Volkswagen";
                if (!modelo.isEmpty()) {
                    Volkswagen vw = new Volkswagen(marca, modelo);
                    lista.add(vw);
                    System.out.println("Carro Volkswagen adicionado!");
                }
            } else {
                System.out.println("Opção inválida. Escolha (1) Fiat, (2) Volkswagen ou (0) Voltar.");
                continue;
            }

            System.out.print("\nDeseja cadastrar outro carro? (S/N): ");
            String resposta = sc.nextLine();
            if (resposta.equalsIgnoreCase("N")) {
                break;
            }

        } while (true);
    }

    public static void exibirCarros(List<Carro> lista) {
        if (lista.isEmpty()) {
            System.out.println("\nNenhum carro cadastrado.");
        } else {
            System.out.println("\nCarros cadastrados:");
            for (Carro carro : lista) {
                System.out.println(carro);
            }
        }
    }
}
