package mace.framesimples;

import javax.swing.JFrame;

public class FrameSimples extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	public FrameSimples() {
		this.setSize(200, 200);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	// torna o frame visivel
	public void exibir() {
		this.setVisible(true);
	}
	
	// torna o frame visivel e define o texto do titulo
	public void exibir(String titulo) {
		this.setTitle(titulo);
		this.setVisible(true);
	}
	
	// torna o frame visivel, define o texto do titulo e a posicao da janela
	public void exibir(String titulo, int x, int y) {
		this.setTitle(titulo);
		this.setLocation(x, y);
		this.setVisible(true);
	}
	
	// torna o frame invisivel
	public void esconder() {
		this.setVisible(false);
	}
	
}