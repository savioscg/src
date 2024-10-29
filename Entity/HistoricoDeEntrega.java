import java.time.LocalDateTime;

public class HistoricoDeEntrega extends Entidade {
    private int id;
    private Pedido pedido;
    private StatusEntrega statusEntrega;
    private LocalDateTime dataHora;

    public HistoricoDeEntrega(Pedido pedido, StatusEntrega statusEntrega, LocalDateTime dataHora) {
        this.pedido = pedido;
        this.statusEntrega = statusEntrega;
        this.dataHora = dataHora;
    }

    public int getId() {
        return id;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public StatusEntrega getStatusEntrega() {
        return statusEntrega;
    }

    public void setStatusEntrega(StatusEntrega statusEntrega) {
        this.statusEntrega = statusEntrega;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
}