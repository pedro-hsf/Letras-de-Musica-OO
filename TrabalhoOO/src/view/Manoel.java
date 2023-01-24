package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

//import project.Tela3.AddArtista.String valorNome;

public class Manoel implements ListSelectionListener, ActionListener{
	private static JFrame frame;
	private static JList<String> lista;
	private static JLabel nome;
	
	String musicas[] = {"caneta azul", "eu vou deixar de ser besta", 
	"olha se vc nn me ama", "maura", "la ele"};
	
	public Manoel() {
		frame = new JFrame("Manoel Gome");
		frame.setSize(500, 600);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		construir();
		frame.getContentPane().setBackground(new java.awt.Color(33,33,33,255));
	}
	
	public void construir() {
		nome();
		idade();
		nacionalidade();
		genero();
		musica();
		lista();
		botaoVoltar();
	}
		
	public void nome() {
		nome = new JLabel("Joab Manoel Gomes Caneta Azul");
		//nome = new JLabel("");
		//nome.setText(ex);
		nome.setBounds(150, 20, 300, 30);
		nome.setForeground(new Color(160,75,209,255));
		frame.add(nome);
	}
		
	public void idade() {
		JLabel idade = new JLabel("53 anos");
		idade.setBounds(70, 70, 300, 30);
		idade.setForeground(new Color(160,75,209,255));
		frame.add(idade);
	}
		
	public void nacionalidade() {
		JLabel nacionalidade = new JLabel("Brasileiro");
		nacionalidade.setBounds(190, 70, 300, 30);
		nacionalidade.setForeground(new Color(160,75,209,255));
		frame.add(nacionalidade);
	}
	
	public void genero() {
		JLabel genero = new JLabel("forró");
		genero.setBounds(340, 70, 300, 30);
		genero.setForeground(new Color(160,75,209,255));
		frame.add(genero);
	}		
	
	public void musica() {
		JLabel musica = new JLabel("Músicas:");
		musica.setBounds(80, 110, 300, 30);
		musica.setForeground(new Color(160,75,209,255));
		frame.add(musica);
	}
	
	public void lista() {
		lista = new JList<String>(musicas);
		lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		lista.addListSelectionListener(this);
		lista.setBounds(80, 140, 300, 300);
		frame.add(lista);
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
		//Manoel exemplo = new Manoel();
		new Manoel();
		//lista.addListSelectionListener(exemplo);
	}
	
	public void valueChanged(ListSelectionEvent le, ActionEvent ae) {  
		// Get the index of the changed item. 
		//int idx = jlst.getSelectedIndex(); 

		// Mostra o item, caso algum seja selecionada 
		/*if(idx != -1) 
			jlab4.setText("Voce selecionou o nome: " + generos[idx]); 
		// Se nenhum item é selecionado, imprime a mesma mensagem de seleção
		else
			jlab4.setText("Por favor, escolha um nome"); */
		
		/*else*/ if ("voltar" == ae.getActionCommand()) {
			new AddPlaylist();
			frame.dispose();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 
		
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// 
		
	}
	
}
		