package mace.graficointerativo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PanelInterativo extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private AdministracaoCirculo administracaoCirculo;
	private double raio = 6.0;
	
	public PanelInterativo() {
		administracaoCirculo = new AdministracaoCirculo();
		this.setBackground(Color.white);
		this.setPreferredSize(new Dimension(300, 300));
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		administracaoCirculo.desenharTudo(g);
	}
	
	public void adicionarCirculo(int x, int y) {
		administracaoCirculo.adicionarCirculo(new Circulo(x, y, raio));
		repaint();
	}
	
	public void removerCirculoProximo(int x, int y) {
		administracaoCirculo.removerCirculoProximo(x, y);
		repaint();
	}
	
	public int getNumeroCirculos() {
		return (administracaoCirculo.getNumeroCirculos());
	}
	
}