import java.util.Date;

public class PessoaJuridica extends Pessoa {
    private Long cnpj;
    private String razaoSocial;

    public PessoaJuridica(String nome, Date dataNascimento, Long cnpj, String razaoSocial) {
        this.setNome(nome);
        this.setDataNascimento(dataNascimento);
        this.setCnpj(cnpj);
        this.setRazaoSocial(razaoSocial);
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
}
