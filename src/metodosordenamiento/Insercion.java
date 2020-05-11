
package metodosordenamiento;

public class Insercion extends Metodo {
 
    @Override
    public int ordenar(int[] lista) {
        
        this.lista = lista;
        
        int j, temp;
        int i = 1;
        
        contador = contador + 2;
        
        while (i < lista.length) {
            
            j = i - 1;
            temp = lista[i];
            
            while (j>=0 && temp < lista[j]) {
                
                lista[j+1] = lista[j];
                j--;
                
                contador = contador + 8;
                
            }
            
            lista[j+1] = temp;
            i = i + 1;
            
            contador = contador + 12;
            
        }
        
        return contador;
        
    }

    @Override
    public int calcularMejor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int calcularMedio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int calcularPeor() {
        
        formula = 8*(((lista.length/2)*(lista.length+1)) - lista.length) + 12*(lista.length-1) + 4;
        
        return formula; 
    
    }
    
}
