package otras_Practicas;

import javax.swing.*;

public class CuadroArea extends JFrame{
 
 private JTextField textfield1;
 private JTextArea textarea1;

 public CuadroArea(){
 setLayout(null);
 textfield1 = new JTextField();
 textfield1.setBounds(10,10,200,30);
 add(textfield1);

 textarea1 = new JTextArea();
 textarea1.setBounds(10,50,400,300);
 add(textarea1);
 }
 
 public static void main(String args[]){
  CuadroArea cuadroarea1 = new CuadroArea();
  cuadroarea1.setBounds(0,0,540,400);  
  cuadroarea1.setVisible(true);
  cuadroarea1.setResizable(false);
  cuadroarea1.setLocationRelativeTo(null);
 }
}