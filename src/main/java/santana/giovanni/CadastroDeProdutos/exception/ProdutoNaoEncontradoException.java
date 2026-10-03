package santana.giovanni.CadastroDeProdutos.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;

public class ProdutoNaoEncontradoException extends RuntimeException{
    public ProdutoNaoEncontradoException(String message) {
        super(message);
    }
}
