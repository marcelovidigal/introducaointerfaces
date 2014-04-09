package mace.eventosmouse;

import java.awt.BorderLayout;

import mace.framesimples.FrameSimples;

public class FrameEventosMouse extends FrameSimples {
	
	private static final long serialVersionUID = 1L;
	
	PanelEventosMouse panelEventosMouse = new PanelEventosMouse();
	PanelStatus panelStatus = new PanelStatus();
	
	public FrameEventosMouse() {
		this.setTitle("Aplicacao com uso do mouse");
		this.getContentPane().add(panelEventosMouse, BorderLayout.CENTER);
		this.getContentPane().add(panelStatus, BorderLayout.SOUTH);
		pack();
		
		ListenerPosicaoMouse listenerPosicaoMouse = new ListenerPosicaoMouse(panelStatus);
		panelEventosMouse.addMouseMotionListener(listenerPosicaoMouse);
		
		ListenerMouse listenerMouse = new ListenerMouse(panelStatus);
		panelEventosMouse.addMouseListener(listenerMouse);
	}
	
}
