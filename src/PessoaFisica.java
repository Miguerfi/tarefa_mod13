import java.util.Date;

public class PessoaFisica extends Pessoa {
    private Long cpf;
    private Long rg;

    public PessoaFisica(String nome, Date dataNascimento, Long cpf, Long rg) {
        this.setNome(nome);
        this.setDataNascimento(dataNascimento);
        this.setCpf(cpf);
        this.setRg(rg);
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public Long getRg() {
        return rg;
    }

    public void setRg(Long rg) {
        this.rg = rg;
    }


}
