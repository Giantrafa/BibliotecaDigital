public class Professor extends Usuario {
    public Professor(int codigo, String nome, String email) {
        super(codigo, nome, email);
    }

    
    public int getLimiteMaximoEmprestimo() {
        return 5;
    }

    
    public int getPrazoDevolucaoDias() {
        return 14;
    }

    
    public double getValorMultaDiaria() {
        return 1.0;
    }

    
    public String getTipo() {
        return "Professor";
    }        
}