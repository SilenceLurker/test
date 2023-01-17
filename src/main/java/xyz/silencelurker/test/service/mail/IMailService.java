package xyz.silencelurker.test.service.mail;

import java.util.Collection;

import jakarta.mail.MessagingException;
import xyz.silencelurker.test.entity.Admin;

/**
 * @author Silence_Lurker
 */
public interface IMailService {
    /**
     * 发送邮件服务
     */
    public void sendMail();

    /**
     * 向指定邮箱集合发送信息
     * 
     * @param subject
     * @param messageInfo
     * @param targets
     * 
     * @throws MessagingException
     */
    public void sendMailToUsers(String subject, String messageInfo, Collection<Admin> targets)
            throws MessagingException;

    /**
     * 发送邮件测试
     * 
     * @param target  目标
     * @param message 信息内容
     * @param subject 主题
     * @throws MessagingException
     */
    public void sendMailTest(String target, String subject, String message) throws MessagingException;
}
