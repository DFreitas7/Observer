package tsi.streamobserver;

public class PlataformaStream {
    private Publisher notificadorFilmes;
    private Publisher notificadorSeries;

    public PlataformaStream() {
        notificadorFilmes = new Publisher();
        notificadorSeries = new Publisher();
    }
    
    void ativarNotificacoesFilmes(Usuario usuario) {
        notificadorFilmes.inscrever(usuario);
    }
    
    void desativarNotificacoesFilmes(Usuario usuario) {
        notificadorFilmes.deinscrever(usuario);
    }
    
    void ativarNotificacoesSeries(Usuario usuario) {
        notificadorSeries.inscrever(usuario);
    }
    
    void desativarNotificacoesSeries(Usuario usuario) {
        notificadorSeries.deinscrever(usuario);
    }
    
    void lancarFilme(String nome) {
        notificadorFilmes.notificarInscritos("O filme " + nome + " acaba de ser lançado!");
    }
    
    void lancarSerie(String nome) {
        notificadorSeries.notificarInscritos("A serie " + nome + " acaba de ser lançada!");
    }
}
