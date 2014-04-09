package mace.dialogs;

public class ObjetoTransferenciaDados {
	
	private String textoLocalizar;
	private boolean caseSensitive;
	private boolean localiza;
	
	public ObjetoTransferenciaDados() {
		textoLocalizar = "";
		caseSensitive = true;
		localiza = true;
	}
	
	public void setTudo(String textoLocalizar, boolean caseSensitive, boolean localiza) {
		this.textoLocalizar = textoLocalizar;
		this.caseSensitive = caseSensitive;
		this.localiza = localiza;
	}
	
	public String getTextoLocalizar() {
		return textoLocalizar;
	}
	
	public boolean getCaseSensitive() {
		return caseSensitive ;
	}
	
	public boolean getLocaliza() {
		return localiza ;
	}
	
}
