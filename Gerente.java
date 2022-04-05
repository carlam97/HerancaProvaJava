public class Gerente extends Funcionario {
    
    private double senha;

    public double getSenha() {
        return senha;
    }public void setSenha(double senha) {
        this.senha = senha;
    }

    public boolean autenticacao(double senhaInput){
        if (senhaInput == this.getSenha()){
            return true;
        }
        else{
            return false;
        }
    }

}
