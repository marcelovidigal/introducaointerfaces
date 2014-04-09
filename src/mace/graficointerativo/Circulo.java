package mace.graficointerativo;

import java.awt.Graphics;

public class Circulo {
	
	private double x, y, raio;
	
	public Circulo(double x, double y, double raio) {
		this.x = x;
		this.y = y;
		this.raio = raio;
	}
	
	// desenha o circulo
	public void desenhar(Graphics g) {
		g.fillOval((int) Math.round(x - raio), (int) Math.round(y - raio), (int) Math.round(2 * raio), (int) Math.round(2 * raio));
	}
	
	// calcula a distancia entre o centro do circulo e o ponto x, y
	public double distanciaPara(double x, double y) {
		return (Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2)));
	}
	
}