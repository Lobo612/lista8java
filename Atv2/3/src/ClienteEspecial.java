public class ClienteEspecial extends Cliente{
    public void desconto(double valor){
        valor *= 0.8;
        System.out.println("Valor já com o desconto para clientes especiais: " + valor);
    }
}