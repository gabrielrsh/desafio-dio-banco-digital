package com.company.models;

import com.company.interfaces.ITransacao;

import java.text.DateFormat;
import java.util.Date;

public abstract class Transacao {

    protected Date data;
    protected double valor;

    public Transacao(Date data, double valor) {
        this.data = data;
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    @Override
    public String toString() {
        return "\nTransacao{" +
                "data= " + DateFormat.getDateTimeInstance().format(data)
                +" } ";
    }
}
