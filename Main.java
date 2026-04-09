public class Main {
    public static void main(String[] args) {

        Biblioteca b = new Biblioteca();

        Usuario aluno = new Aluno(1, "Tom", "Tom@email");
        Usuario prof = new Professor(2, "Ziggy", "Ziggy@email");

        b.cadastrarUsuario(aluno);
        b.cadastrarUsuario(prof);

        Material l1 = new Livro(1, "Código Limpo", 2009, 1, " Robert C. Martin");
        Material l2 = new Livro(2, "Livro Java", 2016, 1, "Deitel, Paul");
        Material r = new Revista(3, "Ultimate batman", 2024, 1, 10);
        Material e = new Ebook(4, "Dune", 1965, 1, "PDF", 5.0);

        b.cadastrarMaterial(l1);
        b.cadastrarMaterial(l2);
        b.cadastrarMaterial(r);
        b.cadastrarMaterial(e);
        
        System.out.println("");
        b.listarUsuarios();
        System.out.println("");
    
        b.listarMateriais();
        System.out.println("");
    
        b.realizarEmprestimo(1, 1);
        b.realizarEmprestimo(1, 2);
        b.realizarEmprestimo(1, 3);
        System.out.println("");
    
        try {
            b.realizarEmprestimo(1, 4);
        } catch (Exception ex) {
            System.out.println("");
            System.out.println("Erro: " + ex.getMessage());
        }
        System.out.println("");
        b.listarEmprestimosAtivos();

        b.registrarDevolucao(1);

        Emprestimo emp = b.buscarEmprestimo(1);
        System.out.println("Multa: " + emp.calcularMulta());

        b.listarEmprestimosFinalizados();
    }
}