
/**
 * Write a description of class IntIp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IntIp {
    // instance variables - replace the example below with your own
    private int myIp;

    /**
     * Constructor for objects of class IntIp
     */
    public IntIp(short oct1, short oct2, short oct3, short oct4) {
        // Asignar a myIp los octetos a nivel de bits
        this.myIp = this.myIp | oct1;
        this.myIp = this.myIp << 8;
        this.myIp = this.myIp | oct2;
        this.myIp = this.myIp << 8;
        this.myIp = this.myIp | oct3;
        this.myIp = this.myIp << 8;
        this.myIp = this.myIp | oct4;
    }

    // Al fin sirve
    public IntIp(String cadenaIp) {
        int posicionPunto = cadenaIp.indexOf('.');
        String cadOct1 = cadenaIp.substring(0, posicionPunto);

        int posicionSegPunto = cadenaIp.indexOf('.', posicionPunto + 1);
        String cadOct2 = cadenaIp.substring(posicionPunto + 1, posicionSegPunto);

        int posicionTercerPunto = cadenaIp.indexOf('.', posicionSegPunto + 1);
        String cadOct3 = cadenaIp.substring(posicionSegPunto + 1, posicionTercerPunto);

        String cadOct4 = cadenaIp.substring(posicionTercerPunto + 1);

        short numOct1 = Short.parseShort(cadOct1);
        short numOct2 = Short.parseShort(cadOct2);
        short numOct3 = Short.parseShort(cadOct3);
        short numOct4 = Short.parseShort(cadOct4);

        this.codificar(numOct1, numOct2, numOct3, numOct4);
    }

    public void codificar(short oct1, short oct2, short oct3, short oct4) {
        // Asignar a myIp los octetos a nivel de bits
        this.myIp = this.myIp | oct1;
        this.myIp = this.myIp << 8;
        this.myIp = this.myIp | oct2;
        this.myIp = this.myIp << 8;
        this.myIp = this.myIp | oct3;
        this.myIp = this.myIp << 8;
        this.myIp = this.myIp | oct4;
    }

    /**
     * @name toString - Devuelve la ip como una cadena de bits
     * @return the sum of x and y
     */
    public String toString() {
        return Integer.toBinaryString(this.myIp);
    }
}
