package mace.combobox;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import mace.framesimples.FrameSimples;

public class FrameCombobox extends FrameSimples implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private PanelExibirData panelExibirData;
	private PanelCalendario panelCalendario;
	
	public FrameCombobox() {
		
		panelExibirData = new PanelExibirData();
		panelCalendario = new PanelCalendario();
		JButton buttonOk = new JButton("OK");
		buttonOk.addActionListener(this);
		
		this.getContentPane().add(panelCalendario, BorderLayout.CENTER);
		this.getContentPane().add(panelExibirData, BorderLayout.SOUTH);
		this.getContentPane().add(buttonOk, BorderLayout.EAST);
		
		this.pack();
	}
	
	public void actionPerformed(ActionEvent evt){
		panelExibirData.setData(panelCalendario.getData());
	}
	
	public static void main(String[] args){
		FrameCombobox frameCombobox = new FrameCombobox();
		frameCombobox.exibir("Combobox");
	}
	
}