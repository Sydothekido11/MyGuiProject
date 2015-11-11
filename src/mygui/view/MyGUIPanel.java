package mygui.view;

import javax.swing.JPanel;
import mygui.controller.GUIController;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


 public class MyGUIPanel extends JPanel
{

	private GUIController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	
	public MyGUIPanel(GUIController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		firstButton = new JButton("Press this to receive a gift");
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
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 94, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstButton, -114, SpringLayout.SOUTH, this);
	baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 126, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstTextField, -46, SpringLayout.NORTH, firstButton);
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
	

}
