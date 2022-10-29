package de.mufa.view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Main_V extends JFrame
{
	public JTextField txt_pathFromMainFolder;
	public JButton btn_openFolder;

	public Main_V()
	{
		setResizable(false);
		setTitle("MuFa Folder Renamer 2.0");
		getContentPane().setBackground(UIManager.getColor("CheckBox.darkShadow"));
		setBounds(100, 100, 739, 376);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		txt_pathFromMainFolder = new JTextField();
		txt_pathFromMainFolder.setBounds(10, 11, 543, 20);
		getContentPane().add(txt_pathFromMainFolder);
		txt_pathFromMainFolder.setColumns(10);

		btn_openFolder = new JButton("Open Mainfolder");
		btn_openFolder.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_openFolder.setBounds(563, 10, 150, 23);
		getContentPane().add(btn_openFolder);

	}
}
