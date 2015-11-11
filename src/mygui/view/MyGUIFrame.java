package mygui.view;

import javax.swing.JFrame;
import mygui.controller.GUIController;


public class MyGUIFrame extends JFrame
{

	private GUIController baseController;
	private MyGUIPanel basePanel;
	
	public MyGUIFrame(GUIController baseController)
	{
		this.baseController = baseController;
		basePanel = new MyGUIPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setTitle("Squish squish");
		this.setSize(400,400);
		this.setVisible(true);
	}

	

}
