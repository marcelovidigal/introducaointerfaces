package mace.tree;

import java.awt.BorderLayout;

import mace.framesimples.FrameSimples;

public class FrameTree extends FrameSimples {
	
	private static final long serialVersionUID = 1L;
	
	public FrameTree() {
		this.setSize(300, 500);
		TreeBiologia treeBiologia = new TreeBiologia();
		
		this.getContentPane().add(treeBiologia, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		FrameTree frameTree = new FrameTree();
		frameTree.exibir("Conponente Tree");
	}
	
}