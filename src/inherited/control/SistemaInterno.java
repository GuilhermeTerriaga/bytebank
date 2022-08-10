package inherited.control;

import inherited.models.interfaces.IAutenticavel;

public class SistemaInterno {
    private int senha = 2222;

    public boolean autentica(IAutenticavel funcionarioAutenticavel) {
        boolean autenticou = funcionarioAutenticavel.autentica(this.senha);
        if (autenticou) {
            System.out.println("Pode entrar");
            return true;
        }
        System.out.println("Não pode entrar");

        return false;
    }
}
