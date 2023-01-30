package view;

/**
 * Classe TelaMusicasArtistas responsável por exibir a lista de músicas de um Artistas
 * 
 * @author Nicolas Bomfim Dias Bandeira
 * @author Pedro Henrique dos Santos Ferreira
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controller.*;

public class TelaMusicasArtistas implements ActionListener, ListSelectionListener {
    private JFrame janela;
    
	private JLabel titulo;
    private JList<String> listaMusicasCadastrados;
	private String[] listaNomes = new String[50];
    
	private JButton cadastroMusica;
	private JButton refreshMusica;

    public static ControleDados dados;
    TelaPessoa p;

    public TelaMusicasArtistas(ControleDados dados) {
        this.dados = dados;
		janela = new JFrame("Tela Musicas do Artista");
		janela.setSize(525, 600);
		janela.setLayout(null);
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
		janela.getContentPane().setBackground(new Color(33,33,33,255));
        construir();
	}

    public void construir() {
        lista();
		botoes();
	}
    
    public void lista() {
        listaNomes = new ControleMusica(dados).getNomeMusica();
		listaMusicasCadastrados = new JList<String>(listaNomes);
		titulo = new JLabel("Músicas do Artista");
		cadastroMusica = new JButton("Cadastrar");
		refreshMusica = new JButton("Carregar");

		titulo.setForeground(new Color(160, 75, 209, 255));
		listaMusicasCadastrados.setBackground(new Color(255, 255, 255, 255));
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(170, 20, 250, 30);
		listaMusicasCadastrados.setBounds(20, 80, 470, 300);
		listaMusicasCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaMusicasCadastrados.setVisibleRowCount(10);

		cadastroMusica.setBackground(new Color(160, 75, 209, 255));
		refreshMusica.setBackground(new Color(160, 75, 209, 255));
		cadastroMusica.setBounds(120, 410, 100, 30);
		refreshMusica.setBounds(250, 410, 100, 30);

		cadastroMusica.addActionListener(this);
		refreshMusica.addActionListener(this);
		listaMusicasCadastrados.addListSelectionListener(this);

        janela.add(titulo);
		janela.add(listaMusicasCadastrados);
    }
        
	public void botoes() {
        cadastroMusica = new JButton("Cadastrar");
		refreshMusica = new JButton("Carregar");

        cadastroMusica.setBackground(new Color(160, 75, 209, 255));
		refreshMusica.setBackground(new Color(160, 75, 209, 255));
		cadastroMusica.setBounds(120, 410, 100, 30);
		refreshMusica.setBounds(250, 410, 100, 30);

        cadastroMusica.addActionListener(this);
        refreshMusica.addActionListener(this);

		janela.add(cadastroMusica);
		janela.add(refreshMusica);
	}
	
	public static void main(String[] args) {
		new TelaMusicasArtistas(dados);
	}

    public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		//Cadastro de nova musica
		if(src == cadastroMusica)
			new TelaDetalhePessoa().inserirEditar(2, dados, p, 0);

		// Atualiza a lista de nomes
		if(src == refreshMusica) {
			listaMusicasCadastrados.setListData(new ControleMusica(dados).getNomeMusica());
			listaMusicasCadastrados.updateUI();
		}
	}

    public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if(e.getValueIsAdjusting() && src == listaMusicasCadastrados) {
			new TelaDetalhePessoa().inserirEditar(4, dados, p,
					listaMusicasCadastrados.getSelectedIndex());
		}
	}
}
