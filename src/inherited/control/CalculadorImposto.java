public class CalculadorImposto {
    private double imposto;

    public void calculaImposto(Tributavel tributavel) {
        imposto += tributavel.getValorImposto();
    }
}