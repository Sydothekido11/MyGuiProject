package mygui.view;

import javax.swing.JPanel;
import mygui.controller.GUIController;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MyGUIPanel
{

	private GUIController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	
	public MyGUIPanel(GUIController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		firstButton = new JButton("Press this to recieve a gift");
		firstTextField = new JTextField("Say something fool.");
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(firstTextField);
	}

	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				firstTextField.setText("No gift lol.");
			}
		});
	}
	
	
	private void add(JTextField firstTextField)
	{}
	private void add(JButton firstButton)
	{}
	private void setLayout(SpringLayout baseLayout)
	{}

}
