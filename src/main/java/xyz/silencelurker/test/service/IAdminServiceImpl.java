package xyz.silencelurker.test.service;

import org.springframework.stereotype.Service;

import jakarta.annotation.Resource;
import jakarta.mail.MessagingException;
import xyz.silencelurker.test.entity.Applicant;
import xyz.silencelurker.test.repository.IAdminRepository;
import xyz.silencelurker.test.service.mail.IMailService;

/**
 * @author Silence_Lurker
 */
@Service
public class IAdminServiceImpl implements IAdminService {

    @Resource
    private IMailService mailService;
    @Resource
    private IAdminRepository adminRepository;

    @Override
    public void sendMailToAdmins(Applicant applicant) {
        try {
            mailService.sendMailToUsers("有新的申请者提交了作答信息", "用户id：" + applicant.getId() + "用户邮箱：" + applicant.getEmail(),
                    adminRepository.findAll());
        } catch (MessagingException e) {
            e.printStackTrace();
        }

    }

}
