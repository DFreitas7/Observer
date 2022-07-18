package tsi.streamobserver;

import java.util.Scanner;

public class StreamObserver {

    public static void main(String[] args) {
        PlataformaStream plataforma = new PlataformaStream();
        System.out.println("Bem vindo ao Sistema de Streaming!");
        
        Scanner scanner = new Scanner(System.in);
        Integer comando;
        do {
            System.out.println("Entre com o comando: 1 - Novo usuario 2 - Lançar filme 3 - Lançar serie! 0 - Sair");
            comando = Integer.parseInt(scanner.nextLine());
            
            switch (comando) {
                case 0:
                    System.out.println("Saindo do sistema!");
                    break;
                case 1:
                    System.out.println("Digite o nome do novo usuario:");
                    Usuario novoUsuario = new Usuario(scanner.nextLine());
                    
                    System.out.println("Deseja receber notificações de novos filmes? (y\\n)");
                    String resposta = scanner.nextLine();
                    
                    if (resposta.toLowerCase().contains("y")) {
                        plataforma.ativarNotificacoesFilmes(novoUsuario);
                    }
                    
                    System.out.println("Deseja receber notificações de novas series? (y\\n)");
                    resposta = scanner.nextLine();
                    if (resposta.toLowerCase().contains("y")) {
                        plataforma.ativarNotificacoesSeries(novoUsuario);
                    }
                    
                    break;
                case 2:
                    System.out.println("Digite o nome do filme a ser lançado:");
                    plataforma.lancarFilme(scanner.nextLine());
                    break;
                case 3:
                    System.out.println("Digite o nome da serie a ser lançada:");
                    plataforma.lancarSerie(scanner.nextLine());
                    break;
                default:
                    System.out.println("Comando inválido!");
                    comando = 1;
            }
        } while(comando != 0);
    }
}
