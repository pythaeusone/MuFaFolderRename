package de.mufa.model;

import java.io.File;

/**
 * Klasse vom Main Model
 * 
 * @author MustafaJukic
 *
 */
public class Main_M
{
	private File folderPath;

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
		String[] fL = filePath.list();
		return fL;
	}

}
