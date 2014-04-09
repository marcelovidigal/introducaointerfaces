package mace.graficointerativo;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class ListenerPosicaoMouse implements MouseMotionListener {
	
	private PanelStatus panelStatus;
	
	public ListenerPosicaoMouse(PanelStatus panelStatus) {
		this.panelStatus = panelStatus;
	}
	
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		panelStatus.setCoordenadas(arg0.getX(), arg0.getY());
	}
	
}