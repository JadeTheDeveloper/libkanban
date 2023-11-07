import javax.swing.*;
import java.awt.*;


public class main {

    JFrame frame = new JFrame();


    public void initWindow(){
        //sets everything with the layouts and all that jazz. This currently only works with 1920x1080 monitors. Sorry :P.
        //frame.setSize(1920,1080);
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
