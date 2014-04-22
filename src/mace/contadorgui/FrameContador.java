package mace.contadorgui;

import java.awt.BorderLayout;

import mace.framesimples.FrameSimples;

public class FrameContador extends FrameSimples {
	
	private static final long serialVersionUID = 1L;
	
	public FrameContador() {
		PanelContador panelContador = new PanelContador();
		this.getContentPane().add(panelContador, BorderLayout.CENTER);
	}
	
}