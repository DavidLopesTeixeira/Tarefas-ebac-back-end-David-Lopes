import br.com.davidlopes.cadastro_pessoas.model.Pessoa;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static junit.framework.TestCase.assertEquals;


public class MainTeste {
    @Test
    public void testEquals(){
        List<Pessoa> pessoas = new ArrayList<>();
        // Instanciando objetos Pessoa diretamente para simular o cenário dinâmico de entrada de dados na classe Main.
        // Este teste verifica se o filtro aplicado à lista de pessoas retorna corretamente apenas as pessoas do sexo "Feminino".

        Pessoa p1 = new Pessoa("Juan", "Masculino", "Brasileiro", 29);
        Pessoa p2 = new Pessoa("Marcio", "Masculino", "Brasileiro", 21);
        Pessoa p3 = new Pessoa("Ana", "Feminino", "Brasileiro", 18);
        Pessoa p4 = new Pessoa("Julia", "Feminino", "Brasileiro", 44);
        Pessoa p5 = new Pessoa("Marcia", "Feminino", "Brasileiro", 12);
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        pessoas.add(p4);
        pessoas.add(p5);

        List<Pessoa> mulheres = pessoas.stream()
                .filter(p -> p.getSexo().equals("Feminino"))
                .collect(Collectors.toList());

        for(Pessoa mulher : mulheres){
            assertEquals("Feminino", mulher.getSexo());
        }
    }
}
