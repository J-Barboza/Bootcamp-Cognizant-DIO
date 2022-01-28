package dio.cognizant.bancodigital;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroCliente {

    public static void lerClienteGravarArquivo() throws IOException {

        PrintWriter printWriter = new PrintWriter(System.out);
        System.out.println("Entre com os dados cadastrais");
        printWriter.flush();

        Scanner scanner = new Scanner(System.in);
        String linha = ""; // = scanner.nextLine();

        File arquivo = new File("CadastroCliente.txt");

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(arquivo.getName()));

        List<String> campos = new ArrayList<>(
                List.of("Nome: ",
                        "Documento: ",
                        "Saldo: "));
        int posicao = 0;
        String linhaTemp = "";
        do {
            System.out.print(campos.get(posicao++));
            linha = scanner.nextLine();
            linhaTemp += linha + ",";
            if (posicao == 3 & !linha.isEmpty()) {
                bufferedWriter.write(linhaTemp);
                bufferedWriter.write("\r\n");
                posicao = 0;
                linhaTemp = "";
            }
        } while (!(linha.isEmpty()));

        printWriter.printf("Arquivo \"%s\" foi criado com sucesso", arquivo.getName());

        bufferedWriter.flush();
        printWriter.close();
        scanner.close();
        bufferedWriter.close();
    }
}
