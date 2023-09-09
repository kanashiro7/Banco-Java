package br.fiap.com.br;

public class Funcionario extends Usuario{
    private String nome;
    protected int idade;
    protected String endereco;
    protected int cpf;
    protected String email;
    protected int id;
    protected int numero;

    public Funcionario(String nome, int idade, String email, int id, int numero, String endereco
        ,int registroGeral, String cpf, String senha, int contato){
        super(registroGeral, cpf, senha, contato);
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.id = id;
        this.numero = numero;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setCpf(int cpf){
        this.cpf = cpf;
    }

    public int getCpf(){
        return cpf;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return numero;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return idade;
    }







}
