import java.util.Set;

public class Acompanhamento extends Entidade {
    private int id;
    private String nome;
    private String descricao;
    private double valor;

    private Set<PedidoProdutoAcompanhamento> pedidoProdutoAcompanhamentos;

}