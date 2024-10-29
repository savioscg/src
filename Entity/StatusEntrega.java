import java.util.Set;

public class StatusEntrega extends Entidade {
    private int id;
    private String nome;

    private Set<Pedido> pedidos;
    private Set<HistoricoDeEntrega> historicoDeEntrega;
    
}