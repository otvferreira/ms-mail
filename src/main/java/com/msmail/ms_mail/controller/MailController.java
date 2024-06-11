package com.msmail.ms_mail.controller;

import lombok.RequiredArgsConstructor;
import com.msmail.ms_mail.model.dto.MailDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.msmail.ms_mail.repositories.MailRepository;
import com.msmail.ms_mail.service.MailService;

@RestController
@RequestMapping("/mail")
@RequiredArgsConstructor
public class MailController {

    @Autowired
    MailRepository mailRepository;

    @Autowired
    MailService mailService;

    @PostMapping("/send")
    public ResponseEntity enviaEmail(@RequestBody MailDTO mail){
        mailService.salvar(mail);

        return ResponseEntity.ok("Email enviado com sucesso.");
    }

}
