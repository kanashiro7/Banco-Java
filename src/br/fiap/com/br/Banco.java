package br.fiap.com.br;
//superclasse
public class Banco{
    protected String numero;
    private String agencia;
    private int tipoConta;

    public Banco(String numero, String agencia, int tipoConta){
        this.numero = numero;
        this.agencia = agencia;
        this.tipoConta = tipoConta;
    }
    //getters e setters
    public void setNumero(String numero){
        this.numero = numero;
    }

    public String getNumero(){
        return numero;
    }

    public void setAgencia(String agencia){
        this.agencia = agencia;
    }

    public String getAgencia(){
        return agencia;
    }

    public void setTipoConta(int tipoConta){
        this.tipoConta = tipoConta;
    }

    public int getTipoConta(){
        return tipoConta;
    }
}
