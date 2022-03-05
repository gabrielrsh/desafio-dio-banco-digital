package com.company.models;

import java.util.Date;

public class Deposito extends Transacao{
    private final String OPERACAO = "Deposito";

    public Deposito(Date date, double valor) {
        super(date, valor);
    }

    public boolean depositar(Conta conta) {
        conta.saldo += super.valor;
        return true;
    }

    @Override
    public String toString() {
        return super. toString() + "OPERACAO='" + OPERACAO + '\'' +
                " valor: "+super.valor+" }";
    }
}
