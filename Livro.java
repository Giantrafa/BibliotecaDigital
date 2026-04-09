public class Livro extends Material {
    private String autor;

    public Livro(int codigo, String titulo, int anoDePublicacao, int quantidadeDisponivel, String autor) {
        super(codigo, titulo, anoDePublicacao, quantidadeDisponivel);
        this.autor = autor;
    }

    @Override
    public String exibirResumo() {
        return "Livro: " + titulo + ", Autor: " + autor;
    }
}