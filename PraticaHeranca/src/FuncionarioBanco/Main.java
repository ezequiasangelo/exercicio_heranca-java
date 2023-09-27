package FuncionarioBanco;

public class Main {
    public static void main(String[] args) {
        FuncionarioBanco funcionario = new FuncionarioBanco("João", 5000.0);

        System.out.println("Nome do Funcionário: " + funcionario.getNome());
        System.out.println("Salário do Funcionário: " + funcionario.getSalario());

        funcionario.setNome("Maria");
        funcionario.setSalario(6000.0);

        System.out.println("Novo Nome do Funcionário: " + funcionario.getNome());
        System.out.println("Novo Salário do Funcionário: " + funcionario.getSalario());
    }
}
