package mace.framesimplespanel;

import java.awt.*;
import javax.swing.JPanel;

public class PanelCor extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	// gera um jpanel com cor de fundo
	public PanelCor(Color cor) {
		this.setBackground(cor);
	}
	
	// gera um jpanel com cor de fundo, largura e altura
	public PanelCor(Color cor, int largura, int altura) {
		this.setPreferredSize(new Dimension(largura, altura));
		this.setBackground(cor);
	}
	
}