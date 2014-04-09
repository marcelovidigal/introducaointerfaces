package mace.eventosmouse;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ListenerMouse implements MouseListener {
	
	private PanelStatus panelStatus;
	
	public ListenerMouse(PanelStatus panelStatus) {
		this.panelStatus = panelStatus;
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		panelStatus.incrementarContadorCliques();
	}
	
	@Override
	public void mouseEntered(MouseEvent arg0) {
		panelStatus.setEntradaSaida("sim");	
	}
	
	@Override
	public void mouseExited(MouseEvent arg0) {
		panelStatus.setEntradaSaida("nao");
		panelStatus.setCoordenadas(-1,-1);
	}
	
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub	
	}
	
}