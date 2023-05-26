package br.com.holdingBenezinho.banco;

import br.com.holdingBenezinho.agencia.Agencia;
import br.com.holdingBenezinho.conta.Conta;

public class Banco {
    private String nome;
    private Agencia agencia;
    private Conta contas;

    public Banco() {
    }

    public Banco(String nome, Agencia agencia, Conta contas) {
        this.nome = nome;
        this.agencia = agencia;
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Conta getContas() {
        return contas;
    }

    public void setContas(Conta contas) {
        this.contas = contas;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nome='" + nome + '\'' +
                ", agencia=" + agencia +
                ", contas=" + contas +
                '}';
    }
}
