package santana.giovanni.CadastroDeProdutos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import santana.giovanni.CadastroDeProdutos.model.ProdutoModel;
import santana.giovanni.CadastroDeProdutos.service.ProdutoService;

import java.util.List;

@RestController
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;
    @PostMapping("/produtos")
    public ResponseEntity<ProdutoModel> criarProduto(@RequestBody ProdutoModel produto) {
        return ResponseEntity.status(201).body(produtoService.cadastrarProduto(produto));
    }
    @GetMapping("/produtos")
    public ResponseEntity<List<ProdutoModel>> listarProduto(){
        return ResponseEntity.ok(produtoService.listarProduto());
    }

    @GetMapping("/produtos/{id}")
    public ResponseEntity<ProdutoModel> listarProdutoId(@PathVariable Long id){
        return ResponseEntity.ok(produtoService.listarProdutoId(id));
    }

    @PutMapping("/produtos/{id}")
    public ResponseEntity<ProdutoModel> editarProduto(@PathVariable Long id, @RequestBody ProdutoModel produtoModel){
        return ResponseEntity.ok(produtoService.editarProduto(id, produtoModel));
    }

    @DeleteMapping("/produtos/{id}")
    public ResponseEntity<Void> deletarProduto(@PathVariable Long id){
        produtoService.deletarProduto(id);
        return ResponseEntity.noContent().build();
    }

}
