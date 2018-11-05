
import java.awt.*;

import javax.swing.*;
import java.util.*;

public class TextManagerGUI extends JFrame {

	public TextManagerGUI(){
		
		super("Text Manager");
		setLayout(new FlowLayout());
		this.setVisible(true);
		this.setSize(800, 600);
		
		//Make Normal Window Extended
		super.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}
