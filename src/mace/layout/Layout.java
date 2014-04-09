package mace.layout;

import java.awt.Color;
import java.awt.LayoutManager;

import mace.framesimples.FrameSimples;
import mace.framesimplespanel.PanelCor;

public class Layout extends FrameSimples {
	
	private static final long serialVersionUID = 1L;
	
	public Layout(LayoutManager layoutManager) {
		
		this.getContentPane().setLayout(layoutManager);
		
		PanelCor panelCor1 = new PanelCor(Color.red, 30, 30);
		PanelCor panelCor2 = new PanelCor(Color.yellow, 40, 20);
		PanelCor panelCor3 = new PanelCor(Color.green);
		PanelCor panelCor4 = new PanelCor(Color.blue);
		PanelCor panelCor5 = new PanelCor(Color.white, 80, 20);
		
		this.getContentPane().add(panelCor1);
		this.getContentPane().add(panelCor2);
		this.getContentPane().add(panelCor3);
		this.getContentPane().add(panelCor4);
		this.getContentPane().add(panelCor5);
	}
	
}