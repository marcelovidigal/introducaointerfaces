package mace.eventosmouse;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelStatus extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private JLabel textoPosicao = new JLabel("posição:");
	private JLabel coordX = new JLabel("0", JLabel.RIGHT);
	private JLabel coordY = new JLabel("0", JLabel.RIGHT);
	private JLabel textoContador = new JLabel("no. de cliques");
	private JLabel contador = new JLabel("0", JLabel.RIGHT);
	private JLabel vazio = new JLabel();
	private JLabel textoEntradaSaida = new JLabel("mouse is in comp.");
	private JLabel entradaSaida = new JLabel("no", JLabel.RIGHT);
	private JLabel vazio2 = new JLabel();
	private int contadorCliques = 0;
	
	public PanelStatus() {	
		this.setLayout(new GridLayout(3, 3));
		this.add(textoPosicao);
		this.add(coordX);
		this.add(coordY);
		this.add(textoContador);
		this.add(contador);
		this.add(vazio);
		this.add(textoEntradaSaida);
		this.add(entradaSaida);
		this.add(vazio2);
	}
	
	// atualiza as coordenadas da posicao do mouse
	public void setCoordenadas(int x, int y) {
		coordX.setText(Integer.toString(x));
		coordY.setText(Integer.toString(y));
	}
	
	// define a informacao onde o mouse esta
	public void setEntradaSaida(String str) {
		entradaSaida.setText(str);
	}
	
	// incrementa o contador de cliques e exibe o valor
	public void incrementarContadorCliques() {
		contadorCliques++;
		contador.setText(Integer.toString(contadorCliques));
	}
	
}