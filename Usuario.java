public abstract class Usuario implements Exibivel {

    protected  int codigo;
    protected  String nome;
    protected  String email;
    
    public Usuario(int codigo, String nome, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
    }

  
    
    public abstract int getLimiteMaximoEmprestimo();
    public abstract int getPrazoDevolucaoDias();
    public abstract double getValorMultaDiaria();
    public abstract String getTipoUsuario();// Aluno ou Professor

    
    public abstract String exibirResumo(){
        return "Usuário: " + nome + " (" + getTipo() + ")";
    }
}