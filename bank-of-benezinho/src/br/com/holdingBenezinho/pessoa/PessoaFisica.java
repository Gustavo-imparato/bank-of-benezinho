package br.com.holdingBenezinho.pessoa;

public class PessoaFisica extends Pessoa{
    private String cpf;
    private String mae;

    public PessoaFisica() {
    }


    public PessoaFisica(String cpf, PessoaFisica mae) {
        this.cpf = cpf;
        this.mae = String.valueOf(mae);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "cpf='" + cpf + '\'' +
                ", mae=" + mae +
                '}';
    }
}
