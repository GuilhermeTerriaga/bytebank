package inherited;

public class TestConexao {
    public static void main(String[] args) {
        try (Conexao con = new Conexao()) {
            con.leDados();
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
}
