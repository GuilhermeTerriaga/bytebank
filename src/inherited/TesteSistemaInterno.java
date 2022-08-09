package inherited;

import inherited.models.Administrador;
import inherited.models.Funcionario;
import inherited.models.FuncionarioAutenticavel;
import inherited.models.Gerente;

public class TesteSistemaInterno {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente();
        ((FuncionarioAutenticavel) gerente).setSenha(2222);

        Funcionario administrador = new Administrador();
        ((FuncionarioAutenticavel) administrador).setSenha(2922);

        SistemaInterno sistemaInterno = new SistemaInterno();
        sistemaInterno.autentica((FuncionarioAutenticavel) gerente);
        sistemaInterno.autentica((FuncionarioAutenticavel) administrador);

    }

}
