package praticaheranca;

public class MainTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("João", 6000.0, "joao123", "senha123");
        Telefonista telefonista = new Telefonista("Maria", 3000.0, "ezequias");
        Secretaria secretaria = new Secretaria("Ana", 3500.0, "ezequias12");

        
        System.out.println("Informações do Gerente:");
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Salário: " + gerente.getSalario());
        System.out.println("Login: " + gerente.getLogin());
        System.out.println("Senha: " + gerente.getSenha());

        System.out.println("\nInformações da Telefonista:");
        System.out.println("Nome: " + telefonista.getNome());
        System.out.println("Salário: " + telefonista.getSalario());
        System.out.println("Estação de Trabalho: " + telefonista.getEstacaoDeTrabalho());

        System.out.println("\nInformações da Secretaria:");
        System.out.println("Nome: " + secretaria.getNome());
        System.out.println("Salário: " + secretaria.getSalario());
        System.out.println("Ramal: " + secretaria.getRamal());
    }
}
