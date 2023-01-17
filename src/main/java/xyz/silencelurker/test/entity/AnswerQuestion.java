package xyz.silencelurker.test.entity;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

/**
 * @author Silence_Lurker
 */
@Table(name = "t_answer_question")
@Entity
@Data
public class AnswerQuestion {
    @Id
    @UuidGenerator
    private String id;
    @Transient
    private Question question;
}
