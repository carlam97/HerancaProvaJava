public class Funcionario {
    
    private String nome;
    private String cpf;
    private double salario;
    private String departamento;

    public String getNome() {
        return nome;
    }public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double Bonificacao(){
        double bonus = getSalario()*10/100;
        double total = getSalario() + bonus;
        return total; 
    }

}
