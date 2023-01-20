package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import enumerators.Generos;

public class AddPlaylist implements ActionListener{
	private static JFrame frame;
	private static JLabel nome;
	private static JTextField textoNome;
	private static JLabel ano;
	private static JTextField textoAno;
	
	private static JButton add;
	private static JLabel valid;
	
	public AddPlaylist() {
		frame = new JFrame("Adicionar Playlist");
		frame.setSize(500, 600);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		construir();
		frame.getContentPane().setBackground(new java.awt.Color(33,33,33,255));
	}
	
	public void construir() {
		nome();
		textoNome();
		ano();
		textoAno();
		add();
		valid();
		botaoVoltar();
	}
	
	public void nome() {
		nome = new JLabel("Nome:");
		nome.setBounds(90, 200, 300, 30);
		nome.setForeground(new Color(160,75,209,255));
		frame.add(nome);
	}
	
	public void textoNome() {
		textoNome = new JTextField("");
		textoNome.setBounds(185, 200, 200, 30);
		frame.add(textoNome);
	}
	
	public void ano() {
		ano = new JLabel("Ano:");
		ano.setBounds(90, 250, 300, 30);
		ano.setForeground(new Color(160,75,209,255));
		frame.add(ano);
	}
	
	public void textoAno() {
		textoAno = new JTextField("");
		textoAno.setBounds(185, 250, 200, 30);
		frame.add(textoAno);
	}
	
	public void add() {
		add = new JButton("Adicionar");
		add.setBounds(80, 350, 300, 30);
		add.setBackground(new Color(160, 75, 209, 255));
		//add.setActionCommand("Adicionar");
		add.addActionListener(this);
		frame.add(add);
	}

	public void valid() {
		valid = new JLabel("Coloque os dados da nova playlist.");
		valid.setBounds(135, 400, 300, 30);
		valid.setForeground(new Color(160,75,209,255));
		frame.add(valid);
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
		new AddPlaylist();		
	}
	
	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand().equals("Adicionar")) {
			// salva os dados
			String valorNome = textoNome.getText();
			String valorAno = textoAno.getText(); 
			if(valorNome.isEmpty() || valorAno.isEmpty()) {
				valid.setText("Dados incorretos.");
			} else {
				valid.setText("Dados corretos, playlist adicionada.");
				//new TelaPlaylist();
				//frame.dispose();
			}
		}
		else if ("voltar" == ae.getActionCommand()) {
			new TelaPlaylist();
			frame.dispose();
		}
	}
	
}