import java.util.Scanner;

public class Principal{

    public static void main(String[] args) {

        Gerente gerente = new Gerente();
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("João Gomes");
        funcionario.setCpf("455.654.987");
        funcionario.setSalario(15900);
        funcionario.setDepartamento("Engenharia");
        System.out.println("Informações pessoais do funcionário");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("CPF: " + funcionario.getCpf());
        System.out.println("Salário: R$" + funcionario.getSalario());
        System.out.println("Departamento: " + funcionario.getDepartamento());
        

        gerente.setNome("Fernanda de Paula");
        gerente.setCpf("564.778.664-43");
        gerente.setSalario(26000);
        gerente.setDepartamento("Gerente de Produção");
        System.out.println("Digite a senha do gerente");
        Scanner sc = new Scanner(System.in);
        gerente.setSenha(sc.nextDouble());
        System.out.println("Informações do Gerente");
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("CPF: " + gerente.getCpf());
        System.out.println("Salario: " + gerente.getSalario());
        System.out.println("Departamento: " + gerente.getDepartamento());

        sc.close();
        
    }
}