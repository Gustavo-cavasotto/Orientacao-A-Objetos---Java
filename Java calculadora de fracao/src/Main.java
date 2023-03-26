public class Main {
    public static void main(String[] args) {
        Fracao fracao1 = new Fracao(2, 3);
        Fracao fracao2 = new Fracao(3, 4);

        Fracao resultado = fracao1.multiplicar(fracao2);

        System.out.println("O resultado da multiplicação é: " + resultado.getNumerador() + "/" + resultado.getDenominador());
    }
}