package hello;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SpamBot implements ActionListener {
	static final String FAKE_USERNAME = "level1.spam.530@gmail.com";
	static final String FAKE_PASSWORD = "password530";
	JFrame frame = new JFrame("Spam Bot");
	JPanel panel = new JPanel();
	JTextField field = new JTextField("Enter your e-mail", 10);
	JTextField fieldNum = new JTextField("How many time would you like to sent the spam email?");
	JButton good = new JButton("The Good");
	JButton bad = new JButton("The Bad");
	JButton ugly = new JButton("The Ugly");

	public static void main(String[] args) {
		new SpamBot().createUI();
	}

	void createUI() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(field);
		panel.add(fieldNum);
		panel.add(good);
		panel.add(bad);
		panel.add(ugly);
		good.addActionListener(this);
		bad.addActionListener(this);
		ugly.addActionListener(this);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private boolean sendSpam(String recipient, String subject, String content) {

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
					protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
						return new javax.mail.PasswordAuthentication(
								FAKE_USERNAME, FAKE_PASSWORD);
					}
				});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(FAKE_USERNAME));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(recipient));
			message.setSubject(subject);
			message.setText(content);
			Transport.send(message);
			return true;

		} catch (MessagingException e) {
			e.printStackTrace();
			return false;
		}
	}

	public void actionPerformed(ActionEvent e) {
		JButton mousePressed = (JButton) e.getSource();
		if (mousePressed.equals(good)) {
			int amount = Integer.parseInt(fieldNum.getText());
			for (int i = 0; i < amount; i++) {
			boolean b = sendSpam(field.getText(), "Join the Army",
					"I want you to serve in the United States Army");
			if (b) {
				field.setBackground(Color.GREEN);
			} else {
				field.setBackground(Color.RED);
			}
			}
			System.out.println("Good Button Clicked; " + field.getText());
		}
		if (mousePressed.equals(bad)) {
			System.out.println("Bad Button Clicked; " + field.getText());
			int amount = Integer.parseInt(fieldNum.getText());
			for (int i = 0; i < amount; i++) {
				boolean b = sendSpam(field.getText(), "Free iPhone 7!",
						"Try ou this new iPhone 7 for us and we will send you a free iPhone 6s");
				if (b) {
					field.setBackground(Color.GREEN);
				} else {
					field.setBackground(Color.RED);
				}
			}
			
			
		}
		if (mousePressed.equals(ugly)) {
			System.out.println("Ugly Button Clicked; " + field.getText());
			int amount = Integer.parseInt(fieldNum.getText());
			for (int i = 0; i < amount; i++) {
			boolean b = sendSpam(field.getText(), "I am wtching you",
					"Leave $100 behind the dumpster at CCA or you will be in trouble");
			if (b) {
				field.setBackground(Color.GREEN);
			} else {
				field.setBackground(Color.RED);
			}
			}
		}
	}

}
