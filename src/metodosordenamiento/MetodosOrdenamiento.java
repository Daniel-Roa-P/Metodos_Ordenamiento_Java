
package metodosordenamiento;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class MetodosOrdenamiento extends JFrame implements ActionListener{
    
    JButton botonMejor = new JButton("Calcular mejor caso");
    JButton botonMedio = new JButton("Calcular caso medio");
    JButton botonPeor = new JButton("Calcular peor caso");
    JButton botonIngreso = new JButton("Ingresar tamaño");
    
    JLabel jLNumero = new JLabel("Ingrese el tamaño del arreglo");
    JLabel jLFormula = new JLabel("OE por formula");
    JLabel jLContador = new JLabel("OE por contador");
    JLabel jLBur = new JLabel("Metodo de burbuja: ");
    JLabel jLIns = new JLabel("Metodo de insercion: ");
    JLabel jLSel = new JLabel("Metodo de seleccion: ");
    
    JTextField cBur = new JTextField();
    JTextField fBur = new JTextField();
    JTextField cIns = new JTextField();
    JTextField fIns = new JTextField();
    JTextField cSel = new JTextField();
    JTextField fSel = new JTextField();
    JTextField tamaño = new JTextField("100");
    
    private int [] lista,lista2,lista3;
    private Metodo metodo;
    int largo = 100;
    
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
        
        c.add(botonMejor);
        c.add(botonMedio);
        c.add(botonPeor);
        c.add(botonIngreso);
        
        c.add(jLNumero);
        c.add(jLFormula);
        c.add(jLContador);
        c.add(jLBur);
        c.add(jLIns);
        c.add(jLSel);
        
        c.add(cBur);
        c.add(fBur);
        c.add(cIns);
        c.add(fIns);
        c.add(cSel);
        c.add(fSel);
        c.add(tamaño);
        
        jLNumero.setBounds(100, 50, 200, 20);
        jLFormula.setBounds(650, 20, 200, 20);
        jLContador.setBounds(500, 20, 200, 20);
        jLBur.setBounds(350, 50, 200, 20);
        jLIns.setBounds(350, 100, 200, 20);
        jLSel.setBounds(350, 150, 200, 20);
        
        cBur.setBounds(500, 50, 100, 20);
        fBur.setBounds(650, 50, 100, 20);
        cIns.setBounds(500, 100, 100, 20);
        fIns.setBounds(650, 100, 100, 20);
        cSel.setBounds(500, 150, 100, 20);
        fSel.setBounds(650, 150, 100, 20);
        tamaño.setBounds(150, 100, 50, 20);
        
        botonIngreso.setBounds(100, 150, 165, 20);
        botonIngreso.setBackground(Color.cyan);
        botonIngreso.addActionListener(this);
        botonMejor.setBounds(800, 50, 250, 20);
        botonMejor.setBackground(Color.green);
        botonMejor.addActionListener(this);
        botonMedio.setBounds(800, 100, 250, 20);
        botonMedio.setBackground(Color.yellow);
        botonMedio.addActionListener(this);
        botonPeor.setBounds(800, 150, 250, 20);
        botonPeor.setBackground(Color.red);
        botonPeor.addActionListener(this);
        
    }
    
    public void llenarPeorLista(){
        
        int numero = largo;
        
        lista = new int[largo];
        lista2 = new int[largo];
        lista3 = new int[largo];
        
        for(int i = 0; i<lista.length; i++){
            
            lista[i]=numero;
            lista2[i]=numero;
            lista3[i]=numero;
            numero--;
            
        }
            
    }
    
    public void llenarMejorLista(){
        
        lista = new int[largo];
        lista2 = new int[largo];
        lista3 = new int[largo];
        
        for(int i = 0; i<lista.length; i++){
            
            lista[i]=i;
            lista2[i]=i;
            lista3[i]=i;
            
        }
        
        
    }
    
    public void llenarListaMedia(){
        
        lista = new int[largo];
        lista2 = new int[largo];
        lista3 = new int[largo];
        
        for(int i = 0; i<lista.length; i++){
        
            int aleatorio = (int) ((int) largo*Math.random());
            
            lista[i] = aleatorio;
            lista2[i] = aleatorio;
            lista3[i] = aleatorio;
            
        }
              
    }
    
    public void calcular(String caso){
        
        metodo = new Burbuja();
        metodo.ordenar(lista);
        cBur.setText(Integer.toString(metodo.getContador()));
        fBur.setText(Integer.toString(metodo.calcularFormula(caso)));
        
        metodo = new Insercion();
        
        metodo.ordenar(lista2);
        cIns.setText(Integer.toString(metodo.getContador()));
        fIns.setText(Integer.toString(metodo.calcularFormula(caso)));
        
        metodo = new Seleccion();
        metodo.ordenar(lista3);
        cSel.setText(Integer.toString(metodo.getContador()));
        fSel.setText(Integer.toString(metodo.calcularFormula(caso)));
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == botonIngreso && tamaño.getText().length() != 0){
        
            largo = Integer.parseInt(tamaño.getText());
            
        }else if(e.getSource() == botonMejor){
            
            llenarMejorLista();  
            calcular("mejor");
            
        } else if(e.getSource() == botonMedio){;
            
            llenarListaMedia();
            calcular("medio");
            
        }   else if(e.getSource() == botonPeor){
            
            llenarPeorLista();
            calcular("peor");
            
        }
        
        
    }
    
    
    
}
