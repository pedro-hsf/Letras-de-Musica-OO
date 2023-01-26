package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import controller.*;

public class TelaDetalhePessoa implements ActionListener {

	private JFrame janela;

	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	//private JLabel labelName;
	private JLabel labelIda = new JLabel("Idade: ");
	private JTextField valorIda;
	private JLabel labelNac = new JLabel("Nac: ");
	private JTextField valorNac;

	private JLabel labelNomeMusica = new JLabel("Nome: ");
	private JTextField valorNomeMusica;
	private JLabel labelAno = new JLabel("Ano: ");
	private JTextField valorAno;
	private JLabel labelDuracao = new JLabel("Duração: ");
	private JTextField valorDuracao;
	private JLabel labelArt = new JLabel("Artista: ");
	private JComboBox valorArt = new JComboBox<>();

	private JLabel labelNomePlaylist = new JLabel("Nome: ");
	private JTextField valorNomePlaylist;
	private JLabel labelAnoPlaylist = new JLabel("Ano: ");
	private JTextField valorAnoPlaylist;

	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");

	//private JList<String> listaMP;
	//private JList<String> listaMA;
	//private String[] listaMM = new String[50];

	private String[] novoDado = new String[9];
	private static ControleDados dados;
	private int posicao;
	private int opcao;
	private String s;

	public void inserirEditar(int op, ControleDados d, 
			TelaPessoa p, int pos) {

		opcao = op;
		posicao = pos;
		dados = d;

		if (op == 1) s = "Adicionar Artista";
		if (op == 2) s = "Adicionar Música";
		if (op == 3) s = "Adicionar Playlist";
		if (op == 4) s = "Detalhe de Artista";
		if (op == 5) s = "Detalhe de Música";
		if (op == 6) s = "Detalhe da Playlist";

		janela = new JFrame(s);

		//Preenche dados com dados do Artista clicado
		if (op == 4) {
			//listaMM = new ControleArtista(dados).getNomeArtista();
			valorNome = new JTextField(dados.getArtistas()[pos].getNome(), 200);
			//labelName = new JLabel(dados.getArtistas()[pos].getNome());
			valorIda = new JTextField(String.valueOf(dados.getArtistas()[pos].getIdade()), 200);
            valorNac = new JTextField(dados.getArtistas()[pos].getNacionalidade(), 200);
			//listaMA = new JList<String>(listaMM);

			
		}
        else if (op == 5) { //Preenche dados com dados do professor clicado 
			valorNomeMusica = new JTextField(dados.getMusicas()[pos].getNomeMusica(), 200);
			valorAno = new JTextField(String.valueOf(dados.getMusicas()[pos].getAno()), 200);
            valorDuracao = new JTextField(dados.getMusicas()[pos].getDuracao(), 200);
		}
		else if (op == 6) { //Preenche dados com dados do professor clicado 
			//listaMM = new ControlePlaylist(dados).getNomePlaylist();
			valorNomePlaylist = new JTextField(dados.getPlaylists()[pos].getNomePlaylist(), 200);
			valorAnoPlaylist = new JTextField(String.valueOf(dados.getPlaylists()[pos].getAnoPlaylist()), 200);
			//listaMP = new JList<String>(listaMM);
		}
        else { //Não preenche com dados

			valorNome = new JTextField(200);
			valorIda = new JTextField(200);
			valorNac = new JTextField(200);
			valorNomeMusica = new JTextField(200);
			valorAno = new JTextField(200);
			valorDuracao = new JTextField(200);
			valorNomePlaylist = new JTextField(200);
			valorAnoPlaylist = new JTextField(200);
			//labelName = new JLabel();

			labelNome.setForeground(new Color(160, 75, 209, 255));
			labelIda.setForeground(new Color(160, 75, 209, 255));
			labelNac.setForeground(new Color(160, 75, 209, 255));
			labelNomeMusica.setForeground(new Color(160, 75, 209, 255));
			labelAno.setForeground(new Color(160, 75, 209, 255));
			labelDuracao.setForeground(new Color(160, 75, 209, 255));
			labelNomePlaylist.setForeground(new Color(160, 75, 209, 255));
			labelAnoPlaylist.setForeground(new Color(160, 75, 209, 255));
			labelArt.setForeground(new Color(160, 75, 209, 255));

			janela.setSize(500, 600);
			//janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			janela.setLocationRelativeTo(null);
			janela.getContentPane().setBackground(new java.awt.Color(33,33,33,255));

			botaoSalvar.setBounds(245, 175, 115, 30);
		}

		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);
		//labelName.setBounds(30, 20, 180, 25);
		labelIda.setBounds(30, 50, 180, 25);
		valorIda.setBounds(180, 50, 180, 25);
        labelNac.setBounds(30, 80, 150, 25);
		valorNac.setBounds(180, 80, 180, 25);
		//listaMA.setBounds(100, 110, 180, 100);

		labelNomeMusica.setBounds(30, 20, 150, 25);
		valorNomeMusica.setBounds(180, 20, 180, 25);
		labelAno.setBounds(30, 50, 180, 25);
		valorAno.setBounds(180, 50, 180, 25);
        labelDuracao.setBounds(30, 80, 150, 25);
		valorDuracao.setBounds(180, 80, 180, 25);
		labelArt.setBounds(30, 110, 150, 25);
		valorArt.setBounds(180, 110, 180, 25);

