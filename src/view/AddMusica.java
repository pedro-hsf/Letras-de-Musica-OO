package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import enumerators.Generos;

public class AddMusica implements ActionListener {
	private static JFrame frame;
	private static JTextField textoNome;
	private static JTextField textoArtista;
	private static JTextField textoAno;
	private static JTextField textoDuracao;
	
	private static JButton add;
	private static JLabel valid;

	public AddMusica() {
		frame = new JFrame("Adicionar Música");
		frame.setSize(500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setResizable(true);
		construir();
		frame.getContentPane().setBackground(new java.awt.Color(33,33,33,255));
	}

	public void construir() {
		nome();
		artista();
		ano();
		duracao();
		genero();
		textoNome();
		textoArtista();
		textoAno();
		textoDuracao();
		box();
		add();
		valid();
		botaoVoltar();
	}

	public void nome() {
		JLabel nome = new JLabel("Nome:");
		nome.setBounds(90, 100, 300, 30);
		nome.setForeground(new Color(160, 75, 209, 255));
		frame.add(nome);
	}

	public void textoNome() {
		textoNome = new JTextField("");
		textoNome.setBounds(185, 100, 200, 30);
		frame.add(textoNome);
	}

	public void artista() {
		JLabel artista = new JLabel("Artista:");
		artista.setBounds(90, 150, 300, 30);
		artista.setForeground(new Color(160, 75, 209, 255));
		frame.add(artista);
	}

	public void textoArtista() {
		textoArtista = new JTextField("");
		textoArtista.setBounds(185, 150, 200, 30);
		frame.add(textoArtista);
	}

	public void ano() {
		JLabel ano = new JLabel("Ano:");
		ano.setBounds(90, 200, 300, 30);
		ano.setForeground(new Color(160, 75, 209, 255));
		frame.add(ano);
	}

	public void textoAno() {
		textoAno = new JTextField("");
		textoAno.setBounds(185, 200, 200, 30);
		frame.add(textoAno);
	}

	public void duracao() {
		JLabel duracao = new JLabel("Duração:");
		duracao.setBounds(90, 250, 300, 30);
		duracao.setForeground(new Color(160, 75, 209, 255));
		frame.add(duracao);
	}

	public void textoDuracao() {
		textoDuracao = new JTextField("");
		textoDuracao.setBounds(185, 250, 200, 30);
		frame.add(textoDuracao);
	}

	public void genero() {
		JLabel genero = new JLabel("Gênero musical:");
		genero.setBounds(80, 300, 300, 30);
		genero.setForeground(new Color(160, 75, 209, 255));
		frame.add(genero);
	}

	public void box() {
		String generos[] = { "rock", "pop", "trap", "rap", "funk", "jazz", "MPB", "forró", "gospel" };
		JComboBox<String> box = new JComboBox<>(generos);
		box.setBounds(185, 300, 200, 30);
		frame.add(box);
	}

	public void add() {
		add = new JButton("Adicionar");
		add.setBounds(110, 360, 250, 30);
		add.setBackground(new Color(160, 75, 209, 255));
		add.setActionCommand("Adicionar");
		add.addActionListener(this);
		frame.add(add);
	}

	public void valid() {
		valid = new JLabel("Coloque os dados da nova música.");
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
		new AddMusica();
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand().equals("Adicionar")) {
			// salva os dados
			String valorNome = textoNome.getText();
			String valorArt = textoArtista.getText();
			String valorAno = textoAno.getText(); 
			String valorDur = textoDuracao.getText();
			if(valorNome.isEmpty() || valorArt.isEmpty()
					|| valorAno.isEmpty() || valorDur.isEmpty()) {
				valid.setText("Dados incorretos.");
			} else {
				valid.setText("Dados corretos, música adicionada.");
				//new TelaMusica();
				//frame.dispose();
			}
		}
		else if ("voltar" == ae.getActionCommand()) {
			new TelaMusica();
			frame.dispose();
		}
	}
}