package view;

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
		janela.setSize(500, 600);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

		//Cadastro de novo musica
		if(src == cadastroMusica)
			new TelaDetalhePessoa().inserirEditar(2, dados, p, 0);

		// Atualiza a lista de nomes de Musica mostrada no JList
		if(src == refreshMusica) {
			listaMusicasCadastrados.setListData(new ControleMusica(dados).getNomeMusica());
			listaMusicasCadastrados.updateUI();
		}
	}

    public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();
		//TelaPessoa p;
        //this.p = p;

		if(e.getValueIsAdjusting() && src == listaMusicasCadastrados) {
			//TelaPessoa p;
			//janela.dispose();
			new TelaDetalhePessoa().inserirEditar(5, dados, p,
					listaMusicasCadastrados.getSelectedIndex());
		}
	}
}
