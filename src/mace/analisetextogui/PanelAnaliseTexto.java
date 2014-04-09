package mace.analisetextogui;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelAnaliseTexto extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private JLabel labelUltimoTexto;
	private JLabel labelNumeroEs;
	//private JLabel labelNumeroTextos;
	private JTextField textfieldEntrada;
	private AnaliseTextoModelo analiseTextoModelo;
	
	public PanelAnaliseTexto() {
		
		analiseTextoModelo = new AnaliseTextoModelo();
		
		this.setBackground(Color.yellow);
		this.setLayout(new GridLayout(3,2,10,10));
		
		JLabel labelPergunta = new JLabel("Digite o texto:");
		JLabel labelResposta = new JLabel("Texto atual:");
		JLabel labelNumeroTextos = new JLabel("No. de Es no texto atual:");
		labelUltimoTexto = new JLabel("");
		labelNumeroEs = new JLabel("--");
		textfieldEntrada = new JTextField("");
		
		labelPergunta.setOpaque(true);
		labelPergunta.setBackground(Color.black);
		labelPergunta.setForeground(Color.white);
		
		labelResposta.setOpaque(true);
		labelResposta.setBackground(Color.black);
		labelResposta.setForeground(Color.white);
		
		labelNumeroTextos.setOpaque(true);
		labelNumeroTextos.setBackground(Color.black);
		labelNumeroTextos.setForeground(Color.white);
		
		labelNumeroEs.setOpaque(true);
		labelNumeroEs.setBackground(Color.red);
		labelNumeroEs.setForeground(Color.white);
		
		labelUltimoTexto.setOpaque(true);
		labelUltimoTexto.setBackground(Color.red);
		labelUltimoTexto.setForeground(Color.white);
		
		this.add(labelPergunta);
		this.add(textfieldEntrada);
		this.add(labelResposta);
		this.add(labelUltimoTexto);
		this.add(labelNumeroTextos);
		this.add(labelNumeroEs);
	}
	
	public void iniciarAnaliseExibirResultado() {
		String texto = textfieldEntrada.getText();
		analiseTextoModelo.analisar(texto);
		labelUltimoTexto.setText(analiseTextoModelo.getTextoAtual());
		int noEs = analiseTextoModelo.getNumeroAtualEs();
		labelNumeroEs.setText(Integer.toString(noEs));
		textfieldEntrada.setText("");
	}
	
}