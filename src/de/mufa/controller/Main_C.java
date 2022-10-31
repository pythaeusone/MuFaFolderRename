package de.mufa.controller;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import de.mufa.model.Main_M;
import de.mufa.view.Main_V;

/**
 * Die Main Controller Klasse.
 * 
 * @author MuFa
 *
 */
public class Main_C implements ActionListener, ListSelectionListener
{
	Main_V mv;
	Main_M mm;
	ButtonColor_C bcc;

	/**
	 * Konstruktor der Main Controller Klasse.
	 * 
	 * @param mv - Die Main View.
	 * @param mm - Das Main Model.
	 */
	public Main_C(Main_V mv, Main_M mm)
	{
		this.mv = mv;
		this.mm = mm;
		this.mv.MainVButtonListener(this);
		this.mv.MainVListSelectionListener(this);

		bcc = new ButtonColor_C(mv);
	}

	/**
	 * Diese Methode macht die GUI sichbar.
	 */
	public void buildView()
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					mv.setLocationRelativeTo(null);
					mv.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Verknuepft mit dem ActionListener in der Main View und erhaelt die
	 * Informationen welcher Button geklickt wurde.
	 */
	@Override
	public void actionPerformed(ActionEvent e)
	{
		switch (e.getActionCommand())
		{
		case "OpenFolder":
			folderChooser();
			break;
		case "RunRename":
			checkRadioButton();
			break;
		default:
			System.out.println("Default");
			break;
		}

	}

	/**
	 * Verknuepft mit dem ListSelectionListener in der Main View und eraehlt die
	 * Information welcher Element das ist.
	 */
	@Override
	public void valueChanged(ListSelectionEvent e)
	{
		if (!e.getValueIsAdjusting())
		{
			mv.txt_StringOne.setText(mv.list_Folders.getSelectedValue().toString());
			mv.txt_StringTwo.setText(mv.list_Folders.getSelectedValue().toString());
		}

	}

	/*
	 * Beim Buttonklick oeffnet sich ein Dialog zu auswaehlen eines Ordners. Danach
	 * werden die Informationen vom Pfad an das Main Model uebergeben und
	 * verarbeitet. Danach wird die JList ueber ein Model mit den Ordnernamen
	 * beschrieben.
	 */
	void folderChooser()
	{
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		int option = fileChooser.showOpenDialog(mv);
		if (option == JFileChooser.APPROVE_OPTION)
		{
			mm.setFolderPath(fileChooser.getSelectedFile());
			mv.txt_pathFromMainFolder.setText(fileChooser.getSelectedFile().toString());
			fillFolderList(mm.getFolderList(mm.getFolderPath()));
		}
		else
		{
			mv.txt_pathFromMainFolder.setText("Kein Ordner gewaehlt!");
		}
	}

	/*
	 * Diese Methode wird aufgerufen um die JList in einer ForEach schleife zu
	 * fuellen.
	 */
	void fillFolderList(String[] folderList)
	{
		mv.model.clear();
		for (String fL : folderList)
		{
			mv.model.addElement(fL);
		}
	}

	/**
	 * Ruft die Rename Methode auf, je nach RadioButton.
	 */
	void checkRadioButton()
	{
		if (mv.rdbtn_renameAll.isSelected())
		{
			renameAll();
		}
		if (mv.rdbtn_renameOne.isSelected())
		{
			renameOne();
		}
	}

	/*
	 * Diese Methode uebergibt dem Main Model renameOne Methode die Parameter zum
	 * umbenennen. Und danach wird die Rueckgabe als Log in eine JTextArea
	 * geprintet.
	 */
	void renameOne()
	{
		ArrayList<String> log = mm.renameOne(mv.list_Folders.getSelectedValue().toString(), mv.txt_StringOne.getText(),
				mv.txt_StringTwo.getText());
		for (String l : log)
		{
			mv.textArea_log.append(l + "\n");
		}
	}

	/*
	 * Diese Methode uebergibt dem Main Model renameAll Methode die Parameter zum
	 * umbenennen. Und danach wird die Rueckgabe als Log in eine JTextArea
	 * geprintet.
	 */
	void renameAll()
	{
		ArrayList<String> log = mm.renameAll(mv.txt_StringOne.getText(),
				mv.txt_StringTwo.getText());
		for (String l : log)
		{
			mv.textArea_log.append(l + "\n");
		}
	}

	/**
	 * Uebergibt den MouseListener and die Buttons fuer die Animation.
	 */
	public void buttonColor()
	{
		mv.btn_openFolder.addMouseListener(bcc);
		mv.btn_runRename.addMouseListener(bcc);
	}
}
