import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;
import java.util.List;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractButton;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


class close extends WindowAdapter
{
    public void windowClosing(WindowEvent e)
    {
        System.out.println("Thanks for playing!");
        System.exit(0);
    }
}

/*Kishan Gandhi
This class is to alter the JButton class and allow us to use round buttons instead of square
 */
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
    static JButton spot1, spot2, spot3, spot4,spot5,spot6,spot7,spot8,spot9;
    JTextArea input;
    List<Integer> playerMoves = new ArrayList<>();
    static List<Integer> cpuMoves = new ArrayList<>();
    List<Integer> win1 = Arrays.asList(1,2,3);
    List<Integer> win2 =  Arrays.asList(1,5,9);
    List<Integer> win3 = Arrays.asList(1,4,8);
    List<Integer> win4 = Arrays.asList(2,4,7);
    List<Integer> win5 = Arrays.asList(2,6,9);
    List<Integer> win6 = Arrays.asList(3,5,7);
    List<Integer> win7 = Arrays.asList(4,5,6);
    List<Integer> win8 = Arrays.asList(7,8,9);
    List<Integer> win9 = Arrays.asList(3,6,8);
    List<List<Integer>> winCombos = Arrays.asList(win1, win2,win3,win4,win5,win6,win7,win8,win9);
    List<JButton> clearBoard = Arrays.asList(spot1,spot2,spot3,spot4,spot5,spot6,spot7,spot8,spot9);

    static boolean uPlayFirst;
    static int moveCount=0;

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

        /*RED DYLAN
        this function handles the majority of the code. waits for button event and then executes a check-run-check
        cycle to determine if the user has won yet, and, if not, runs the ai method that is supposed to run a loop
        from 0-8 and selects the first value that isn't in the List of user moves
            RED DYLAN*/
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==spot1) {
                if(checkMove(1))
                    spot1.setIcon(new ImageIcon("/Users/dbakr/IdeaProjects/JerryTacToe/src/JSORE.png"));
                validate();
                winCheck();
                gandhi();
                winCheck();
            }
            if(e.getSource()==spot2) {
                if(checkMove(2))
                    spot2.setIcon(new ImageIcon("/Users/dbakr/IdeaProjects/JerryTacToe/src/JSORE.png"));
                validate();
                winCheck();
                gandhi();
                winCheck();
            }
            if(e.getSource()==spot3) {
                if(checkMove(3))
                    spot3.setIcon(new ImageIcon("/Users/dbakr/IdeaProjects/JerryTacToe/src/JSORE.png"));
                validate();
                winCheck();
                gandhi();
                winCheck();
            }
            if(e.getSource()==spot4) {
                if(checkMove(4))
                    spot4.setIcon(new ImageIcon("/Users/dbakr/IdeaProjects/JerryTacToe/src/JSORE.png"));
                validate();
                winCheck();
                gandhi();
                winCheck();
            }
            if(e.getSource()==spot5) {
                if(checkMove(5))
                    spot5.setIcon(new ImageIcon("/Users/dbakr/IdeaProjects/JerryTacToe/src/JSORE.png"));
                validate();
                winCheck();
                gandhi();
                winCheck();
            }
            if(e.getSource()==spot6) {
                if(checkMove(6))
                    spot6.setIcon(new ImageIcon("/Users/dbakr/IdeaProjects/JerryTacToe/src/JSORE.png"));
                validate();
                winCheck();
                gandhi();
                winCheck();
            }
            if(e.getSource()==spot7) {
                if(checkMove(7))
                    spot7.setIcon(new ImageIcon("/Users/dbakr/IdeaProjects/JerryTacToe/src/JSORE.png"));
                validate();
                winCheck();
                gandhi();
                winCheck();
            }
            if(e.getSource()==spot8) {
                if(checkMove(8))
                    spot8.setIcon(new ImageIcon("/Users/dbakr/IdeaProjects/JerryTacToe/src/JSORE.png"));
                validate();
                winCheck();
                gandhi();
                winCheck();
            }
            if(e.getSource()==spot9) {
                if(checkMove(9))
                    spot9.setIcon(new ImageIcon("/Users/dbakr/IdeaProjects/JerryTacToe/src/JSORE.png"));
                validate();
                winCheck();
                gandhi();
                winCheck();
            }
        }

    public static void main(String [] args) throws FileNotFoundException
    {
        final JFrame frame = new JFrame();
        Object[] options = { "Second", "First" };
        int play = JOptionPane.showConfirmDialog(frame, "Welcome to Jerry Tac Toe!\nWould you like to go first?",
                "Jerry", JOptionPane.YES_NO_OPTION);
        if (play == JOptionPane.YES_OPTION)
            uPlayFirst = true;
        else if (play == JOptionPane.NO_OPTION)
            uPlayFirst=false;
        gui noOpinions=new gui();
        if(!uPlayFirst){
            spot5.setIcon(new ImageIcon("/Users/dbakr/IdeaProjects/JerryTacToe/src/GUPTAWHIP" +
                    ".jpg"));
            cpuMoves.add(5);
            moveCount++;
        }
    }

    private void updateMoveCount(){
            moveCount++;
    }
    /*BLUE DYLAN
    This is our ai function which essentially chooses the first spot not already picked by the user.
     BLUE DYLAN*/
    private void gandhi(){
        if(!(playerMoves.contains(1))&&!(cpuMoves.contains(1))){
            cpuMoves.add(1);
            moveCount++;
            spot1.setIcon(new ImageIcon("/Users/dbakr/IdeaProjects/JerryTacToe/src/GUPTAWHIP" +
                    ".jpg"));
        }
        else if(!(playerMoves.contains(2))&&!(cpuMoves.contains(2))){
            cpuMoves.add(2);
            moveCount++;
            spot2.setIcon(new ImageIcon("/Users/dbakr/IdeaProjects/JerryTacToe/src/GUPTAWHIP" +
                    ".jpg"));
        }
        else if(!(playerMoves.contains(3))&&!(cpuMoves.contains(3))){
            cpuMoves.add(3);
            moveCount++;
            spot3.setIcon(new ImageIcon("/Users/dbakr/IdeaProjects/JerryTacToe/src/GUPTAWHIP" +
                    ".jpg"));
        }
        else if(!(playerMoves.contains(4))&&!(cpuMoves.contains(4))){
            cpuMoves.add(4);
            moveCount++;
            spot4.setIcon(new ImageIcon("/Users/dbakr/IdeaProjects/JerryTacToe/src/GUPTAWHIP" +
                    ".jpg"));
        }
        else if(!(playerMoves.contains(5))&&!(cpuMoves.contains(5))){
            cpuMoves.add(5);
            moveCount++;
            spot5.setIcon(new ImageIcon("/Users/dbakr/IdeaProjects/JerryTacToe/src/GUPTAWHIP" +
                    ".jpg"));
        }
        else if(!(playerMoves.contains(6))&&!(cpuMoves.contains(6))){
            cpuMoves.add(6);
            moveCount++;
            spot6.setIcon(new ImageIcon("/Users/dbakr/IdeaProjects/JerryTacToe/src/GUPTAWHIP" +
                    ".jpg"));
        }
        else if(!(playerMoves.contains(7))&&!(cpuMoves.contains(7))){
            cpuMoves.add(7);
            moveCount++;
            spot7.setIcon(new ImageIcon("/Users/dbakr/IdeaProjects/JerryTacToe/src/GUPTAWHIP" +
                    ".jpg"));
        }
        else if(!(playerMoves.contains(8))&&!(cpuMoves.contains(8))){
            cpuMoves.add(8);
            moveCount++;
            spot8.setIcon(new ImageIcon("/Users/dbakr/IdeaProjects/JerryTacToe/src/GUPTAWHIP" +
                    ".jpg"));
        }
        else if(!(playerMoves.contains(9))&&!(cpuMoves.contains(9))){
            cpuMoves.add(9);
            moveCount++;
            spot9.setIcon(new ImageIcon("/Users/dbakr/IdeaProjects/JerryTacToe/src/GUPTAWHIP" +
                    ".jpg"));
        }
    }

    private boolean checkMove(int x){
        if(playerMoves.contains(x)||cpuMoves.contains(x)){
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "Invalid move! You have forfeited your move");
            return false;
        }
        else{
            playerMoves.add(x);
            updateMoveCount();
            return true;
        }
    }

    /*Oliva Marunde
    This method is to check if the user or the cpu has won the game yet by determining if any of the winning sets are
     subsets of the List of user/cpu moves. If the game is over, a window prompts users to play again. If the user
     selects play again, both selection lists are cleared and the count is reset to 0. The list of JButtons is then
     iterated through and its attached image icon is set to null.
     */
    private void winCheck() {
        boolean gameOver = false;
        for (int i = 0; i < winCombos.size(); i++) {
            if ((playerMoves.containsAll(winCombos.get(i)))||(cpuMoves.containsAll(winCombos.get(i)))) {
                gameOver = true;
            }
        }
            if (gameOver==true) {
                JFrame frame = new JFrame();
                int play = JOptionPane.showConfirmDialog(frame, "Thanks for playing!\nWould you like to play again?",
                        "Game Over", JOptionPane.YES_NO_OPTION);
                if (play == JOptionPane.YES_OPTION) {
                    spot1.setIcon(null);
                    spot2.setIcon(null);
                    spot3.setIcon(null);
                    spot4.setIcon(null);
                    spot5.setIcon(null);
                    spot6.setIcon(null);
                    spot7.setIcon(null);
                    spot8.setIcon(null);
                    spot9.setIcon(null);
                    moveCount = 0;
                    playerMoves.clear();
                    cpuMoves.clear();
                    moveCount = 0;
                    playerMoves.clear();
                    cpuMoves.clear();
                }
                else if (play == JOptionPane.NO_OPTION) {
                    System.exit(0);
                }
            }
        if(moveCount==18){
            JFrame frame = new JFrame();
            int play = JOptionPane.showConfirmDialog(frame, "No more moves!\nWould you like to play again?",
                    "Game Over", JOptionPane.YES_NO_OPTION);
            if (play == JOptionPane.YES_OPTION) {
                spot1.setIcon(null);
                spot2.setIcon(null);
                spot3.setIcon(null);
                spot4.setIcon(null);
                spot5.setIcon(null);
                spot6.setIcon(null);
                spot7.setIcon(null);
                spot8.setIcon(null);
                spot9.setIcon(null);
                moveCount = 0;
                playerMoves.clear();
                cpuMoves.clear();
            }
            else if (play == JOptionPane.NO_OPTION)
                System.exit(0);
        }
    }
    /*Andrew Nesler
    This gui is an altered version of the one from class. It turns our JButtons into RoundButtons and then attaches
    the previously specified action listener to each one. It then draws our board.
     */

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
        spot1.addActionListener(this);
        spot2.addActionListener(this);
        spot3.addActionListener(this);
        spot4.addActionListener(this);
        spot5.addActionListener(this);
        spot6.addActionListener(this);
        spot7.addActionListener(this);
        spot8.addActionListener(this);
        spot9.addActionListener(this);
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

        setTitle("Jerry-Tac-Toe");
        setVisible(true);
    }
}
