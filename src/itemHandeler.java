import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class itemHandeler extends main {

public static void newItem(){
    main mymain = new main();
    JDialog item = new JDialog(mymain.frame, "New Item", true);
    item.setSize(100, 100);
    item.setVisible(true);
}
}
