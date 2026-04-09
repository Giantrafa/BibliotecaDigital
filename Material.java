public abstract class Material implements Exibivel{
    protected int codigo;
    protected String titulo;
    protected int anoDePublicacao;
    protected int quantidadeDisponivel;

    public Material(int codigo, String titulo, int anoDePublicacao, int quantidadeDisponivel){
        this.codigo = codigo;
        this.titulo = titulo;
        this.anoDePublicacao = anoDePublicacao;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public boolean disponivel() {
        return quantidadeDisponivel > 0;
    }

    public void emprestar() {
        quantidadeDisponivel--;
    }

    public void devolver() {
        quantidadeDisponivel++;
    }
}