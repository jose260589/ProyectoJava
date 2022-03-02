package otras_Practicas;

import javax.swing.*;

public class Formulario3 extends JFrame{
 
 private JLabel label1;
 private JLabel label2; 

 public Formulario3(){
  setLayout(null);
  label1 = new JLabel("Interfaz Grafica");
  label1.setBounds(10,20,300,30);
  add(label1);
  label2 = new JLabel("Version 1.0");
  label2.setBounds(10,100,100,30);
  add(label2);
 }
 
 public static void main(String args[]){
  Formulario3 formulario1 = new Formulario3();
  formulario1.setBounds(0,0,300,200);
  formulario1.setResizable(false);
  formulario1.setVisible(true);
  formulario1.setLocationRelativeTo(null);
 } 
}