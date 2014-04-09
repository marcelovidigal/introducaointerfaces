package mace.scrolling;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PanelExibicaoDesenhoScroll extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	public PanelExibicaoDesenhoScroll() {
		this.setBackground(Color.WHITE);
		this.setPreferredSize(new Dimension(250, 250));
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		Color color = g.getColor();
		g.setColor(Color.red);
		g.drawRect(0, 0, 249, 249);
		g.drawString("Borda do tamanho preferencial.", 10, 240);
		g.setColor(Color.blue);
		g.fillOval(300, 150, 20, 20);
		g.drawString("Isso esta fora do tamanho preferencial.", 260, 180);
		g.setColor(color);
	}
	
}