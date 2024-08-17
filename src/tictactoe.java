import java.awt.*;
import java.awt.event.*;

// creating class for window
class Fdemo extends Frame implements ActionListener {

    // Creating the button array. We need 9 buttons
    Button[] b = new Button[9];

    Button b1; // New game

    // Initializing button counter and coordinates
    int k = 0, x=8, y=28;

    // Labeling the buttons
    int a = 0; // 0 or X
    int z = 0, z1 = 0, z2 = 0, z3 = 0, z4 = 0, z5 = 0, z6 = 0, z7 = 0, z8 = 0; // z is monitoring or preventing the alteration of buttons

    // creating the constructor
    Fdemo() {

        setLayout(null);	// no predifined layouts
        setVisible(true);
        setSize(800,600);
        setLocation(400,100);
        setBackground(Color.white);
        setForeground(Color.black);

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

        // New Game button
        b1 = new Button("New Game");
        b1.setSize(150,40);
        b1.setLocation(500,300);
        b1.setFont(new Font("",Font.BOLD,20));
        b1.setForeground(Color.black);

        add(b1);
        b1.addActionListener(this);
    }

    // implementing ActionListener, used for receiving action events
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {

            // Setting values to initial state for a new game
            for (int i=0; i<=8; i++) {
                b[i].setLabel(""); // setting label to null
            }
            z = 0; z1 = 0; z2 = 0; z3 = 0; z4 = 0; z5 = 0; z6 = 0; z7 = 0; z8 = 0;
        }

        // For the 9 buttons

        // First Button
        if (e.getSource() == b[0] && z == 0) {
            // if a is an even number, the button label is 0
            if (a % 2 == 0) {
                b[0].setLabel("0");
                z++;
                a++;
            }
            else {
                b[0].setLabel("X");
                z++;
                a++;
            }
        }

        //Second Button
        if (e.getSource() == b[1] && z1 == 0) {
            // if a is an even number, the button label is 0
            if (a % 2 == 0) {
                b[1].setLabel("0");
                z1++;
                a++;
            }
            else {
                b[1].setLabel("X");
                z1++;
                a++;
            }
        }

        // Third Button
        if (e.getSource() == b[2] && z2 == 0) {
            // if a is an even number, the button label is 0
            if (a % 2 == 0) {
                b[2].setLabel("0");
                z2++;
                a++;
            }
            else {
                b[2].setLabel("X");
                z2++;
                a++;
            }
        }

        // Fourth button
        if (e.getSource() == b[3] && z3 == 0) {
            // if a is an even number, the button label is 0
            if (a % 2 == 0) {
                b[3].setLabel("0");
                z3++;
                a++;
            }
            else {
                b[3].setLabel("X");
                z++;
                a++;
            }
        }

        // Fifth button
        if (e.getSource() == b[4] && z4 == 0) {
            // if a is an even number, the button label is 0
            if (a % 2 == 0) {
                b[4].setLabel("0");
                z4++;
                a++;
            }
            else {
                b[4].setLabel("X");
                z4++;
                a++;
            }
        }

        // Sixth button
        if (e.getSource() == b[5] && z5 == 0) {
            // if a is an even number, the button label is 0
            if (a % 2 == 0) {
                b[5].setLabel("0");
                z5++;
                a++;
            }
            else {
                b[5].setLabel("X");
                z5++;
                a++;
            }
        }

        // Seventh button
        if (e.getSource() == b[6] && z6 == 0) {
            // if a is an even number, the button label is 0
            if (a % 2 == 0) {
                b[6].setLabel("0");
                z6++;
                a++;
            }
            else {
                b[6].setLabel("X");
                z6++;
                a++;
            }
        }

        // Eighth button
        if (e.getSource() == b[7] && z7 == 0) {
            // if a is an even number, the button label is 0
            if (a % 2 == 0) {
                b[7].setLabel("0");
                z7++;
                a++;
            }
            else {
                b[7].setLabel("X");
                z7++;
                a++;
            }
        }

        // Ninth Button
        if (e.getSource() == b[8] && z8 == 0) {
            // if a is an even number, the button label is 0
            if (a % 2 == 0) {
                b[8].setLabel("0");
                z8++;
                a++;
            }
            else {
                b[8].setLabel("X");
                z8++;
                a++;
            }
        }
    }
}

public class tictactoe{

    public static void main (String [] args) {

        Fdemo f = new Fdemo();

    }
}