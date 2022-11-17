package br.com.erickfreire.desenhandolinhas;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DesenhandoLinhas extends JPanel {
	
	public void paintComponent(Graphics g) {
		
		super.paintComponents(g);

		int width = getWidth();
		int height = getHeight();
		int c =15;
		
		while(c<345){ 
			
			g.drawLine(0,c,c,height);
			c+=15;// 
		
	    }
		
	}

}
