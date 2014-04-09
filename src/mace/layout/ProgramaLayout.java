package mace.layout;

import java.awt.FlowLayout;
import java.awt.GridLayout;

public class ProgramaLayout {
	
	public static void main(String[] args) {
		
		FlowLayout flowLayout1 = new FlowLayout();
		Layout layout1 = new Layout(flowLayout1);
		
		layout1.exibir("Flow Layout 1", 60, 60);
		
		FlowLayout flowLayout2 = new FlowLayout(FlowLayout.LEFT, 40, 30);
		Layout layout2 = new Layout(flowLayout2);
		
		layout2.exibir("Flow Layout 2", 300, 60);
		
		GridLayout gridLayout = new GridLayout(2, 3);
		Layout layout3 = new Layout(gridLayout);
		
		layout3.exibir("Grid Layout", 540, 60);
	}
	
}