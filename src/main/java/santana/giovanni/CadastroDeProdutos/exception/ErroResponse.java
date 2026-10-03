package santana.giovanni.CadastroDeProdutos.exception;

public class ErroResponse {
    private String erro;

    public ErroResponse(String erro) {
        this.erro = erro;
    }

    public String getErro() {
        return erro;
    }
}
