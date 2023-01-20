package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TelaArtista implements ActionListener{
	private static JFrame frame;
	private static JButton botaoProcurar;
	private static JButton botaoAdd;
	private static JButton botaoDeletar;
	
	public TelaArtista() {
		frame = new JFrame("Tela Artista");
		frame.setSize(500, 600);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		construir();
		frame.getContentPane().setBackground(new java.awt.Color(33,33,33,255));
	}

	public void construir() {
		botaoProcurar();
		botaoAdd();
		botaoDeletar();
		botaoVoltar();
	}
	
	public void botaoProcurar() {
		botaoProcurar = new JButton("procurar artista");
		botaoProcurar.setBounds(90, 200, 300, 30);
		botaoProcurar.setBackground(new Color(160, 75, 209, 255));
		//botaoProcurar.setActionCommand("procurar artista");
        botaoProcurar.addActionListener(this);
		frame.add(botaoProcurar);
	}

	public void botaoAdd() {
		botaoAdd = new JButton("add artista");
		botaoAdd.setBounds(90, 250, 300, 30);
		botaoAdd.setBackground(new Color(160, 75, 209, 255));
		//botaoAdd.setActionCommand("add artista");
        botaoAdd.addActionListener(this);
		frame.add(botaoAdd);
	}

	public void botaoDeletar() {
		botaoDeletar = new JButton("deletar artista");
		botaoDeletar.setBounds(90, 300, 300, 30);
		botaoDeletar.setBackground(new Color(160, 75, 209, 255));
		//botaoAdd.setActionCommand("deletar artista");
		botaoAdd.addActionListener(this);
		frame.add(botaoDeletar);
	}

	public void botaoVoltar() {
		JButton botaoVoltar = new JButton("Voltar");
		botaoVoltar.setBounds(390, 520, 80, 30);
		botaoVoltar.setBackground(new Color(160,75,209,255));
		botaoVoltar.setActionCommand("voltar");
		botaoVoltar.addActionListener(this);
		frame.add(botaoVoltar);
	}
		
	public static void main(String[] args) {
		 new TelaArtista();
	}
	
	public void actionPerformed(ActionEvent ae) {
		if ("procurar artista" == ae.getActionCommand()) {
			//pressione.setText("JList");
		} 
		else if ("add artista" == ae.getActionCommand()) {
			new AddArtista();
			frame.dispose();
		}
		else if ("deletar artista" == ae.getActionCommand()) {
			//pressione.setText("JList");
		}
		else if ("voltar" == ae.getActionCommand()) {
			new TelaInicial();
			frame.dispose();
		}
	}
}	