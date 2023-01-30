package view;

/**
 * Classe TelaPessoa responsável por exibir tanto a tela de Usuário, Músicas e Artistas
 * 
 * @author Nicolas Bomfim Dias Bandeira
 * @author Pedro Henrique dos Santos Ferreira
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controller.*;

public class TelaPessoa implements ActionListener, ListSelectionListener {		
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroArtista;
	private JButton refreshArtista;
	private JButton cadastroMusica;
	private JButton refreshMusica;

	private ControleDados dados;
	private JList<String> listaArtistasCadastrados;
	private JList<String> listaMusicasCadastrados;
	private String[] listaNomes = new String[50];
	
	private JTextField buscar;
	private JButton botaoBuscar;



	public void mostrarDados(ControleDados d, int op){
		dados = d;

		switch (op) {

	/**
 	 * Caso seja selecionada a tela de Artista, contém uma lista dos artistas e botões de criar e atualizar a lista
	 */

	case 1: 
		listaNomes = new ControleArtista(dados).getNomeArtista();
		listaArtistasCadastrados = new JList<String>(listaNomes);
		janela = new JFrame("Artistas");
		titulo = new JLabel("Artistas");
		cadastroArtista = new JButton("Cadastrar");
		refreshArtista = new JButton("Carregar");
		titulo.setForeground(new Color(160, 75, 209, 255));
		listaArtistasCadastrados.setBackground(new Color(255, 255, 255, 255));

		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(60, 20, 250, 30);
		listaArtistasCadastrados.setBounds(20, 60, 470, 300);
		listaArtistasCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaArtistasCadastrados.setVisibleRowCount(10);

		cadastroArtista.setBackground(new Color(160, 75, 209, 255));
		refreshArtista.setBackground(new Color(160, 75, 209, 255));
		cadastroArtista.setBounds(120, 380, 100, 30);
		refreshArtista.setBounds(250, 380, 100, 30);

		janela.setLayout(null);

		janela.setSize(525, 600);
		janela.setLocationRelativeTo(null);
		janela.getContentPane().setBackground(new java.awt.Color(33,33,33,255));

		janela.add(titulo);
		janela.add(listaArtistasCadastrados);
		janela.add(cadastroArtista);
		janela.add(refreshArtista);

		janela.setVisible(true);

		cadastroArtista.addActionListener(this);
		refreshArtista.addActionListener(this);
		listaArtistasCadastrados.addListSelectionListener(this);

		break;

		/**
		 * Caso seja selecionada a tela de Música, contém uma lista das músicas, barra de busca 
		 * e botões de criar e atualizar a lista
		 */

		case 2:
			listaNomes = new ControleMusica(dados).getNomeMusica();
			listaMusicasCadastrados = new JList<String>(listaNomes);
			janela = new JFrame("Músicas");
			titulo = new JLabel("Músicas");
			cadastroMusica = new JButton("Cadastrar");
			refreshMusica = new JButton("Carregar");
			botaoBuscar = new JButton("buscar");
			buscar = new JTextField("");

			titulo.setForeground(new Color(160, 75, 209, 255));
			listaMusicasCadastrados.setBackground(new Color(255, 255, 255, 255));

			buscar.setBounds(170, 20, 180, 25);
			botaoBuscar.setBounds(390, 20, 100, 30);

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(60, 20, 250, 30);
			listaMusicasCadastrados.setBounds(20, 80, 470, 300);
			listaMusicasCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaMusicasCadastrados.setVisibleRowCount(10);

			cadastroMusica.setBackground(new Color(160, 75, 209, 255));
			refreshMusica.setBackground(new Color(160, 75, 209, 255));
			cadastroMusica.setBounds(120, 410, 100, 30);
			refreshMusica.setBounds(250, 410, 100, 30);

			janela.setLayout(null);

			janela.setSize(525, 600);
			janela.setLocationRelativeTo(null);
			janela.getContentPane().setBackground(new java.awt.Color(33,33,33,255));

			janela.add(titulo);
			janela.add(listaMusicasCadastrados);
			janela.add(cadastroMusica);
			janela.add(refreshMusica);
			janela.add(botaoBuscar);
			janela.add(buscar);

			janela.setVisible(true);

			cadastroMusica.addActionListener(this);
			refreshMusica.addActionListener(this);
			botaoBuscar.addActionListener(this);
			listaMusicasCadastrados.addListSelectionListener(this);

			break;

		/**
    	 * Caso seja selecionada a tela de Usuario, contém uma lista de todas as músicas, barra de busca 
		 * e botões de criar e atualizar a lista
		 */

		case 3: 
			listaNomes = new ControleMusica(dados).getNomeMusica();
			listaMusicasCadastrados = new JList<String>(listaNomes);
			janela = new JFrame("Músicas");
			titulo = new JLabel("Músicas do Usuário");
			cadastroMusica = new JButton("Cadastrar");
			refreshMusica = new JButton("Carregar");
			botaoBuscar = new JButton("buscar");
			buscar = new JTextField("");

			titulo.setForeground(new Color(160, 75, 209, 255));
			listaMusicasCadastrados.setBackground(new Color(255, 255, 255, 255));

			buscar.setBounds(190, 60, 180, 25);
			botaoBuscar.setBounds(390, 60, 100, 30);

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(30, 20, 250, 30);
			listaMusicasCadastrados.setBounds(20, 110, 470, 300);
			listaMusicasCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaMusicasCadastrados.setVisibleRowCount(10);

			cadastroMusica.setBackground(new Color(160, 75, 209, 255));
			refreshMusica.setBackground(new Color(160, 75, 209, 255));
			cadastroMusica.setBounds(120, 430, 100, 30);
			refreshMusica.setBounds(250, 430, 100, 30);

			janela.setLayout(null);

			janela.setSize(525, 600);
			janela.setLocationRelativeTo(null);
			janela.getContentPane().setBackground(new java.awt.Color(33,33,33,255));

			janela.add(titulo);
			janela.add(listaMusicasCadastrados);
			janela.add(cadastroMusica);
			janela.add(refreshMusica);
			janela.add(botaoBuscar);
			janela.add(buscar);

			janela.setVisible(true);

			cadastroMusica.addActionListener(this);
			refreshMusica.addActionListener(this);
			botaoBuscar.addActionListener(this);
			listaMusicasCadastrados.addListSelectionListener(this);

			break;

		default:
			JOptionPane.showMessageDialog(null,"Opção não encontrada", null, 
					JOptionPane.ERROR_MESSAGE);
		}
	}

	/**
	 * Método da interface ActionListener capaz de executar as funções dos botões
	 */
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		//Cadastro de novo Artista
		if(src == cadastroArtista)
			new TelaDetalhePessoa().inserirEditar(1, dados, this, 0);

		//Cadastro de nova musica
		if(src == cadastroMusica)
			new TelaDetalhePessoa().inserirEditar(2, dados, this, 0);

		// Atualiza a lista de nomes de Artistas mostrada no JList
		if(src == refreshArtista) {
			listaArtistasCadastrados.setListData(new ControleArtista(dados).getNomeArtista());			
			listaArtistasCadastrados.updateUI();
		}

		// Atualiza a lista de nomes de Musica mostrada no JList
		if(src == refreshMusica) {
			listaMusicasCadastrados.setListData(new ControleMusica(dados).getNomeMusica());
			listaMusicasCadastrados.updateUI();
		}

		// botão para buscar músicas na JLits pelo nome
		if (src == botaoBuscar) {
			this.dados = dados;
			String nomeMusica = buscar.getText();

			int idxMusica = dados.buscarMusica(nomeMusica);
			if (idxMusica == -1) {
				JOptionPane.showMessageDialog(null, "Essa música não está cadastrada!");
			} else {
				new TelaDetalhePessoa().inserirEditar(4, dados, this, 
					listaMusicasCadastrados.getSelectedIndex());
			}
		}
	}

	/**
	 * Método da interface ListSelectionListener capaz de executar as funções na JList
	 */

	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if(e.getValueIsAdjusting() && src == listaArtistasCadastrados) {
			new TelaDetalhePessoa().inserirEditar(3, dados, this, 
					listaArtistasCadastrados.getSelectedIndex());
		}

		if(e.getValueIsAdjusting() && src == listaMusicasCadastrados) {
			new TelaDetalhePessoa().inserirEditar(4, dados, this, 
					listaMusicasCadastrados.getSelectedIndex());
		}
	}
}