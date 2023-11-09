package project.damgom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.damgom.entity.Mail;

public interface MailRepository extends JpaRepository<Mail, Integer> {
}
