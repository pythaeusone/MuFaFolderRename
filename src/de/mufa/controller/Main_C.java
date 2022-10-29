package de.mufa.controller;

import java.awt.EventQueue;

import de.mufa.model.Main_M;
import de.mufa.view.Main_V;

public class Main_C
{
	Main_V mv;
	Main_M mm;

	public Main_C(Main_V mv, Main_M mm)
	{
		this.mv = mv;
		this.mm = mm;
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
}
