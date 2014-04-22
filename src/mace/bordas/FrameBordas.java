package mace.bordas;

import java.awt.GridLayout;

import mace.framesimples.FrameSimples;

public class FrameBordas extends FrameSimples {
	
	private static final long serialVersionUID = 1L;
	
	public FrameBordas() {
		
		this.getContentPane().setLayout(new GridLayout(2, 2));
		
		PanelBordas panelBordas1 = new PanelBordas();
		PanelBordas panelBordas2 = new PanelBordas();
		PanelBordas panelBordas3 = new PanelBordas("Painel 3");
		PanelBordas panelBordas4 = new PanelBordas("Painel 4");
		
		this.getContentPane().add(panelBordas1);
		this.getContentPane().add(panelBordas2);
		this.getContentPane().add(panelBordas3);
		this.getContentPane().add(panelBordas4);
	}
	
	public static void main(String[] args) {
		FrameBordas frameBordas = new FrameBordas();
		frameBordas.exibir("Bordas");		
	}
	
}