package mace.list;

import java.awt.BorderLayout;

import javax.swing.JList;
import javax.swing.JScrollPane;

import mace.framesimples.FrameSimples;

public class FrameList extends FrameSimples {
	
	private static final long serialVersionUID = 1L;
	
	private String[] estados = {"Acre", "Alagoas", "Amap�", "Amazonas", "Bahia", "Cear�", 
								"Distrito Federal", "Esp�rito Santo", "Goi�s", "Maranh�o", 
								"Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Par�", 
								"Para�ba", "Paran�", "Pernambuco", "Piau�", "Rio de Janeiro", 
								"Rio Grande do Norte", "Rio Grande do Sul", "Rond�nia", "Roraima", 
								"Santa Catarina", "S�o Paulo", "Sergipe", "Tocantins"};
	
	public FrameList() {
		JList<Object> listEstados = new JList<Object>(estados);
		JScrollPane scrollPane = new JScrollPane(listEstados);
		this.getContentPane().add(scrollPane, BorderLayout.CENTER);
		this.pack();
	}
	
	public static void main(String[] args) {
		FrameList frameList = new FrameList();
		frameList.exibir("Programa List");
	}
	
}