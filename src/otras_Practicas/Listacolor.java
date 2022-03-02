package otras_Practicas;

import javax.swing.*;
import java.awt.event.*;

public class Listacolor extends JFrame implements ItemListener{

 private JComboBox combo1; //Esto es para hacer una lista

 public Listacolor(){
  setLayout(null);
  combo1 = new JComboBox();
  combo1.setBounds(10,10,80,20);
  add(combo1);

  combo1.addItem("rojo");
  combo1.addItem("verde");
  combo1.addItem("amarrillo");
  combo1.addItem("negro");
  combo1.addItemListener(this);
 }

 public void itemStateChanged(ItemEvent e){
  if(e.getSource() == combo1){
     String seleccion = combo1.getSelectedItem().toString();
     setTitle(seleccion);
    }
 }
 
 public static void main(String args[]){
  Listacolor lista1 = new Listacolor();
  lista1.setBounds(0,0,250,150);
  lista1.setVisible(true);
  lista1.setResizable(false);
  lista1.setLocationRelativeTo(null);
 }
}