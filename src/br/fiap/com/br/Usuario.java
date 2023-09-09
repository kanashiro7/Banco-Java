package br.fiap.com.br;
//superclasse
public class Usuario {
    private int registroGeral;
    private String cpf;
    private String senha;
    private int contato;

    public Usuario(int registroGeral, String cpf, String senha, int contato) {
        this.registroGeral = registroGeral;
        this.cpf = cpf;
        this.senha = senha;
        this.contato = contato;

    }

    private int getRegistroGeral() {
        return registroGeral;
    }

    private void setRegistroGeral(int registroGeral) {
        this.registroGeral = registroGeral;
    }
    //getters e setters
    private String getCpf() {
        return cpf;
    }

    private void setCpf(String cpf) {
        this.cpf = cpf;
    }

    private void setSenha(String senha) {
        this.senha = senha;
    }

    private String getSenha() {
        return senha;
    }

    private int getContato() {
        return contato;
    }

    private void setContato(int contato) {
        this.contato = contato;

    }
}

