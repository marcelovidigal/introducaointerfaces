package mace.framesimplespanel;

import java.awt.BorderLayout;
import java.awt.Color;

import mace.framesimples.FrameSimples;

public class FrameSimplesPanel extends FrameSimples {
	
	private static final long serialVersionUID = 1L;
	
	public FrameSimplesPanel() {
		
		PanelCor panelCorDireito = new PanelCor(Color.white, 50, 20);
		PanelCor panelCorEsquerdo = new PanelCor(Color.red);
		PanelCor panelCorNorte = new PanelCor(Color.yellow);
		PanelCor panelCorSul = new PanelCor(Color.green);
		PanelCor panelCorCentro = new PanelCor(Color.blue);
		
		this.getContentPane().add(panelCorDireito, BorderLayout.WEST);
		this.getContentPane().add(panelCorEsquerdo, BorderLayout.EAST);
		this.getContentPane().add(panelCorNorte, BorderLayout.NORTH);
		this.getContentPane().add(panelCorSul, BorderLayout.SOUTH);
		this.getContentPane().add(panelCorCentro, BorderLayout.CENTER);
	}
	
}