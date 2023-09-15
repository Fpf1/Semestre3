public class App {
    public static void main(String[] args) throws Exception {
<<<<<<< Updated upstream:Jk/src/App.java
        IntIp ip = new IntIp((short) 4, (short) 4, (short) 4, (short) 4);
        ip.Codificar((short) 4, (short) 4, (short) 4, (short) 4);
        System.out.println("La dirección IP es: " + ip.ToString());
=======
        //Creación del objeto 
        IntIp ipPc = new IntIp((short) 192, (short) 168, (short) 25, (short) 3);
        
        //imprimir contenido de ip
        System.out.println("La dirección IP es: " + ipPc);
        
        IntIp otraIp = new IntIp("192.168.25.3");
        
        //imprimir contenido de ip
        System.out.println("La dirección IP es: " + otraIp);
>>>>>>> Stashed changes:Jk/src/Tarea.java

    }
}
