package inherited.models;

public interface IAutenticavel {

    public abstract boolean autentica(int senha);

    public abstract void setSenha(int senha);
}