import javax.swing.*;
import java.awt.*;

public class UiExample {
    JFrame window = new JFrame("Example App");

    JPanel myPanel = new JPanel();

    JTextField emailField = new JTextField("Enter your email address");

    JButton myButton = new JButton("Click here");

    void drawUi() {
        myPanel.setLayout(new GridLayout(2, 1));  // 2 rows, 1 column
        myPanel.add(emailField);
        myPanel.add(myButton);

        window.add(myPanel);
        window.setSize(300, 150);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public static void main(String[] args) {
        UiExample uiExample = new UiExample();
        uiExample.drawUi();
    }
}
