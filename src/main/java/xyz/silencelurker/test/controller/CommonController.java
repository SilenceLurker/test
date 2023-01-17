package xyz.silencelurker.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Resource;
import xyz.silencelurker.test.entity.Job;
import xyz.silencelurker.test.service.IJobService;

/**
 * @author Silence_Lurker
 */
@RequestMapping("/api")
@RestController
public class CommonController {

    @Resource
    private IJobService jobService;

    @GetMapping("/test")
    public ResponseEntity<List<Job>> testInfo() {
        List<Job> jobList = new ArrayList<Job>();

        return ResponseEntity.ok(jobList);
    }
}
