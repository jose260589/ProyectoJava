package otras_Practicas;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Terminos extends JFrame implements ActionListener, ChangeListener{ // para implementar clases de eschucha se pueden separar por comas ",", y con esto se puede implementar varias clases

 private JLabel label1;
 private JCheckBox check1;
 private JButton boton1;

 public Terminos(){
  setLayout(null);
  label1 = new JLabel("Aceptar Terminos y condiciones");
  label1.setBounds(10,10,400,30);
  add(label1);

  check1 = new JCheckBox("Acepto");
  check1.setBounds(10,50,100,30);
  check1.addChangeListener(this);
  add(check1);

  boton1 = new JButton("Continuar");
  boton1.setBounds(10,100,100,30);
  add(boton1);
  boton1.addActionListener(this);
  boton1.setEnabled(false);// esto es para desactivar el boton si es false, o true para que este activo.
 }

 public void stateChanged(ChangeEvent e){//evento para checkbox
  if(check1.isSelected() == true ){
     boton1.setEnabled(true);
  } else {
    boton1.setEnabled(false);
  }
 }
 public void actionPerformed(ActionEvent e){// este es para el evento del boton
  if(e.getSource() == boton1){//e.getSource() es para ver donde se origina un evento
    System.exit(0);
  }
 }
 
 public static void main(String args[]){
  Terminos termino1 = new Terminos();
  termino1.setBounds(0,0,350,200);
  termino1.setVisible(true);
  termino1.setResizable(false);
  termino1.setLocationRelativeTo(null);
 }
}