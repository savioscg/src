import java.util.Set;

public class Produto extends Entidade {
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    private Categoria categoria;
    private Restaurante restaurante;

    private Set<PedidoProduto> pedidos;

}