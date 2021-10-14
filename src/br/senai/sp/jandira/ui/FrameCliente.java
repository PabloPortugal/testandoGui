
package br.senai.sp.jandira.ui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameCliente {

	
	
	
	  public void criarTela() {
		  
		  JFrame telacliente = new JFrame();
		  
		  telacliente.setSize(1200, 800);
		  telacliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  telacliente.setTitle("Minha Primeira Tela GUI");
		  telacliente.setLayout(null);
		  //criar componentes de tela
		  
		  // label =  etiqueta 	  
		  JLabel lblidade = new JLabel();
		  lblidade.setText("IDADE : ");
		  //definir posição 
		  lblidade.setBounds(20, 20, 100, 30);
		  telacliente.getContentPane().add(lblidade);
		 
		  // criando um campo para digitar 
		  JTextField idadefld = new JTextField();
		  idadefld.setText("");
		  idadefld.setBounds(20, 50, 40, 30);
		  telacliente.getContentPane().add(idadefld);
		  // definindo o botao 
		  JButton btt = new JButton();
		  btt.setText("verificar");
		  btt.setBounds(80, 50, 100, 30);
		  telacliente.getContentPane().add(btt);
		  
		  telacliente.setVisible(true);
		  
		  //listener de eventeos
		    
		  btt.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("solta o butão");
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("aperto o butão");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("saiu do butão");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("entre no butão");
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("clicko no butão");
			}
		});
		  
		  idadefld.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("solto ermano");
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("apertei ermano");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("saiiii ermanoooo");
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("ENTREI ermano");
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("vai ficar clikando ai a toa? PATETA");
				
			}
		});
		  
		  idadefld.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				System.out.println("to digintando brouu");
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				System.out.println("ta soltando o brouuu a tecla");
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				System.out.println(e.getKeyChar()+" ta precionando a tecla igual um idiota");
				System.out.println(e.getKeyCode());
			}
		});
	  }
	
	
	
	
	
}
