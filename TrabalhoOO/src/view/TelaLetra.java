package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TelaLetra implements ActionListener{
	private static JFrame frame;
	private static JTextArea letra;
	private static JButton botaoEditar;
	private static JButton botaoDeletar;
	private static JButton botaoSalvar;
	
	public TelaLetra() {
		frame = new JFrame("TelaLetra");
		frame.setSize(500, 700);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		construir();
		frame.getContentPane().setBackground(new java.awt.Color(33,33,33,255));
	}
	
	public void construir() {
		nome();
		nomeMusica();
		ano();
		duracao();
		genero();
		letra();
		botaoEditar();
		botaoDeletar();
		botaoSalvar();
		botaoVoltar();
	}
	
	public void nome() {	
		JLabel nome = new JLabel("TelaLetra of Concern");
		nome.setBounds(180, 10, 300, 30);
		nome.setForeground(new Color(160,75,209,255));
		frame.add(nome);
	}
	
	public void nomeMusica() {
		JLabel nomeMusica = new JLabel("Twenty one Pilots");
		nomeMusica.setBounds(50, 50, 300, 30);
		nomeMusica.setForeground(new Color(160,75,209,255));
		frame.add(nomeMusica);
	}
		
	public void ano() {
		JLabel ano = new JLabel("2020");
		ano.setBounds(200, 50, 300, 30);
		ano.setForeground(new Color(160,75,209,255));
		frame.add(ano);
	}
		
	public void duracao() {
		JLabel duracao = new JLabel("3:52");
		duracao.setBounds(300, 50, 300, 30);
		duracao.setForeground(new Color(160,75,209,255));
		frame.add(duracao);
	}
		
	public void genero() {
		JLabel genero = new JLabel("rock");
		genero.setBounds(400, 50, 300, 30);
		genero.setForeground(new Color(160,75,209,255));
		frame.add(genero);
	}
	
	public void letra() {
		letra = new JTextArea("");
		letra.setLineWrap(true);
		letra.setEditable(false);
		letra.setBounds(50, 90, 400, 370);
		frame.add(letra);
	}

	public void botaoEditar() {
		botaoEditar = new JButton("editar letra");
		botaoEditar.setBounds(90, 470, 300, 30);
		botaoEditar.setBackground(new Color(160,75,209,255));
		botaoEditar.addActionListener(this);
		frame.add(botaoEditar);
	}
	
	public void botaoDeletar() {	
		botaoDeletar = new JButton("deletar letra");
		botaoDeletar.setBounds(90, 520, 300, 30);
		botaoDeletar.setBackground(new Color(160,75,209,255));
		botaoDeletar.addActionListener(this);
		frame.add(botaoDeletar);
	}
		
	public void botaoSalvar() {
		botaoSalvar = new JButton("salvar");
		botaoSalvar.setBounds(90, 570, 300, 30);
		botaoSalvar.setBackground(new Color(160,75,209,255));
		botaoSalvar.addActionListener(this);
		frame.add(botaoSalvar);
	}

	public void botaoVoltar() {
		JButton botaoVoltar = new JButton("Voltar");
		botaoVoltar.setBounds(390, 620, 80, 30);
		botaoVoltar.setBackground(new Color(160,75,209,255));
		botaoVoltar.setActionCommand("voltar");
		botaoVoltar.addActionListener(this);
		frame.add(botaoVoltar);
	}
		
	public static void main(String[] args) {
		new TelaLetra();
	}
	
	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand().equals("editar letra")) {
			letra.setEditable(true);
		}
		else if (ae.getActionCommand().equals("deletar letra")) {
			letra.setText("");
		}
		else if (ae.getActionCommand().equals("salvar letra")){
			letra.setEditable(false);
		}
		else if ("voltar" == ae.getActionCommand()) {
			//new TelaMusica();
			frame.dispose();
		}
	}
}	