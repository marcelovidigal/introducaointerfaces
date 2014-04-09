package mace.graficointerativo;

import java.awt.Graphics;
import java.util.Vector;

public class AdministracaoCirculo {
	
	private Vector<Circulo> circulos;
	
	public AdministracaoCirculo() {
		circulos = new Vector<Circulo>();
	}
	
	public void adicionarCirculo(Circulo circulo) {
		circulos.add(circulo);
	}
	
	public void removerCirculoProximo(int x, int y) {
		
		Circulo circulo;
		
		double menorDistancia = Double.MAX_VALUE;
		int indiceMenorDistancia = -1;
		
		for (int i = 0; i < circulos.size(); i++) {
			
			circulo = (Circulo)(circulos.get(i));
			
			if (circulo.distanciaPara(x, y) < menorDistancia) {
				menorDistancia = circulo.distanciaPara(x, y);
				indiceMenorDistancia = i;
			}
		}
		
		if ((indiceMenorDistancia >= 0) && (menorDistancia < 30)) {
			circulos.removeElementAt(indiceMenorDistancia);
		}
	}
	
	public void desenharTudo(Graphics g) {
		
		Circulo circuloAtual;
		
		for (int i = 0; i < circulos.size(); i++) {
			circuloAtual = (Circulo) (circulos.get(i));
			circuloAtual.desenhar(g);
		}
	}
	
	public int getNumeroCirculos() {
		return(circulos.size());
	}
	
}