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
import javax.swing.JOptionPane;

public class ObjectSendEmail {

	private String user = JOptionPane.showInputDialog("Name User");
	private String password = JOptionPane.showInputDialog("Password");

	private String listaEmails = "";
	private String personSend = "";
	private String subject = "";
	private String messageSend = "";

	public ObjectSendEmail(String listaEmails, String personSend, String subject, String messageSend) {
		
		this.listaEmails = listaEmails;
		this.personSend = personSend;
		this.subject = subject;
		this.messageSend = messageSend;
	}

	public void send() throws Exception {
		Properties properties = new Properties();

		properties.put("mail.smtp.ssl.trust", "*");

		properties.put("mail.smtp.ssl.checkserveridentity", "true");

		properties.put("mail.smtp.auth", "true"); /* Autorizacao */
		properties.put("mail.smtp.starttls", "true"); /* Autenticação */
		properties.put("mail.smtp.host", "smtp.gmail.com"); /* servidor de email Gmail */
		properties.put("mail.smtp.port", "465"); /* Porta do Servidor */
		properties.put("mail.smtp.socketFactory.port", "465"); /* Especifica a porta a ser conectada pelo socket */
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
		Address[] toUser = InternetAddress.parse(listaEmails);

		/* Mensagem */
		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress(user, personSend)); // Email de origem
		message.setRecipients(Message.RecipientType.TO, toUser); // Email(s) de Destino(s)
		message.setSubject(subject); // Assunto
		message.setText(messageSend); // Corpo do Email

		// Transmitir
		Transport.send(message);

	}
}
