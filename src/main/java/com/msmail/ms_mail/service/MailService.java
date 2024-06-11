package com.msmail.ms_mail.service;

import com.msmail.ms_mail.model.Mail;
import com.msmail.ms_mail.model.dto.MailDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import com.msmail.ms_mail.repositories.MailRepository;

@Service
public class MailService {

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private MailRepository mailRepository;

    public Mail salvar(MailDTO mailDTO) {
        Mail mail = new Mail();
        mail.setSender(mailDTO.getSender());
        mail.setRecipient(mailDTO.getRecipient());
        mail.setCarbonCopy(mailDTO.getCarbonCopy());
        mail.setBlindCarbonCopy(mailDTO.getBlindCarbonCopy());
        mail.setSubject(mailDTO.getSubject());
        mail.setBody(mailDTO.getBody());
        sendEmail(mailDTO);

        return mailRepository.save(mail);
    }

    public void sendEmail(MailDTO email) {
        var message = new SimpleMailMessage();
        message.setFrom(email.getSender());
        message.setTo(email.getRecipient());
        message.setSubject(email.getSubject());
        message.setText(email.getBody());
        mailSender.send(message);
    }

}
