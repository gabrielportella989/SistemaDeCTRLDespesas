import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=== MENU ===");
            System.out.println("1 - Entrar Despesa");
            System.out.println("2 - Anotar Pagamento");
            System.out.println("3 - Cadastrar Usuário");
            System.out.println("4 - Listar Despesas");
            System.out.println("0 - Sair");

            int op = sc.nextInt();
            sc.nextLine();

            if (op == 1) {
                System.out.print("Descrição: ");
                String desc = sc.nextLine();
                System.out.print("Valor: ");
                double v = sc.nextDouble();
                sc.nextLine();

                Despesa d = new Despesa(desc, v);
                salvar("data/despesas.txt", d.toString());
            }

            else if (op == 2) {
                System.out.print("Pagamento: ");
                String desc = sc.nextLine();
                System.out.print("Valor: ");
                double v = sc.nextDouble();
                sc.nextLine();

                Pagamento p = new Pagamento(desc, v);
                salvar("data/pagamentos.txt", p.toString());
            }

            else if (op == 3) {
                System.out.print("Login: ");
                String login = sc.nextLine();
                System.out.print("Senha: ");
                String senha = sc.nextLine();

                Usuario u = new Usuario(login, Criptografia.sha256(senha));
                salvar("data/usuarios.txt", u.toString());
            }

            else if (op == 4) {
                listar("data/despesas.txt");
            }

            else if (op == 0) {
                break;
            }
        }

        sc.close();
    }

    public static void salvar(String path, String texto) throws Exception {
        FileWriter fw = new FileWriter(path, true);
        fw.write(texto + "\n");
        fw.close();
    }

    public static void listar(String path) throws Exception {
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("Nenhuma despesa ainda.");
            return;
        }

        Scanner reader = new Scanner(file);
        while (reader.hasNextLine()) {
            System.out.println(reader.nextLine());
        }
        reader.close();
    }
}
