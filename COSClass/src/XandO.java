import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class XandO {

    ArrayList<Integer> playerOne = new ArrayList<>();
    ArrayList<Integer> playerTwo = new ArrayList<>();
    JFrame XandO = new JFrame();
    JButton btn1 = new JButton("1");
    JButton btn2 = new JButton("2");
    JButton btn3 = new JButton("3");
    JButton btn4 = new JButton("4");
    JButton btn5 = new JButton("5");
    JButton btn6 = new JButton("6");
    JButton btn7 = new JButton("7");
    JButton btn8 = new JButton("8");
    JButton btn9 = new JButton("9");
    JPanel myPanel = new JPanel();

    public void drawGrid() {
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playerOne.add(1);
                checkWin();
            }
        });

        myPanel.add(btn1);
        myPanel.add(btn2);
        myPanel.add(btn3);
        myPanel.add(btn4);
        myPanel.add(btn5);
        myPanel.add(btn6);
        myPanel.add(btn7);
        myPanel.add(btn8);
        myPanel.add(btn9);
        XandO.add(myPanel);
        XandO.setSize(300, 300);
        XandO.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        XandO.setVisible(true);
    }

    void checkWin() {
        if (playerOne.contains(1) && playerOne.contains(2) && playerOne.contains(3)) {
            JOptionPane.showMessageDialog(null, "Player 1 wins!");
        }
    }

    public static void main(String[] args) {
        XandO xando = new XandO();
        xando.drawGrid();
    }
}
