import javax.swing.*;
import java.awt.*;


public class main {

    JFrame frame = new JFrame();


    public void initWindow(){
        Color colour = new Color(82,82,82);
        frame.setBackground(colour);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    //I Know having the class named main is a horrible practice. Don't change it.
    public static void main(String[] args){
        main instance = new main();
        instance.initWindow();
    }

}
