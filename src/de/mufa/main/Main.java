package de.mufa.main;

import de.mufa.controller.Main_C;
import de.mufa.model.Main_M;
import de.mufa.view.Main_V;

/**
 * Die Main Klasse, Einstiegspunkt
 * 
 * @author MustafaJukic
 *
 */
public class Main
{

	/**
	 * Startpunkt von Java.
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		Main_V mv = new Main_V();
		Main_M mm = new Main_M();

		Main_C mc = new Main_C(mv, mm);
		
		mc.buildView();
	}

}
