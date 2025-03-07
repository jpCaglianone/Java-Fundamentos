package POO;

public class ClasseAuxiliar {

    private int quantidade;
    private String descricao;
    private boolean ativo;
    private  double preco;

    public ClasseAuxiliar(int quantidade, String descricao, boolean ativo, double preco) {
        this.quantidade = quantidade;
        this.descricao = descricao;
        this.ativo = ativo;
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
