public class Pagamento {
    private String descricao;
    private double valor;

    public Pagamento(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return descricao + ";" + valor;
    }
}
