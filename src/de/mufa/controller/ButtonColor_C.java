package de.mufa.controller;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.border.LineBorder;

import de.mufa.view.Main_V;

/**
 * Diese Klasse kuemmert sich fuer die Button Animation.
 * 
 * @author MuFa
 *
 */
public class ButtonColor_C implements MouseListener
{
	Main_V mv;
	/**
	 * Konstruktor fuer die Button Animation.
	 */
	public ButtonColor_C(Main_V mv)
	{
		this.mv = mv;
	}

	@Override
	public void mouseClicked(MouseEvent e)
	{

	}

	/*
	 * Wenn die Linke Maustaste einen Button klickt, wird die Schrift kleiner.
	 */
	@Override
	public void mousePressed(MouseEvent e)
	{
		((JButton) e.getSource()).setFont(new Font("Tahoma", Font.BOLD, 11));
	}

	/*
	 * Wenn die Linke Maustaste wieder losgelassen wird, ist die Schrift wieder
	 * groeßer.
	 */
	@Override
	public void mouseReleased(MouseEvent e)
	{
		((JButton) e.getSource()).setFont(new Font("Tahoma", Font.BOLD, 12));
	}

	/*
	 * Wenn der Mauszeiger ueber ein Button gleitet, wird der Rahmen dicker.
	 */
	@Override
	public void mouseEntered(MouseEvent e)
	{
		((JButton) e.getSource()).setBorder(new LineBorder(new Color(128, 128, 128), 2));
		((JButton) e.getSource()).setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	}

	/*
	 * Verlaesst die Maus den Button, wird der Rahmen wieder duenner.
	 */
	@Override
	public void mouseExited(MouseEvent e)
	{
		((JButton) e.getSource()).setBorder(new LineBorder(new Color(255, 255, 255), 2));
		((JButton) e.getSource()).setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
	}
}
