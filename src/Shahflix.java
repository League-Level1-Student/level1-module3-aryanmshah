import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Shahflix implements ActionListener {
	public static void main(String[] args) {
		Shahflix bob= new Shahflix();
	bob.flix();

}
	void flix() {
    	Dimension BIG = new Dimension(1000,1000);
    	Dimension SMALL = new Dimension(50,50);
		JFrame Frame=new JFrame();
    	JPanel Panel= new JPanel();
    	Frame.add(Panel);
    	Frame.setPreferredSize(BIG);
    	Frame.setVisible(true);
    	Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	Frame.setSize(500, 500);
    	JLabel Label= new JLabel();
    	JButton button= loadImage("download.jpg");
    	Panel.add(Label);
    	 Panel.add(Label);
    	Panel.add(button);
        button.setPreferredSize(SMALL);
         button.setText(null);
         button.addActionListener(this);           
	           
         
        
	           
}
	private JButton loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JButton(icon);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}