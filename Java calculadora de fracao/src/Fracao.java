public class Fracao {
    private int numerador;
    private int denominador;

    public Fracao(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fracao multiplicar(Fracao outrafracao){
        int totalNumerador = this.numerador * outrafracao.numerador;
        int totalDenominador = this.denominador * outrafracao.denominador;
        Fracao resultadoFracao = new Fracao(totalNumerador, totalDenominador);
        return resultadoFracao;
    }
    /* Precisamos desses construtores, pois caso contrário será retornado uma variável do tipo Fracao, e precisamos
    de um inteiro */
    public int getNumerador() {
        return numerador;
    }
    public int getDenominador() {
        return denominador;
    }

}
