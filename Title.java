import javax.swing.ImageIcon;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.FlowLayout;

public class Title {
    private JFrame frame;

    public Title() {
        // Set up frame.
        frame = new JFrame("Carnival Tycoon");
        frame.setSize(1600, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.white);
        frame.setLayout(null);

        // Set icon.
        ImageIcon logo = new ImageIcon("logo.png"); // Image needs to be in project folder.
        frame.setIconImage(logo.getImage());
        
        frame.add(new LabelMaker("logo.png", "Welcome to Carnival Tycoon!!!", 1100, 500, 325, 0, 69));
        frame.add(new ButtonMaker("", "CLick Here to Play", 150, 50, 675, 500));
        
        // Display frame.
        frame.setVisible(true);
    }

}
