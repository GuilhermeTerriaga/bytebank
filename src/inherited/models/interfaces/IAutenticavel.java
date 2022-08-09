package inherited.models.interfaces;

public interface IAutenticavel {

    public abstract boolean autentica(int senha);

    public abstract void setSenha(int senha);
}