package inherited;

import inherited.models.FuncionarioAutenticavel;

public class SistemaInterno {
    private int senha = 2222;

    public boolean autentica(FuncionarioAutenticavel funcionarioAutenticavel) {
        boolean autenticou = funcionarioAutenticavel.autentica(this.senha);
        if (autenticou) {
            System.out.println("Pode entrar");
            return true;
        }
        System.out.println("Não pode entrar");

        return false;
    }
}
