package santana.giovanni.CadastroDeProdutos.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerController {
    @ExceptionHandler(ProdutoNaoEncontradoException.class)
    public ResponseEntity<ErroResponse> tratarExcecao(ProdutoNaoEncontradoException excecao){
        ErroResponse erroResponse = new ErroResponse(excecao.getMessage());
        return ResponseEntity.status(404).body(erroResponse);
    }

    @ExceptionHandler(QuantidadeInvalidaException.class)
    public  ResponseEntity<ErroResponse> tratarQuantidadeInvalida (QuantidadeInvalidaException excecao){
        ErroResponse erroResponse = new ErroResponse(excecao.getMessage());
        return ResponseEntity.status(400).body(erroResponse);
    }

    @ExceptionHandler(NomeInvalidoException.class)
        public ResponseEntity<ErroResponse> tratarNomeInvalido (NomeInvalidoException excecao){
        ErroResponse erroResponse = new ErroResponse(excecao.getMessage());
        return ResponseEntity.status(400).body(erroResponse);
    }
    }
