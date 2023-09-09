package br.fiap.com.br;

public class Investimento{
    protected float tesouroDireto;
    protected float cdb;
    protected float bolsaValores;
    protected float fundoInvestimento;
    protected float previdencia;
    protected float poupanca;

    public Investimento (float tesouroDireto, float cdb, float bolsaValores, float fundoInvestimento, float previdencia, float poupanca){
        this.tesouroDireto = tesouroDireto;
        this.cdb = cdb;
        this.bolsaValores = bolsaValores;
        this.fundoInvestimento = fundoInvestimento;
        this.previdencia = previdencia;
        this.poupanca = poupanca;
    }
    //getters e setters
    protected void setTesouroDireto(float tesousoDireto){
        this.tesouroDireto = tesousoDireto;
    }

    protected float getTesouroDireto(){
        return tesouroDireto;
    }

    protected void setCdb (float cdb){
        this.cdb = cdb;
    }

    protected float getCdb(){
        return cdb;
    }

    protected void setBolsaValores(float bolsaValores){
        this.bolsaValores = bolsaValores;
    }

    protected float getBolsaValores(){
        return bolsaValores;
    }

    protected void setFundoInvestimento(float fundoInvestimento){
        this.fundoInvestimento = fundoInvestimento;
    }

    protected float getFundoInvestimento(){
        return fundoInvestimento;
    }

    protected void setPrevidencia(float previdencia){
        this.previdencia = previdencia;
    }

    protected float getprevidencia(){
        return previdencia;
    }

    protected void setPoupanca(float poupanca){
        this.poupanca = poupanca;
    }

    protected float getPoupanca(){
        return poupanca;
    }
}


