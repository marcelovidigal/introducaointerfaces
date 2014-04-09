package mace.analisetextogui;

public class AnaliseTextoModelo {
	
	private int numeroTotalEs;
	private int numeroAtualEs;
	private int numeroTotalTextos;
	private String textoAtual;
	
	public AnaliseTextoModelo() {
		numeroTotalEs = 0;
		numeroTotalTextos = 0;
		textoAtual = "";
	}
	
	public void analisar(String texto) {
		
		textoAtual = texto.toUpperCase();
		numeroAtualEs = 0;
		
		for (int i = 0; i < textoAtual.length(); i++) {
			if (textoAtual.charAt(i) == 'E') {
				numeroAtualEs++;
			}
		}
		
		numeroTotalEs += numeroAtualEs;
		numeroTotalTextos++;
	}
	
	public int getNumeroAtualEs() {
		return numeroAtualEs;
	}
	
	public String getTextoAtual(){
		return textoAtual;
	}
	
	public int getNumeroTotalEs() {
		return numeroTotalEs;
	}
	
	public int getNumeroTotalTextos(){
		return numeroTotalTextos;
	}
	
}