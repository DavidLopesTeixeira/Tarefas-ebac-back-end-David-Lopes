package br.com.davidlopes.cadastro_pessoas.model;

public class Pessoa {
    private String nome;
    private String sexo;
    private String nacionalidade;
    private Integer idade;
    private Integer id;

    private static int contadorId = 1;

    public Pessoa(String nome, String sexo, String nacionalidade, Integer idade){
        this.nome = nome;
        this.sexo = sexo;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        id = incrementId();
    }

    private int incrementId(){
        return contadorId ++;
    }

    public Pessoa(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    @Override
    public String toString() {
        return "Pessoa {" +
                " Nome: " + nome +
                " Sexo:" + sexo +
                " Idade: " + idade +
                " Pais: " + nacionalidade +
                " ID: " + id +
                " }";
    }
}
