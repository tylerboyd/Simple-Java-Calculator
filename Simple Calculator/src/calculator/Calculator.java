package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
* The Simple Java Calculator performs basic numerical operations
* as well as support for decimal and negative number calculations.
*
* Built exclusively with Java Swing components.
*
* @author  Tyler Boyd
* @version 1.0
*/

public class Calculator extends JFrame 
{
	
	private CalculatorPanel view;
	private String firstArgument = "";
	private String secondArgument = "";
	private String displayText = "";
	private double arg1 = 0;
	private double arg2 = 0;
	private double answer = 0;
	private boolean firstArgEntered = false;
	private boolean operatorEntered = false;
	private char operator;
	
	public Calculator(String name) 
	{
		//Set window title
		super(name);
		
		//Create and add GUI
		view = new CalculatorPanel();
		this.getContentPane().add(view);
		
		//Window parameters
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 450);
		setResizable(false);
		setVisible(true);
		
		//Set initial display number to 0
		view.getDisplay().setText("0");
		
		//Event Listeners for Each Button
		
		view.getButton_negate().addActionListener( new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				eventHandleNegate();		
			}
		});
		
		view.getButton_0().addActionListener( new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				eventHandleNumberButton("0");		
			}
		});
		
		view.getButton_decimal().addActionListener( new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				eventHandleDecimal();	
			}
		});
		
		view.getButton_equals().addActionListener( new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				eventHandleEquals();	
			}
		});
		
		view.getButton_1().addActionListener( new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				eventHandleNumberButton("1");		
			}
		});
		
		view.getButton_2().addActionListener( new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				eventHandleNumberButton("2");		
			}
		});
		
		view.getButton_3().addActionListener( new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				eventHandleNumberButton("3");		
			}
		});
		
		view.getButton_add().addActionListener( new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				eventHandleOperationButton('+');	
			}
		});
		
		view.getButton_4().addActionListener( new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				eventHandleNumberButton("4");		
			}
		});
		
		view.getButton_5().addActionListener( new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				eventHandleNumberButton("5");		
			}
		});
		
		view.getButton_6().addActionListener( new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				eventHandleNumberButton("6");		
			}
		});
		
		view.getButton_subtract().addActionListener( new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				eventHandleOperationButton('-');	
			}
		});
		
		view.getButton_7().addActionListener( new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				eventHandleNumberButton("7");		
			}
		});
		
		view.getButton_8().addActionListener( new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				eventHandleNumberButton("8");		
			}
		});
		
		view.getButton_9().addActionListener( new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				eventHandleNumberButton("9");		
			}
		});
		
		view.getButton_multiply().addActionListener( new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				eventHandleOperationButton('x');	
			}
		});
		
		view.getButton_backspace().addActionListener( new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				eventHandleBackspace();	
			}
		});
		
		view.getButton_clear().addActionListener( new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				eventHandleClear();	
			}
		});
		
		view.getButton_divide().addActionListener( new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				eventHandleOperationButton('/');
			}
		});
	}
	
	//Inputs a number to screen
	private void eventHandleNumberButton(String s) 
	{
		if(!firstArgEntered)
		{
			firstArgument += s;
			arg1 = Double.parseDouble(firstArgument);
			displayText += s;
		}
		else
		{
			secondArgument += s;
			arg2 = Double.parseDouble(secondArgument);
			displayText += s;
		}
		
		view.getDisplay().setText(displayText);
	}
	
	//Sets the operator for the calculation
	private void eventHandleOperationButton(char c)
	{	
		if(!operatorEntered)
		{
			operator = c;
			operatorEntered = true;
			firstArgEntered = true;
			
			displayText = displayText + " " + c + " ";
			view.getDisplay().setText(displayText);
		}
	}
	
	//Removes most recent number
	private void eventHandleBackspace()
	{
		if(!firstArgEntered)
		{
			if(firstArgument.length() > 0)
			{
				firstArgument = firstArgument.substring(0, firstArgument.length() - 1);
				displayText = displayText.substring(0, displayText.length() - 1);
				view.getDisplay().setText(displayText);
			}
		}
		else
		{
			if(secondArgument.length() > 0)
			{
			secondArgument = secondArgument.substring(0, secondArgument.length() - 1);
			displayText = displayText.substring(0, displayText.length() - 1);
			view.getDisplay().setText(displayText);
			}
		}
	}
	
	//Clears the display
	private void eventHandleClear()
	{
		//Clear screen and variables
		clearData();
		view.getDisplay().setText("0");
	}

	//Adds a decimal point to the current argument
	private void eventHandleDecimal()
	{
		if(!firstArgEntered)
		{
			firstArgument += ".";
		}
		else
		{
			secondArgument += ".";
		}
		
		displayText += ".";
		view.getDisplay().setText(displayText);
	}
	
	//Toggles negative on the current argument
	private void eventHandleNegate()
	{
		if(!firstArgument.equals(""))
		{
			if(!firstArgEntered)
			{
				if(!(arg1 < 0))
				{
					//Negate first argument
					firstArgument = "-" + firstArgument;
					arg1 = -arg1;
					displayText = firstArgument;
					view.getDisplay().setText(displayText);
				}
				else
				{
					//Remove negative on first argument
					firstArgument = firstArgument.replace("-", "");
					arg1 = -arg1;
					displayText = firstArgument;
					view.getDisplay().setText(displayText);
				}
			}
			else
			{
				if(!(arg2 < 0))
				{
					//Negate second argument
					secondArgument = "-" + secondArgument;
					arg2 = -arg2;
					displayText = firstArgument + " " + operator + " " + secondArgument;
					view.getDisplay().setText(displayText);
				}
				else
				{
					//Remove negative second argument
					secondArgument = secondArgument.replace("-", "");
					arg2 = -arg2;
					displayText = firstArgument + " " + operator + " " + secondArgument;
					view.getDisplay().setText(displayText);
				}
				
			}
		}
	}
	
	//Performs the calculation
	private void eventHandleEquals()

	{	
		switch(operator) {
		case '+':
			answer = arg1 + arg2;
			break;
			
		case '-':
			answer = arg1 - arg2;
			break;
			
		case 'x':
			answer = arg1 * arg2;
			break;
			
		case '/':
			answer = arg1 / arg2;
			break;
		}
		
		firstArgEntered = false;
		
		displayText = Double.toString(answer);
		
		if((int)answer == answer)
		{
			displayText = displayText.substring(0, displayText.indexOf("."));
		}
		
		view.getDisplay().setText(displayText);
		
		clearData();
	}
	
	//Clears logic variables
	private void clearData() 
	{
		//Clear variables
		operatorEntered = false;
		arg1 = 0;
		arg2 = 0;
		firstArgument = "";
		secondArgument = "";
		answer = 0;
		displayText = "";
	}
	
	public static void main(String[] args) {
		
		JFrame frame = new Calculator("Simple Calculator");
	}
}
