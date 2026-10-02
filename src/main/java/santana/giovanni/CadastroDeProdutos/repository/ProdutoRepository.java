package santana.giovanni.CadastroDeProdutos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import santana.giovanni.CadastroDeProdutos.model.ProdutoModel;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {
}
