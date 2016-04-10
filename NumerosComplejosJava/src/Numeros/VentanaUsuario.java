package Numeros;


import java.awt.*;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.*;

public class VentanaUsuario {
	
	public Image imagen;
	public URL fondo;

		/*Aqui vamos a declarar todos los objetos que usaremos en la ventana*/
	JFrame ventana = new JFrame();
	JPanel panelsuperior = new JPanel();
	JPanel panelcentral = new JPanel();
	JPanel panelinferior = new JPanel();
	
	JLabel mensaje = new JLabel("Bienvenido al programa");
	JLabel seleccion = new JLabel("�Que desea realizar?");
	
	JButton sumar = new JButton("Suma");
	JButton restar = new JButton("Resta");
	JButton multiplicar = new JButton("Multiplicar");
	JButton dividir = new JButton("Dividir");
	JButton salir = new JButton("Salir");
	
	JMenuBar mb = new JMenuBar();
	JMenu menu = new JMenu("Opciones");
	JMenuItem opciones,autor,instrucciones;
		
		
		/*Esta clase es la constructora de la ventana*/
		
		public void ventana(){
			
			
			Icon icono = new ImageIcon("../imagenes/minato.png");
			
			
			ventana.setSize(600, 500);
			ventana.setIconImage(new ImageIcon(getClass().getResource("../imagenes/minato.png")).getImage());
			ventana.setLocationRelativeTo(null);
			ventana.setResizable(false);
			fondo = this.getClass().getResource("../imagenes/fondo2.jpg");
			imagen= new ImageIcon(fondo).getImage();
			ventana.setTitle("Operaciones con numeros complejos");
			ventana.add(panel);
			
			ventana.setJMenuBar(mb);
			mb.add(menu);
			opciones = new JMenuItem("Opciones de programa");
			autor = new JMenuItem("Acerca del autor");
			
			instrucciones = new JMenuItem("Instrucciones de uso");
			menu.add(autor);
			menu.add(instrucciones);
			instrucciones.addActionListener(new ActionListener(){
				
				@Override
				public void actionPerformed(ActionEvent e){
					
					JOptionPane.showMessageDialog(null, "Instrucciones"+
					"\n"+"Para poder utilizar el programa solo hay que seleccionar"+"\n"
							+ "el boton con la operacion que se desee realizar"+"\n"
							+ "automaticamente el programa te redigira a una pesta�a en donde podras realizar "+"\n"
							+ "las operaciones se�aladas","Instrucciones de uso",JOptionPane.PLAIN_MESSAGE);
				}
				
			});
			
			autor.addActionListener(new ActionListener(){
				
				@Override
				public void actionPerformed(ActionEvent e){
					
					JOptionPane.showMessageDialog(null, "Software Creado por: " + "\n"+"Gonzalez Aranda Erick Damian"+"\n"+"Ingenieria en sistemas computacionales"+
					"\n"+"Tecnologico de Estudios Superiores de Huixquilucan", "Autor", JOptionPane.PLAIN_MESSAGE);
				}
				
			});
			
			
			ventana.add("South",panelinferior);
			panel.add(mensaje);
			mensaje.setFont(new java.awt.Font("Tahoma", 0, 36));
			
			panel.add(seleccion);
			seleccion.setBounds(100, 300, 100, 40);
			seleccion.setFont(new java.awt.Font("Tahoma", 0, 36));
			ventana.setVisible(true);
				
			
			panelinferior.setLayout(new GridLayout(2,3));
						
			/*Aqui agregamos los botones al panel inferior*/
			panelinferior.add(sumar);
			panelinferior.add(restar);
			panelinferior.add(multiplicar);
			panelinferior.add(dividir);
			panelinferior.add(salir);
			
			/*Le daremos funcionalidad a los botones*/
			sumar.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
					
					Metodos suma = new Metodos();
					suma.sumar();
					ventana.dispose();
					
				}
			});
			restar.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
					Metodos resta = new Metodos();
					resta.restar();
					ventana.dispose();
					
				}
			});
			multiplicar.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
					Metodos multi = new Metodos();
					multi.multiplicaciones();
					ventana.dispose();
					
				}
			});
			dividir.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
					Metodos div = new Metodos();
					div.diviciones();
					ventana.dispose();
					
				}
			});
			
			salir.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
					
					System.exit(0);
					
				}
			});
			ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
			
		}
		
		public JPanel panel = new JPanel(){
			
                        @Override
			public void paintComponent(Graphics g){
				
				g.drawImage(imagen, 0,0, getWidth(), getHeight(), this);
			}
			
		};
		
		
		
		
		
}
