
package metodosordenamiento;

public abstract class Metodo {
    
    protected int [] lista;
    protected int formula;
    protected int contador = 0;
    
    public abstract void ordenar(int[] lista);

    public int getContador() {
        return contador;
    }

    public abstract int calcularFormula(String caso);
    
    
}
