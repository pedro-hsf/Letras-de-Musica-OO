package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ExPlaylist implements ListSelectionListener, ActionListener{
	private static JFrame frame;
	private static JList<String> lista;
	
	String mus[] = {"caneta azul", "eu vou deixar de ser besta", 
						"olha se vc nn me ama", "maura", "la ele"};
	
	public ExPlaylist() {
		frame = new JFrame("Top Hits");
		frame.setSize(500, 600);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		construir();
		frame.getContentPane().setBackground(new java.awt.Color(33,33,33,255));
	}
	
	public void construir() {
		hits();
		ano();
		musica();
		lista();
		botaoVoltar();
	}
	public void hits() {
		JLabel hits = new JLabel("Top Hits");
		hits.setBounds(210, 100, 300, 30);
		hits.setForeground(new Color(160,75,209,255));
		frame.add(hits);
	}
	
	public void ano() {
		JLabel ano = new JLabel("2023");
		ano.setBounds(220, 130, 300, 30);
		ano.setForeground(new Color(160,75,209,255));
		frame.add(ano);
	}
	
	public void musica() {
		JLabel musica = new JLabel("Músicas:");
		musica.setBounds(100, 160, 300, 30);
		musica.setForeground(new Color(160,75,209,255));
		frame.add(musica);
	}
	
	public void lista() {
		lista = new JList<String>(mus);
		lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		lista.addListSelectionListener(this);
		lista.setBounds(90, 190, 300, 250);
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
		ExPlaylist exemplo = new ExPlaylist();
		lista.addListSelectionListener(exemplo);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 
		
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// 
		
	}
	
	/*public void valueChanged(ListSelectionEvent le) {
		JList<String> jlst;
		// Get the index of the changed item. 
		int idx = jlst.getSelectedIndex(); 

		 Mostra o item, caso algum seja selecionada 
		if(idx != -1) {
			jlab4.setText("Voce selecionou o nome: " + generos[idx]);
			if (ae.getActionCommand().equals(generos[idx])) {
				letra.setEditable(true);
			}
		}
		 //Se nenhum item é selecionado, imprime a mesma mensagem de seleção
		else
			jlab4.setText("Por favor, escolha um nome"); 
			
			else if ("voltar" == ae.getActionCommand()) {
			new TelaPLaylist();
			frame.dispose();
		}
	
	}*/
}
		