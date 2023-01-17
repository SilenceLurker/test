package xyz.silencelurker.test.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

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
    @Transient
    private QuestionType type;

    @Getter
    @AllArgsConstructor
    public enum QuestionType {
        /**
         * 选择题
         */
        CHOICE_QUESTION("Choice question"),
        /**
         * 填空题
         */
        COMPLETION("Completion"),
        /**
         * 客观题
         */
        SUBJECTIVE_QUESTION("Subjective question");

        private String type;

        public QuestionType getQuestionType(String type) {
            if (type.equals(CHOICE_QUESTION.getType())) {
                return CHOICE_QUESTION;
            } else if (type.equals(COMPLETION.getType())) {
                return COMPLETION;
            } else if (type.equals(SUBJECTIVE_QUESTION.getType())) {
                return SUBJECTIVE_QUESTION;
            }

            return null;
        }
    }
}
