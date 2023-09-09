package br.fiap.com.br;
//subclasse
public class Conta extends Banco{
    protected int tipoMoeda;
    private int contaCorrente;
    private int contaPoupanca;


    public Conta(int tipoMoeda, int contaCorrente, int contaPoupanca, String numero, String agencia, int tipoConta){
        super(numero, agencia, tipoConta);
        this.tipoMoeda = tipoMoeda;
        this.contaCorrente = contaCorrente;
        this.contaPoupanca = contaPoupanca;
    }
    //getters e setters
    public void setTipoMoeda(int tipoMoeda){
        this.tipoMoeda = tipoMoeda;
    }

    public int getTipoMoeda(){
        return tipoMoeda;
    }

    public void setContaCorrente(int contaCorrente){
        this.contaCorrente = contaCorrente;
    }

    public int getContaCorrente(){
        return contaCorrente;
    }

    public void setContaPoupanca(int contaPoupanca){
        this.contaPoupanca = contaPoupanca;
    }

    public int getContaPoupanca(){
        return contaPoupanca;
    }
}
