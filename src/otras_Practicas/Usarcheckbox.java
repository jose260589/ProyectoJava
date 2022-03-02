package otras_Practicas;

import javax.swing.*;
import javax.swing.event.*; // este maneja eventos para JCheckBox

public class Usarcheckbox extends JFrame implements ChangeListener{ // ChangeListener se para darle eventos a los checkbox

 private JCheckBox check1, check2, check3;

 public Usarcheckbox(){
  setLayout(null);
  check1 = new JCheckBox("Ingles");
  check1.setBounds(10,10,150,30);
  check1.addChangeListener(this); //es igual que los otros listener, pero aqui va change
  add(check1);

  check2 = new JCheckBox("Frances");
  check2.setBounds(10,50,150,30);
  check2.addChangeListener(this); //es igual que los otros listener, pero aqui va change
  add(check2);

  check3 = new JCheckBox("Aleman");
  check3.setBounds(10,90,150,30);
  check3.addChangeListener(this); //es igual que los otros listener, pero aqui va change
  add(check3);
 }

 public void stateChanged(ChangeEvent e){//se usa estas opciones para estos eventos
  String cad = "";
  if(check1.isSelected() == true){
     cad= cad + "Ingles-";
  }
  if(check2.isSelected() == true){
     cad= cad + "Frances-";
  }
  if(check3.isSelected() == true){
     cad= cad + "Aleman-";
  }
 setTitle(cad);// esto es para que se muestre en los titulos
 }

 public static void main(String args[]){
  Usarcheckbox formulario1 = new Usarcheckbox();
  formulario1.setBounds(0,0,350,200);
  formulario1.setVisible(true);
  formulario1.setResizable(false);
  formulario1.setLocationRelativeTo(null);
 }

}