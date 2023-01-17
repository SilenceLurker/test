package xyz.silencelurker.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import xyz.silencelurker.test.entity.Job;

/**
 * @author Silence_Lurker
 */
public interface IJobRepository extends JpaRepository<Job, String> {

}
