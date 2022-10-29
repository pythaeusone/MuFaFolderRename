package de.mufa.controller;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;

import de.mufa.model.Main_M;
import de.mufa.view.Main_V;

public class Main_C implements ActionListener
{
	Main_V mv;
	Main_M mm;

	public Main_C(Main_V mv, Main_M mm)
	{
		this.mv = mv;
		this.mm = mm;
		this.mv.MainVButtonListener(this);
	}

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

	@Override
	public void actionPerformed(ActionEvent e)
	{
		switch (e.getActionCommand())
		{
		case "OpenFolder":
			folderChooser();
			break;
		default:
			System.out.println("Default");
			break;
		}

	}

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
			System.out.println("Kein Ordner gewaehlt!");
		}
	}

	void fillFolderList(String[] folderList)
	{
		for (String fL : folderList)
		{
			mv.model.addElement(fL);
		}
	}
}
