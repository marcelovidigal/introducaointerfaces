package mace.contadorgui;

import java.awt.BorderLayout;

import mace.framesimples.FrameSimples;

public class ContadorFrame extends FrameSimples {
	
	private static final long serialVersionUID = 1L;
	
	public ContadorFrame() {
		ContadorPanel contadorPanel = new ContadorPanel();
		this.getContentPane().add(contadorPanel, BorderLayout.CENTER);
	}
	
}