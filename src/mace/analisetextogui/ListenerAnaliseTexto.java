package mace.analisetextogui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerAnaliseTexto implements ActionListener {
	
	private PanelAnaliseTexto panelAnaliseTexto;
	
	public ListenerAnaliseTexto(PanelAnaliseTexto panelAnaliseTexto) {
		this.panelAnaliseTexto = panelAnaliseTexto;
	}
	
	public void actionPerformed(ActionEvent evt) {
		panelAnaliseTexto.iniciarAnaliseExibirResultado();
	}
	
}