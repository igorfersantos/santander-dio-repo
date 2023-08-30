import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BancoOrganizadorAtivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> ativos = new ArrayList<>();

        // Entrada dos tipos de ativos
        int quantidadeAtivos = scanner.nextInt();

        // Entrada dos códigos dos ativos
        for (int i = 0; i <= quantidadeAtivos; i++) {
            String codigoAtivo = scanner.nextLine();
            ativos.add(codigoAtivo);
        }

        imprimeAtivos(ativos);

        // Ordernar os ativos
        Collections.sort(ativos);

        // TODO: Imprimir a lista de ativos ordenada, conforme a tabela de exemplos.
        imprimeAtivos(ativos);
    }

    public static void imprimeAtivos(ArrayList<String> ativos) {
        for (String ativo : ativos) {
            System.out.println(ativo);
        }
    }
}