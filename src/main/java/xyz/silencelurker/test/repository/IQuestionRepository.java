package xyz.silencelurker.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import xyz.silencelurker.test.entity.Question;

/**
 * @author Silence_Lurker
 */
public interface IQuestionRepository extends JpaRepository<Question, String> {

}
