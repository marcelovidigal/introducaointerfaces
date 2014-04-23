package mace.table;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import mace.framesimples.FrameSimples;

public class FrameTableEstatica extends FrameSimples {
	
	private static final long serialVersionUID = 1L;
	
	private String[][] registros = {{"Celula 0.0", "Celula 0.1", "Celula 0.2"},
									{"Celula 1.0", "Celula 1.1", "Celula 1.2"}};
	
	private String[] nomesColunas = {"Coluna 0", "Coluna 1", "Coluna 2"};
	
	public FrameTableEstatica() {
		JTable table = new JTable(registros, nomesColunas);
		JScrollPane scrollPane = new JScrollPane(table);
		this.getContentPane().add(scrollPane);
	}
	
	public static void main(String[] args) {
		FrameTableEstatica frameTableEstatica = new FrameTableEstatica();
		frameTableEstatica.exibir("Frame Tabela Estatica");
	}
	
}