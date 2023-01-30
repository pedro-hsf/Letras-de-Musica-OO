package view;

/**
 * Classe TelaInicial exibe botões para as outras telas
 * 
 * @author Nicolas Bomfim Dias Bandeira
 * @author Pedro Henrique dos Santos Ferreira
 */

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import controller.*;

public class TelaInicial implements ActionListener{
	private JFrame frame;
	private JButton botaoMusica;
	private JButton botaoArtista;
	private JButton botaoUsuario;

	public ControleDados dados = new ControleDados();

	/**
	 * Contrutor do frame da tela inicial
	 */
	
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

	/**
	 * Contrutor do template da tela inicial
	 */
	
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

	/**
	 * Contrutor dos botões
	 */
		
	public void construir() {
		botaoUsuario();
		botaoArtista();
	}

	/**
	 * Botão para ir para tela do usuário
	 */
	
	public void botaoUsuario() {
		botaoUsuario = new JButton("Usuário");
		botaoUsuario.setBounds(90, 350, 300, 30);
		botaoUsuario.setBackground(new Color(160,75,209,255));
		botaoUsuario.setActionCommand("usuario");
		botaoUsuario.addActionListener(this);
		frame.add(botaoUsuario);
	}

	/**
	 * Botão para ir para tela do artista
	 */
		
	public void botaoArtista() {
		botaoArtista = new JButton("Artistas");
		botaoArtista.setBounds(90, 400, 300, 30);
		botaoArtista.setBackground(new Color(160,75,209,255));
		botaoArtista.setActionCommand("artista");
		botaoArtista.addActionListener(this);
		frame.add(botaoArtista);
	}

	public static void main(String[] args) {
		new TelaInicial();
	}

	/**
	 * Método da interface ActionListener capaz de executar as funções dos botões
	 */
	
	public void actionPerformed(ActionEvent ae) {
		Object src = ae.getSource();
		
		if(src == botaoArtista)
			new TelaPessoa().mostrarDados(dados, 1);

		if(src == botaoMusica)
			new TelaPessoa().mostrarDados(dados, 2);
		
		if(src == botaoUsuario)
			new TelaPessoa().mostrarDados(dados, 3);
	}
}