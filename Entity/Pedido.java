import java.util.List;

public class Pedido extends Entidade {
    private int id;
    private Restaurante restaurante;
    private double valor;
    private double taxaEntrega;
    private Promo promo;
    private StatusEntrega statusEntrega;
    private FormaDePagamento formaPagamento;
    private String observacao;
    private double troco;
    private Endereco endereco;

    private List<PedidoProduto> produtos;
    private List<HistoricoDeEntrega> historicoDeEntrega;

}