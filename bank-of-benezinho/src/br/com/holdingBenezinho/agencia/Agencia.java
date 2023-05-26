package br.com.holdingBenezinho.agencia;

import br.com.holdingBenezinho.banco.Banco;

public class Agencia {
    private String numero;
    private String nome;
    private String banco;

    public Agencia() {
    }

    public Agencia(String numero, String nome, Banco banco) {
        this.numero = numero;
        this.nome = nome;
        this.banco = String.valueOf(banco);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    @Override
    public String toString() {
        return "Agencia{" +
                "numero='" + numero + '\'' +
                ", nome='" + nome + '\'' +
                ", banco=" + banco +
                '}';
    }
}
