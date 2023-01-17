package xyz.silencelurker.test.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * @author Silence_Lurker
 */
@Data
@Table(name = "t_question")
@Entity
public class Question {
    @Id
    private String id;
    private String question;
    private String answer;
    @JsonIgnore
    private String trueAnswer;
    private Double score;
    private String type;
}
