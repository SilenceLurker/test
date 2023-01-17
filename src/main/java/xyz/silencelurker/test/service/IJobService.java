package xyz.silencelurker.test.service;

import java.util.List;

import xyz.silencelurker.test.entity.Job;

/**
 * @author Silence_Lurker
 */
public interface IJobService {

    /**
     * 获取全部招募人员信息
     * 
     * @return
     */
    public List<Job> getAllJobInfo();

    /**
     * 通过id获取对应的招募信息
     * 
     * @param id
     * @return
     */
    public Job getJobInfoById(String id);

    /**
     * 新增一个招募信息
     * 
     * @param newJob
     */
    public void addNewJob(Job newJob);

    /**
     * 通过id隐藏招募信息
     * 
     * @param id
     */
    public void hideJobInfoById(String id);
}
