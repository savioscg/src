import java.util.Set;

public class Promo extends Entidade {
    private int id;
    private String nome;
    private String codigo;
    private String tipo;
    private double valor;
    private String validade;

    private Set<Pedido> pedidos;

}