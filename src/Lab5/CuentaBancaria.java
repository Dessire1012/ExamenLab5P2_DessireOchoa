
package Lab5;

import java.util.logging.Logger;


public class CuentaBancaria {
    private int SaldoDis;
    private int numCuenta;

    public CuentaBancaria(int SaldoDis, int numCuenta) throws ExceptionNintendo {
        this.setSaldoDis(SaldoDis);
        this.numCuenta = numCuenta;
    }

    public CuentaBancaria() {
    }

    public int getSaldoDis() {
        return SaldoDis;
    }

    public void setSaldoDis(int SaldoDis) throws ExceptionNintendo{
        if (SaldoDis >= 2000 && SaldoDis <= 10000){
            this.SaldoDis = SaldoDis;  
        }else{
            throw new ExceptionNintendo("La cantidad no entra en los parametros");
        }
        
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "SaldoDis=" + SaldoDis + ", numCuenta=" + numCuenta + '}';
    }

}
