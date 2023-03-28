package hcmus.edu.vn.ui;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutUI extends JFrame {
	public FlowLayoutUI(String tieude)
	{
		super(tieude);
		addControl();
	}
	public void addControl()
	{
		Container con = getContentPane();
		
		JPanel pnFlowLayout = new JPanel();
		pnFlowLayout.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("demo button 1");
		JButton btn2 = new JButton("demo button 2");
		JButton btn3 = new JButton("demo button 3");
		JButton btn4 = new JButton("demo button 4");
		
		pnFlowLayout.add(btn1);
		pnFlowLayout.add(btn2);
		pnFlowLayout.add(btn3);
		pnFlowLayout.add(btn4);
		
		con.add(pnFlowLayout);
	}
	public void showWindow()
	{
		this.setSize(500, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
