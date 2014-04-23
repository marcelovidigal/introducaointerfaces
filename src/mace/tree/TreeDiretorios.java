package mace.tree;

import java.io.File;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class TreeDiretorios extends JTree {
	
	private static final long serialVersionUID = 1L;
	
	private DefaultTreeModel defaultTreeModel;
	
	private String caminho = "./src/mace/";
	private File file;
	
	public TreeDiretorios() {
		file = new File(caminho);
		metodoRecursivo(file);
		this.setModel(defaultTreeModel);
	}
	
	public DefaultMutableTreeNode metodoRecursivo(File file) {
		
		DefaultMutableTreeNode defaultMutableTreeNode = new DefaultMutableTreeNode(file.getName());
		
		if (file == this.file) {
			defaultTreeModel = new DefaultTreeModel(defaultMutableTreeNode);
		}
		
		if (file.isDirectory()) {
			
			File[] files = file.listFiles();
			
			for (int i = 0; i < files.length; i++) {
				defaultTreeModel.insertNodeInto(metodoRecursivo(files[i]), defaultMutableTreeNode, 0);
			}
		}
		
		return defaultMutableTreeNode;
	}
	
}