package xyz.silencelurker.test.entity;

import java.io.Serializable;

import org.hibernate.annotations.UuidGenerator;
import org.springframework.lang.NonNull;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * @author Silence_Lurker
 */
@Data
@Table(name = "t_admin")
@Entity
public class Admin implements Serializable {
    @Id
    @UuidGenerator
    private String id;
    @NonNull
    private String email;
    @UuidGenerator
    private String randomKey;
}
