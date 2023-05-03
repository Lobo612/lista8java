public class Cliente {
    public void desconto(double valor){
        valor *= 0.9;
        System.out.println("Valor já com o desconto para clientes: " + valor);
    }
}