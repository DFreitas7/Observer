package tsi.streamobserver;

public class Usuario implements Subscriber {
    private final String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(String mensagem) {
        System.out.println("Usuario " + nome + " recebendo a notificação " + mensagem);
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
