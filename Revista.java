public class Revista extends Material {
    private int edicao;

    public Revista(int codigo, String titulo, int anoDePublicacao, int quantidadeDisponivel, int edicao) {
        super(codigo, titulo, anoDePublicacao, quantidadeDisponivel);
        this.edicao = edicao;
    }

    @Override
    public String exibirResumo() {
        return "Revista: " + titulo + " - edição " + edicao;
    }
}