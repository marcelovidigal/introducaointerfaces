package mace.combobox;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelExibirData extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	public JLabel labelExibicao;
	
	public PanelExibirData() {
		
		labelExibicao = new JLabel("01.Janeiro 2014");
		
		this.setLayout(new GridLayout(1, 2));
		this.add(new JLabel("Data selecionada:  "));
		this.add(labelExibicao);
	}
	
	public void setData(String data) {
		labelExibicao.setText(data);
	}
	
}