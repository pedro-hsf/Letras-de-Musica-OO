package view;

/**
 * Classe TelaDetalhePessoa responsável por exibir tanto a criação de Músicas e Artistas
 * 
 * @author Nicolas Bomfim Dias Bandeira
 * @author Pedro Henrique dos Santos Ferreira
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controller.*;

public class TelaDetalhePessoa implements ActionListener{

	private JFrame janela;

	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelIda = new JLabel("Idade: ");
	private JTextField valorIda;
	private JLabel labelNac = new JLabel("Nacionalidade: ");
	private JTextField valorNac;
	private JLabel labelGen = new JLabel("Gênero musical: ");
	private JTextField valorGen;

	private JLabel labelNomeMusica = new JLabel("Nome: ");
	private JTextField valorNomeMusica;
	private JLabel labelAno = new JLabel("Ano: ");
	private JTextField valorAno;
	private JLabel labelDuracao = new JLabel("Duração: ");
	private JTextField valorDuracao;

	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private JButton botaoEditar = new JButton("Editar");

	private JTextArea letra;
	private JButton botaoExcluirL = new JButton("Excluir letra");
	private JButton botaoSalvarL = new JButton("Salvar letra");
	private JButton botaoEditarL = new JButton("Editar letra");

	private JButton botaoMusicas = new JButton("Musicas");

	private String[] novoDado = new String[9];
	private static ControleDados dados;
	private int posicao;
	private int opcao;
	private String s;

	TelaPessoa p;

	public void inserirEditar(int op, ControleDados d, TelaPessoa p, int pos) {

		opcao = op;
		posicao = pos;
		dados = d;
		this.p = p;

		if (op == 1) s = "Adicionar Artista";
		if (op == 2) s = "Adicionar Música";
		if (op == 3) s = "Detalhe de Artista";
		if (op == 4) s = "Detalhe de Música";

		janela = new JFrame(s);

		if (op == 3) {
			valorNome = new JTextField(dados.getArtistas()[pos].getNome(), 200);
			valorIda = new JTextField(String.valueOf(dados.getArtistas()[pos].getIdade()), 200);
            valorNac = new JTextField(dados.getArtistas()[pos].getNacionalidade(), 200);
			valorGen = new JTextField(dados.getArtistas()[pos].getGenero(), 200);

			valorNome.setEditable(false);
			valorIda.setEditable(false);
			valorNac.setEditable(false);
			valorGen.setEditable(false);

			janela.setSize(525, 600);
			janela.setLocationRelativeTo(null);
			janela.getContentPane().setBackground(new Color(33,33,33,255));

			labelNome.setForeground(new Color(160, 75, 209, 255));
			labelIda.setForeground(new Color(160, 75, 209, 255));
			labelNac.setForeground(new Color(160, 75, 209, 255));
			labelGen.setForeground(new Color(160, 75, 209, 255));
		}
        else if (op == 4) { 
			valorNomeMusica = new JTextField(dados.getMusicas()[pos].getNomeMusica(), 200);
			valorAno = new JTextField(String.valueOf(dados.getMusicas()[pos].getAno()), 200);
            valorDuracao = new JTextField(dados.getMusicas()[pos].getDuracao(), 200);

			valorNomeMusica.setEditable(false);
			valorAno.setEditable(false);
			valorDuracao.setEditable(false);

			janela.setSize(525, 600);
			janela.setLocationRelativeTo(null);
			janela.getContentPane().setBackground(new Color(33,33,33,255));

			labelNomeMusica.setForeground(new Color(160, 75, 209, 255));
			labelAno.setForeground(new Color(160, 75, 209, 255));
			labelDuracao.setForeground(new Color(160, 75, 209, 255));

			letra = new JTextArea("");
		}
        else { 
			valorNome = new JTextField(200);
			valorIda = new JTextField(200);
			valorNac = new JTextField(200);
			valorGen = new JTextField(200);
			valorNomeMusica = new JTextField(200);
			valorAno = new JTextField(200);
			valorDuracao = new JTextField(200);

			labelNome.setForeground(new Color(160, 75, 209, 255));
			labelIda.setForeground(new Color(160, 75, 209, 255));
			labelNac.setForeground(new Color(160, 75, 209, 255));
			labelGen.setForeground(new Color(160, 75, 209, 255));
			labelNomeMusica.setForeground(new Color(160, 75, 209, 255));
			labelAno.setForeground(new Color(160, 75, 209, 255));
			labelDuracao.setForeground(new Color(160, 75, 209, 255));

			janela.setSize(525, 600);
			janela.setLocationRelativeTo(null);
			janela.getContentPane().setBackground(new java.awt.Color(33,33,33,255));

			botaoSalvar.setBounds(170, 175, 115, 30);

			letra = new JTextArea("");
		}

		if (op == 1) {
			labelNome.setBounds(30, 20, 150, 25);
			valorNome.setBounds(180, 20, 180, 25);
			labelIda.setBounds(30, 50, 180, 25);
			valorIda.setBounds(180, 50, 180, 25);
        	labelNac.setBounds(30, 80, 150, 25);
			valorNac.setBounds(180, 80, 180, 25);
			labelGen.setBounds(30, 110, 150, 25);
			valorGen.setBounds(180, 110, 180, 25);

			this.janela.add(labelNome);
			this.janela.add(valorNome);
        	this.janela.add(labelIda);
			this.janela.add(valorIda);
        	this.janela.add(labelNac);
			this.janela.add(valorNac);
			this.janela.add(labelGen);
			this.janela.add(valorGen);
		}

		if (op == 3) {
			labelNome.setBounds(30, 20, 150, 25);
			valorNome.setBounds(180, 20, 180, 25);
			labelIda.setBounds(30, 50, 180, 25);
			valorIda.setBounds(180, 50, 180, 25);
        	labelNac.setBounds(30, 80, 150, 25);
			valorNac.setBounds(180, 80, 180, 25);
			labelGen.setBounds(30, 110, 150, 25);
			valorGen.setBounds(180, 110, 180, 25);

			this.janela.add(labelNome);
			this.janela.add(valorNome);
        	this.janela.add(labelIda);
			this.janela.add(valorIda);
        	this.janela.add(labelNac);
			this.janela.add(valorNac);
			this.janela.add(labelGen);
			this.janela.add(valorGen);

			botaoMusicas.setBounds(180, 280, 115, 30);
			botaoMusicas.setBackground(new Color(160,75,209,255));
			botaoMusicas.addActionListener(this);
			this.janela.add(botaoMusicas);
		}

		if (op == 2) {
			labelNomeMusica.setBounds(30, 20, 150, 25);
			valorNomeMusica.setBounds(180, 20, 180, 25);
			labelAno.setBounds(30, 50, 180, 25);
			valorAno.setBounds(180, 50, 180, 25);
        	labelDuracao.setBounds(30, 80, 150, 25);
			valorDuracao.setBounds(180, 80, 180, 25);

			this.janela.add(labelNomeMusica);
			this.janela.add(valorNomeMusica);
        	this.janela.add(labelAno);
			this.janela.add(valorAno);
        	this.janela.add(labelDuracao);
			this.janela.add(valorDuracao);
		}

		if (op == 4) {

			labelNomeMusica.setBounds(30, 20, 150, 25);
			valorNomeMusica.setBounds(180, 20, 180, 25);
			labelAno.setBounds(30, 50, 180, 25);
			valorAno.setBounds(180, 50, 180, 25);
        	labelDuracao.setBounds(30, 80, 150, 25);
			valorDuracao.setBounds(180, 80, 180, 25);
			
			letra.setLineWrap(true);
			letra.setEditable(false);
			letra.setBounds(20, 150, 470, 300);
			botaoEditarL.setBounds(20, 500, 115, 30);
			botaoSalvarL.setBounds(150, 500, 115, 30);
			botaoExcluirL.setBounds(280, 500, 115, 30);
			botaoEditarL.setBackground(new Color(160,75,209,255));
			botaoSalvarL.setBackground(new Color(160, 75, 209, 255));
			botaoExcluirL.setBackground(new Color(160, 75, 209, 255));
			botaoEditarL.addActionListener(this);
			botaoSalvarL.addActionListener(this);
			botaoExcluirL.addActionListener(this);
			this.janela.add(botaoEditarL);
			this.janela.add(botaoSalvarL);
			this.janela.add(botaoExcluirL);

			this.janela.add(labelNomeMusica);
			this.janela.add(valorNomeMusica);
        	this.janela.add(labelAno);
			this.janela.add(valorAno);
        	this.janela.add(labelDuracao);
			this.janela.add(valorDuracao);
			this.janela.add(letra);
		}

		//Coloca botoes de excluir, editar e salvar
		if (op == 3 || op == 4) {
			botaoSalvar.setBounds(150, 460, 115, 30);

			botaoExcluir.setBounds(280, 460, 115, 30);
			botaoExcluir.setBackground(new Color(160, 75, 209, 255));
			this.janela.add(botaoExcluir);

			botaoEditar.setBounds(20, 460, 115, 30);
			botaoEditar.setBackground(new Color(160,75,209,255));
			this.janela.add(botaoEditar);
		}

		botaoSalvar.setBackground(new Color(160, 75, 209, 255));
		this.janela.add(botaoSalvar);

		this.janela.setLayout(null);
		this.janela.setSize(525, 600);
		this.janela.setVisible(true);

		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
		botaoEditar.addActionListener(this);
	}


	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == botaoSalvar) {
			try {
				boolean res;
				if(opcao == 1) //Adicionar novo Artista
					novoDado[0] = Integer.toString(dados.getQtdArtistas());
				else if (opcao == 2) // Adicionar nova musica
					novoDado[0] = Integer.toString(dados.getQtdMusicas());
				else // edicao de dado existente
					novoDado[0] = Integer.toString(posicao);

				if (opcao == 1 || opcao == 3) {
					novoDado[1] =  valorNome.getText();
                	novoDado[2] =  valorIda.getText();
                	novoDado[3] =  valorNac.getText();
					novoDado[4] =  valorGen.getText();
					res = dados.adicionarArtista(novoDado);
				} else{// if (opcao == 2 || opcao == 5) {
					novoDado[1] =  valorNomeMusica.getText();
                	novoDado[2] =  valorAno.getText();
                	novoDado[3] =  valorDuracao.getText();
					res = dados.adicionarMusica(novoDado);
				}

				if(res) {
					mensagemSucessoCadastro();
				}
				else mensagemErroCadastro();

			}catch (NullPointerException exc1) {
				mensagemErroCadastro();
			} catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			}
			//finally{	}
		}

		if(src == botaoExcluir) {
			boolean res = false;

			if (opcao == 3) {//exclui Artista
				res = dados.removerArtista(posicao);
				if (res) mensagemSucessoExclusao(); 
			}
				
			if (opcao == 4){ //exclui musica
				res = dados.removerMusica(posicao);
				if (res) mensagemSucessoExclusao(); 
			}
		}

		if(src == botaoEditar) {
			if (opcao == 3) {//edita Artista
				valorNome.setEditable(true);
				valorIda.setEditable(true);
				valorNac.setEditable(true);
				valorGen.setEditable(true);
			}
				
			if (opcao == 4){ //edita musica
				valorNomeMusica.setEditable(true);
				valorAno.setEditable(true);
				valorDuracao.setEditable(true);
			}
		}
		if (src == botaoEditarL) {
			letra.setEditable(true);
		}
		if (src == botaoSalvarL) {
			letra.setEditable(false);
		}
		if (src == botaoExcluirL){
			letra.setText("");
		}
		if (src == botaoMusicas){
			new TelaMusicasArtistas(dados);
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