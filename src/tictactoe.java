import java.awt.*;
import java.awt.event.*;

// creating class for window
class Fdemo extends Frame implements ActionListener {

    // Creating the button array. We need 9 buttons
    Button[] b = new Button[9];

    // Initializing button counter and coordinates
    int k = 0, x=8, y=28;

    // creating the constructor
    Fdemo() {

        setLayout(null);	// no predifined layouts
        setVisible(true);
        setSize(800,600);
        setLocation(400,100);
        setBackground(Color.black);
        setForeground(Color.white);

        for (int i=1; i<=3; i++) {
            for (int j=1; j<=3; j++) {
                b[k] = new Button();
                b[k].setSize(100,100);
                b[k].setLocation(x, y);
                b[k].setFont(new Font("", Font.BOLD, 40));

                add(b[k]);

                b[k].addActionListener(this);
                b[k].setBackground(new Color(255,141,28)); //ORANGE
                k++;
                x = x + 100;
            }

            x = 8;
            y = y + 100;
        }

    }

    // implementing ActionListener, used for receiving action events
    public void actionPerformed(ActionEvent e) {

    }
}

public class tictactoe{

    public static void main (String [] args) {

        Fdemo f = new Fdemo();

    }
}