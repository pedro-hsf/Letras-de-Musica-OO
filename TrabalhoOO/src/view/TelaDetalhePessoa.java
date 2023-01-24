package view;

import java.awt.event.*;
import javax.swing.*;
import controller.*;

public class TelaDetalhePessoa implements ActionListener {

	private JFrame janela;

	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
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

	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");

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
			valorNome = new JTextField(dados.getArtistas()[pos].getNome(), 200);
			valorIda = new JTextField(String.valueOf(dados.getArtistas()[pos].getIdade()), 200);
            valorNac = new JTextField(dados.getArtistas()[pos].getNacionalidade(), 200);
		} 
        else if (op == 5) { //Preenche dados com dados do professor clicado 
			valorNomeMusica = new JTextField(dados.getMusicas()[pos].getNomeMusica(), 200);
			valorAno = new JTextField(String.valueOf(dados.getMusicas()[pos].getAno()), 200);
            valorDuracao = new JTextField(dados.getMusicas()[pos].getDuracao(), 200);
		}
		else if (op == 6) { //Preenche dados com dados do professor clicado 
			/*
			
			*/
		} 
        else { //Não preenche com dados

			valorNome = new JTextField(200);
			valorIda = new JTextField(200);
			valorNac = new JTextField(200);
			valorNomeMusica = new JTextField(200);
			valorAno = new JTextField(200);
			valorDuracao = new JTextField(200);

			botaoSalvar.setBounds(245, 175, 115, 30);
		}

		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);
		labelIda.setBounds(30, 50, 180, 25);
		valorIda.setBounds(180, 50, 180, 25);
        labelNac.setBounds(30, 80, 150, 25);
		valorNac.setBounds(180, 80, 180, 25);

		labelNomeMusica.setBounds(30, 20, 150, 25);
		valorNomeMusica.setBounds(180, 20, 180, 25);
		labelAno.setBounds(30, 50, 180, 25);
		valorAno.setBounds(180, 50, 180, 25);
        labelDuracao.setBounds(30, 80, 150, 25);
		valorDuracao.setBounds(180, 80, 180, 25);

		//Coloca os campos relacionados a etc se Artista
		if (op == 1 || op == 4 ) {
			this.janela.add(labelNome);
			this.janela.add(valorNome);
        	this.janela.add(labelIda);
			this.janela.add(valorIda);
        	this.janela.add(labelNac);
			this.janela.add(valorNac);
		}

		//Coloca campos relacionados a etc se musica
		if (op == 2 || op == 5) {
			this.janela.add(labelNomeMusica);
			this.janela.add(valorNomeMusica);
        	this.janela.add(labelAno);
			this.janela.add(valorAno);
        	this.janela.add(labelDuracao);
			this.janela.add(valorDuracao);
		}

		//Coloca campos relacionados a etc se playlist
		/*if (op == 3 || op == 6) {
			this.janela.add(labelHoraAula);
			this.janela.add(valorHoraAula);
		}*/

		//Coloca botoes de excluir e salvar
		if (op == 4 || op == 5 || op == 6) {
			botaoSalvar.setBounds(120, 175, 115, 30);
			botaoExcluir.setBounds(245, 175, 115, 30);
			this.janela.add(botaoExcluir);
		}

		this.janela.add(botaoSalvar);

		this.janela.setLayout(null);

		this.janela.setSize(400, 250);
		this.janela.setVisible(true);

		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
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
				//else if (opcao == 3) // Adicionar nova playlist
					//novoDado[0] = Integer.toString(dados.getQtdProfs());
				else // edicao de dado existente
					novoDado[0] = Integer.toString(posicao);

				if (opcao == 1 || opcao == 4) {
					novoDado[1] =  valorNome.getText();
                	novoDado[2] =  valorIda.getText();
                	novoDado[3] =  valorNac.getText();
					res = dados.inserirEditarArtista(novoDado);
				} else if (opcao == 2 || opcao == 5) {
					novoDado[1] =  valorNomeMusica.getText();
                	novoDado[2] =  valorAno.getText();
                	novoDado[3] =  valorDuracao.getText();
					res = dados.inserirEditarMusica(novoDado);
				} /*else{
					res = dados.inserirEditarProf(novoDado);
				}*/

				/*if(res) {
					mensagemSucessoCadastro();
				}
				else mensagemErroCadastro();*/

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

			/*if (opcao == 6){ //exclui playlist
				res = dados.removerProfessor(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoProf();
			}*/
		}
	}

	public void mensagemSucessoExclusao() {
		JOptionPane.showMessageDialog(null, "Os dados foram excluidos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null,"ERRO AO SALVAR OS DADOS!\n "
				+ "Pode ter ocorrido um dos dois erros a seguir:  \n"
				+ "1. Nem todos os campos foram preenchidos \n"
				+ "2. CPF, identidade, DDD e telefone não contêm apenas números", null, 
				JOptionPane.ERROR_MESSAGE);
	}
}