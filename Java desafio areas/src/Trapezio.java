public class Trapezio {
    double baseMaior;
    double baseMenor;
    double altura;

    double calcularAreaTrapezio(){
        double expressao = (baseMaior + baseMenor) / 2;
        return (expressao * altura);
    }

}
