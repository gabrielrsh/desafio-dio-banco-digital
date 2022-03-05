package com.company.models;

import java.util.Date;

public class Saque extends Transacao {
    private final String OPERACAO = "Saque";

    public Saque(Date data, double valor) {
        super(data,valor);
    }

    public boolean sacar(Conta conta) {
        if(conta.getSaldo() - super.valor >= 0){
            conta.saldo -= super.valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "OPERACAO='" + OPERACAO + '\'' +
                " valor: "+super.valor+" }";
    }
}
