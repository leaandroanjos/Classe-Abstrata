package br.com.leandro;

public class PessoaJuridica extends Pessoa {

    private Long cnpj;

    private Long InscricaoEstadual;

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public Long getInscricaoEstadual() {
        return InscricaoEstadual;
    }

    public void setInscricaoEstadual(Long inscricaoEstadual) {
        InscricaoEstadual = inscricaoEstadual;
    }
}
