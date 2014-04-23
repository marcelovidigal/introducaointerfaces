package mace.table;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import mace.framesimples.FrameSimples;

public class FrameTablePedidos extends FrameSimples {
	
	private static final long serialVersionUID = 1L;
	
	public FrameTablePedidos() {
		this.setSize(300, 250);
		ModeloTablePedidos modeloTabelaPedidos = new ModeloTablePedidos();
		JTable table = new JTable(modeloTabelaPedidos);
		table.setRowHeight(50);
		JScrollPane scrollPane = new JScrollPane(table);
		
		this.getContentPane().add(scrollPane);	
	}
	
	public static void main(String[] args) {
		FrameTablePedidos frameTablePedidos = new FrameTablePedidos();
		frameTablePedidos.exibir();
	}
	
}