package project.damgom.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Mail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mail_key;

    @Column
    private int mail_id;
    @Column
    private String mail_title;
    @Column
    private String mail_content;
    @Column
    private String mail_sender;
    @Column
    private String mail_receiver;
    @Column
    private LocalDateTime mail_time;

}
