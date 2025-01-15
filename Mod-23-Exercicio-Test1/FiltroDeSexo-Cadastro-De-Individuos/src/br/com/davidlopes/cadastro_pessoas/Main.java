package br.com.davidlopes.cadastro_pessoas;

import br.com.davidlopes.cadastro_pessoas.model.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    private static List<Pessoa> pessoas = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        Scanner sc = new Scanner(System.in);
        boolean isSair = false;
        int op;

        do {
            System.out.println("Cadastrar Pessoas");
            System.out.println("Digite 1 para cadastrar, 2 exibir pessoas cadastradas ou 3 para sair");
            op = sc.nextInt();
            sc.nextLine();

            switch (op){
                case 1:
                    System.out.println("Cadastrar nova pessoa");
                    cadastrarPessoas();
                    break;
                case 2:
                    System.out.println("Exibir pessoas cadastradas");
                    tratarTipos();
                    break;
                case 3:
                    isSair = true;
                    System.out.println("Até logo...");
                    sc.close();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        }while (!isSair);

    }

    private static void cadastrarPessoas() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Separados por virgula digite nome, sexo(M ou F), naturalidade(Brasil), idade");
        String valores = sc.nextLine();
        String[] dados = valores.split(",");
        String nome = dados[0];
        String sexo = dados[1].trim().toUpperCase();
        String natura = dados[2];
        try{
            if(sexo.equals("M") || sexo.equals("F")){
                Integer idade = Integer.parseInt(dados[3].trim());
                if(sexo.equals("M")){
                    sexo = "Masculino";
                } else {
                    sexo = "Feminino";
                }
                Pessoa pessoa = new Pessoa(dados[0].trim(), sexo, dados[2].trim(), idade);
                pessoas.add(pessoa);

                System.out.println(pessoa);
                cadastrarNovo();

            } else {
                System.out.println("Digite M para masculino ou F para feminino");
            }

        }catch (Exception e){
            System.out.println("Ocorreu um erro...");
        }
    }

    private static void tratarTipos() {
        if(pessoas.isEmpty()){
            System.out.println("A lista está vazia! \n");
            return;
        }

        boolean isSair = false;
        List<Pessoa> mulheres = pessoas.stream()
                .filter(p -> p.getSexo().equals("Feminino"))
                .collect(Collectors.toList());

        List<Pessoa> homens = pessoas.stream()
                .filter(p -> p.getSexo().equals("Masculino"))
                .collect(Collectors.toList());

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Selecione 0 para voltar, \n 1 para todos,\n 2 para Mulheres,\n 3 para Homens,\n 4 resumo");
            Integer op = sc.nextInt();
            sc.nextLine();
            switch (op){
                case 1:
                    System.out.println("Todas as pessoas cadastradas:");
                    pessoas.forEach(p -> System.out.println(p));
                    break;
                case 2:
                    System.out.println("Mulheres cadastradas:");
                    if(mulheres.isEmpty()){
                        System.out.println("Não existem mulheres cadastradas!");
                        return;
                    }
                    mulheres.forEach(m -> System.out.println(m));
                    break;
                case 3:
                    System.out.println("Homens cadastrados:");
                    if (homens.isEmpty()){
                        System.out.println("Não existem Homens cadastradas!");
                        return;
                    }
                    homens.forEach(h -> System.out.println(h));
                    break;

                case 4:
                    System.out.println("Existem: " + pessoas.size() + " pessoas cadastradas\n" +
                             + homens.size() + ":" +  " Homens\n"  +
                            mulheres.size() + ":" + " Mulheres\n");
                    break;

                case 0:
                    System.out.println("Até logo...");
                    menu();
                    break;
                default:
                    System.out.println("Opção invalida!");
            }

        } while (!isSair);

    }


    private static void cadastrarNovo() {
        Scanner sc = new Scanner(System.in);
        boolean cadastrarNovo = false;
        do {
            System.out.println("Digite 1 para cadastrar outra ou 2 para sair");
            Integer op = sc.nextInt();

            if (op.equals(1)){
                cadastrarPessoas();
            } else{
                menu();
                cadastrarNovo = true;
            }
        }while (!cadastrarNovo);
    }
}
