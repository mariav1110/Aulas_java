import heranca2.Animal;
import heranca2.Habitat;

public class Mamifero extends Animal {
    protected int tempoGestacao;

    public Mamifero(String nome, int idade, Habitat habitat,int tempoGestacao) {
        super(nome, idade, habitat);
        this.tempoGestacao = tempoGestacao;
    }

    public int getTempoGestacao() {
        return tempoGestacao;
    }

    public void setTempoGestacao(int tempoGestacao) {
        this.tempoGestacao = tempoGestacao;
    }
}
