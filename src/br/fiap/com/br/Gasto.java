package br.fiap.com.br;

public class Gasto {
    protected String nomeGasto;
    protected float valorGasto;
    protected String descricaoGasto;

    public Gasto(String nomeGasto, float valorGasto, String descricaogasto){
        this.nomeGasto = nomeGasto;
        this.valorGasto = valorGasto;
        this.descricaoGasto = descricaogasto;
    }

    //getters e setters
    protected void setNomeGasto(String nomeGasto){
        this.nomeGasto = nomeGasto;
    }

    protected String getNomeGasto(){
        return nomeGasto;
    }

    protected void setValorGasto(float valorGasto){
        this.valorGasto = valorGasto;
    }

    protected void setDescricaoGasto(String descricaoGasto){
        this.descricaoGasto = descricaoGasto;
    }

    protected String getDescricaoGasto() {
        return descricaoGasto;
    }
}
