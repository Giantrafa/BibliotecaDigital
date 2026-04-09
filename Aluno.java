public class Aluno extends Usuario {
    public Aluno(int codigo, String nome, String email) {
        super(codigo, nome, email);
    }

    public int getLimiteMaximoEmprestimo() {
        return 3;
    }
    public int getPrazoDevolucaoDias() {
        return 7;

    }
    public double getValorMultaDiaria() {
        return 2.5;

    }
    public String getTipo() {
        return "Aluno";
    }

}