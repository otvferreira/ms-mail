package com.msmail.ms_mail.repositories;

import com.msmail.ms_mail.model.Mail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MailRepository extends JpaRepository<Mail, String> {
}
