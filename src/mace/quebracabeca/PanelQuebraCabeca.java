package mace.quebracabeca;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PanelQuebraCabeca extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private ModeloTabuleiro modeloTabuleiro;
	private ModeloConfiguracao configuracaoAtual;
	private int numeroLinhas, numeroColunas;
	private int larguraColuna, alturaLinha;
	
	public PanelQuebraCabeca(ModeloTabuleiro modeloTabuleiro) {
		this.modeloTabuleiro = modeloTabuleiro;
		
		numeroLinhas = modeloTabuleiro.getNumeroLinhas();
		numeroColunas = modeloTabuleiro.getNumeroColunas();
		
		this.setPreferredSize(new Dimension(300, 300));
		this.setBackground(Color.white);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int largura = getWidth();
		int altura = getHeight();
		
		larguraColuna = largura / numeroColunas;
		alturaLinha = altura / numeroLinhas;
		
		configuracaoAtual = modeloTabuleiro.getConfiguracaoAtual();
		
		for (int linha = 0; linha < numeroLinhas; linha++) {
			for (int coluna = 0; coluna < numeroColunas; coluna++) {
				if (configuracaoAtual.getNumeroBloco(linha, coluna) != 0) {
					desenharBloco(linha, coluna, configuracaoAtual.getNumeroBloco(linha, coluna), g);
				} else {
					desenharBlocoVazio(linha, coluna, g);
				}
			}
		}
	}
	
	public void mover(ModeloMovimento modeloMovimento) {
		if (modeloTabuleiro.mover(modeloMovimento)) {
			this.repaint();
		} else {
			JOptionPane.showMessageDialog(this, "Movimento Ilegal", "Quebra-cabeca", JOptionPane.WARNING_MESSAGE);
		}
	}
	
	private void desenharBloco(int linha, int coluna, int numeroBloco, Graphics g) {
		g.drawRect(coluna * larguraColuna + 2, linha * alturaLinha + 2, larguraColuna - 4, alturaLinha - 4);
		g.drawString("" + numeroBloco, coluna * larguraColuna + (larguraColuna / 2), linha * alturaLinha + alturaLinha / 2);
	}
	
	private void desenharBlocoVazio(int linha, int coluna, Graphics g) {
		g.fillRect(coluna * larguraColuna, linha * alturaLinha, larguraColuna, alturaLinha);
	}
	
	public int getNumeroBlocoNasCoordenadas(int x, int y) {
		
		int coluna = x / (this.getWidth() / numeroColunas);
		int linha = y / (this.getHeight() / numeroLinhas);
		
		return configuracaoAtual.getNumeroBloco(linha, coluna);
	}
	
}