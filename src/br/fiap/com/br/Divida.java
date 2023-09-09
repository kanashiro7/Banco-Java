package br.fiap.com.br;

public class Divida {
    protected float saldoDevedor;
    protected float emprestimo;

    public Divida(float saldoDevedor, float emprestimo){
        this.saldoDevedor = saldoDevedor;
        this.emprestimo = emprestimo;
    }

    public void setSaldoDevedor(float saldoDevedor){
        this.saldoDevedor = saldoDevedor;
    }

    public float getSaldoDevedor(){
        return saldoDevedor;
    }

    public void setEmprestimo(float emprestimo){
        this.emprestimo = emprestimo;
    }

    public float getEmprestimo(){
        return emprestimo;
    }
}
