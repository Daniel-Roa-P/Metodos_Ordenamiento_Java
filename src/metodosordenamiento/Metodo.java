
package metodosordenamiento;

public abstract class Metodo {
    
    protected int [] lista;
    protected int formula;
    protected int contador = 0;
    
    public abstract int ordenar(int[] lista);

    public int getContador() {
        return contador;
    }

    public abstract int calcularMejor();
    public abstract int calcularMedio();
    public abstract int calcularPeor();
    
    
}
