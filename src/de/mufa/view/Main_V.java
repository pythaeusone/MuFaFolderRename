package de.mufa.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Main_V extends JFrame
{
	public JTextField txt_pathFromMainFolder;
	public JButton btn_openFolder;
	public JLabel lblNewLabel;
	public JList list_Folders;
	public DefaultListModel<String> model;
	public JPanel panel;

	public Main_V()
	{
		setResizable(false);
		setTitle("MuFa Folder Renamer 2.0");
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setBounds(100, 100, 739, 376);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		txt_pathFromMainFolder = new JTextField();
		txt_pathFromMainFolder.setSelectionColor(Color.GRAY);
		txt_pathFromMainFolder.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txt_pathFromMainFolder.setForeground(Color.LIGHT_GRAY);
		txt_pathFromMainFolder.setOpaque(false);
		txt_pathFromMainFolder.setFocusTraversalKeysEnabled(false);
		txt_pathFromMainFolder.setCaretColor(Color.WHITE);
		txt_pathFromMainFolder.setBorder(new LineBorder(Color.WHITE));
		txt_pathFromMainFolder.setBounds(10, 11, 543, 20);
		getContentPane().add(txt_pathFromMainFolder);
		txt_pathFromMainFolder.setColumns(10);

		btn_openFolder = new JButton("Open Mainfolder");
		btn_openFolder.setForeground(Color.LIGHT_GRAY);
		btn_openFolder.setContentAreaFilled(false);
		btn_openFolder.setVerifyInputWhenFocusTarget(false);
		btn_openFolder.setRolloverEnabled(false);
		btn_openFolder.setRequestFocusEnabled(false);
		btn_openFolder.setOpaque(false);
		btn_openFolder.setFocusTraversalKeysEnabled(false);
		btn_openFolder.setFocusPainted(false);
		btn_openFolder.setBorder(new LineBorder(Color.WHITE));
		btn_openFolder.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_openFolder.setBounds(563, 10, 150, 23);
		getContentPane().add(btn_openFolder);

		lblNewLabel = new JLabel("Folders Inside");
		lblNewLabel.setForeground(Color.LIGHT_GRAY);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 42, 200, 14);
		getContentPane().add(lblNewLabel);

		model = new DefaultListModel<>();
		list_Folders = new JList(model);
		list_Folders.setSelectionBackground(Color.GRAY);
		list_Folders.setVerifyInputWhenFocusTarget(false);
		list_Folders.setRequestFocusEnabled(false);
		list_Folders.setFocusTraversalKeysEnabled(false);
		list_Folders.setBackground(Color.DARK_GRAY);
		list_Folders.setFont(new Font("Tahoma", Font.BOLD, 12));
		list_Folders.setForeground(Color.LIGHT_GRAY);
		list_Folders.setOpaque(false);
		list_Folders.setBorder(new LineBorder(Color.WHITE));
		list_Folders.setBounds(10, 67, 200, 259);
		getContentPane().add(list_Folders);

		panel = new JPanel();
		panel.setRequestFocusEnabled(false);
		panel.setBorder(new LineBorder(Color.WHITE, 3));
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 723, 337);
		getContentPane().add(panel);

	}

	public void MainVButtonListener(ActionListener a)
	{
		btn_openFolder.setActionCommand("OpenFolder");
		btn_openFolder.addActionListener(a);
	}
}
