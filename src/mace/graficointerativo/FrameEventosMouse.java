package mace.graficointerativo;

import java.awt.BorderLayout;

import mace.framesimples.FrameSimples;

public class FrameEventosMouse extends FrameSimples {
	
	private static final long serialVersionUID = 1L;
	
	PanelInterativo panelInterativo = new PanelInterativo();
	PanelStatus panelStatus = new PanelStatus();
	
	public FrameEventosMouse() {
		this.setTitle("Aplicacao com uso do mouse");
		this.getContentPane().add(panelInterativo, BorderLayout.CENTER);
		this.getContentPane().add(panelStatus, BorderLayout.SOUTH);
		pack();
		
		ListenerPosicaoMouse listenerPosicaoMouse = new ListenerPosicaoMouse(panelStatus);
		panelInterativo.addMouseMotionListener(listenerPosicaoMouse);
		
		ListenerMouse listenerMouse = new ListenerMouse(panelStatus, panelInterativo);
		panelInterativo.addMouseListener(listenerMouse);
	}
	
}
