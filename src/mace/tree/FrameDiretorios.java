package mace.tree;

import java.awt.BorderLayout;

import javax.swing.JScrollPane;

import mace.framesimples.FrameSimples;

public class FrameDiretorios extends FrameSimples {
	
	private static final long serialVersionUID = 1L;
	
	public FrameDiretorios() {
		this.setSize(300, 500);
		TreeDiretorios treeDirectorios = new TreeDiretorios();
		JScrollPane scrollPane = new JScrollPane(treeDirectorios);
		this.getContentPane().add(scrollPane, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		FrameDiretorios frameDiretorios = new FrameDiretorios();
		frameDiretorios.exibir("Arvore de Diretorios");
	}
	
}