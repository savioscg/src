import java.util.List;

public class PedidoProduto extends Entidade {
    private int id;
    private Pedido pedido;
    private Produto produto;
    private int quantidade;

    private List<PedidoProdutoAcompanhamento> acompanhamentos;

}