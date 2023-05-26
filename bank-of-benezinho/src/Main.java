import br.com.holdingBenezinho.agencia.Agencia;
import br.com.holdingBenezinho.conta.Conta;
import br.com.holdingBenezinho.conta.ContaCorrente;
import br.com.holdingBenezinho.pessoa.Pessoa;
import br.com.holdingBenezinho.pessoa.PessoaFisica;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoa01 = new PessoaFisica();
        pessoa01.setNome("Adalberto");
        pessoa01.setCpf("6969696969");
        pessoa01.setMae("juricleide");

        Agencia agencia01 = new Agencia();
        agencia01.setNumero("123456789");
        agencia01.setNome("lugar nenhum");
        agencia01.setBanco("benezinho bank");

        Conta conta01 = new ContaCorrente();
        conta01.setNumero("010101");
        conta01.setSaldo(100000);
        conta01.setTitular(pessoa01);
        conta01.setAgencia(agencia01);


        System.out.println(conta01);
        System.out.println(agencia01);
        System.out.println(pessoa01);



    }
}