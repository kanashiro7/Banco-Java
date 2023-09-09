package br.fiap.com.br;
//superclasse
public class Renda {
    private float renda;
    private float debito;
    protected float credito;

    public Renda(float renda, float debito, float credito){
        this.renda = renda;
        this.debito = debito;
        this.credito = credito;
    }
    //getters e setters
    private void setRenda(float renda){
        this.renda = renda;
    }

    private float getRenda(){
        return renda;
    }

    private void setCredito(float credito){
        this.credito = credito;
    }

    private float getCredito(){
        return credito;
    }

    private void setDebito(float debito){
        this.debito = debito;
    }

    private float getDebito(){
        return debito;
    }

}