		labelNomePlaylist.setBounds(30, 20, 150, 25);
		valorNomePlaylist.setBounds(180, 20, 180, 25);
		labelAnoPlaylist.setBounds(30, 50, 180, 25);
		valorAnoPlaylist.setBounds(180, 50, 180, 25);
		//listaMP.setBounds(100, 80, 180, 100);

		//Coloca os campos relacionados a etc se Artista
		if (op == 1 || op == 4) {
			this.janela.add(labelNome);
			this.janela.add(valorNome);
        	this.janela.add(labelIda);
			this.janela.add(valorIda);
        	this.janela.add(labelNac);
			this.janela.add(valorNac);
		}

		/*if (op == 4) {
			this.janela.add(labelNome);
			//this.janela.add(valorNome);
			this.janela.add(labelName);
        	this.janela.add(labelIda);
			this.janela.add(valorIda);
        	this.janela.add(labelNac);
			this.janela.add(valorNac);
			//this.janela.add(listaMA);
		}*/

		//Coloca campos relacionados a etc se musica
		if (op == 2 || op == 5) {
			this.janela.add(labelNomeMusica);
			this.janela.add(valorNomeMusica);
        	this.janela.add(labelAno);
			this.janela.add(valorAno);
        	this.janela.add(labelDuracao);
			this.janela.add(valorDuracao);
			this.janela.add(labelArt);
			this.janela.add(valorArt);
		}

		//Coloca campos relacionados a etc se playlist
		if (op == 3 || op == 6) {
			this.janela.add(labelNomePlaylist);
			this.janela.add(valorNomePlaylist);
        	this.janela.add(labelAnoPlaylist);
			this.janela.add(valorAnoPlaylist);
		}

		/*if (op == 6) {
			this.janela.add(labelNomePlaylist);
			this.janela.add(valorNomePlaylist);
        	this.janela.add(labelAnoPlaylist);
			this.janela.add(valorAnoPlaylist);
			this.janela.add(listaMP);
		}*/

		//Coloca botoes de excluir e salvar
		if (op == 4 || op == 5 || op == 6) {
			botaoSalvar.setBounds(120, 175, 115, 30);
			botaoSalvar.setBackground(new Color(160, 75, 209, 255));
			botaoSalvar.setForeground(null);
			botaoExcluir.setBounds(245, 175, 115, 30);
			this.janela.add(botaoExcluir);
		}

		this.janela.add(botaoSalvar);

		this.janela.setLayout(null);

		this.janela.setSize(500, 600);
		this.janela.setVisible(true);

		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
	}


	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == botaoSalvar) {
			try {
				boolean res=true;
				if(opcao == 1) //Adicionar novo Artista
					novoDado[0] = Integer.toString(dados.getQtdArtistas());
				else if (opcao == 2) // Adicionar nova musica
					novoDado[0] = Integer.toString(dados.getQtdMusicas());
				else if (opcao == 3) // Adicionar nova playlist
					novoDado[0] = Integer.toString(dados.getQtdPlaylists());
				else // edicao de dado existente
					novoDado[0] = Integer.toString(posicao);

				if (opcao == 1 || opcao == 4) {
					//res=false;
					novoDado[1] =  valorNome.getText();
                	novoDado[2] =  valorIda.getText();
                	novoDado[3] =  valorNac.getText();
					res = dados.inserirEditarArtista(novoDado);
				} else if (opcao == 2 || opcao == 5) {
					//res=false;
					novoDado[1] =  valorNomeMusica.getText();
                	novoDado[2] =  valorAno.getText();
                	novoDado[3] =  valorDuracao.getText();
					res = dados.inserirEditarMusica(novoDado);
				} else{
					novoDado[1] =  valorNomePlaylist.getText();
                	novoDado[2] =  valorAnoPlaylist.getText();
					res = dados.inserirEditarPlaylist(novoDado);
				}

				if(res) {
					mensagemSucessoCadastro();
				}
				else mensagemErroCadastro();

			} catch (NullPointerException exc1) {
				mensagemErroCadastro();
			} catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			}
		}

		if(src == botaoExcluir) {
			boolean res = false;

			if (opcao == 4) {//exclui Artista
				res = dados.removerArtista(posicao);
				if (res) mensagemSucessoExclusao(); 
				//else mensagemErroExclusaoArtista(); 
			}
				
			if (opcao == 5){ //exclui musica
				res = dados.removerMusica(posicao);
				if (res) mensagemSucessoExclusao(); 
				//else mensagemErroExclusaoProf();
			}

			if (opcao == 6){ //exclui playlist
				res = dados.removerPlaylist(posicao);
				if (res) mensagemSucessoExclusao(); 
				//else mensagemErroExclusaoProf();
			}
		}
	}

	public void mensagemSucessoExclusao() {
		JOptionPane.showMessageDialog(null, "Os dados foram excluidos", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null,"ERRO AO SALVAR OS DADOS", null, 
				JOptionPane.ERROR_MESSAGE);
	}
}