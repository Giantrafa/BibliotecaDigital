public abstract class Material implements Exibivel {

    protected  int codigo;
    protected  String titulo;
    protected  int anoDePublicacao;
    protected  int quantidadeDisponivel;

    
    public Material(int codigo, String titulo, int anoDePublicacao, int quantidadeDisponivel) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anoDePublicacao = anoDePublicacao;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }
    
    public boolean disponivel(){
        if(quantidade > 0){
            return quantidade > 0;
        }
        else{
            return false;
        }
    }

    public void emprestar(){
        quantidade--;
    }

    public void devolver(){
        quantidade++;
    }
        
    public abstract String getInformacoesEspecificas();

            
}