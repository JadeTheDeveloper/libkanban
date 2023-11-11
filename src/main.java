import javax.swing.*;
import java.awt.*;


public class main {

    JFrame frame = new JFrame("libkanban");
    JMenuBar menuBar = new JMenuBar();
    JMenu menu = new JMenu("File");
    JMenuItem exit = new JMenuItem("Exit");

    public void drawTopMenu(){
        menu.add(exit);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
    }



    public void initWindow(){
        Color backgroundColour = new Color(82,82,82);
        drawTopMenu();
        frame.getContentPane().setBackground(backgroundColour);
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
