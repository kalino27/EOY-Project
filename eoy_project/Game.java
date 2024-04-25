package eoy_project;

	import javax.swing.*;
	import java.awt.*;
	import java.awt.image.BufferedImage; 
	import java.awt.event.*; 


	public class Game  extends JPanel implements Runnable, KeyListener{

		
		private BufferedImage back; 
		private int key; 
		private Box runner;



		
		public Game() {
			new Thread(this).start();	
			this.addKeyListener(this);
			key =-1; 
			
		
		}

		
		
		public void run()
		   {
		   	try
		   	{
		   		while(true)
		   		{
		   		   Thread.currentThread().sleep(5);
		            repaint();
		         }
		      }
		   		catch(Exception e)
		      {
		      }
		  	}
		

		
		
		
		public void paint(Graphics g){
			
			Graphics2D twoDgraph = (Graphics2D) g; 
			if( back ==null)
				back=(BufferedImage)( (createImage(getWidth(), getHeight()))); 
			

			Graphics g2d = back.createGraphics();
		
			g2d.clearRect(0,0,getSize().width, getSize().height);
			
			g2d.setFont( new Font("Broadway", Font.BOLD, 50));
			
			g2d.drawString("key " + key, 340, 100);
			
		
			twoDgraph.drawImage(back, null, 0, 0);

		}

		



		//DO NOT DELETE
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}




	//DO NOT DELETE
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
			key= e.getKeyCode();
			if (key==37) {//Left
				runner.setDX(-2);	
			}
			if (key==38) {//Down
				runner.setDY(-2);	
			}
			if (key==39) {//Right
				runner.setDX(2);	
			}
			if (key==40) {//Up
				runner.setDY(2);		
			}

			}
				



			public void keyReleased(KeyEvent e) {
			key=e.getKeyCode();
			if (key==39 || key==37) {
				runner.setDX(0);	
			}
			if (key==38 || key==40) {
				runner.setDY(0);	
			}
			}
			}


		
		

	

