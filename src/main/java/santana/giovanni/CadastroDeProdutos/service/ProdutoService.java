package santana.giovanni.CadastroDeProdutos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import santana.giovanni.CadastroDeProdutos.exception.NomeInvalidoException;
import santana.giovanni.CadastroDeProdutos.exception.ProdutoNaoEncontradoException;
import santana.giovanni.CadastroDeProdutos.exception.QuantidadeInvalidaException;
import santana.giovanni.CadastroDeProdutos.model.ProdutoModel;
import santana.giovanni.CadastroDeProdutos.repository.ProdutoRepository;

import java.util.List;
import java.util.Optional;


@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public ProdutoModel cadastrarProduto(ProdutoModel produtoModel){
        if (produtoModel.getQuantidade() <= 0) {
            throw new QuantidadeInvalidaException("Quantidade inválida");
        } else if (produtoModel.getNome().trim().isEmpty()) {
            throw new NomeInvalidoException("Nome Inválido");
        }
        return produtoRepository.save(produtoModel);
    }

    public ProdutoModel editarProduto(Long id, ProdutoModel produtoModel){
        ProdutoModel produtoExistente;
        Optional<ProdutoModel> produto = produtoRepository.findById(id);
        if (produto.isEmpty()){
            throw new ProdutoNaoEncontradoException("Produto Não encontrado");
        }
        produtoExistente = produto.get();
        produtoExistente.setNome(produtoModel.getNome());
        produtoExistente.setQuantidade(produtoModel.getQuantidade());

        return produtoRepository.save(produtoExistente);
    }

    public List<ProdutoModel> listarProduto() {
        return produtoRepository.findAll();
    }

    public ProdutoModel listarProdutoId(Long id) {
        Optional<ProdutoModel> produto = produtoRepository.findById(id);
        if (produto.isEmpty()){
            throw new ProdutoNaoEncontradoException("Produto Não encontrado");
        }
        return produto.get();
    }

    public void deletarProduto(Long id){
        Optional<ProdutoModel> produto = produtoRepository.findById(id);
        if (produto.isEmpty()){
            throw new ProdutoNaoEncontradoException("Produto Não encontrado");
        }
        produtoRepository.deleteById(id);
    }
    }
