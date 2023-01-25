package view;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import controller.*;
import models.*;

public class TelaInicial implements ActionListener{
	private static JFrame frame;
	private static JButton botaoMusica;
	private static JButton botaoArtista;
	private static JButton botaoPlaylist;
	private static JButton botaoUsuario;

	public static ControleDados dados = new ControleDados();
	
	public TelaInicial() {
		frame = new JFrame("Tela inicial");
		frame.setSize(500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		template();
		construir();
		frame.getContentPane().setBackground(new Color(33,33,33,255));
	}
	
	public void template() {
		try {
			BufferedImage img = ImageIO.read(getClass().getResource("/Imagem/KengaTemplate2.jpg"));
			Image dimg = img.getScaledInstance(500, 600, Image.SCALE_SMOOTH);
			ImageIcon icon = new ImageIcon(dimg);
			JLabel label = new JLabel();
			label.setIcon(icon);
			frame.getContentPane().add(label, BorderLayout.CENTER);
			frame.setContentPane(label);
			frame.pack();
		} 
		catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
		
	public void construir() {
		botaoArtista();
		botaoMusica();
		botaoPlaylist();
		botaoUsuario();
	}

	public void botaoArtista() {
		botaoArtista = new JButton("Artistas");
		botaoArtista.setBounds(90, 350, 300, 30);
		botaoArtista.setBackground(new Color(160,75,209,255));
		botaoArtista.setActionCommand("artista");
		botaoArtista.addActionListener(this);
		frame.add(botaoArtista);
	}
	
	public void botaoMusica() {
		botaoMusica = new JButton("Músicas");
		botaoMusica.setBounds(90, 400, 300, 30);
		botaoMusica.setBackground(new Color(160,75,209,255));
		botaoMusica.setActionCommand("musica");
		botaoMusica.addActionListener(this);
		frame.add(botaoMusica);
	}	
	
	public void botaoPlaylist() {
		botaoPlaylist = new JButton("Playlists");
		botaoPlaylist.setBounds(90, 450, 300, 30);
		botaoPlaylist.setBackground(new Color(160,75,209,255));
		botaoPlaylist.setActionCommand("playlist");
		botaoPlaylist.addActionListener(this);
		frame.add(botaoPlaylist);
	}

	public void botaoUsuario() {
		botaoUsuario = new JButton("Usuário");
		botaoUsuario.setBounds(390, 10, 100, 30);
		botaoUsuario.setBackground(new Color(160,75,209,255));
		botaoUsuario.setActionCommand("usuario");
		botaoUsuario.addActionListener(this);
		frame.add(botaoUsuario);
	}
		
	public static void main(String[] args) {
		new TelaInicial();
	}
	
	public void actionPerformed(ActionEvent ae) {
		/*if ("musica" == ae.getActionCommand()) {
			frame.dispose();
			new TelaMusica();
		}
		else if ("artista" == ae.getActionCommand()) {
			frame.dispose();
			new TelaArtista();
		}
		else if ("playlist" == ae.getActionCommand()) {
			frame.dispose();
			new TelaPlaylist();
		}*/
		Object src = ae.getSource();
		
		if(src == botaoArtista)
			new TelaPessoa().mostrarDados(dados, 1);

		if(src == botaoMusica)
			new TelaPessoa().mostrarDados(dados, 2);
			
		if(src == botaoPlaylist)
			new TelaPessoa().mostrarDados(dados, 3);
		
		if(src == botaoUsuario)
			new TelaPessoa().mostrarDados(dados, 4);
	}
}