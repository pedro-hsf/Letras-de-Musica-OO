package view;

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
	private JButton cadastroPlaylist;
	private JButton refreshPlaylist;

	//private JButton botaoVoltar = new JButton("Voltar");

	private static ControleDados dados;
	private JList<String> listaArtistasCadastrados;
	private JList<String> listaMusicasCadastrados;
	private JList<String> listaPlaylistsCadastrados;
	private String[] listaNomes = new String[50];

	public void mostrarDados(ControleDados d, int op){
		dados = d;

		switch (op) {
		case 1:// Mostrar dados de Artistas cadastrados (JList)
			listaNomes = new ControleArtista(dados).getNomeArtista();
			listaArtistasCadastrados = new JList<String>(listaNomes);
			janela = new JFrame("Artistas");
			titulo = new JLabel("Artistas");
			cadastroArtista = new JButton("Cadastrar");
			refreshArtista = new JButton("Carregar");

			titulo.setForeground(new Color(160, 75, 209, 255));

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaArtistasCadastrados.setBounds(20, 50, 350, 120);
			listaArtistasCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaArtistasCadastrados.setVisibleRowCount(10);

			cadastroArtista.setBounds(70, 177, 100, 30);
			refreshArtista.setBounds(200, 177, 100, 30);
			//botaoVoltar.setBounds(10, 177, 100, 30);

			janela.setLayout(null);

			janela.setSize(500, 600);
			//janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			janela.setLocationRelativeTo(null);
			janela.getContentPane().setBackground(new java.awt.Color(33,33,33,255));


			janela.add(titulo);
			janela.add(listaArtistasCadastrados);
			janela.add(cadastroArtista);
			janela.add(refreshArtista);
			//janela.add(botaoVoltar);

			//janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroArtista.addActionListener(this);
			refreshArtista.addActionListener(this);
			//botaoVoltar.addActionListener(this);
			listaArtistasCadastrados.addListSelectionListener(this);

			break;

		case 2:// Mostrar dados de musicas cadastrados (JList)
			listaNomes = new ControleMusica(dados).getNomeMusica();
			listaMusicasCadastrados = new JList<String>(listaNomes);
			janela = new JFrame("Músicas");
			titulo = new JLabel("Músicas");
			cadastroMusica = new JButton("Cadastrar");
			refreshMusica = new JButton("Carregar");

			titulo.setForeground(new Color(160, 75, 209, 255));

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaMusicasCadastrados.setBounds(20, 50, 350, 120);
			listaMusicasCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaMusicasCadastrados.setVisibleRowCount(10);


			cadastroMusica.setBounds(70, 177, 100, 30);
			refreshMusica.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.setSize(500, 600);
			//janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			janela.setLocationRelativeTo(null);
			janela.getContentPane().setBackground(new java.awt.Color(33,33,33,255));


			janela.add(titulo);
			janela.add(listaMusicasCadastrados);
			janela.add(cadastroMusica);
			janela.add(refreshMusica);

			//janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroMusica.addActionListener(this);
			refreshMusica.addActionListener(this);
			listaMusicasCadastrados.addListSelectionListener(this);

			break;

		case 3:// Mostrar dados de playlists cadastrados (JList)
			listaNomes = new ControlePlaylist(dados).getNomePlaylist();
			listaPlaylistsCadastrados = new JList<String>(listaNomes);
			janela = new JFrame("Playlists");
			titulo = new JLabel("Playlists");
			cadastroPlaylist = new JButton("Cadastrar");
			refreshPlaylist = new JButton("Carregar");

			titulo.setForeground(new Color(160, 75, 209, 255));

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaPlaylistsCadastrados.setBounds(20, 50, 350, 120);
			listaPlaylistsCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaPlaylistsCadastrados.setVisibleRowCount(10);


			cadastroPlaylist.setBounds(70, 177, 100, 30);
			refreshPlaylist.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.setSize(500, 600);
			//janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			janela.setLocationRelativeTo(null);
			janela.getContentPane().setBackground(new java.awt.Color(33,33,33,255));


			janela.add(titulo);
			janela.add(listaPlaylistsCadastrados);
			janela.add(cadastroPlaylist);
			janela.add(refreshPlaylist);

			//janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroPlaylist.addActionListener(this);
			refreshPlaylist.addActionListener(this);
			listaPlaylistsCadastrados.addListSelectionListener(this);

			break;

		default:
			JOptionPane.showMessageDialog(null,"Op��o n�o encontrada!", null, 
					JOptionPane.ERROR_MESSAGE);
		}
	}

	//Captura eventos relacionados aos bot�es da interface
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		//Cadastro de novo Artista
		if(src == cadastroArtista)
			new TelaDetalhePessoa().inserirEditar(1, dados, this, 0);

		//Cadastro de novo musica
		if(src == cadastroMusica)
			new TelaDetalhePessoa().inserirEditar(2, dados, this, 0);

		//Cadastro de novo playlist
		if(src == cadastroPlaylist)
			new TelaDetalhePessoa().inserirEditar(3, dados, this, 0);

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

		// Atualiza a lista de nomes de playlist mostrada no JList
		if(src == refreshPlaylist) {
			listaPlaylistsCadastrados.setListData(new ControlePlaylist(dados).getNomePlaylist());
			listaPlaylistsCadastrados.updateUI();
		}

		//if(src == botaoVoltar) {
		//	new TelaInicial();
		//	janela.dispose();
		//}
	}

	//Captura eventos relacionados ao JList
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if(e.getValueIsAdjusting() && src == listaArtistasCadastrados) {
			new TelaDetalhePessoa().inserirEditar(4, dados, this, 
					listaArtistasCadastrados.getSelectedIndex());
		}

		if(e.getValueIsAdjusting() && src == listaMusicasCadastrados) {
			new TelaDetalhePessoa().inserirEditar(5, dados, this, 
					listaMusicasCadastrados.getSelectedIndex());
		}

		if(e.getValueIsAdjusting() && src == listaPlaylistsCadastrados) {
			new TelaDetalhePessoa().inserirEditar(6, dados, this, 
					listaPlaylistsCadastrados.getSelectedIndex());
		}
	}

}