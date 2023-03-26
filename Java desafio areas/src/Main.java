
public class Main {
    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo();
        triangulo1.altura = 10;
        triangulo1.base = 5;
        System.out.println("A área do triangulo é " + triangulo1.calcularAreaTriangulo());

        Quadrado quadrado1 = new Quadrado();
        quadrado1.lado = 2;
        System.out.println("A área do quadrado é " + quadrado1.calcularAreaLado());

        Circunferencia circunferencia1 = new Circunferencia();
        circunferencia1.raio = 10;
        System.out.println("A área da circunferencia é " + circunferencia1.calcularAreaCircunferencia());

        Trapezio trapezio1 = new Trapezio();
        trapezio1.altura = 10;
        trapezio1.baseMaior = 15;
        trapezio1.baseMenor = 5;
        System.out.println("A área do trapezio é " + trapezio1.calcularAreaTrapezio());
    }

}