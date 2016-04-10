package Numeros;

import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

public class Metodos extends JFrame{
	
	public Image imagen;
	public URL fondo;
	
	public void sumar(){
		
		this.setTitle("Suma de numeros complejos");
		this.setSize(600,500);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setIconImage(new ImageIcon(getClass().getResource("../imagenes/minato.png")).getImage());
		
		
		
		
		fondo = this.getClass().getResource("../imagenes/fondo5.jpg");
		imagen= new ImageIcon(fondo).getImage();
		
		Container contenedor = getContentPane();
		contenedor.add(panel);
		this.setVisible(true);
		panel.setLayout(null);
		JLabel mensaje = new JLabel("Bienvenido a suma de numeros complejos");
		panel.add(mensaje);
		mensaje.setBounds(10,50,600,40);
		mensaje.setFont(new Font("Tahoma", 0, 28));
		
		JLabel complejo1, complejo2, i1, i2;
		JTextField numero1, numero2, numero3, numero4;
		complejo1 = new JLabel("Dado el numero complejo: Z1 =");
		panel.add(complejo1);
		complejo1.setBounds(20, 150, 200, 10);
		
		numero1 = new JTextField();
		panel.add(numero1);
		numero1.setBounds(215, 150, 50, 20);
		
		numero2 = new JTextField();
		panel.add(numero2);
		numero2.setBounds(270,150,50,20);
		
		i1 = new JLabel("i");
		panel.add(i1);
		i1.setBounds(325,150,20,20);
		
		
		complejo2 = new JLabel("Y el numero Complejo: Z2 =");
		panel.add(complejo2);
		complejo2.setBounds(20,200,200,10);
		
		numero3 = new JTextField();
		panel.add(numero3);
		numero3.setBounds(215,200,50,20);
		
		numero4 = new JTextField();
		panel.add(numero4);
		numero4.setBounds(270,200,50,20);
		
		i2 = new JLabel("i");
		panel.add(i2);
		i2.setBounds(325,200,20,20);
		
		JLabel determina = new JLabel("Determinar la suma de : ");
		panel.add(determina);
		determina.setBounds(340,150, 300, 20);
		
		JTextField primero = new JTextField();
		panel.add(primero);
		primero.setBounds(340,200,20,20);
		JLabel z1 = new JLabel("Z1");
		panel.add(z1);
		
		z1.setBounds(375,200,20,20);

		JLabel simbolo = new JLabel("+");
		panel.add(simbolo);
		simbolo.setBounds(395,200,10,10);
		
		JTextField segundo = new JTextField();
		panel.add(segundo);
		segundo.setBounds(400,200,20,20);
		JLabel z2 = new JLabel("Z2");
		panel.add(z2);
		z2.setBounds(432,200,40,20);
		JLabel resultado = new JLabel("El resultado de la suma es: ");
		panel.add(resultado);
		resultado.setBounds(20, 290, 200, 20);
		JTextField resulta = new JTextField();
		panel.add(resulta);
		resulta.setBounds(215,290,300,20);
		
		JButton regresar = new JButton("Regresar");
		panel.add(regresar);
		regresar.setBounds(490,430, 100,20);
		
		
		JButton sumando = new JButton("Sumar");
		panel.add(sumando);
		sumando.setBounds(270,250,150,20);;
		sumando.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed (ActionEvent e){
				int a,b,c,d;
				int x,y;
				a = Integer.parseInt(numero1.getText());
				b = Integer.parseInt(numero2.getText());
				c = Integer.parseInt(numero3.getText());
				d = Integer.parseInt(numero4.getText());
				
				x = Integer.parseInt(primero.getText());
				y = Integer.parseInt(segundo.getText());
				
				int aux1 = x*a;
				int aux2 = x*b;
				
				int aux3 = y*c;
				int aux4 = y*d;
				
				int suma1 = aux1+aux3;
				int suma2 = aux2+aux4;
				String su1 = Integer.toString(suma1);
				String su2 = Integer.toString(suma2);
				resulta.setText(su1+"..."+su2+"i");
				
			}
		});
		JButton limpiar = new JButton("Limpiar");
		panel.add(limpiar);
		limpiar.setBounds(50,250,150,20);
		limpiar.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e){
				numero1.setText("");
				numero2.setText("");
				numero3.setText("");
				numero4.setText("");
				
				primero.setText("");
				segundo.setText("");
				resulta.setText("");
				
			}
		});
		
	
		regresar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				
				VentanaUsuario vtn = new VentanaUsuario();
				vtn.ventana();
				dispose();
				
			}
		});
		
		
		
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}
	
	public void restar(){
		this.setTitle("Resta de numeros complejos");
		this.setSize(600,500);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setIconImage(new ImageIcon(getClass().getResource("../imagenes/minato.png")).getImage());
		
		
		
		fondo = this.getClass().getResource("../imagenes/fondo4.jpg");
		imagen= new ImageIcon(fondo).getImage();
		
		Container contenedor = getContentPane();
		contenedor.add(panel);
		this.setVisible(true);
		panel.setLayout(null);
		JLabel mensaje = new JLabel("Bienvenido a resta de numeros complejos");
		panel.add(mensaje);
		mensaje.setBounds(10,50,600,40);
		mensaje.setFont(new Font("Tahoma", 0, 28));
		
		JLabel complejo1, complejo2, i1, i2;
		JTextField numero1, numero2, numero3, numero4;
		complejo1 = new JLabel("Dado el numero complejo: Z1 =");
		panel.add(complejo1);
		complejo1.setBounds(20, 150, 200, 10);
		
		numero1 = new JTextField();
		panel.add(numero1);
		numero1.setBounds(215, 150, 50, 20);
		
		numero2 = new JTextField();
		panel.add(numero2);
		numero2.setBounds(270,150,50,20);
		
		i1 = new JLabel("i");
		panel.add(i1);
		i1.setBounds(325,150,20,20);
		
		
		complejo2 = new JLabel("Y el numero Complejo: Z2 =");
		panel.add(complejo2);
		complejo2.setBounds(20,200,200,10);
		
		numero3 = new JTextField();
		panel.add(numero3);
		numero3.setBounds(215,200,50,20);
		
		numero4 = new JTextField();
		panel.add(numero4);
		numero4.setBounds(270,200,50,20);
		
		i2 = new JLabel("i");
		panel.add(i2);
		i2.setBounds(325,200,20,20);
		
		JLabel determina = new JLabel("Determinar la resta de : ");
		panel.add(determina);
		determina.setBounds(340,150, 300, 20);
		
		JTextField primero = new JTextField();
		panel.add(primero);
		primero.setBounds(340,200,20,20);
		JLabel z1 = new JLabel("Z1");
		panel.add(z1);
		
		z1.setBounds(375,200,20,20);

		JLabel simbolo = new JLabel("+");
		panel.add(simbolo);
		simbolo.setBounds(395,200,10,10);
		
		JTextField segundo = new JTextField();
		panel.add(segundo);
		segundo.setBounds(400,200,20,20);
		JLabel z2 = new JLabel("Z2");
		panel.add(z2);
		z2.setBounds(432,200,40,20);
		JLabel resultado = new JLabel("El resultado de la resta es: ");
		panel.add(resultado);
		resultado.setBounds(20, 290, 200, 20);
		JTextField resulta = new JTextField();
		panel.add(resulta);
		resulta.setBounds(215,290,300,20);
		
		JButton regresar = new JButton("Regresar");
		panel.add(regresar);
		regresar.setBounds(490,430, 100,20);
		
		
		JButton sumando = new JButton("Restar");
		panel.add(sumando);
		sumando.setBounds(270,250,150,20);;
		sumando.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed (ActionEvent e){
				int a,b,c,d;
				int x,y;
				a = Integer.parseInt(numero1.getText());
				b = Integer.parseInt(numero2.getText());
				c = Integer.parseInt(numero3.getText());
				d = Integer.parseInt(numero4.getText());
				
				x = Integer.parseInt(primero.getText());
				y = Integer.parseInt(segundo.getText());
				
				int aux1 = x*a;
				int aux2 = x*b;
				
				int aux3 = y*c;
				int aux4 = y*d;
				
				int resta1 = aux1-aux3;
				int resta2 = aux2-aux4;
				String re1 = Integer.toString(resta1);
				String re2 = Integer.toString(resta2);
				resulta.setText(re1+"..."+re2+"i");
				
			}
		});
		JButton limpiar = new JButton("Limpiar");
		panel.add(limpiar);
		limpiar.setBounds(50,250,150,20);
		limpiar.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e){
				numero1.setText("");
				numero2.setText("");
				numero3.setText("");
				numero4.setText("");
				
				primero.setText("");
				segundo.setText("");
				resulta.setText("");
				
			}
		});
		
	
		regresar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				
				VentanaUsuario vtn = new VentanaUsuario();
				vtn.ventana();
				dispose();
				
			}
		});
		
		
		
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}

	
	public void multiplicaciones(){
		this.setTitle("Multiplicacion de numeros complejos");
		this.setSize(600,500);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setIconImage(new ImageIcon(getClass().getResource("../imagenes/minato.png")).getImage());
		
		
		
		fondo = this.getClass().getResource("../imagenes/fondo6.jpg");
		imagen= new ImageIcon(fondo).getImage();
		
		Container contenedor = getContentPane();
		contenedor.add(panel);
		this.setVisible(true);
		panel.setLayout(null);
		JLabel mensaje = new JLabel("Bienvenido a multiplicacion de numeros complejos");
		panel.add(mensaje);
		mensaje.setBounds(10,50,600,40);
		mensaje.setFont(new Font("Tahoma", 0, 28));
		
		JLabel complejo1, complejo2, i1, i2;
		JTextField numero1, numero2, numero3, numero4;
		complejo1 = new JLabel("Dado el numero complejo: Z1 =");
		panel.add(complejo1);
		complejo1.setBounds(20, 150, 200, 10);
		
		numero1 = new JTextField();
		panel.add(numero1);
		numero1.setBounds(215, 150, 50, 20);
		
		numero2 = new JTextField();
		panel.add(numero2);
		numero2.setBounds(270,150,50,20);
		
		i1 = new JLabel("i");
		panel.add(i1);
		i1.setBounds(325,150,20,20);
		
		
		complejo2 = new JLabel("Y el numero Complejo: Z2 =");
		panel.add(complejo2);
		complejo2.setBounds(20,200,200,10);
		
		numero3 = new JTextField();
		panel.add(numero3);
		numero3.setBounds(215,200,50,20);
		
		numero4 = new JTextField();
		panel.add(numero4);
		numero4.setBounds(270,200,50,20);
		
		i2 = new JLabel("i");
		panel.add(i2);
		i2.setBounds(325,200,20,20);
		
		JLabel determina = new JLabel("Determinar la multiplicacion de : ");
		panel.add(determina);
		determina.setBounds(340,150, 300, 20);
		
		JTextField primero = new JTextField();
		panel.add(primero);
		primero.setBounds(340,200,20,20);
		JLabel z1 = new JLabel("Z1");
		panel.add(z1);
		
		z1.setBounds(375,200,20,20);

		JLabel simbolo = new JLabel("+");
		panel.add(simbolo);
		simbolo.setBounds(395,200,10,10);
		
		JTextField segundo = new JTextField();
		panel.add(segundo);
		segundo.setBounds(400,200,20,20);
		JLabel z2 = new JLabel("Z2");
		panel.add(z2);
		z2.setBounds(432,200,40,20);
		JLabel resultado = new JLabel("El resultado de la multiplicacion es: ");
		panel.add(resultado);
		resultado.setBounds(20, 290, 200, 20);
		JTextField resulta = new JTextField();
		panel.add(resulta);
		resulta.setBounds(215,290,300,20);
		
		JButton regresar = new JButton("Regresar");
		panel.add(regresar);
		regresar.setBounds(490,430, 100,20);
		
		
		JButton sumando = new JButton("Multiplicar");
		panel.add(sumando);
		sumando.setBounds(270,250,150,20);;
		sumando.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed (ActionEvent e){
				int a,b,c,d;
				int x,y;
				a = Integer.parseInt(numero1.getText());
				b = Integer.parseInt(numero2.getText());
				
				c = Integer.parseInt(numero3.getText());
				d = Integer.parseInt(numero4.getText());
				
				x = Integer.parseInt(primero.getText());
				y = Integer.parseInt(segundo.getText());
				
				int aux1 = x*a;
				int aux2 = x*b;
				
				int aux3 = y*c;
				int aux4 = y*d;
				
				int multi1 = aux1*aux3;//Parte real con parte real
				int multi2 = aux1*aux4;//Parte real con parte imaginaria
				int multi3 = aux2*aux3;//Parte imaginaria con parte real
				int multi4 = aux2*aux4;//Parte imaginaria con parte imaginaria
				
				int cuadrado = multi4*-1;
				int suma1 = multi1+cuadrado;
				int suma2 = multi2+multi3;
				
				String mu1 = Integer.toString(suma1);
				String mu2 = Integer.toString(suma2);
				resulta.setText(mu1 + "..."+ mu2+"i");
				
			}
		});
		JButton limpiar = new JButton("Limpiar");
		panel.add(limpiar);
		limpiar.setBounds(50,250,150,20);
		limpiar.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e){
				numero1.setText("");
				numero2.setText("");
				numero3.setText("");
				numero4.setText("");
				
				primero.setText("");
				segundo.setText("");
				resulta.setText("");
				
			}
		});
		
	
		regresar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				
				VentanaUsuario vtn = new VentanaUsuario();
				vtn.ventana();
				dispose();
				
			}
		});
		
		
		
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}
	
	public void diviciones(){
		this.setTitle("Divicion de numeros complejos");
		this.setSize(600,500);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setIconImage(new ImageIcon(getClass().getResource("../imagenes/minato.png")).getImage());
		
		
		
		fondo = this.getClass().getResource("../imagenes/fondo7.jpg");
		imagen= new ImageIcon(fondo).getImage();
		
		Container contenedor = getContentPane();
		contenedor.add(panel);
		this.setVisible(true);
		panel.setLayout(null);
		JLabel mensaje = new JLabel("Bienvenido a divicion de numeros complejos");
		panel.add(mensaje);
		mensaje.setBounds(10,50,600,40);
		mensaje.setFont(new Font("Tahoma", 0, 28));
		
		JLabel complejo1, complejo2, i1, i2;
		JTextField numero1, numero2, numero3, numero4;
		complejo1 = new JLabel("Dado el numero complejo: Z1 =");
		panel.add(complejo1);
		complejo1.setBounds(20, 150, 200, 10);
		
		numero1 = new JTextField();
		panel.add(numero1);
		numero1.setBounds(215, 150, 50, 20);
		
		numero2 = new JTextField();
		panel.add(numero2);
		numero2.setBounds(270,150,50,20);
		
		i1 = new JLabel("i");
		panel.add(i1);
		i1.setBounds(325,150,20,20);
		
		
		complejo2 = new JLabel("Y el numero Complejo: Z2 =");
		panel.add(complejo2);
		complejo2.setBounds(20,200,200,10);
		
		numero3 = new JTextField();
		panel.add(numero3);
		numero3.setBounds(215,200,50,20);
		
		numero4 = new JTextField();
		panel.add(numero4);
		numero4.setBounds(270,200,50,20);
		
		i2 = new JLabel("i");
		panel.add(i2);
		i2.setBounds(325,200,20,20);
		
		JLabel determina = new JLabel("Determinar la divicion de : ");
		panel.add(determina);
		determina.setBounds(340,150, 300, 20);
		
		JTextField primero = new JTextField();
		panel.add(primero);
		primero.setBounds(340,200,20,20);
		JLabel z1 = new JLabel("Z1");
		panel.add(z1);
		
		z1.setBounds(375,200,20,20);

		JLabel simbolo = new JLabel("+");
		panel.add(simbolo);
		simbolo.setBounds(395,200,10,10);
		
		JTextField segundo = new JTextField();
		panel.add(segundo);
		segundo.setBounds(400,200,20,20);
		JLabel z2 = new JLabel("Z2");
		panel.add(z2);
		z2.setBounds(432,200,40,20);
		JLabel resultado = new JLabel("El resultado de la divicion es: ");
		panel.add(resultado);
		resultado.setBounds(20, 290, 200, 20);
		JTextField resulta = new JTextField();
		panel.add(resulta);
		resulta.setBounds(215,290,300,20);
		
		JButton regresar = new JButton("Regresar");
		panel.add(regresar);
		regresar.setBounds(490,430, 100,20);
		
		
		JButton sumando = new JButton("Dividir");
		panel.add(sumando);
		sumando.setBounds(270,250,150,20);;
		sumando.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed (ActionEvent e){
				int a,b,c,d;
				int x,y;
				a = Integer.parseInt(numero1.getText());
				b = Integer.parseInt(numero2.getText());
				c = Integer.parseInt(numero3.getText());
				d = Integer.parseInt(numero4.getText());
				
				x = Integer.parseInt(primero.getText());
				y = Integer.parseInt(segundo.getText());
				
				int aux1 = x*a;
				int aux2 = x*b;
				
				int aux3 = y*c;
				int aux4 = y*d;
				int aux5= aux4*-1;
				
				int multi1 = aux1*aux3;//parte real con parte real
				int multi2 = aux1*aux5;//parte real con imaginaria
				int multi3 = aux2*aux3;//parte imaginaria con parte real
				int multi4 = aux2*aux5;//parte imaginaria con parte imaginaria
				int potencia = multi4*-1;
				
				int suma1 = multi1+potencia;
				int suma2 = multi2+multi3;
				
				int producto1 = aux3*aux3;
				int absoluto = Math.abs(aux4);
				int producto2 = absoluto*absoluto;
				int producto3 = producto2*-1;
				
				int suma3= producto1-producto3;
				
				String div1 = Integer.toString(suma1);
				String div2 = Integer.toString(suma2);
				String div3 = Integer.toString(suma3);
				
				resulta.setText(suma1+"..."+suma2+"i"+"/"+suma3 +"Separando terminos: " +suma1+"/"+suma3+"....."+suma2+"i"+"/"+suma3);
				
				
				
			}
		});
		JButton limpiar = new JButton("Limpiar");
		panel.add(limpiar);
		limpiar.setBounds(50,250,150,20);
		limpiar.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e){
				numero1.setText("");
				numero2.setText("");
				numero3.setText("");
				numero4.setText("");
				
				primero.setText("");
				segundo.setText("");
				resulta.setText("");
				
			}
		});
		
	
		regresar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				
				VentanaUsuario vtn = new VentanaUsuario();
				vtn.ventana();
				dispose();
				
			}
		});
		
		
		
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}
	
	
	public JPanel panel = new JPanel(){
		
		public void paintComponent(Graphics g){
			
			g.drawImage(imagen, 0,0, getWidth(), getHeight(), this);
		}
		
	}; 

}
