package mace.graficointerativo;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelStatus extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private JLabel textoPosicao = new JLabel("posicao:");
	private JLabel coordX = new JLabel("0", JLabel.RIGHT);
	private JLabel coordY = new JLabel("0", JLabel.RIGHT);
	private JLabel textoContador = new JLabel("no. de cliques");
	private JLabel contador = new JLabel("0", JLabel.RIGHT);
	private JLabel vazio1 = new JLabel();
	private JLabel textoCirculo = new JLabel("no. de circulos");
	private JLabel numeroCirculos = new JLabel("0", JLabel.RIGHT);
	private JLabel vazio2 = new JLabel();
	private JLabel textoEntradaSaida = new JLabel("mouse esta na area do controle");
	private JLabel entradaSaida = new JLabel("nao", JLabel.RIGHT);
	private JLabel vazio3 = new JLabel();
	
	private int contadorCliques = 0;
	
	public PanelStatus() {
		this.setLayout(new GridLayout(4, 3));
		this.add(textoPosicao);
		this.add(coordX);
		this.add(coordY);
		this.add(textoContador);
		this.add(contador);
		this.add(vazio1);
		this.add(textoCirculo);
		this.add(numeroCirculos);
		this.add(vazio2);
		this.add(textoEntradaSaida);
		this.add(entradaSaida);
		this.add(vazio3);
	}
	
	public void setCoordenadas(int x, int y) {
		coordX.setText("" + x);
		coordY.setText("" + y);
	}
	
	public void setInOut(String str) {
		entradaSaida.setText(str);
	}
	
	public void incrementarContadorCliques() {
		contadorCliques++;
		contador.setText(Integer.toString(contadorCliques));
	}
	
	public void setNumeroCirculos(int n) {
		numeroCirculos.setText(Integer.toString(n));
	}
	
}