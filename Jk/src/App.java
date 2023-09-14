public class App {
    public static void main(String[] args) throws Exception {
        IntIp ip = new IntIp((short) 4, (short) 4, (short) 4, (short) 4);
        ip.Codificar((short) 4, (short) 4, (short) 4, (short) 4);
        System.out.println("La dirección IP es: " + ip.ToString());

    }
}
