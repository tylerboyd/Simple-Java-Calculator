package calculator;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
* CalculatorPanel Class sets the layout for the GUI.
*
* Built exclusively with Java Swing components.
*
* @author  Tyler Boyd
* @version 1.0
*/

public class CalculatorPanel extends JPanel{
	
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_0;
	private JButton button_decimal;
	private JButton button_negate;
	private JButton button_equals;
	private JButton button_add;
	private JButton button_subtract;
	private JButton button_multiply;
	private JButton button_divide;
	private JButton button_backspace;
	private JButton button_clear;
	private JTextField display;
	
	public JButton getButton_1() 
	{
		return button_1;
	}
	
	public JButton getButton_2() 
	{
		return button_2;
	}
	public JButton getButton_3() {
		return button_3;
	}
	public JButton getButton_4() 
	{
		return button_4;
	}
	
	public JButton getButton_5() 
	{
		return button_5;
	}
	
	public JButton getButton_6() 
	{
		return button_6;
	}
	
	public JButton getButton_7() 
	{
		return button_7;
	}
	
	public JButton getButton_8() 
	{
		return button_8;
	}
	
	public JButton getButton_9() 
	{
		return button_9;
	}
	
	public JButton getButton_0() 
	{
		return button_0;
	}
	
	public JButton getButton_decimal() 
	{
		return button_decimal;
	}
	
	public JButton getButton_negate() 
	{
		return button_negate;
	}
	
	public JButton getButton_equals() 
	{
		return button_equals;
	}
	
	public JButton getButton_add() 
	{
		return button_add;
	}
	
	public JButton getButton_subtract() 
	{
		return button_subtract;
	}
	
	public JButton getButton_multiply() 
	{
		return button_multiply;
	}
	
	public JButton getButton_divide() 
	{
		return button_divide;
	}
	
	public JButton getButton_backspace() 
	{
		return button_backspace;
	}
	
	public JButton getButton_clear() 
	{
		return button_clear;
	}
	
	public JTextField getDisplay() 
	{
		return display;
	}
	
	public CalculatorPanel() 
	{
		//Null layout to set component positions manually
		setLayout(null);
		
		Font displayFont = new Font("Lucida Console", Font.BOLD, 20);
		
		display = new JTextField("");
		display.setLocation(20, 10);
		display.setSize(260, 40);
		display.setEditable(false);
		display.setBackground(Color.WHITE);
		display.setFont(displayFont);
		display.setHorizontalAlignment(SwingConstants.RIGHT);;
		add(display);
		
		button_negate = new JButton("+/-");
		button_negate.setLocation(20, 350);
		button_negate.setSize(50, 50);
		add(button_negate);
		
		button_0 = new JButton("0");
		button_0.setLocation(90, 350);
		button_0.setSize(50, 50);
		add(button_0);
		
		button_decimal = new JButton(".");
		button_decimal.setLocation(160, 350);
		button_decimal.setSize(50, 50);
		add(button_decimal);
		
		button_equals = new JButton("=");
		button_equals.setLocation(230, 350);
		button_equals.setSize(50, 50);
		add(button_equals);
		
		button_1 = new JButton("1");
		button_1.setLocation(20, 280);
		button_1.setSize(50, 50);
		add(button_1);
		
		button_2 = new JButton("2");
		button_2.setLocation(90, 280);
		button_2.setSize(50, 50);
		add(button_2);
		
		button_3 = new JButton("3");
		button_3.setLocation(160, 280);
		button_3.setSize(50, 50);
		add(button_3);
		
		button_add = new JButton("+");
		button_add.setLocation(230, 280);
		button_add.setSize(50, 50);
		add(button_add);
		
		button_4 = new JButton("4");
		button_4.setLocation(20, 210);
		button_4.setSize(50, 50);
		add(button_4);
		
		button_5 = new JButton("5");
		button_5.setLocation(90, 210);
		button_5.setSize(50, 50);
		add(button_5);
		
		button_6 = new JButton("6");
		button_6.setLocation(160, 210);
		button_6.setSize(50, 50);
		add(button_6);
		
		button_subtract = new JButton("-");
		button_subtract.setLocation(230, 210);
		button_subtract.setSize(50, 50);
		add(button_subtract);
		
		button_7 = new JButton("7");
		button_7.setLocation(20, 140);
		button_7.setSize(50, 50);
		add(button_7);
		
		button_8 = new JButton("8");
		button_8.setLocation(90, 140);
		button_8.setSize(50, 50);
		add(button_8);
		
		button_9 = new JButton("9");
		button_9.setLocation(160, 140);
		button_9.setSize(50, 50);
		add(button_9);
		
		button_multiply = new JButton("x");
		button_multiply.setLocation(230, 140);
		button_multiply.setSize(50, 50);
		add(button_multiply);
		
		button_backspace = new JButton("Backspace");
		button_backspace.setLocation(20, 70);
		button_backspace.setSize(120, 50);
		add(button_backspace);
		
		button_clear = new JButton("C");
		button_clear.setLocation(160, 70);
		button_clear.setSize(50, 50);
		add(button_clear);
		
		button_divide = new JButton("/");
		button_divide.setLocation(230, 70);
		button_divide.setSize(50, 50);
		add(button_divide);
	}
}
