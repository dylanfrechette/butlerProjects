import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class close extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.out.println("Later alligator.  In a while crocodile.");
		System.exit(0);
	}
}

public class gui7 extends JFrame implements ActionListener
{
	JButton swim, color;
	JTextArea input;
	
	monalisa tank;
	
	private int random(int low, int hi)
	{
		return low+(int)( (hi-low)*Math.random());
	}
	
	class fish
	{
		int x;
		int y;
		int length;
		int height;
		Color color;
		
		public fish()
		{
			length=random(50,200);
			height=length/2;
			x=random(0,700-length);
			y=random(0,500-height);
			color=new Color( random(0,255),
			  random(0,255), random(0,255) );
		}
		
		public void newcolor()
		{
			color=new Color( random(0,255),
			  random(0,255), random(0,255) );
		}
		
		public void swim()
		{
			x=x+2+length/10;
			if(x+length>700) x=-length;
		}
		
		public void draw(Graphics g)
		{
			g.setColor(color);
			g.fillOval(x+length/3,y, 2*length/3,height);
			int [] xlist={x, x, x+length/2};
			int [] ylist={y, y+height, y+height/2};
			g.fillPolygon(xlist,ylist,3);
			
			g.setColor(Color.white);
			g.fillOval(x+2*length/3,y+height/4,
			   height/4,height/4);
			g.setColor(Color.black);
			int ew=5;
			g.fillOval(x+2*length/3+ew,y+height/4+ew,
			   height/4-2*ew,height/4-2*ew);
		}
	}
	
	fish [] school;
	
	class monalisa extends JPanel
	{
		public monalisa() { setSize(700,500); }
		
		public void paintComponent(Graphics g)
		{
			g.setColor(Color.blue);
			g.fillRect(0,0, 700,500);
			for(int i=0; i<school.length; i++)
				school[i].draw(g);
		}
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==swim)
		{
			for(int i=0; i<school.length; i++)
				school[i].swim();
		}
		if(e.getSource()==color)
		{
			int x=Integer.parseInt(input.getText());
			if(0<=x && x<school.length)
				school[x].newcolor();
		}
		repaint();
	}
	
	public gui7()
	{
		addWindowListener( new close() );
		setSize(900,600);
		
		swim=new JButton("Swim");
		swim.addActionListener(this);
		color=new JButton("Color");
		color.addActionListener(this);
		input=new JTextArea("0");
		tank=new monalisa();
		
		school=new fish[20];
		for(int i=0; i<school.length; i++)
			school[i]=new fish();
		
		Container malcolm=getContentPane();
		malcolm.setLayout(new BorderLayout());
		
		malcolm.add( color,"West");
		malcolm.add( swim, "East");
		malcolm.add( tank,"Center");
		malcolm.add( input,"South");
		
		setTitle("gui7 - a braver newer water world!");
		setVisible(true);
	}
	
	public static void main(String [] args)
	{
		gui7 noOpinions=new gui7();	
	}
}
