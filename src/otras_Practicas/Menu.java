package otras_Practicas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame implements ActionListener{
 
 private JMenuBar menubar; //Barra donde van los menu
 private JMenu menu1; //es para pestañas desplegables
 private JMenuItem menuitem1, menuitem2, menuitem3; //son las opciones que van en los menu desplegables

 public Menu(){
  setLayout(null);
  menubar = new JMenuBar(); //crear la barra
  setJMenuBar(menubar); // es para crear la barra

  menu1 = new JMenu("Opciones"); //esto es para las opciones del menu
  menubar.add(menu1); // hay que moner a menubar para decirle que va dentro de menu bar.

  menuitem1 = new JMenuItem("Rojo"); // descripcion de la lista desplegable del menu
  menuitem1.addActionListener(this); // es para el evento.
  menu1.add(menuitem1); // es lo que va dentro de la lista desplegable del menu, 

  menuitem2 = new JMenuItem("verde");
  menuitem2.addActionListener(this);
  menu1.add(menuitem2);

  menuitem3 = new JMenuItem("Azul");
  menuitem3.addActionListener(this);
  menu1.add(menuitem3);
 }

 public void actionPerformed(ActionEvent e){
   Container fondo = this.getContentPane(); //contenedor

   if(e.getSource() == menuitem1){
      fondo.setBackground(new Color(255,0,0));// es para el fondo del formulario
     }
   if(e.getSource() == menuitem2){
      fondo.setBackground(new Color(0,255,0));
     }
   if(e.getSource() == menuitem3){
      fondo.setBackground(new Color(0,0,255));
     }
 }

 public static void main(String args[]){
  Menu pantalla = new Menu();
  pantalla.setBounds(0,0,400,300);
  pantalla.setVisible(true);
  pantalla.setLocationRelativeTo(null);
 }
}