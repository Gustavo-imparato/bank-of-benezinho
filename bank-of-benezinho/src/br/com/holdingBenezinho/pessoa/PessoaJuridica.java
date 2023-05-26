package br.com.holdingBenezinho.pessoa;

public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String razaoSocial;
    private Pessoa socios;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String cnpj, String razaoSocial, Pessoa socios) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.socios = socios;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public Pessoa getSocios() {
        return socios;
    }

    public void setSocios(Pessoa socios) {
        this.socios = socios;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", socios=" + socios +
                '}';
    }
}
