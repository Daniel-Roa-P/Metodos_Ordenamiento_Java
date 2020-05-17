
package metodosordenamiento;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
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
    JButton botonGraficar = new JButton("Graficar peor caso (20 - 500 de 10 en 10)");
    
    JLabel jLNumero = new JLabel("Ingrese el tamaño del arreglo");
    JLabel jLFormula = new JLabel("OE por formula");
    JLabel jLContador = new JLabel("OE por contador");
    JLabel jLBur = new JLabel("Metodo de burbuja: ");
    JLabel jLIns = new JLabel("Metodo de insercion: ");
    JLabel jLSel = new JLabel("Metodo de seleccion: ");
    JLabel jL1 = new JLabel("Burbuja ");
    JLabel jL2 = new JLabel("Insercion ");
    JLabel jL3 = new JLabel("Seleccion ");
    
    JLabel maximo = new JLabel("1.500.000");
    JLabel y1 = new JLabel("1.250.000");
    JLabel y2 = new JLabel("1.000.000");
    JLabel y3 = new JLabel("750.000");
    JLabel y4 = new JLabel("500.000");
    JLabel y5 = new JLabel("250.000");
    JLabel y6 = new JLabel("0");
    
    JLabel x1 = new JLabel("500");
    JLabel x2 = new JLabel("450");
    JLabel x3 = new JLabel("400");
    JLabel x4 = new JLabel("350");
    JLabel x5 = new JLabel("300");
    JLabel x6 = new JLabel("250");
    JLabel x7 = new JLabel("200");
    JLabel x8 = new JLabel("150");
    JLabel x9 = new JLabel("100");
    JLabel x10 = new JLabel("50");
    JLabel x11 = new JLabel("20");
    
    JTextField cBur = new JTextField();
    JTextField fBur = new JTextField();
    JTextField cIns = new JTextField();
    JTextField fIns = new JTextField();
    JTextField cSel = new JTextField();
    JTextField fSel = new JTextField();
    JTextField tamaño = new JTextField("100");
    
    String situacion = "peor";
    
    private int [] lista,lista2,lista3;
    private Metodo metodo;
    int largo = 100;
    
    public static void main(String[] args) {
        
        MetodosOrdenamiento m = new MetodosOrdenamiento();
        m.setSize(1200, 750);
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
        c.add(botonGraficar);
        
        c.add(jLNumero);
        c.add(jLFormula);
        c.add(jLContador);
        c.add(jLBur);
        c.add(jLIns);
        c.add(jLSel);
        c.add(jL3);
        c.add(jL2);
        c.add(jL1);
        
        c.add(maximo);
        
        c.add(y1);
        c.add(y2);
        c.add(y3);
        c.add(y4);
        c.add(y5);
        c.add(y6);
        
        c.add(x1);
        c.add(x2);
        c.add(x3);
        c.add(x4);
        c.add(x5);
        c.add(x6);
        c.add(x7);
        c.add(x8);
        c.add(x9);
        c.add(x10);
        c.add(x11);
        
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
        botonGraficar.setBounds(100, 180, 950, 20);
        botonGraficar.addActionListener(this);
        botonGraficar.setBackground(Color.ORANGE);
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
    
    public void pintar(String sit){
        
        Graphics g = getGraphics();
        
        g.drawLine(100, 240, 100, 650);
        g.drawLine(100, 240, 98, 245);
        g.drawLine(100, 240, 102, 245);
        
        maximo.setBounds(30, 215, 60, 10);
        y1.setBounds(30, 281, 60, 10);
        y2.setBounds(30, 347, 60, 10);
        y3.setBounds(40, 413, 50, 10);
        y4.setBounds(40, 479, 50, 10);
        y5.setBounds(40, 545, 50, 10);
        y6.setBounds(80, 615, 10, 10);
        
        g.drawLine(100, 650, 1150, 650);
        g.drawLine(1145, 648, 1150, 650);
        g.drawLine(1145, 652, 1150, 650);
        
        x1.setBounds(1085, 630, 40, 10);
        x2.setBounds(985, 630, 40, 10);
        x3.setBounds(885, 630, 40, 10);
        x4.setBounds(785, 630, 40, 10);
        x5.setBounds(685, 630, 40, 10);
        x6.setBounds(585, 630, 40, 10);
        x7.setBounds(485, 630, 40, 10);
        x8.setBounds(385, 630, 40, 10);
        x9.setBounds(285, 630, 40, 10);
        x10.setBounds(185, 630, 40, 10);
        x11.setBounds(125, 630, 40, 10);
        
        jL1.setBounds(320, 660, 100, 15);
        g.setColor(Color.red);
        g.drawLine(300, 700, 310, 700);
        jL2.setBounds(520, 660, 100, 15);
        g.setColor(Color.blue);
        g.drawLine(500, 700, 510, 700);
        jL3.setBounds(720, 660, 100, 15);
        g.setColor(Color.green);
        g.drawLine(700, 700, 710, 700);
        
        int espacio = 20;
        int ejeY, ejeY2, ejeY3, contador;
        int anteriorY = 650;
        int anteriorY2 = 650;
        int anteriorY3 = 650;
            
        while(espacio <= 500){
        
            largo = espacio;
            
            if(sit.equals("mejor")){
        
                llenarMejorLista();

            } else if (sit.equals("medio")){

                llenarListaMedia();
                
            } else {

                llenarPeorLista();
                
            }
            
            metodo = new Burbuja();
            
            metodo.ordenar(lista);
            
            contador = metodo.getContador();
            
            ejeY = (int) (650 - 400*(contador/(1499997.0)));
            
            g.setColor(Color.red);
            g.drawLine(100+(espacio*2), ejeY, 100+((espacio-10)*2), anteriorY);
            
            metodo = new Insercion();
            
            metodo.ordenar(lista2);
            
            contador = metodo.getContador();
            
            ejeY2 = (int) (650 - 400*(contador/(1499997.0)));
            
            g.setColor(Color.BLUE);
            g.drawLine(100+(espacio*2), ejeY2, 100+((espacio-10)*2), anteriorY2);
            
            metodo = new Seleccion();
            
            metodo.ordenar(lista3);
            
            contador = metodo.getContador();
            
            ejeY3 = (int) (650 - 400*(contador/(1499997.0)));
            
            g.setColor(Color.GREEN);
            g.drawLine(100+(espacio*2), ejeY3, 100+((espacio-10)*2), anteriorY3);
            
            espacio = espacio + 10; 
            
            anteriorY=ejeY;
            anteriorY2=ejeY2;
            anteriorY3=ejeY3;
        
        }
        
        largo = Integer.parseInt(tamaño.getText());
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == botonIngreso && tamaño.getText().length() != 0){
        
            largo = Integer.parseInt(tamaño.getText());
            
        }else if(e.getSource() == botonMejor){
            
            llenarMejorLista();
            botonGraficar.setText("Graficar mejor caso (20 - 500 de 10 en 10)");
            situacion = "mejor";           
            calcular(situacion);
            
        } else if(e.getSource() == botonMedio){;
            
            llenarListaMedia();
            situacion = "medio";
            botonGraficar.setText("Graficar caso promedio (20 - 500 de 10 en 10)");
            calcular(situacion);
            
        }   else if(e.getSource() == botonPeor){
            
            llenarPeorLista();
            situacion = "peor";
            botonGraficar.setText("Graficar peor caso (20 - 500 de 10 en 10)");
            calcular(situacion);
            
        } else if (e.getSource() == botonGraficar){
            
            Graphics g = getGraphics();
            g.setColor(Color.LIGHT_GRAY);
            g.fillRect(102, 250, 1200, 400);
            pintar(situacion);
            
        }
        
    } 
    
}
