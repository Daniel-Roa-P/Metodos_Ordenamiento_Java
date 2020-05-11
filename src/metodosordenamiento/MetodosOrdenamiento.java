
package metodosordenamiento;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MetodosOrdenamiento extends JFrame implements ActionListener{
    
    JButton botonBurbuja = new JButton("Burbuja");
    JButton botonSeleccion = new JButton("Seleccion");
    JButton botonInsercion = new JButton("Insercion");
    private int [] lista;
    private Metodo metodo;
    int largo = 97;
    
    public static void main(String[] args) {
        
        MetodosOrdenamiento m = new MetodosOrdenamiento();
        m.setSize(1200, 700);
        m.setTitle("Metodos de oredenamiento");
        m.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        m.setVisible(true);
        
    }

    public MetodosOrdenamiento(){
        
        Container c = getContentPane();
        c.setLayout(null);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        
        c.add(botonInsercion);
        c.add(botonSeleccion);
        c.add(botonBurbuja);
        
        botonBurbuja.setBounds(100, 100, 200, 20);
        botonBurbuja.addActionListener(this);
        
        botonInsercion.setBounds(100, 300, 200, 20);
        botonInsercion.addActionListener(this);
        
        botonSeleccion.setBounds(100, 200, 200, 20);
        botonSeleccion.addActionListener(this);
        
    }
    
    public void llenarPeorLista(){
        
        int numero = largo;
        
        lista = new int[largo];
        
        for(int i = 0; i<lista.length; i++){
            
            lista[i]=numero;
            numero--;
            
        }
            
    }
    
    public void llenarMejorLista(){
        
        lista = new int[largo];
        
        for(int i = 0; i<lista.length; i++){
            
            lista[i]=i;
            
        }
        
        
    }
    
    public void llenarListaMedia(){
        
        lista = new int[largo];
        
        for(int i = 0; i<lista.length; i++){
            
            lista[i] = (int) ((int) largo*Math.random());
            
        }
              
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == botonBurbuja){
            
            llenarPeorLista();
            
            metodo = new Burbuja();
            
            System.out.println("Contador: " + metodo.ordenar(lista));
            System.out.println("Formula: " + metodo.calcularPeor());
            
            llenarMejorLista();
            
            System.out.println("Contador: " + metodo.ordenar(lista));
            System.out.println("Formula: " + metodo.calcularMejor());
            
            llenarListaMedia();
            
            System.out.println("Contador: " + metodo.ordenar(lista));
            System.out.println("Formula: " + metodo.calcularMedio());
            
        } else if(e.getSource() == botonSeleccion){
            
            llenarPeorLista();
            
            metodo = new Seleccion();
            
            System.out.println("Contador: " + metodo.ordenar(lista));
            System.out.println("Formula: " + metodo.calcularPeor());
            
            llenarMejorLista();
            
            System.out.println("Contador: " + metodo.ordenar(lista));
            System.out.println("Formula: " + metodo.calcularMejor());
            
        }   else if(e.getSource() == botonInsercion){
            
            llenarPeorLista();
            
            metodo = new Insercion();
            
            System.out.println("Contador: " + metodo.ordenar(lista));
            System.out.println("Formula: " + metodo.calcularPeor());
            
            llenarMejorLista();
            
            System.out.println("Contador: " + metodo.ordenar(lista));
            System.out.println("Formula: " + metodo.calcularMejor());
            
        }
        
        
    }
    
    
    
}
