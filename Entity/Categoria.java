import java.util.Set;

public class Categoria extends Entidade {
    private int id;
    private String tipo;
    private String nome;
    private String descricao;

    private Set<Produto> produtos;
    private Set<Restaurante> restaurantes;

}