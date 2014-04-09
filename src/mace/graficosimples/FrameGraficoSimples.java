package mace.graficosimples;

import java.awt.BorderLayout;
import mace.framesimples.FrameSimples;

public class FrameGraficoSimples extends FrameSimples {
	
	private static final long serialVersionUID = 1L;
	
	public FrameGraficoSimples() {
		this.setTitle("Grafico Simples");
		
		PanelGraficoSimples panelGraficoSimples = new PanelGraficoSimples();
		this.getContentPane().add(panelGraficoSimples, BorderLayout.CENTER);
		
		pack();
	}
	
}