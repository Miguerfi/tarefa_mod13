import java.util.Date;

public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica("João", new Date(), 123456789L, 123456L);
        System.out.println("Nome: " + pessoaFisica.getNome() + " | CPF: " + pessoaFisica.getCpf() + " | RG: " + pessoaFisica.getRg());
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa", new Date(), 123456789L, "Empresa LTDA");
        System.out.println("Razão Social: " + pessoaJuridica.getRazaoSocial() + " | CNPJ: " + pessoaJuridica.getCnpj());
    }
}