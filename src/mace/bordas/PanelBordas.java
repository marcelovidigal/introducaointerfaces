package mace.bordas;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class PanelBordas extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	public PanelBordas() {
		this.setBackground(Color.LIGHT_GRAY);
		Border border = BorderFactory.createEtchedBorder();
		this.setBorder(border);
	}
	
	public PanelBordas(String texto) {
		this.setBackground(Color.lightGray);
		Border border = BorderFactory.createEtchedBorder();
		Border borderTitulo = BorderFactory.createTitledBorder(border ,texto);
		this.setBorder(borderTitulo);
	}
	
}