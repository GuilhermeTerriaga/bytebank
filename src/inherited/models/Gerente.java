package inherited.models;

public class Gerente extends Funcionario implements IAutenticavel {

    private int senha;

    @Override
    public double getBonificacao() {
        return super.getSalario();
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
