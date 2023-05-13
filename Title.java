import javax.swing.JFrame;
import java.awt.Color;
import java.awt.FlowLayout;


public class Title {
    private JFrame frame;
    public Title() {
        // Set up frame.
        frame = new JFrame("Carnival Tycoon");
        frame.setSize(1900, 1000);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.white);


         // Display frame.
         frame.setVisible(true);
    }
}
