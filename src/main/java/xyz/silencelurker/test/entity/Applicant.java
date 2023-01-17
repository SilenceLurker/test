package xyz.silencelurker.test.entity;

import java.io.Serializable;
import java.util.List;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * @author Silence_Lurker
 */
@Data
@Table(name = "t_applicant")
@Entity
public class Applicant implements Serializable {
    @Id
    @UuidGenerator
    private String id;
    private String email;
    private List<String> questions;
}
