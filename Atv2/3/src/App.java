public class App {
    public static void main(String[] args) throws Exception {
        Cliente c1 = new Cliente();
        Cliente ce1 = new ClienteEspecial();
        Cliente c2 = new Cliente();
        Cliente ce2 = new ClienteEspecial();

        c1.desconto(2000);
        ce1.desconto(2000);
        c2.desconto(6000);
        ce2.desconto(6000);
    }
}