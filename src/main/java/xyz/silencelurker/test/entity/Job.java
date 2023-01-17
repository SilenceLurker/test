package xyz.silencelurker.test.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * @author Silence_Lurker
 */
@Data
@Entity
@Table(name = "t_job")
public class Job implements Serializable {

    @Id
    private Integer id;
    private String name;
    private String description;

}
