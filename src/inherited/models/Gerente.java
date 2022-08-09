package inherited.models;

public class Gerente extends FuncionarioAutenticavel {

    @Override
    public double getBonificacao() {
        return super.getSalario();
    }

}
