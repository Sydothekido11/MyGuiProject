package mygui.view;

import javax.swing.JFrame;
import mygui.controller.GUIController;


public class MyGUIFrame
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


	private void setContentPane(MyGUIPanel basePanel)
	{}
	
	private void setTitle(String string)
	{}
	
	private void setSize(int i, int j)
	{}
	
	private void setVisible(boolean b)
	{}
	

	

	

}
