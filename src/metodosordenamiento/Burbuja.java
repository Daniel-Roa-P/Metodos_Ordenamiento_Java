
package metodosordenamiento;

public class Burbuja extends Metodo{
    
    @Override
    public int ordenar(int[] lista){
        
        this.lista = lista;
        
        contador = 3;
        
        for(int i=0;i < lista.length - 1; i++) {
            
            for(int j=i+1; j < lista.length; j++) {
                    
                if(lista[i] > lista[j]) {

                        int temp=lista[i];
                        lista[i]=lista[j];
                        lista[j]=temp;
                        
                        contador = contador + 7; 
                        
                    }
                
                contador = contador + 5;
                
            }
            
            contador = contador + 6;
            
        }
        
        return contador;
        
    }

    @Override
    public int calcularMejor() {
        
        formula = (5*(lista.length)*(lista.length) + 7*lista.length - 6) / 2;
        
        return formula;
        
    }

    @Override
    public int calcularMedio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int calcularPeor() {
        
       formula = 6*((lista.length)*(lista.length)) - 3 ;
       
       return formula;
       
    }
    
}
