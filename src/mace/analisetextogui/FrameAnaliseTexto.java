package mace.analisetextogui;

import java.awt.*;
import javax.swing.JButton;
import mace.framesimples.FrameSimples;

public class FrameAnaliseTexto extends FrameSimples {
	
	private static final long serialVersionUID = 1L;
	
	public FrameAnaliseTexto() {
		this.setSize(300,150);
		
		PanelAnaliseTexto panelAnaliseTexto = new PanelAnaliseTexto();
		this.getContentPane().add(panelAnaliseTexto, BorderLayout.CENTER);
		
		JButton buttonAnalisar = new JButton("Analisar");
		buttonAnalisar.setBackground(Color.blue);
		buttonAnalisar.setForeground(Color.yellow);
		
		this.getContentPane().add(buttonAnalisar, BorderLayout.SOUTH);
		
		ListenerAnaliseTexto listenerAnaliseTexto = new ListenerAnaliseTexto(panelAnaliseTexto);
		buttonAnalisar.addActionListener(listenerAnaliseTexto);
	}
	
} 