public class Tarea {
    public static void main(String[] args) throws Exception {
        // Creación del objeto
        IntIp ipPc = new IntIp((short) 192, (short) 168, (short) 25, (short) 3);

        // imprimir contenido de ip
        System.out.println("La dirección IP es: " + ipPc);

        IntIp otraIp = new IntIp("192.168.25.3");

        // imprimir contenido de ip
        System.out.println("La dirección IP es: " + otraIp);

    }
}
