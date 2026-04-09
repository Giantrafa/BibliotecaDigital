import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Emprestimo implements Exibivel, CalculavelMulta {

    private int id;
    private Usuario usuario;
    private Material material;
    private LocalDate dataEmprestimo;
    private LocalDate dataPrevista;
    private LocalDate dataDevolucao;

    public Emprestimo(int id, Usuario usuario, Material material) {
        this.id = id;
        this.usuario = usuario;
        this.material = material;
        this.dataEmprestimo = LocalDate.now();
        this.dataPrevista = dataEmprestimo.plusDays(usuario.getPrazoDevolucaoDias());

        material.emprestar();
    }

    public int getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Material getMaterial() {
        return material;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataPrevista() {
        return dataPrevista;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public boolean finalizado() {
        return dataDevolucao != null;
    }

    public void devolver() {
        devolver(LocalDate.now());
    }

    public void devolver(LocalDate dataDevolucao) {
        if (this.dataDevolucao != null) {
            throw new RuntimeException("Empréstimo já devolvido!");
        }

        if (dataDevolucao.isBefore(dataEmprestimo)) {
            throw new RuntimeException("Data de devolução inválida");
        }

        this.dataDevolucao = dataDevolucao;
        material.devolver();
    }

    public long diasAtraso() {
        if (dataDevolucao == null) return 0;

        long dias = ChronoUnit.DAYS.between(dataPrevista, dataDevolucao);
        return Math.max(dias, 0);
    }

    public double calcularMulta() {
        return diasAtraso() * usuario.getValorMultaDiaria();
    }

    @Override
    public String exibirResumo() {
        return "ID: " + id +
               " | Usuário: " + usuario.exibirResumo() +
               " | Material: " + material.exibirResumo() +
               " | Previsto: " + dataPrevista +
               " | Devolução: " + (dataDevolucao != null ? dataDevolucao : "-") +
               " | Status: " + (finalizado() ? "Finalizado" : "Em andamento");
    }
}