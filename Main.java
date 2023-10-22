import java.time.LocalDate;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int opcao;

        Livro livro = new Livro("Game of Thrones", 2019, 5, "George RR Martin");
        DVD dvd = new DVD("Como treinar seu dragão", 2017, 3, 122);
        Revista revista = new Revista("Capricho", 2013, 10, 25);

        do {
            System.out.println("Escolha a operação:");
            System.out.println("1. Emprestar");
            System.out.println("2. Devolver");
            System.out.println("3. Calcular Multa");
            System.out.println("4. Sair");
            System.out.print("Opção: ");
            opcao = s.nextInt();

            if (opcao == 1) {
                System.out.println("Escolha o item para emprestar:");
                System.out.println("1. Livro");
                System.out.println("2. DVD");
                System.out.println("3. Revista");
                int escolhaItem = s.nextInt();
                if (escolhaItem == 1) {
                    livro.emprestar();
                } else if (escolhaItem == 2) {
                    dvd.emprestar();
                } else if (escolhaItem == 3) {
                    revista.emprestar();
                } else {
                    System.out.println("Escolha de item inválida.");
                }
            } else if (opcao == 2) {
                System.out.println("Escolha o item para devolver:");
                System.out.println("1. Livro");
                System.out.println("2. DVD");
                System.out.println("3. Revista");
                int escolhaItemDevolver = s.nextInt();
                if (escolhaItemDevolver == 1) {
                    livro.devolver();
                } else if (escolhaItemDevolver == 2) {
                    dvd.devolver();
                } else if (escolhaItemDevolver == 3) {
                    revista.devolver();
                } else {
                    System.out.println("Escolha de item inválida.");
                }
            } else if (opcao == 3) {
                System.out.println("Escolha o item para calcular a multa:");
                System.out.println("1. Livro");
                System.out.println("2. DVD");
                System.out.println("3. Revista");
                int escolhaItemMulta = s.nextInt();
                if (escolhaItemMulta == 1) {
                    System.out.println("Informe a data de devolução no formato: YYYY-MM-DD: ");
                    String dataDevolucaoString = s.next();
                    LocalDate dataDevolucao = LocalDate.parse(dataDevolucaoString);
                    livro.calcularMulta(dataDevolucao);
                } else if (escolhaItemMulta == 2) {
                    System.out.println("Informe a data de devolução (Formato: YYYY-MM-DD): ");
                    String dataDevolucaoStringDVD = s.next();
                    LocalDate dataDevolucaoDVD = LocalDate.parse(dataDevolucaoStringDVD);
                    dvd.calcularMulta(dataDevolucaoDVD);
                } else if (escolhaItemMulta == 3) {
                    System.out.println("Informe a data de devolução (Formato: YYYY-MM-DD): ");
                    String dataDevolucaoStringRevista = s.next();
                    LocalDate dataDevolucaoRevista = LocalDate.parse(dataDevolucaoStringRevista);
                    revista.calcularMulta(dataDevolucaoRevista);
                } else {
                    System.out.println("Escolha de item inválida.");
                }
            } else if (opcao == 4) {
                System.out.println("Saindo do programa.");
            } else {
                System.out.println("Opção inválida.");
            }
        } while (opcao != 4);

        s.close();
    }
}
