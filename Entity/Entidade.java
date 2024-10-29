public abstract class Entidade {
    private boolean ativo = true;
    private boolean deletado = false;

    public boolean isAtivo() {
        return ativo && !deletado;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public boolean isDeletado() {
        return deletado;
    }

    public void setDeletado(boolean deletado) {
        this.deletado = deletado;
        if (deletado) {
            this.ativo = false;
        }
    }
}