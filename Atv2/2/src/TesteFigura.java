public class TesteFigura {
    public static void main(String[] args) throws Exception {
        Quadrado quadrado1 = new Quadrado();
        Circulo circulo1 = new Circulo();
        Figura figura1 = new Figura();
        System.out.println("Lado do quadrado: " + quadrado1.area(25) + "\nRaio do círculo: " + circulo1.area(15) + "\nArea da figura: " + figura1.area(55));
    }
}