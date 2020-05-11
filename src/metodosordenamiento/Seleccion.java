
package metodosordenamiento;

public class Seleccion extends Metodo{
    
    int mitad;
    
    @Override
    public int ordenar(int[] lista){
        
        this.lista = lista;
        
        int t,i,j,x;
        int N = lista.length;
        mitad = (int) N/2;
        
        contador=3;
        
        for(i=0; i < mitad; i++) { 
            
            x = i; 
            contador=contador+8;
          
            for(j=i+1; j < N - i; j++) { 
                
                if(lista[x] > lista[j]) {
              
                    x=j;               
                    contador=contador+1;
                
                }
            
            contador=contador+5;
            
            }
          
            if(i!=x) {
            
                t=lista[i];
                lista[i]=lista[x];
                lista[x]=t;
                contador=contador+7;
            }
            
        }
            
        return contador;
        
    }

    @Override
    public int calcularMejor() {
        
        if(lista.length%2 !=0){
        
            formula = (5*(mitad)*(mitad+1)) + 8*(mitad) + 3;
        
        } else {
        
            formula = (5*(mitad)*(mitad)) + 8*(mitad) + 3;
            
        }
        
        return formula;
        
    }

    @Override
    public int calcularMedio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int calcularPeor() {
        
        if(lista.length%2 !=0){
        
            formula = (6*(mitad)*(mitad+1)) + 7*(mitad) + 8*(mitad) + 3;
        
        } else {
        
            formula = (6*(mitad)*(mitad)) + 7*(mitad) + 8*(mitad) + 3;
            
        }
    
        return formula;
        
    }
    
}
