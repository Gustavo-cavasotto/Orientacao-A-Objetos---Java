public class Ponteiro {
    private int posicao;

    public void setPosicao(int posicao) {
        this.posicao = posicao % 12; // assume 12 horas no relógio
    }

    public int getPosicao() {
        return this.posicao;
    }
}