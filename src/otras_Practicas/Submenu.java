package otras_Practicas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Submenu extends JFrame implements ActionListener{
 
 private JMenuBar menubar;
 private JMenu menu1, menu2, menu3; // para hacer sub menu, estos se crean como menu normales, menu2 y menu3 son submenu, manu1 es el munu principal.
 private JMenuItem menuitem1, menuitem2, menuitem3, menuitem4;

 public Submenu(){
  setLayout(null);
  menubar = new JMenuBar(); //Barra menu principal
  setJMenuBar(menubar);// para crear la barra de menu

  menu1 = new JMenu("Opciones"); // descripcion menu
  menubar.add(menu1); // se agrega dentro de la barra para que este dentro de esta

  menu2 = new JMenu("Tamaño de la Ventana");
  menu1.add(menu2);

  menu3 = new JMenu("Color de Fondo");
  menu1.add(menu3);

  menuitem1 = new JMenuItem("300*200");
  menu2.add(menuitem1);
  menuitem1.addActionListener(this);

  menuitem2 = new JMenuItem("640*480");
  menu2.add(menuitem2);
  menuitem2.addActionListener(this);

  menuitem3 = new JMenuItem("Rojo");
  menu3.add(menuitem3);
  menuitem3.addActionListener(this);

  menuitem4 = new JMenuItem("Verde");
  menu3.add(menuitem4);
  menuitem4.addActionListener(this);
 }

 public void actionPerformed(ActionEvent e){

  if(e.getSource() == menuitem1){
     setSize(300,200);// este metodo es para cambiar el tamaño de la pantalla
    }
  if(e.getSource() == menuitem2){
     setSize(640,480);
    }
  if(e.getSource() == menuitem3){
     getContentPane().setBackground(new Color(255,0,0));// para fondo rojo
    }
  if(e.getSource() == menuitem4){
     getContentPane().setBackground(new Color(0,255,0));// ´para fondo verde
    }
 }

 public static void main(String args[]){
  Submenu submenu1 = new Submenu();
  submenu1.setBounds(0,0,300,200);
  submenu1.setVisible(true);
  submenu1.setResizable(false);
  submenu1.setLocationRelativeTo(null);
 }
}
