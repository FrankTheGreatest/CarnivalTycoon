import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class LabelMaker extends JLabel{
    public LabelMaker(String imageName, String text, int sizeX, int sizeY, int x, int y, int textSize){
        ImageIcon logo = new ImageIcon(imageName);
        // Set up label.
        // label.setBorder(BorderFactory.createEtchedBorder());
        this.setText("Welcome to Carnival Tycoon!!");
        this.setFont(new Font("Times New Roman", Font.PLAIN, textSize));
        this.setIcon(logo);
        this.setHorizontalTextPosition(JLabel.CENTER);
        this.setVerticalTextPosition(JLabel.TOP);
        this.setBounds(x, y, sizeX, sizeY);
    }
}
