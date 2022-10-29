package de.mufa.view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionListener;

/**
 * Klasse fuer die Main View.
 * 
 * @author MustafaJukic
 *
 */
public class Main_V extends JFrame
{
	public JTextField txt_pathFromMainFolder;
	public JButton btn_openFolder;
	public JLabel lbl_1;
	public JList list_Folders;
	public DefaultListModel<String> model;
	public JLabel lbl_3;
	public JLabel lbl_4;
	public JTextField txt_StringTwo;
	public JTextField txt_StringOne;
	public JLabel lbl_2;
	public JRadioButton rdbtn_renameAll;
	public JRadioButton rdbtn_renameOne;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	public JButton btn_runRename;
	public JLabel lbl_printLog;
	public JScrollPane scrollPane;

	/**
	 * Konstruktor der Main View.
	 */
	public Main_V()
	{
		setResizable(false);
		setTitle("MuFa Folder Renamer 2.0");
		getContentPane().setBackground(Color.DARK_GRAY);
		setBounds(100, 100, 739, 376);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		txt_pathFromMainFolder = new JTextField();
		txt_pathFromMainFolder.setSelectionColor(Color.GRAY);
		txt_pathFromMainFolder.setFont(new Font("Tahoma", Font.BOLD, 12));
		txt_pathFromMainFolder.setForeground(Color.LIGHT_GRAY);
		txt_pathFromMainFolder.setOpaque(false);
		txt_pathFromMainFolder.setFocusTraversalKeysEnabled(false);
		txt_pathFromMainFolder.setCaretColor(Color.WHITE);
		txt_pathFromMainFolder.setBorder(new LineBorder(Color.WHITE));
		txt_pathFromMainFolder.setBounds(10, 10, 543, 23);
		getContentPane().add(txt_pathFromMainFolder);
		txt_pathFromMainFolder.setColumns(10);

		btn_openFolder = new JButton("1. - Open Mainfolder");
		btn_openFolder.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_openFolder.setForeground(Color.LIGHT_GRAY);
		btn_openFolder.setContentAreaFilled(false);
		btn_openFolder.setVerifyInputWhenFocusTarget(false);
		btn_openFolder.setRolloverEnabled(false);
		btn_openFolder.setRequestFocusEnabled(false);
		btn_openFolder.setOpaque(false);
		btn_openFolder.setFocusTraversalKeysEnabled(false);
		btn_openFolder.setFocusPainted(false);
		btn_openFolder.setBorder(new LineBorder(Color.WHITE));
		btn_openFolder.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_openFolder.setBounds(563, 10, 150, 23);
		getContentPane().add(btn_openFolder);

		lbl_1 = new JLabel("2. - Folders Inside, select One.");
		lbl_1.setBorder(new LineBorder(Color.WHITE));
		lbl_1.setForeground(Color.LIGHT_GRAY);
		lbl_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_1.setBounds(10, 44, 200, 23);
		getContentPane().add(lbl_1);

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
		list_Folders.setBounds(10, 78, 200, 248);
		getContentPane().add(list_Folders);

		lbl_3 = new JLabel("1. String to remove:");
		lbl_3.setBorder(new LineBorder(Color.WHITE));
		lbl_3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_3.setForeground(Color.LIGHT_GRAY);
		lbl_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_3.setBounds(220, 78, 140, 23);
		getContentPane().add(lbl_3);

		lbl_4 = new JLabel("2. String to remove:");
		lbl_4.setBorder(new LineBorder(Color.WHITE));
		lbl_4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_4.setForeground(Color.LIGHT_GRAY);
		lbl_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_4.setBounds(220, 112, 140, 23);
		getContentPane().add(lbl_4);

		txt_StringTwo = new JTextField();
		txt_StringTwo.setSelectionColor(Color.GRAY);
		txt_StringTwo.setOpaque(false);
		txt_StringTwo.setForeground(Color.LIGHT_GRAY);
		txt_StringTwo.setFont(new Font("Tahoma", Font.BOLD, 12));
		txt_StringTwo.setFocusTraversalKeysEnabled(false);
		txt_StringTwo.setColumns(10);
		txt_StringTwo.setCaretColor(Color.WHITE);
		txt_StringTwo.setBorder(new LineBorder(Color.WHITE));
		txt_StringTwo.setBounds(370, 112, 343, 23);
		getContentPane().add(txt_StringTwo);

		txt_StringOne = new JTextField();
		txt_StringOne.setSelectionColor(Color.GRAY);
		txt_StringOne.setOpaque(false);
		txt_StringOne.setForeground(Color.LIGHT_GRAY);
		txt_StringOne.setFont(new Font("Tahoma", Font.BOLD, 12));
		txt_StringOne.setFocusTraversalKeysEnabled(false);
		txt_StringOne.setColumns(10);
		txt_StringOne.setCaretColor(Color.WHITE);
		txt_StringOne.setBorder(new LineBorder(Color.WHITE));
		txt_StringOne.setBounds(370, 78, 343, 23);
		getContentPane().add(txt_StringOne);

		lbl_2 = new JLabel("3. - Prepare the String to remove, you can leave one Blank.");
		lbl_2.setBorder(new LineBorder(Color.WHITE));
		lbl_2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_2.setForeground(Color.LIGHT_GRAY);
		lbl_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_2.setBounds(220, 44, 493, 23);
		getContentPane().add(lbl_2);

		rdbtn_renameAll = new JRadioButton("Rename all Folders.");
		rdbtn_renameAll.setOpaque(false);
		rdbtn_renameAll.setVerifyInputWhenFocusTarget(false);
		rdbtn_renameAll.setContentAreaFilled(false);
		rdbtn_renameAll.setFocusPainted(false);
		rdbtn_renameAll.setRolloverEnabled(false);
		rdbtn_renameAll.setRequestFocusEnabled(false);
		buttonGroup.add(rdbtn_renameAll);
		rdbtn_renameAll.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtn_renameAll.setForeground(Color.LIGHT_GRAY);
		rdbtn_renameAll.setSelected(true);
		rdbtn_renameAll.setBorderPainted(true);
		rdbtn_renameAll.setBackground(Color.DARK_GRAY);
		rdbtn_renameAll.setBorder(new LineBorder(Color.WHITE));
		rdbtn_renameAll.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtn_renameAll.setBounds(370, 146, 165, 23);
		getContentPane().add(rdbtn_renameAll);

		rdbtn_renameOne = new JRadioButton("Rename only One.");
		rdbtn_renameOne.setOpaque(false);
		rdbtn_renameOne.setVerifyInputWhenFocusTarget(false);
		rdbtn_renameOne.setContentAreaFilled(false);
		rdbtn_renameOne.setFocusPainted(false);
		rdbtn_renameOne.setRolloverEnabled(false);
		rdbtn_renameOne.setRequestFocusEnabled(false);
		buttonGroup.add(rdbtn_renameOne);
		rdbtn_renameOne.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtn_renameOne.setForeground(Color.LIGHT_GRAY);
		rdbtn_renameOne.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtn_renameOne.setBorderPainted(true);
		rdbtn_renameOne.setBorder(new LineBorder(Color.WHITE));
		rdbtn_renameOne.setBackground(Color.DARK_GRAY);
		rdbtn_renameOne.setBounds(548, 146, 165, 23);
		getContentPane().add(rdbtn_renameOne);

		btn_runRename = new JButton("4. - Run rename");
		btn_runRename.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_runRename.setVerifyInputWhenFocusTarget(false);
		btn_runRename.setRolloverEnabled(false);
		btn_runRename.setRequestFocusEnabled(false);
		btn_runRename.setOpaque(false);
		btn_runRename.setForeground(Color.LIGHT_GRAY);
		btn_runRename.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_runRename.setFocusTraversalKeysEnabled(false);
		btn_runRename.setFocusPainted(false);
		btn_runRename.setContentAreaFilled(false);
		btn_runRename.setBorder(new LineBorder(Color.WHITE));
		btn_runRename.setBounds(220, 147, 140, 23);
		getContentPane().add(btn_runRename);

		scrollPane = new JScrollPane();
		scrollPane.setVerifyInputWhenFocusTarget(false);
		scrollPane.setRequestFocusEnabled(false);
		scrollPane.setOpaque(false);
		scrollPane.setFocusTraversalKeysEnabled(false);
		scrollPane.setBackground(Color.DARK_GRAY);
		scrollPane.setBorder(null);
		scrollPane.setBounds(220, 181, 493, 145);
		getContentPane().add(scrollPane);

		lbl_printLog = new JLabel("");
		lbl_printLog.setOpaque(true);
		lbl_printLog.setBackground(Color.DARK_GRAY);
		scrollPane.setViewportView(lbl_printLog);
		lbl_printLog.setHorizontalTextPosition(SwingConstants.LEFT);
		lbl_printLog.setVerticalTextPosition(SwingConstants.TOP);
		lbl_printLog.setVerticalAlignment(SwingConstants.TOP);
		lbl_printLog.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_printLog.setForeground(Color.LIGHT_GRAY);
		lbl_printLog.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_printLog.setBorder(new LineBorder(Color.WHITE));

	}

	/**
	 * Button Listener, reagiert auf Klicks und sagt an den Controller welcher
	 * Button das ist.
	 * 
	 * @param a - ButtonSource wird gesendet.
	 */
	public void MainVButtonListener(ActionListener a)
	{
		btn_openFolder.setActionCommand("OpenFolder");
		btn_openFolder.addActionListener(a);
	}

	/**
	 * Wenn ein Element in der JList angeklickt wird, reagiert der Controller
	 * darauf.
	 * 
	 * @param i - Das Element was selected ist, wird uebergeben.
	 */
	public void MainVListSelectionListener(ListSelectionListener l)
	{
		list_Folders.addListSelectionListener(l);
	}
}
