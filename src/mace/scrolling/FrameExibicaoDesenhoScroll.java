package mace.scrolling;

import java.awt.BorderLayout;
import javax.swing.JScrollPane;

import mace.framesimples.FrameSimples;

public class FrameExibicaoDesenhoScroll extends FrameSimples {
	
	private static final long serialVersionUID = 1L;
	
	private PanelExibicaoDesenhoScroll panelExibicaoDesenhoScroll;
	
	public FrameExibicaoDesenhoScroll() {
		
		panelExibicaoDesenhoScroll = new PanelExibicaoDesenhoScroll();
		JScrollPane scrollPane = new JScrollPane(panelExibicaoDesenhoScroll);
		
		this.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
	}
	
}
