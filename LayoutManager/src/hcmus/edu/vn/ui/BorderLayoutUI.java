package hcmus.edu.vn.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutUI extends JFrame {
	public BorderLayoutUI(String tieude)
	{
		super(tieude);
		addControl();
	}
	public void addControl()
	{
		Container con = getContentPane();
		JPanel pnBorderLayout = new JPanel();
		pnBorderLayout.setLayout(new BorderLayout());
		
		JPanel pnNorth = new JPanel();
		pnNorth.setBackground(Color.red);
		pnBorderLayout.add(pnNorth, BorderLayout.NORTH);
		
		JPanel pnSouth = new JPanel();
		pnSouth.setBackground(Color.blue);
		pnBorderLayout.add(pnSouth, BorderLayout.SOUTH);
		
		JPanel pnWest = new JPanel();
		pnWest.setBackground(Color.green);
		pnBorderLayout.add(pnWest, BorderLayout.WEST);
		
		JPanel pnEast = new JPanel();
		pnEast.setBackground(Color.pink);
		pnBorderLayout.add(pnEast, BorderLayout.EAST);
		
		JPanel pnCenter = new JPanel();
		pnCenter.setBackground(Color.orange);
		pnBorderLayout.add(pnCenter, BorderLayout.CENTER);
		
		con.add(pnBorderLayout);
	}
	public void showWindow() 
	{
		this.setSize(500, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
