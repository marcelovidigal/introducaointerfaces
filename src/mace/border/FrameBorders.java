package mace.border;

import java.awt.GridLayout;

import mace.framesimples.FrameSimples;

public class FrameBorders extends FrameSimples {
	
	private static final long serialVersionUID = 1L;
	
	public FrameBorders() {
		
		this.getContentPane().setLayout(new GridLayout(2, 2));
		
		PanelBorders panelBorders1 = new PanelBorders();
		PanelBorders panelBorders2 = new PanelBorders();
		PanelBorders panelBorders3 = new PanelBorders("Painel 3");
		PanelBorders panelBorders4 = new PanelBorders("Painel 4");
		
		this.getContentPane().add(panelBorders1);
		this.getContentPane().add(panelBorders2);
		this.getContentPane().add(panelBorders3);
		this.getContentPane().add(panelBorders4);
	}
	
	public static void main(String[] args) {
		FrameBorders frameBorders = new FrameBorders();
		frameBorders.exibir("Bordas");		
	}
	
}