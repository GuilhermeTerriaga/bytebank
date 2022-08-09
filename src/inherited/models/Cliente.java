package inherited.models;

public class Cliente implements IAutenticavel {
    private String nome;
    private String cpf;
    private String profissao;
    private int senha;

    public String getCpf() {
        return cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public Cliente(String profissao, String nome, String cpf) {
        this.cpf = cpf;
        this.nome = nome;
        this.profissao = profissao;
    }

    public Cliente() {

    }

    @Override
    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        }
        return false;
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

}
