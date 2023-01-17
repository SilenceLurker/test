package xyz.silencelurker.test.entity;

import jakarta.persistence.Table;
import lombok.Data;

/**
 * @author Silence_Lurker
 */
@Data
@Table(name = "t_banner")
public class Banner {
    private String mac;
    private String ip;
}
