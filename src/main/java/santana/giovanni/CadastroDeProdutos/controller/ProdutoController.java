package santana.giovanni.CadastroDeProdutos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import santana.giovanni.CadastroDeProdutos.model.ProdutoModel;
import santana.giovanni.CadastroDeProdutos.service.ProdutoService;

@RestController
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;
    @PostMapping("/produtos")
    public ResponseEntity<ProdutoModel> criarProduto(@RequestBody ProdutoModel produto) {
        return ResponseEntity.ok(produtoService.cadastrarProduto(produto));

    }
}
