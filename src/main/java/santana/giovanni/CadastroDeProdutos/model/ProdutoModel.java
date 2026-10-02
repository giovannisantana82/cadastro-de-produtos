package santana.giovanni.CadastroDeProdutos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "db_produto")
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoModel {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String nome;
    private int quantidade;

}
