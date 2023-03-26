public class Main {
    public static void main(String[] args) {
        Relogio relogio = new Relogio();
        relogio.acertarRelogio(3, 25, 50);

        System.out.println("Hora atual: " + relogio.lerHora());
        System.out.println("Minuto atual: " + relogio.lerMinuto());
        System.out.println("Segundo atual: " + relogio.lerSegundo());
    }
}
