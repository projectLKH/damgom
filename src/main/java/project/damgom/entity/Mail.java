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
    @Column(name = "mail_key")
    private int mailKey;
    @Column(name = "mail_id")
    private int mailId;
    @Column(name = "mail_title")
    private String mailTitle;
    @Column(name = "mail_content")
    private String mailContent;
    @Column(name = "mail_sender")
    private String mailSender;
    @Column(name = "mail_receiver")
    private String mailReceiver;
    @Column(name = "mail_time")
    private LocalDateTime mailTime;

}
