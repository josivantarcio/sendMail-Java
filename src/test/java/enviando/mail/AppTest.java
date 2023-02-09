package enviando.mail;

import org.junit.Test;

/**
 * Unit test for simple App.
 */

public class AppTest {
	@Test
	public void testeEmail() throws Exception {

		ObjectSendEmail sendMail = new ObjectSendEmail(
				"josivantarcio@gmail.com, josivanjavadev@gmail.com, josivantarcio@msn.com, josivantarcio@hotmail.com",
				"Josevan Java", "Teste com Java", "Olá esse é um email enviado pelo app em Java do Curso do Alex");
		sendMail.send();

	}
}
