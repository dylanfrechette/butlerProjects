import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

class close extends WindowAdapter
{
    public void windowClosing(WindowEvent e)
    {
        System.out.println("You can do it.");
        System.exit(0);
    }
}
class RoundButton extends JButton {

    private int random(int low, int hi)
    {
        return low+(int)( (hi-low)*Math.random());
    }
    public Color newcolor()
    {
        Color color=new Color( random(0,255),
                random(0,235), random(0,235) );
        return color;
    }

    protected void paintComponent(Graphics g) {
        if (getModel().isArmed()) {
            g.setColor(newcolor());
        } else {
            g.setColor(Color.cyan);
        }
        g.fillOval(0, 0, getSize().width-1, getSize().height-1);
        super.paintComponent(g);
    }
    protected void paintBorder(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawOval(0, 0, getSize().width-1, getSize().height - 1);
    }
    // Hit detection.
    Shape shape;

    public boolean contains(int x, int y) {
        // If the button has changed size,  make a new shape object.
        if (shape == null || !shape.getBounds().equals(getBounds())) {
            shape = new Ellipse2D.Float(0, 0, getWidth(), getHeight());
        }
        return shape.contains(x, y);
    }
}

public class gui extends JFrame implements ActionListener
{
    JButton spot1, spot2, spot3, spot4,spot5,spot6,spot7,spot8,spot9;
    JTextArea input;

    monalisa tank;

        class monalisa extends JPanel {
            public monalisa() {
                setSize(900, 900);
            }

            public void paintComponent(Graphics g) {
                g.setColor(Color.lightGray);
                g.fillRect(0, 0, 900, 900);
                g.setColor(Color.BLACK);
                g.drawLine(150, 100, 300, 350);
                g.drawLine(150,100,450,350);
                g.drawLine(150,100,450,100);
                g.drawLine(450,100,750,100);
                g.drawLine(450,100,600,350);
                g.drawLine(450,100,300,350);
                g.drawLine(750,100,450,350);
                g.drawLine(750,100,600,350);
                g.drawLine(150,600,300,350);
                g.drawLine(150,600,450,350);
                g.drawLine(150,600,450,600);
                g.drawLine(450,600,300,350);
                g.drawLine(450,600,600,350);
                g.drawLine(450,600,750,600);
                g.drawLine(750,600,450,350);
                g.drawLine(750,600,600,350);
                g.drawLine(300,350,600,350);

            }
        }

        public void actionPerformed(ActionEvent e) {
//        if(e.getSource()==swim)
//        {
//            for(int i=0; i<pieces.length; i++)
//                pieces[i].swim();
//        }
//        if(e.getSource()==color) {
//            //int x = Integer.parseInt(input.getText());
//            //if (0 <= x && x < school.length)
//            for(int x =0; x<pieces.length; x++)
//                pieces[x].newcolor();
//        }
//        repaint();
        }

    public gui() {
        addWindowListener(new close());
        setSize(900, 900);

        spot1 = new RoundButton();
        spot2 = new RoundButton();
        spot3 = new RoundButton();
        spot4 = new RoundButton();
        spot5 = new RoundButton();
        spot6 = new RoundButton();
        spot7 = new RoundButton();
        spot8 = new RoundButton();
        spot9 = new RoundButton();
        //swim.addActionListener(this);
        //color = new JButton("Color");
        //color.addActionListener(this);
        input = new JTextArea("0");
        tank = new monalisa();


        Container malcolm=getContentPane();
        malcolm.setLayout(new BorderLayout());

        spot1.setOpaque(false);
        spot1.setContentAreaFilled(false);
        spot1.setBorderPainted(false);
        spot1.setBounds(100,50,100,100);
        malcolm.add(spot1);
        spot2.setOpaque(false);
        spot2.setContentAreaFilled(false);
        spot2.setBorderPainted(false);
        spot2.setBounds(400,50,100,100);
        malcolm.add(spot2);
        spot3.setOpaque(false);
        spot3.setContentAreaFilled(false);
        spot3.setBorderPainted(false);
        spot3.setBounds(700,50,100,100);
        malcolm.add(spot3);
        spot4.setOpaque(false);
        spot4.setContentAreaFilled(false);
        spot4.setBorderPainted(false);
        spot4.setBounds(250,300,100,100);
        malcolm.add(spot4);
        spot5.setOpaque(false);
        spot5.setContentAreaFilled(false);
        spot5.setBorderPainted(false);
        spot5.setBounds(400,300,100,100);
        malcolm.add(spot5);
        spot6.setOpaque(false);
        spot6.setContentAreaFilled(false);
        spot6.setBorderPainted(false);
        spot6.setBounds(550,300,100,100);
        malcolm.add(spot6);
        spot7.setOpaque(false);
        spot7.setContentAreaFilled(false);
        spot7.setBorderPainted(false);
        spot7.setBounds(100,550,100,100);
        malcolm.add(spot7);
        spot8.setOpaque(false);
        spot8.setContentAreaFilled(false);
        spot8.setBorderPainted(false);
        spot8.setBounds(400,550,100,100);
        malcolm.add(spot8);
        spot9.setOpaque(false);
        spot9.setContentAreaFilled(false);
        spot9.setBorderPainted(false);
        spot9.setBounds(700,550,100,100);
        malcolm.add(spot9);
        malcolm.add( tank,"Center");
        //malcolm.add( input,"South");

        setTitle("Jerry-Tac-Toe");
        setVisible(true);
    }

    public static void main(String [] args)
    {
        String turn;
        Component frame;
        Object[] options = { "Second", "First" };
        int action = JOptionPane.showOptionDialog(frame, "Welcome to Jerry Tac Toe!\nWould you like to go first or second?",
                "Welcome!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (action == JOptionPane.YES_OPTION)
            turn = "X";
        else if (action == JOptionPane.NO_OPTION)
            turn = "O";
        gui noOpinions=new gui();
    }
}
