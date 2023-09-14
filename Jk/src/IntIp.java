public class IntIp {
    private int myIp;
//jijii
    public void IntIp(short oct1, short oct2, short oct3, short oct4) {
        this.myIp = this.myIp | oct1;
        this.myIp = this.myIp << 8;
        this.myIp = this.myIp | oct2;
        this.myIp = this.myIp << 8;
        this.myIp = this.myIp | oct3;
        this.myIp = this.myIp << 8;
        this.myIp = this.myIp | oct4;
    }

    public void Codificar(short oct1, short oct2, short oct3, short oct4) {
        this.myIp = this.myIp | oct1;
        this.myIp = this.myIp << 8;
        this.myIp = this.myIp | oct2;
        this.myIp = this.myIp << 8;
        this.myIp = this.myIp | oct3;
        this.myIp = this.myIp << 8;
        this.myIp = this.myIp | oct4;
    }

    public IntIp(String cadenaIp) {
        int posicionPunto = cadenaIp.indexOf('.');
        String cadOct1 = cadenaIp.substring(posicionPunto -1);

        int posicionSegPunto = cadOct1.indexOf('.', posicionPunto + 1);
        String cadOct2 = cadenaIp.substring(posicionPunto + 1, posicionSegPunto - 1);

        int posicionTercerPunto = cadenaIp.indexOf('.', posicionSegPunto + 1);
        String cadOct3 = cadenaIp.substring(posicionSegPunto + 1, posicionTercerPunto - 1);

        String cadOct4 = cadenaIp.substring(posicionTercerPunto + 1);

        short numOct1 = Short.parseShort(cadOct1);
        
        short numOct3 = Short.parseShort(cadOct3);
        short numOct4 = Short.parseShort(cadOct4);


        this.Codificar(numOct1, numOct2, numOct3, numOct4);
    }

    public IntIp(short s, short t, short u, short v) {
    }

    public String ToString() {
        return Integer.toBinaryString(myIp);

    }
}
 