package xyz.silencelurker.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import jakarta.annotation.Resource;
import jakarta.mail.MessagingException;
import xyz.silencelurker.test.service.mail.IMailService;

@SpringBootTest
class TestApplicationTests {

	@Test
	void contextLoads() {
	}

	@Resource
	private IMailService mailService;

	@Test
	void mailTest() throws MessagingException {
		mailService.sendMailTest("slvccans@gmail.com", "Test", "Test Info");
	}
}
