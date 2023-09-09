package br.fiap.com.br;
//superclasse
public class Operacao {
    protected String pix;
    protected float transferencia;
    protected float saque;
    protected float deposito;

    public Operacao(String pix, float transferencia, float saque, float deposito){
        this.transferencia = transferencia;
        this.saque = saque;
        this.deposito = deposito;
        this.pix = pix;
    }
    //getters e setters
    public void setPix(String pix){
        this.pix = pix;
    }

    public String getPix(){
        return pix;
    }


    public void setTransferencia(float transferencia){
        this.transferencia = transferencia;
    }

    public float getTransferencia(){
        return transferencia;
    }

    public void setSaque(float saque){
        this.saque = saque;
    }

    public float getSaque(){
        return saque;
    }

    public void setDeposito(float deposito){
        this.deposito = deposito;
    }

    public float getDeposito(){
        return deposito;
    }
}
