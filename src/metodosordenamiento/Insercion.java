
package metodosordenamiento;

public class Insercion extends Metodo {
 
    @Override
    public int ordenar(int[] lista) {
        
        this.lista = lista;
        
        int j, temp;
        int i = 1;
        
        contador =  2;
        
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
        
        contador = contador + 2;
        
        return contador;
        
    }

    @Override
    public int calcularMejor() {
    
        formula = 12*(lista.length-1) + 4;
        
        return formula; 
        
    }

    @Override
    public int calcularMedio() {
        
        formula = (int) (4*(((lista.length/2.0)*(lista.length+1)) - lista.length) + 12*(lista.length-1) + 4);
        
        return formula;
        
    }

    @Override
    public int calcularPeor() {
        
        formula = (int) (8*(((lista.length/2.0)*(lista.length+1)) - lista.length) + 12*(lista.length-1) + 4);
        
        return formula; 
    
    }
    
}
