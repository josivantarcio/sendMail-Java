package enviando.mail;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.junit.Test;

/**
 * Unit test for simple App.
 */

public class AppTest {
	@Test
	public void testeEmail() {

//		final String user = JOptionPane.showInputDialog("Name User");
//		final String password = JOptionPane.showInputDialog("Password");

		final String user = "josivandevjava@gmail.com";
		final String password = "@lpH@057";

		try {
			Properties properties = new Properties();

			properties.put("mail.smtp.ssl.trust", "*"); 
			properties.put("mail.smtp.auth", "true"); /* Autorizacao */
			properties.put("mail.smtp.starttls", "true"); /* Autenticação */
			properties.put("mail.smtp.host", "smtp.gmail.com"); /* servidor de email Gmail */
			properties.put("mail.smtp.port", "465"); /* Porta do Servidor */
			properties.put("mail.smtp.socketFactory.port", "587"); /* Especifica a porta a ser conectada pelo socket */
			properties.put("mail.smtp.socketFactory.class",
					"javax.net.ssl.SSLSocketFactory"); /* Classe socket de conexao ao SMTP */

			Session session = Session.getInstance(properties, new Authenticator() {

				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(user, password);
				}
			});

			/* Destinatarios */
			// final String destino = JOptionPane.showInputDialog("Destinatário(s)");
			Address[] toUser = InternetAddress.parse(
					"josivantarcio@gmail.com, josivandevjava@gmail.com");

			/* Mensagem */
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(user, "Josevan Dev Java")); // Email de origem
			message.setRecipients(Message.RecipientType.TO, toUser); // Email(s) de Destino(s)
			message.setSubject("Chegou um email enviado com Java"); // Assunto
			message.setText("Olá Você está recebendo um email feito por Java do Curso de Java Avançado do Alex!"); // Corpo
																														// do
																														// Email

			// Transmitir
			Transport.send(message);
			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
