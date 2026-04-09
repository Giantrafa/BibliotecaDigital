public class Ebook extends Material {
    private String formato;
    private Double tamanho;

    public Ebook(int codigo, String titulo, int anoDePublicacao, int quantidadeDisponivel, String formato, Double tamanho) {
        super(codigo, titulo, anoDePublicacao, quantidadeDisponivel);
        this.formato = formato;
        this.tamanho = tamanho;
    }

    @Override
    public String exibirResumo() {
        return "Ebook: " + titulo + ", Tipo " + formato + " (" + tamanho + ")";
    }
}