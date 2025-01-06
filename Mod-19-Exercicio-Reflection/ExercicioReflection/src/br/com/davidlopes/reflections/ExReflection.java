package br.com.davidlopes.reflections;

import java.lang.reflect.Field;

public class ExReflection {
    @Tabela(value = "ExTabela")
    private String exemploCampo;

    public static void main(String[] args) {
        Class<?> classe = ExReflection.class;
        Field campo = null;

        try {
            campo = classe.getDeclaredField("exemploCampo");
            campo.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        if (campo.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = campo.getAnnotation(Tabela.class);
            String nomeTabela = tabela.value();

            System.out.println("Nome da tabela em runtime: " + nomeTabela);
        } else {
            System.out.println("A anotação Tabela não está presente.");
        }
    }
}