
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        List<Contato> contatos = new ArrayList<>();

        while(true){

            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 0 -> {
                    System.out.println("Saindo...");
                    return;
                }
                case 1 -> listarContatos(contatos);
                case 2 -> adicionarContato(contatos, scanner);
                case 3 -> editarContato(contatos, scanner);
                default -> System.out.println("Opção inválida.");
            }
        }
    }

    public static void adicionarContato(List<Contato> contatos, Scanner scanner) {
        System.out.print("Digite o nome do contato: ");
        String nome = scanner.nextLine();
        String nomeValido = validarNome(nome);
        if (nomeValido != null) {
            System.out.println(nomeValido);
            return;
        }
        System.out.print("Digite o telefone do contato: ");
        String telefone = scanner.nextLine();
        String telefoneValido = validarTelefone(telefone);
        if (telefoneValido != null) {
            System.out.println(telefoneValido);
            return;
        }
        Contato contato = new Contato(nome, telefone);
        contatos.add(contato);
            System.out.println("---------------------------\n");
            System.out.println("Contato adicionado com sucesso!");
            System.out.println("\n---------------------------");
    }

    public static void listarContatos(List<Contato> contatos) {
        if (contatos.isEmpty()) {
            System.out.println("---------------------------\n");
            System.out.println("Nenhum contato cadastrado.");
            System.out.println("\n---------------------------");
        } else {
            System.out.println("=====LISTA DE CONTATOS=====");
            for (int i = 0; i < contatos.size(); i++) {
                System.out.println("---------------------------\n");
                System.out.println(contatos.get(i).toString());
                System.out.println("\n---------------------------");
            }
        }
    }

    public static void editarContato(List<Contato> contatos, Scanner scanner) {
        if (contatos.isEmpty()) {
            System.out.println("---------------------------\n");
            System.out.println("Nenhum contato cadastrado.");
            System.out.println("\n---------------------------");
            return;
        }

        System.out.print("Digite o nome do contato que deseja editar: ");
        String nome = scanner.nextLine();
        Contato contatoParaEditar = null;

        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contatoParaEditar = contato;
                break;
            }
        }

        if (contatoParaEditar == null) {
            System.out.println("---------------------------\n");
            System.out.println("Contato não encontrado.");
            System.out.println("\n---------------------------");
            return;
        }

        System.out.print("Digite o novo nome do contato: ");
        String novoNome = scanner.nextLine();
        System.out.print("Digite o novo telefone do contato: ");
        String novoTelefone = scanner.nextLine();

        contatoParaEditar.setNome(novoNome);
        contatoParaEditar.setTelefone(novoTelefone);

        System.out.println("---------------------------\n");
        System.out.println("Contato atualizado com sucesso!");
        System.out.println("\n---------------------------");
    }

    public static void exibirMenu() {
        System.out.println("=====LISTA DE CONTATOS=====");
        System.out.println("0 - Sair");
        System.out.println("1 - Listar contato");
        System.out.println("2 - Adicionar contato");
        System.out.println("3 - Editar contato");
        System.out.print("Escolha uma opção: ");
    }

    public static String validarNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            return "Nome inválido. O nome não pode ser vazio.";
        }else if (!nome.matches("[a-zA-Z\\s]+")) {
            return "Nome inválido. O nome deve conter apenas letras e espaços.";
        }
        return null;
    }

    public static String validarTelefone(String telefone) {
        if (telefone == null || telefone.trim().isEmpty()) {
            return "Telefone inválido. O telefone não pode ser vazio.";
        }else if (!telefone.matches("\\d+")) {
            return "Telefone inválido. O telefone deve conter apenas números.";
        }
        return null;
    }   
}
