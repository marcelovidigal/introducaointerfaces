package mace.tree;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class TreeBiologia extends JTree {
	
	private static final long serialVersionUID = 1L;
	
	private DefaultTreeModel defaultTreeModel;
	
	public TreeBiologia(){
		construirModelo();
		this.setModel(defaultTreeModel);
		this.putClientProperty("JTree.lineStyle", "Angled");
	}
	
	private void construirModelo() {
		
		DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Arvores");
		DefaultMutableTreeNode frondoso = new DefaultMutableTreeNode("Arvores com folhas");
		DefaultMutableTreeNode conifera = new DefaultMutableTreeNode("Conifera");
		DefaultMutableTreeNode faia = new DefaultMutableTreeNode("Faia");
		DefaultMutableTreeNode carvalho = new DefaultMutableTreeNode("Carvalho");
		DefaultMutableTreeNode betula = new DefaultMutableTreeNode("Betula");
		DefaultMutableTreeNode pinho = new DefaultMutableTreeNode("Pinho");
		DefaultMutableTreeNode abeto = new DefaultMutableTreeNode("Abeto");
		DefaultMutableTreeNode faiaR = new DefaultMutableTreeNode("Com folhas vrmelhas");
		DefaultMutableTreeNode faiaG = new DefaultMutableTreeNode("Com folhas verdes");
		
		defaultTreeModel = new DefaultTreeModel(raiz);
		defaultTreeModel.insertNodeInto(frondoso, raiz, 0);
		defaultTreeModel.insertNodeInto(conifera, raiz, 1);
		defaultTreeModel.insertNodeInto(faia, frondoso, 0);
		defaultTreeModel.insertNodeInto(carvalho, frondoso, 1);
		defaultTreeModel.insertNodeInto(betula, frondoso, 2);
		defaultTreeModel.insertNodeInto(pinho, conifera, 0);
		defaultTreeModel.insertNodeInto(abeto, conifera, 1);
		defaultTreeModel.insertNodeInto(faiaR, faia ,0);
		defaultTreeModel.insertNodeInto(faiaG, faia ,1);
	}
	
}