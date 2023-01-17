package xyz.silencelurker.test.service.mail;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.annotation.Resource;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import xyz.silencelurker.test.entity.Admin;

/**
 * @author Silence_Lurker
 */
@Service
public class IMailServiceImpl implements IMailService {
    @Resource
    private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String from;

    @Override
    public void sendMail() {

    }

    @Override
    public void sendMailToUsers(String subject, String messageInfo, Collection<Admin> targets)
            throws MessagingException {
        if (targets.size() == 0) {
            return;
        }
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper message = new MimeMessageHelper(mimeMessage);
        message.setFrom(from);
        message.setSubject(subject);
        message.setText(messageInfo);
        for (Admin admin : targets) {
            message.setTo(admin.getEmail());
            javaMailSender.send(mimeMessage);
        }
    }

    /**
     * {@inheritDoc}
     * 
     * WARNING This Function Is Only For Test!!!
     */
    @Override
    @Deprecated
    public void sendMailTest(String target, String subject, String message) throws MessagingException {

        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper mMessage = new MimeMessageHelper(mimeMessage);
        mMessage.setFrom(from);
        mMessage.setSubject(subject);
        mMessage.setText(message);
        mMessage.setTo(target);
        javaMailSender.send(mimeMessage);

    }

}
