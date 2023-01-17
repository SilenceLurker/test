package xyz.silencelurker.test.service;

import xyz.silencelurker.test.entity.Applicant;

/**
 * @author Silence_Lurker
 */
public interface IAdminService {

    /**
     * 发送邮件通知管理员
     * 
     * @param applicant 申请人信息
     */
    public void sendMailToAdmins(Applicant applicant);
}
