package xyz.silencelurker.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import xyz.silencelurker.test.entity.Applicant;

/**
 * @author Silence_Lurker
 */
public interface IApplicantRepository extends JpaRepository<Applicant, String> {

}
