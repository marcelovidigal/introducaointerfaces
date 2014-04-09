package mace.graficointerativo;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.SwingUtilities;

public class ListenerMouse implements MouseListener {
	
	private PanelStatus panelStatus;
	private PanelInterativo panelInterativo;
	
	public ListenerMouse(PanelStatus panelStatus, PanelInterativo panelInterativo) {
		this.panelStatus = panelStatus;
		this.panelInterativo = panelInterativo;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
		panelStatus.incrementarContadorCliques();
		
		// botap esquedo do mouse
		if (SwingUtilities.isLeftMouseButton(e)) {
			panelInterativo.adicionarCirculo(e.getX(), e.getY());
		} else { // qualquer outro botao do mouse
			panelInterativo.removerCirculoProximo(e.getX(), e.getY());
		}
		
		panelStatus.setNumeroCirculos(panelInterativo.getNumeroCirculos());
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		panelStatus.setInOut("sim");
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		panelStatus.setInOut("nao");
		panelStatus.setCoordenadas(-1, -1);
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	
}