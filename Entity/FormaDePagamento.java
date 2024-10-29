import java.util.Set;

public class FormaDePagamento extends Entidade {
    private int id;
    private String tipoPagamento;

    private Set<Pedido> pedidos;
    private Set<RestaurantePagamento> restaurantePagamentos;
    private Set<HistoricoDePagamento> historicoDePagamentos;

}