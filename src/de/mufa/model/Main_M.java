package de.mufa.model;

import java.io.File;
import java.util.ArrayList;

/**
 * Klasse vom Main Model
 * 
 * @author MuFa
 *
 */
public class Main_M
{
	private File folderPath;
	private String[] fL;
	ArrayList<String> log = new ArrayList<String>();

	/**
	 * Gibt den Ordnerpfad zurueck.
	 * 
	 * @return - Der return enthaelt den Pfad.
	 */
	public File getFolderPath()
	{
		return folderPath;
	}

	/**
	 * Der Main Controller speichert hier den Ordnerpfad.
	 * 
	 * @param folderPath - Parameter enthaelt den Pfad.
	 */
	public void setFolderPath(File folderPath)
	{
		this.folderPath = folderPath;
	}

	/**
	 * Listet alle Ordner in einem Pfad auf.
	 * 
	 * @param filePath - Der Pfad wo die Ordner drin sind.
	 * @return - Gibt ein Array zurueck mit allen Ordnernamen.
	 */
	public String[] getFolderList(File filePath)
	{
		fL = filePath.list();
		return fL;
	}

	/**
	 * Diese Methode benennt nur einen Ordner um.
	 * 
	 * @param oldName   - Alter Ordnername.
	 * @param removeOne - String Eins, der entfernt werden soll.
	 * @param removeTwo - String Zwei, der entfernt werden soll, kann auch leer
	 *                  bleiben.
	 * @return - Gibt eine Log als ArrayListe zurueck mit dem Alten und neuen Pfad.
	 */
	public ArrayList<String> renameOne(String oldName, String removeOne, String removeTwo)
	{
		String newFolderName = "";
		log.clear();
		newFolderName = (oldName.replace(removeOne, "")).replace(removeTwo, "");
		File oldDir = new File(folderPath + File.separator + oldName);
		log.add(oldDir.toString());
		File newDir = new File(folderPath + File.separator + newFolderName);
		log.add(newDir.toString());
		oldDir.renameTo(newDir);

		return log;
	}

	/**
	 * Diese Methode benennt alle Order vom gewaehlten Pfad um.
	 * 
	 * @param removeOne - String Eins, der entfernt werden soll.
	 * @param removeTwo - String Zwei, der entfernt werden soll, kann auch leer
	 * @return - Gibt eine Log als ArrayListe zurueck mit dem Alten und neuen Pfad.
	 */
	public ArrayList<String> renameAll(String removeOne, String removeTwo)
	{
		String newFolderName = "";
		log.clear();
		for (String f : fL)
		{
			newFolderName = (f.replace(removeOne, "")).replace(removeTwo, "");
			File oldDir = new File(folderPath + File.separator + f);
			log.add(oldDir.toString());
			File newDir = new File(folderPath + File.separator + newFolderName);
			log.add(newDir.toString());
			oldDir.renameTo(newDir);
		}

		return log;
	}

	public String cutStringLeft(String oldName, int carretPosi)
	{
		return oldName.substring(carretPosi);
	}

	public String cutStringRight(String oldName, int carretPosi)
	{

		return oldName.substring(0, carretPosi);
	}

}
