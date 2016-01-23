package hello;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.teachingextensions.logo.Colors;


public class simpleCalculator implements ActionListener {
	JTextField text1 = new JTextField("Enter a number here", 10);
	JTextField text2 = new JTextField("Enter a number here", 10);
	JButton add = new JButton("add");
	JButton subtract = new JButton("subtract");
	JButton multiply = new JButton("multiply");
	JButton divide = new JButton("divide");
	JLabel label = new JLabel("Your answer should appear here");
	JFrame frame = new JFrame("Philosophical Calculator");
	JPanel panel = new JPanel();

	public void createUI() {
		text1.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                text1.setText("");
            }
        });
		text2.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				text2.setText("");
			}
		});
		frame.add(panel);
		panel.add(text1);
		panel.add(text2);
		panel.add(add);
		panel.add(subtract);
		panel.add(multiply);
		panel.add(divide);
		panel.add(label);
		panel.setBackground(Colors.Blues.Azure);
		frame.pack();
		frame.setVisible(true);
		add.addActionListener(this);
		subtract.addActionListener(this);
		multiply.addActionListener(this);
		divide.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new simpleCalculator().createUI();
	}

	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		String textOne = text1.getText();
		double intOne = Double.parseDouble(textOne);

		String textTwo = text2.getText();
		double intTwo = Double.parseDouble(textTwo);

		if (buttonPressed == add) {
			label.setText(add(intOne, intTwo) + "");
			text1.setText(add(intOne, intTwo) + "");
		}
		if (buttonPressed == subtract) {
			label.setText(subtract(intOne, intTwo) + "");
			text1.setText(subtract(intOne, intTwo) + "");
		}
		if (buttonPressed == multiply) {
			label.setText(multiply(intOne, intTwo) + "");
			text1.setText(multiply(intOne, intTwo) + "");
		}
		if (buttonPressed == divide) {
			label.setText(divide(intOne, intTwo) + "");
			text1.setText(divide(intOne, intTwo) + "");
		}

	}

	public double add(double intOne, double intTwo) {
		double answer = intOne + intTwo;
		return answer;
	}

	public double subtract(double intOne, double intTwo) {
		double answer = intOne - intTwo;
		return answer;
	}
	public double multiply(double intOne, double intTwo) {
		double answer = intOne * intTwo;
		return answer;
	}
	public double divide(double intOne, double intTwo) {
		double answer = intOne / intTwo;
		return answer;
	}
}
