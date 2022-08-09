package inherited;

import inherited.models.Administrador;
import inherited.models.Cliente;
import inherited.models.Gerente;
import inherited.models.IAutenticavel;

public class TesteSistemaInterno {
    public static void main(String[] args) {
        IAutenticavel gerente = new Gerente();
        gerente.setSenha(222);

        IAutenticavel administrador = new Administrador();
        administrador.setSenha(2922);

        IAutenticavel cliente = new Cliente();
        cliente.setSenha(2222);

        SistemaInterno sistemaInterno = new SistemaInterno();
        sistemaInterno.autentica(gerente);
        sistemaInterno.autentica(administrador);
        sistemaInterno.autentica(cliente);
    }

}
