package santana.giovanni.CadastroDeProdutos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import santana.giovanni.CadastroDeProdutos.model.ProdutoModel;
import santana.giovanni.CadastroDeProdutos.repository.ProdutoRepository;

import java.util.List;


@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public ProdutoModel cadastrarProduto(ProdutoModel produtoModel){
        if (produtoModel.getQuantidade() <= 0) {
            throw new IllegalArgumentException("Quantidade inválida");
        } else if (produtoModel.getNome().trim().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        return produtoRepository.save(produtoModel);

    }

    public List<ProdutoModel> listarProduto() {
        return produtoRepository.findAll();
    }
}
