package de.mufa.model;

import java.io.File;

public class Main_M
{
	private File folderPath;

	public File getFolderPath()
	{
		return folderPath;
	}

	public void setFolderPath(File folderPath)
	{
		this.folderPath = folderPath;
	}

	public String[] getFolderList(File filePath)
	{
		String[] fL = filePath.list();
		return fL;
	}

}
