package hcmus.edu.vn.ui;

import java.awt.Button;
import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BoxLayoutUI extends JFrame {
	public BoxLayoutUI(String tieude)
	{
		super(tieude);
		addControl();
	}
	public void addControl()
	{
		Container con = getContentPane();
		
		JPanel pnBoxLayout = new JPanel();
		pnBoxLayout.setLayout(new BoxLayout(pnBoxLayout, BoxLayout.X_AXIS));
		
		JButton btn1 = new JButton("demo button 1");
		JButton btn2 = new JButton("demo button 2"); 
		JButton btn3 = new JButton("demo button 3"); 
		JButton btn4 = new JButton("demo button 4"); 
		
		pnBoxLayout.add(btn1);
		pnBoxLayout.add(btn2);
		pnBoxLayout.add(btn3);
		pnBoxLayout.add(btn4);
		
		con.add(pnBoxLayout);
	}
	public void showWindow() 
	{
		this.setSize(500, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
