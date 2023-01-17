package xyz.silencelurker.test.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.annotation.Resource;
import xyz.silencelurker.test.entity.Job;
import xyz.silencelurker.test.repository.IJobRepository;

/**
 * @author Silence_Lurker
 */
@Service
public class IJobServiceImpl implements IJobService {

    @Resource
    private IJobRepository jobRepository;

    @Override
    public List<Job> getAllJobInfo() {
        return jobRepository.findAll();
    }

    @Override
    public Job getJobInfoById(String id) {
        return jobRepository.findById(id).get();
    }

    @Override
    public void addNewJob(Job newJob) {
        jobRepository.save(newJob);
    }

    @Override
    public void hideJobInfoById(String id) {
        var job = jobRepository.findById(id).get();
        job.setHide(true);
        jobRepository.save(job);
    }

}
