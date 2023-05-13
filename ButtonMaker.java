import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ButtonMaker extends JButton{
    public ButtonMaker(String imageName, String text, int sizeX, int sizeY, int x, int y){
        ImageIcon image = new ImageIcon(imageName);
        this.setText(text);
        //this.addActionListener(event -> this.handleButton(event));
        this.setIcon(image);
        this.setBounds(x, y, sizeX, sizeY);

    }
    
}
