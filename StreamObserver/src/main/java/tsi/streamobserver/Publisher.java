package tsi.streamobserver;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private List<Subscriber> inscritos;

    public Publisher() {
        inscritos = new ArrayList<>();
    }
    
    void inscrever(Subscriber sub) {
        inscritos.add(sub);
    }
    
    void deinscrever(Subscriber sub) {
        inscritos.remove(sub);
    }
    
    void notificarInscritos(String mensagem) {
        for(Subscriber inscrito : inscritos) {
            inscrito.update(mensagem);
        }
    }
}
