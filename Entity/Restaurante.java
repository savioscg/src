import java.util.Set;

public class Restaurante extends Entidade {
    private int id;
    private String nome;
    private Endereco endereco;
    private String telefone;
    private Categoria categoria;
    private String horario;
    private boolean isRetirada;

    private Set<Pedido> pedidos;
    private Set<Avaliacao> avaliacoes;
    private Set<Produto> produtos;

}